package com.theysla.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.theysla.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
