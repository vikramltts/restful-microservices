package com.ltts.detailinfo.model;

public class Player {
	private int playerno;
	private String playername;
	private String teamname;
	public int getPlayerno() {
		return playerno;
	}
	public void setPlayerno(int playerno) {
		this.playerno = playerno;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public Player(int playerno, String playername, String teamname) {
		super();
		this.playerno = playerno;
		this.playername = playername;
		this.teamname = teamname;
	}
	public Player() {
		super();
	}
	
	

}
