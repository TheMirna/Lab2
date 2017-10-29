package hr.fer.oop.lab2;

import hr.fer.oop.lab2.welcomepack.PlayingPosition;
import hr.fer.oop.lab2.welcomepack.Formation;

public class Main {
	
	public static void main(String args[]){
		Coach coach = new Coach();
		FootballPlayer player = new FootballPlayer();
		
		System.out.println(coach.getName());
		System.out.println(coach.getCountry());
		System.out.println(coach.getEmotion());
		System.out.println(coach.getCoachingSkill());
		System.out.println(coach.getFormation());
		
		/*System.out.println(coach.getName());
		System.out.println(coach.getCountry());
		coach.setEmotion(78);
		System.out.println(coach.getEmotion());
		coach.setCoachingSkill(102);
		System.out.println(coach.getCoachingSkill());
		coach.setFormation(Formation.F352);
		System.out.println(coach.getFormation());
		
		System.out.println(player.getName());
		System.out.println(player.getCountry());
		player.setEmotion(550);
		System.out.println(player.getEmotion());
		player.setPlayingSkill(99);
		System.out.println(player.getPlayingSkill());
		player.setPlayingPosition(PlayingPosition.GK);
		System.out.println(player.getPlayingPosition());*/
	}

}
