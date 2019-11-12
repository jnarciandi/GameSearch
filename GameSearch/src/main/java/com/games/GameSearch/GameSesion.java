package com.games.GameSearch;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gamesesions")
public class GameSesion {
	@Id
	private long sesionId;
	@Column(name="userid")
	private String userid;
	@Column(name="gameid")
	private long gameId;
	@Column(name="timestamp")
	private Date timeStamp;
	
	public enum Relation{JUGADOR,ADMIN,MASTER,ADMINMASTER,SOLICITANTE,INVITADO,ELIMINADO};
	@Column(name="relation")
	private Relation relation;

}
