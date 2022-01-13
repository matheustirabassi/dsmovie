package com.devsuperior.dsmovie.controller;


import com.devsuperior.dsmovie.dto.MovieDto;
import com.devsuperior.dsmovie.dto.ScoreDto;
import com.devsuperior.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

  @Autowired
  private ScoreService service;

  @PutMapping
  public ResponseEntity<MovieDto> save(@RequestBody ScoreDto dto) {
    return ResponseEntity.ok().body(service.saveScore(dto));
  }
}