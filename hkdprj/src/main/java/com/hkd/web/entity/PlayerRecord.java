package com.hkd.web.entity;

public class PlayerRecord {

    private String playerName;
    private int season;
    private String league;
    private int appearance;
    private int goals;
    private int assists;
    private int offside;
    private int shootings;
    private int fouls;
    private int yellowcard;
    private int redcard;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getOffside() {
        return offside;
    }

    public void setOffside(int offside) {
        this.offside = offside;
    }

    public int getShootings() {
        return shootings;
    }

    public void setShootings(int shootings) {
        this.shootings = shootings;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public int getYellowcard() {
        return yellowcard;
    }

    public void setYellowcard(int yellowcard) {
        this.yellowcard = yellowcard;
    }

    public int getRedcard() {
        return redcard;
    }

    public void setRedcard(int redcard) {
        this.redcard = redcard;
    }

    // PlayerRecord 모델 복사
    public void CopyData(PlayerRecord param)
    {
        this.playerName = param.getPlayerName();
        this.season = param.getSeason();
        this.league = param.getLeague();
        this.appearance = param.getAppearance();
        this.goals = param.getGoals();
        this.assists = param.getAssists();
        this.offside = param.getOffside();
        this.shootings = param.getShootings();
        this.fouls = param.getFouls();
        this.yellowcard = param.getYellowcard();
        this.redcard = param.getRedcard();
    }

	public PlayerRecord() {
		
	}

	public PlayerRecord(String playerName, int season, String league, int appearance, int goals, int assists,
			int offside, int shootings, int fouls, int yellowcard, int redcard) {
		super();
		this.playerName = playerName;
		this.season = season;
		this.league = league;
		this.appearance = appearance;
		this.goals = goals;
		this.assists = assists;
		this.offside = offside;
		this.shootings = shootings;
		this.fouls = fouls;
		this.yellowcard = yellowcard;
		this.redcard = redcard;
	}

	@Override
	public String toString() {
		return "PlayerRecord [playerName=" + playerName + ", season=" + season + ", league=" + league + ", appearance="
				+ appearance + ", goals=" + goals + ", assists=" + assists + ", offside=" + offside + ", shootings="
				+ shootings + ", fouls=" + fouls + ", yellowcard=" + yellowcard + ", redcard=" + redcard + "]";
	}
    
}
