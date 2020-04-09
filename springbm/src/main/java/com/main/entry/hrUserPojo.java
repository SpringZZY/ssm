package com.main.entry;

public class hrUserPojo {

    public String id;
    public String state;
    public String nickname;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    @Override
    public String toString() {
        return "hrUserPojo [id=" + id + ", state=" + state + ", nickname=" + nickname + "]";
    }
    
    

}
