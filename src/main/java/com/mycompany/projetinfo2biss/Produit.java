/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetinfo2biss;

/**
 *
 * @author pardiescamille
 */
public class Produit {
    private int codeProduit;
    private String nomProduit; 

    public Produit(int codeProduit, String nomProduit) {
        this.codeProduit = codeProduit;
        this.nomProduit = nomProduit;
    }

    public int getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }
    
    public String afficherProduit() {
        return "Produit [code du produit=" + codeProduit + ", nom=" + nomProduit + "]";
    }
    
    public String modifierProduit() {
         
    }
    
    public String supprimerProduit() {
        
    }
}

