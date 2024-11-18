package com.devsuperior.intensivao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.intensivao.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
