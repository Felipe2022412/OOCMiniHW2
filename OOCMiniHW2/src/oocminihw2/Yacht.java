/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author felip
 */
public class Yacht extends Vehicle implements Sailable {

    
    //Creating my Super constructor to create my object
    public Yacht(float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
    }

    
    //Overriding methods and getters to apply to my Jet Object
    @Override
    public void hoistSail() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void lowerSail() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean isSailHoisted() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void landHo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int getNumSails() {
        return numSails;
    }

    @Override
    public void setNumSails(int numSails) {
        this.numSails = numSails;
    }
    
    
    
}
