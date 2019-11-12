package com.games.GameSearch;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="games")
public class Game /*implements Serializable*/ {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long gameId;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="date")
	private Date date;
	@Column(name="maxplayers")
	private int maxPlayers;
	@Column(name="latitude")
	private double latitude;
	@Column(name="longitude")
	private double longitude;
	@Column(name="adress")
	private String adress;	
	@Column(name="place")
	private String place;
	
	public enum GameType{MESA,ROL};
	@Column(name="gameType")
	private GameType gametype;	
	
	public enum Privacity{PUBLICA,PRIVADA,OCULTA};
	@Column(name="privacity")
	private Privacity privacity;
	
	public enum GameState{ABIERTA,CERRADA,CADUCADA};
	@Column(name="gameState")
	private GameState gamestate;

}
