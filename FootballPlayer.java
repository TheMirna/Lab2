package hr.fer.oop.lab2;

import hr.fer.oop.lab2.welcomepack.PlayingPosition;
import hr.fer.oop.lab2.welcomepack.Constants;

public class FootballPlayer extends Person{
	int playingSkill;
	PlayingPosition playingPosition;
	
	{
		playingSkill = Constants.DEFAULT_PLAYING_SKILL;
		playingPosition = Constants.DEFAULT_PLAYING_POSITION;
	}
	
	public FootballPlayer(String name, String country){
		super(name, country);
	}
	
	public FootballPlayer(){
		super();
	}
	
	public int getPlayingSkill(){
		return playingSkill;
	}
	
	public void setPlayingSkill(int playingSkill){
		if(playingSkill < Constants.MAX_PLAYING_SKILL && playingSkill > Constants.MIN_PLAYING_SKILL){
			this.playingSkill = playingSkill;
		} else {
			System.err.printf("The player's skill must be above %d and below %d!%n", Constants.MIN_PLAYING_SKILL, Constants.MAX_PLAYING_SKILL);
		}
	}
	
	public PlayingPosition getPlayingPosition(){
		return playingPosition;
	}
	
	public void setPlayingPosition(PlayingPosition playingPosition){
		this.playingPosition = playingPosition;
	}
	
}
