/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetinfo2biss;

/**
 *
 * @author pardiescamille
 */

import java.util.List;

public class Atelier {
    private String nom ;
    private List<Equipement> equipements;

    public Atelier(String nom, List<Equipement> equipements) {
        this.nom = nom;
        this.equipements = equipements;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(List<Equipement> equipements) {
        this.equipements = equipements;
    }
    
    public String afficher() {
    
    }
}



