/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetinfo2biss;

/**
 *
 * @author pardiescamille
 */
public class Machine {
    private int refMachine;
    private String nomMachine;
    private float abcisse;
    private float ordonee;
    private float cout;
    private float duree;
    private boolean dispo;
    
    public Machine(int refMachine, String dMachine, float abcisse, float ordonee, float c, float t, boolean dispo) {
        this.refMachine = refMachine;
        this.nomMachine = dMachine;
        this.abcisse = abcisse;
        this.ordonee = ordonee;
        this.cout = cout;
        this.duree = duree;
        this.dispo = dispo;
    }
    public int getRefMachine() {
        return refMachine;
    }

    public void setRefMachine(int refMachine) {
        this.refMachine = refMachine;
    }

    public String getnomMachine() {
        return nomMachine;
    }

    public void setnomMachine(String dMachine) {
        this.nomMachine = dMachine;
    }

    public float getAbcisse() {
        return abcisse;
    }

    public void setAbcisse(float abcisse) {
        this.abcisse = abcisse;
    }

    public float getOrdonee() {
        return ordonee;
    }

    public void setOrdonee(float ordonee) {
        this.ordonee = ordonee;
    }

    public float getCout() {
        return cout;
    }

    public void setCout(float c) {
        this.cout = cout;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float t) {
        this.duree = duree;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }
    
    public String afficheMachine(){
        return "Machine [ref=" + refMachine + ", nom=" + nomMachine +
        ", coordonnées=(" + abcisse + ", " + ordonee + ")" +
        ", coût=" + cout + ", durée=" + duree + ", disponibilité=" + dispo + "]";
    }
    
    public String modifierMachine() {
        
    }
    
    public String supprimerMachine() {

    }
}
