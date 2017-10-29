package hr.fer.oop.lab2;

import hr.fer.oop.lab2.welcomepack.Constants;

public class Person {
	private String name;
	private String country;
	private int emotion;
	
	{
		this.emotion = Constants.DEFAULT_PLAYING_SKILL;

	}
	protected Person(String name, String country){
		this.name = name;
		this.country = country;
	}
	
	protected Person(){
		this.name = Constants.DEFAULT_PLAYER_NAME;
		this.country = Constants.DEFAULT_COUNTRY;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCountry(){
		return country;
	}
	
	public void setEmotion(int emotion){
		if(emotion < Constants.MAX_EMOTION && emotion > Constants.MIN_EMOTION){
			this.emotion = emotion;
		} else {
			System.err.printf("Player's emotion must be above %d and below %d!%n", Constants.MIN_EMOTION, Constants.MAX_EMOTION);
		}
	}
	
	public int getEmotion(){
		return emotion;
	}

}
