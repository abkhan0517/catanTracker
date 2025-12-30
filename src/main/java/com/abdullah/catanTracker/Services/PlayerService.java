package com.abdullah.catanTracker.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah.catanTracker.Entities.Player;
import com.abdullah.catanTracker.Repositories.PlayerRepo;

@Service
public class PlayerService {
    @Autowired
    PlayerRepo playerRepo;

    public Player addPlayer(Player player) {
        return playerRepo.save(player);
    }

    public Player getPlayerByName(String name) {
        return playerRepo.findPlayerByName(name);
    }

    public Player updatePlayer(Player player) {
        return playerRepo.save(player);
    }

    public void deletePlayer(Integer id) {
        playerRepo.deleteById(id);
    }
}
