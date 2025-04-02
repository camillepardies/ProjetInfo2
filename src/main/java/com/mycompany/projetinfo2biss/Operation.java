/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetinfo2biss;

/**
 *
 * @author pardiescamille
 */
public class Operation {
    private int idOperation;
    private String nom;
    private Poste poste;
    private float duree;
    private float cout;

    public Operation(int idOperation, String nom, Poste poste, float duree, float cout) {
        this.idOperation = idOperation;
        this.nom = nom;
        this.poste = poste;
        this.duree = duree;
        this.cout = cout;
    }

    public int getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(int idOperation) {
        this.idOperation = idOperation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public float getCout() {
        return cout;
    }

    public void setCout(float cout) {
        this.cout = cout;
    }
    
    
}

