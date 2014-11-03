package game;

import java.util.ArrayList;

import GUI.GUI;

public class Play {
	private int players;
	private ArrayList<Player> playerArray = new ArrayList<Player>();

	private GUI gui = new GUI();

	public void playGame() {

		players = gui.amountOfPlayers();

		addPlayers(players);
		
		for(int i = 0; i<=players; i++) {
			System.out.println(playerArray.get(i).getName());
		}
		
		
	}

	private void addPlayers(int amountOfPlayers) {

		for (int i = 0; i <= amountOfPlayers; i++) {
			
			playerArray.add(gui.playerCreation());
		}
	}
}
