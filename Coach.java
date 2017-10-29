package hr.fer.oop.lab2;

import hr.fer.oop.lab2.welcomepack.Constants;
import hr.fer.oop.lab2.welcomepack.Formation;

public class Coach extends Person{
	private int coachingSkill;
	private Formation formation;
	
	{
		coachingSkill = Constants.DEFAULT_COACHING_SKILL;
		formation = Constants.DEFAULT_FORMATION;
	}
	
	public Coach(String name, String country){
		super(name, country);
	}
	
	public Coach(){
		super();
	}
	
	public int getCoachingSkill(){
		return coachingSkill;
	}
	
	public void setCoachingSkill(int coachingSkill){
		if(coachingSkill < Constants.MAX_COACHING_SKILL && coachingSkill > Constants.MIN_COACHING_SKILL){
			this.coachingSkill = coachingSkill;
		} else {
			System.err.printf("The coaching skill must be above %d and below %d!%n", Constants.MIN_COACHING_SKILL, Constants.MAX_COACHING_SKILL);
		}
	}
	
	public Formation getFormation(){
		return formation;
	}
	
	public void setFormation(Formation formation){
		this.formation = formation;
	}
	
}
