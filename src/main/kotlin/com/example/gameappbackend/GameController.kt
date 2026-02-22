package com.example.gameappbackend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GameController {

    enum class Move {
        ROCK, PAPER, SCISSORS
    }

    data class GameResult(val playerMove: Move, val serverMove: Move, val result: String)

    @GetMapping("/play/rock-paper-scissors")
    fun playRockPaperScissors(@RequestParam playerMove: Move): GameResult {
        val serverMove = Move.values().random()
        val result = when {
            playerMove == serverMove -> "DRAW"
            (playerMove == Move.ROCK && serverMove == Move.SCISSORS) ||
            (playerMove == Move.SCISSORS && serverMove == Move.PAPER) ||
            (playerMove == Move.PAPER && serverMove == Move.ROCK) -> "WIN"
            else -> "LOSE"
        }
        return GameResult(playerMove, serverMove, result)
    }
}
