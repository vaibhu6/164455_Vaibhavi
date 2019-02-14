package com.upcomingmatches.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="UpcomingMatch")
public class UpcomingMatches {
	
	@Field("unique_id")
	private long unique_id;
	private String name;
	private String date;
	
	public long getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(long unique_id) {
		this.unique_id = unique_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "UpcomingMatches [unique_id=" + unique_id + ", name=" + name + ", date=" + date + "]";
	}
}
