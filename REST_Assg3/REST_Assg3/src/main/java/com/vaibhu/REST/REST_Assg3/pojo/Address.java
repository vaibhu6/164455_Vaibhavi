package com.vaibhu.REST.REST_Assg3.pojo;

public class Address {
	private String state;
	private String city;
	private String country;
	private long zip;
	public Address(String state, String city, String country, long zip) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
}
