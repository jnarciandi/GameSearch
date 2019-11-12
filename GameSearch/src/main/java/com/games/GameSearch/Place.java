package com.games.GameSearch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="places")
public class Place {
	@Id
	private long placeId;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="latitude")
	private double latitude;
	@Column(name="longitude")
	private double longitude;
	@Column(name="mapsId")
	private String mapsId;
	

}
