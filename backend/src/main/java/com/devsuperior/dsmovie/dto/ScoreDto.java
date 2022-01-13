package com.devsuperior.dsmovie.dto;

import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
public class ScoreDto implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private Long movieId;
  private String email;
  private Double score;


}