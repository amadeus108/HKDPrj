package com.hkd.web.entity;

import java.util.Date;

public class Player {

    private String name;
    private Date birthday;
    private int backNumber;
    private String position;
    private String nationality;
    private String clubName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getBackNumber() {
        return backNumber;
    }

    public void setBackNumber(int backNumber) {
        this.backNumber = backNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    // Player 모델 복사
    public void CopyData(Player param)
    {
        this.name = param.getName();
        this.birthday = param.getBirthday();
        this.backNumber = param.getBackNumber();
        this.position = param.getPosition();
        this.nationality = param.getNationality();
        this.clubName = param.getClubName();
    }

	public Player() {
		
	}

	public Player(String name, Date birthday, int backNumber, String position, String nationality,
			String clubName) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.backNumber = backNumber;
		this.position = position;
		this.nationality = nationality;
		this.clubName = clubName;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", birthday=" + birthday + ", backNumber=" + backNumber + ", position="
				+ position + ", nationality=" + nationality + ", clubName=" + clubName + "]";
	}
    
}