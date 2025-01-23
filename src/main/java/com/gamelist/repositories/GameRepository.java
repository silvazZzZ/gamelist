package com.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameListRepository, Long> {
}
