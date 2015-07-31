package com.travelsky.datashow.domain;


public class AirInfo {
	private String id;
	private String departure;
	private Integer dtime;
	private String arrival;
	private Integer atime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public Integer getDtime() {
		return dtime;
	}
	public void setDtime(Integer dtime) {
		this.dtime = dtime;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public Integer getAtime() {
		return atime;
	}
	public void setAtime(Integer atime) {
		this.atime = atime;
	}


}
