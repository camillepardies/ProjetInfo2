/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetinfo2biss;

/**
 *
 * @author pardiescamille
 */
public class Equipement {
    
    public Equipement(String idEquipement) {
        this.idEquipement = idEquipement;
    }

    public String getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(String idEquipement) {
        this.idEquipement = idEquipement;
    }
    
    public String afficher() {
        return "Équipement [id=" + idEquipement + "]";
    }
}


