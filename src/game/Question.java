package game;

public class Question {
	
	private String question, answer; 
	private boolean chance; 
	private int points; 
	
	public Question(String question, String answer, int points) {
		this.question = question; 
		this.answer = answer; 
		this.chance = false; 
		this.points = points; 
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isChance() {
		return chance;
	}

	public void setChance(boolean chance) {
		this.chance = chance;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	

}
