package com.hkd.web.entity;

public class Club {

    private String name;
    private String homepage;
    private String facebook;
    private String instagram;
    private String introduce;
    private String history;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    // Club 모델 복사
    public void CopyData(Club param)
    {
        this.name = param.getName();
        this.homepage = param.getHomepage();
        this.facebook = param.getFacebook();
        this.instagram = param.getInstagram();
        this.introduce = param.getIntroduce();
        this.history = param.getHistory();
    }

	public Club() {
		
	}

	public Club(String name, String homepage, String facebook, String instagram, String introduce, String history) {
		super();
		this.name = name;
		this.homepage = homepage;
		this.facebook = facebook;
		this.instagram = instagram;
		this.introduce = introduce;
		this.history = history;
	}

	@Override
	public String toString() {
		return "Club [name=" + name + ", homepage=" + homepage + ", facebook=" + facebook + ", instagram=" + instagram
				+ ", introduce=" + introduce + ", history=" + history + "]";
	}
    
    
}
