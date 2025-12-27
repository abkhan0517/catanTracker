package com.abdullah.catanTracker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah.catanTracker.Entities.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer>{
    public Player findPlayerByName(String name);

}
