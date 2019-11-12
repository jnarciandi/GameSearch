package com.games.GameSearch;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userrelations")
public class UserRelation {
	
	@Id
	private long userRelationId;
	@Column(name="userid")
	private String userId;
	@Column(name="usertargetid")
	private String userTargetId;
	@Column(name="timestamp")
	private Date timeStamp;
	
	public enum Friendship{AMIGO,SOLICITUD,RECHAZADO,BLOQUEADO}
	@Column(name="friendship")
	private Friendship friendship;

}
