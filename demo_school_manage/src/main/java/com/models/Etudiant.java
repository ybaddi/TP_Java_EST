package com.models;

import java.util.Date;

public class Etudiant {

    private int id;
    private String name;
    private int num_apogee;
    private String cin;
    private Date created_at;
    private Date updated_at;


    public Etudiant(){

    }
    public Etudiant(String name, int num_apogee, String cin ){
        this.cin = cin;
        this.name = name;
        this.num_apogee = num_apogee;
    }

    public Etudiant(int id, String name, int num_apogee, String cin, Date created_at, Date updated_at) {
        this.id = id;
        this.name = name;
        this.num_apogee = num_apogee;
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

    public int getNum_apogee() {
        return num_apogee;
    }

    public void setNum_apogee(int num_apogee) {
        this.num_apogee = num_apogee;
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
        return "Etudiant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", num_apogee=" + num_apogee +
                ", cin='" + cin + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}

