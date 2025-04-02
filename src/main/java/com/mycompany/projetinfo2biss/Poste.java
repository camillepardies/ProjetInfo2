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

public class Poste {
    import java.util.List;

public class Poste {
    private int refPoste;
    private String dPoste;
    private List<Machine> machines;

    public Poste(int refPoste, String dPoste, List<Machine> machines) {
        this.refPoste = refPoste;
        this.dPoste = dPoste;
        this.machines = machines;
    }

    public int getRefPoste() {
        return refPoste;
    }

    public void setRefPoste(int refPoste) {
        this.refPoste = refPoste;
    }

    public String getdPoste() {
        return dPoste;
    }

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

    public String afficher() {
        
    }
    
    public String modifier() {
        
    }
    public String supprimer() {
        
    }
}

