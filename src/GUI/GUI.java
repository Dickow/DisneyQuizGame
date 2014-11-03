package GUI;

import game.Player;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUI {
	
	private int intPlayers; 

	private JFrame mainFrame;
	private JButton playerInputButton = new JButton("OK");
	private JButton playerInputButton2 = new JButton("OK");
	private JTextArea playerInputText = new JTextArea(
			"Indtast antal spillere 1-5");
	private String playerName; 
	
	

	public GUI() {
		this.prepareGUI();
	}

	private void prepareGUI() {
		GridBagLayout layoutManager = new GridBagLayout();
		mainFrame = new JFrame("Disney Quiz Game");
		mainFrame.setSize(800, 600);
		mainFrame.setBackground(Color.WHITE);
		mainFrame.setLayout(layoutManager);
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

	}

	public int amountOfPlayers() {
		intPlayers = 0;
		// The OK button press this to send the amount of players to the action
		// event
		playerInputButton.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				String players = playerInputText.getText();
				players.trim();
				intPlayers = Integer.parseInt(players);
			}
		});
		playerInputText.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e){
				playerInputText.setText("");
			}
		});

		// The text input field for the amount of players
		playerInputText.setBackground(Color.WHITE);
		playerInputText.setForeground(Color.BLACK);
		playerInputText.setText("Intast antal spillere 1-5 ");
		mainFrame.getContentPane().add(playerInputText);
		mainFrame.getContentPane().add(playerInputButton);
		
		mainFrame.setVisible(true);
		
		while(intPlayers == 0){}

		return intPlayers; 
	}
	
	public Player playerCreation(){
		// remove all the previous buttons and text areas
		mainFrame.getContentPane().removeAll();
		
		// The playerName that is to be returned to the Play class
		playerName= "empty"; 
		
		// set the action listener for the input Button
		playerInputButton2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				playerName = playerInputText.getText();
				playerName.trim();
				System.out.println(playerName);
				
				
				
			}
			
		});
		
		// Change the text shown in the text area
		playerInputText.setText("Indtast dit navn ");
		
		// add all the buttons and text areas to the frame and show them on the screen
		mainFrame.getContentPane().add(playerInputButton2);
		mainFrame.getContentPane().add(playerInputText);
		mainFrame.setVisible(true);
		
		while(playerName.equals("empty")){}
		
		return new Player(playerName,0); 
	}

}
