package com.theysla.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theysla.dsmovie.entities.Score;
import com.theysla.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
