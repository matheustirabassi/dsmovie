package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.MovieDto;
import com.devsuperior.dsmovie.dto.ScoreDto;
import com.devsuperior.dsmovie.entitties.Movie;
import com.devsuperior.dsmovie.entitties.Score;
import com.devsuperior.dsmovie.entitties.User;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;
import com.devsuperior.dsmovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

  @Autowired
  private MovieRepository movieRepository;
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private ScoreRepository scoreRepository;

  @Transactional
  public MovieDto saveScore(ScoreDto dto) {
    User user = userRepository.findByEmail(dto.getEmail());
    if (user == null) {
      user = new User();
      user.setEmail(dto.getEmail());
      user = userRepository.saveAndFlush(user);
    }

    Movie movie = movieRepository.findById(dto.getMovieId()).orElse(null);

    Score score = new Score();
    score.setMovie(movie);
    score.setUser(user);
    score.setValue(dto.getScore());
    scoreRepository.saveAndFlush(score);

    double sum = 0;
    assert movie != null;
    for (Score scr : movie.getScores()) {
      sum += scr.getValue();
    }
    double avg = sum / movie.getScores().size();
    movie.setScore(avg);
    movie.setCount(movie.getScores().size());

    movie = movieRepository.save(movie);
    return new MovieDto(movie);
  }
}