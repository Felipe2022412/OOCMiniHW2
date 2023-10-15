/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author felip
 */
public class Motorbike extends Vehicle implements Drivable{

    
    //Creating my Super constructor to create my object
    public Motorbike(float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
    }

    
    //Overriding methods and getters to apply to my Jet Object
    @Override
    public void accelerate(float speed) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void brake() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void turn(float angle) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
    
}
