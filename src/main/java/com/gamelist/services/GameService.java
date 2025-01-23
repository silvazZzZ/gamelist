package com.gamelist.services;

import com.gamelist.dto.GameMinDTO;
import com.gamelist.entities.Game;
import com.gamelist.repositories.GameListRepository;
import com.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public List<Game> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
