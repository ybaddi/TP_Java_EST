package com.models;

import java.util.Date;

public class Professor {

    private int id;
    private String name;
    private String cours;
    private String cin;
    private Date created_at;
    private Date updated_at;

    public Professor(String name, String cour, String cin) {
        this.name = name;
        this.cours = cour;
        this.cin = cin;
    }

    public Professor(int id, String name, String cour, String cin, Date created_at, Date updated_at) {
        this.id = id;
        this.name = name;
        this.cours = cour;
        this.cin = cin;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cour) {
        this.cours = cour;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cours='" + cours + '\'' +
                ", cin='" + cin + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}

