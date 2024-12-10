package com.example.jobslisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost")
public class Post {
    private String profile;
    private String desc;
    private int ext;
    private String[] techs;

    public Post() {
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExt() {
        return ext;
    }

    public void setExt(int ext) {
        this.ext = ext;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }
}
