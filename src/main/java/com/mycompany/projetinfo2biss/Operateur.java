/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetinfo2biss;

/**
 *
 * @author pardiescamille
 */
public class Operateur {
    private String nom;
    private String prenom;
    private int idOperateur; 
    private boolean dispo;
    private String competence; 
    
    public Operateur(String nom, String prenom, int idOperateur, boolean dispo, String competence) {
        this.nom = nom;
        this.prenom = prenom;
        this.idOperateur = idOperateur;
        this.dispo = dispo;
        this.competence = competence;
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

    public int getIdOperateur() {
        return idOperateur;
    }

    public void setIdOperateur(int idOperateur) {
        this.idOperateur = idOperateur;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

}

