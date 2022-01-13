package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entitties.Movie;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
public class MovieDto implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private Long id;
  private String title;
  private Double score;
  private Integer count;
  private String image;

  public MovieDto(Movie movie) {
    id = movie.getId();
    title = movie.getTitle();
    score = movie.getScore();
    count = movie.getCount();
    image = movie.getImage();
  }
}