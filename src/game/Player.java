package game;

public class Player {
	
	private String name; 
	private int Score; 
	
	public Player(String name, int Score){
		this.name = name; 
		this.Score = Score; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}
	
	

}
