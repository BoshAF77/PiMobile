/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycomany.entities;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Reclamation {
    //nemchio taw nchofo entity fi symfony
    
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private int tel;

    
    private String etat;
    private String description;
    private Date dateReclamation;

  public Reclamation(String nom, String prenom, String email, int tel, String etat, String description, Date dateReclamation) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.etat = etat;
        this.description = description;
        this.dateReclamation = dateReclamation;
    }

    public Reclamation(int id, String nom, String prenom, String email, int tel, String etat, String description, Date dateReclamation) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.etat = etat;
        this.description = description;
        this.dateReclamation = dateReclamation;
    }

    public Reclamation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateReclamation() {
        return dateReclamation;
    }

    public void setDateReclamation(Date dateReclamation) {
        this.dateReclamation = dateReclamation;
    }
    

   }

    
 