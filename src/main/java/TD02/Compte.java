/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD02;

/**
 *
 * @author g55315
 */
public class Compte {
    private String titulaire;
    private int numero;
    private double solde;
    
    public Compte(String titulaire,int numero,double solde){
        this.titulaire = titulaire;
        this.numero = numero;
        this.solde = solde;
    }
    
    public double retirer(double montant) {
        if (this.solde > montant && montant > 0) {
            this.solde = this.solde - montant;
        } else {
            throw new IllegalArgumentException("solde insuffisant");
        }
        return solde;
    }
    
    public static void main(String[] args) {
        Compte c1 = new Compte("OT", 55315, 550.66);
        Compte c2 = new Compte("MW", 55047, 454999945.66);
        Compte c3 = new Compte("AD", 52068, 0.86);
        double solde_restant = c1.retirer(445.5);
        
        System.out.println(solde_restant);
    }
}
