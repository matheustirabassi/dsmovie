package com.devsuperior.dsmovie.services;

import com.devsuperior.dsmovie.dto.MovieDto;
import com.devsuperior.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  @Autowired
  MovieRepository repository;


  public Page<MovieDto> findAll(Pageable pageable) {
    return repository.findAll(pageable).map(MovieDto::new);
  }

  public MovieDto findById(Long id) {
    return new MovieDto(repository.findById(id).orElse(null));
  }
}