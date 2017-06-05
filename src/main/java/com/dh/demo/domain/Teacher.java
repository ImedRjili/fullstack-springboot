package com.dh.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Juan Zapata on 6/3/2017.
 */
@Document
public class Teacher {
    @Id
    private String id;

    private String name;
    private long ci;
    private String proffesion;

    public Teacher() {
    }

    public Teacher(String id, String name, long ci, String proffesion) {
        this.id = id;
        this.name = name;
        this.ci = ci;
        this.proffesion = proffesion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }
}
