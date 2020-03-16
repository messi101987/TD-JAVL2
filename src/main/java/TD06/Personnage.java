/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD06;

/**
 *
 * @author oscartison
 */
public class Personnage {
    private String name;
    private int hp;
    private Boolean drunk;
    private Boolean invisible;
    
    public Personnage(String name) {
        this.name = name;
        hp = 40;
        drunk = false;
        invisible = false;
    }

    public Boolean getDrunk() {
        return drunk;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public Boolean getInvisible() {
        return invisible;
    }

    public void setDrunk(Boolean drunk) {
        this.drunk = drunk;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setInvisible(Boolean invisible) {
        this.invisible = invisible;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "nom: " + name + ", nombre de vies: " + hp + ", invisible: " + invisible + " et saoul: " + drunk; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + name.hashCode();
        result = prime * result + (int) (hp ^ (hp >>> 32));
        result = prime * result + drunk.hashCode();
        result = prime * result + invisible.hashCode();
        return result;
}
    
    
    
    
    
    
    
}
