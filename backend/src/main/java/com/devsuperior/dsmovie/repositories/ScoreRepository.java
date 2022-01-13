package com.devsuperior.dsmovie.repositories;

import com.devsuperior.dsmovie.entitties.Score;
import com.devsuperior.dsmovie.entitties.pk.ScorePk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}