package com.abdullah.catanTracker.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah.catanTracker.Entities.Player;
import com.abdullah.catanTracker.Services.PlayerService;

@RestController
@RequestMapping("/player/v1")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/addPlayer")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player addedPlayer = playerService.addPlayer(player);
        return ResponseEntity.ok(addedPlayer);
    }
}
