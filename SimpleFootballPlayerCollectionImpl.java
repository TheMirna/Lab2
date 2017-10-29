package hr.fer.oop.lab2;

import java.util.Arrays;

import hr.fer.oop.lab2.FootballPlayer;
import hr.fer.oop.lab2.welcomepack.SimpleFootballPlayerCollection;

public class SimpleFootballPlayerCollectionImpl implements SimpleFootballPlayerCollection {
	private FootballPlayer[] players;
	private int numPlayers;
	private static int size;
	
	public SimpleFootballPlayerCollectionImpl(int numPlayers){
		players = new FootballPlayer[numPlayers];
		this.numPlayers = numPlayers;
	}
	
	public int size(){
		return size;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof FootballPlayer)){
			return false;
		}
		
		FootballPlayer other = (FootballPlayer) obj;
		//FootballPlayer b = (FootballPlayer)this;
		
		if(getName().equals(other.getName())) return true;
		/*if (!Arrays.equals(players, other.getName())){
			return false;
		}*/
		
		return true;
	}

	public boolean contains(FootballPlayer player){
		for(FootballPlayer tmp_player : players){
			if(player.equals(tmp_player)){
				return true;
			}
		}
		return false;
	}
}
