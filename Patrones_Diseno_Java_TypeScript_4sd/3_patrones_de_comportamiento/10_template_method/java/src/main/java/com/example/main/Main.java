package com.example.main;

import com.example.api.Game;
import com.example.impl.Chess;
import com.example.impl.Monopoly;

public class Main {

	public static void main(String[] args) {
		System.out.println("Jugando al ajedrez:");
        Game chessGame = new Chess();
        chessGame.play();

        System.out.println("Jugando al Monopoly:");
        Game monopolyGame = new Monopoly();
        monopolyGame.play();

	}

}
