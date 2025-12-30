package com.abdullah.catanTracker.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getPlayer/{playerName}")
    public ResponseEntity<Player> getPlayerByName(@PathVariable("playerName") String name) {
        Player gettedPlayer = playerService.getPlayerByName(name);
        return ResponseEntity.ok(gettedPlayer);
    }

    @PutMapping("/updatePlayer")
    public ResponseEntity<Player> updatePlayerWins(@RequestBody Player player) {
        Player updatedPlayer = playerService.updatePlayer(player);
        return ResponseEntity.ok(updatedPlayer);
    }

    @DeleteMapping("/deletePlayer/{id}")
    public ResponseEntity deletePlayer(@PathVariable("id") Integer id) {
        playerService.deletePlayer(id);
        return ResponseEntity.ok().build();
    }
}
