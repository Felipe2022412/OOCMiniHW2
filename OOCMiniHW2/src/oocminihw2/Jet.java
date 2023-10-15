/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author felip
 */
public class Jet extends Vehicle implements Flyable {

   
  //Creating my Super constructor to create my object
    public Jet(float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
       
    }

    @Override
    public void changeAltitude(float change) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     *Overriding methods and getters to apply to my Jet Object
     * @return
     */
    @Override
    public float getAltitude() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void accelerate(float speed) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void brake() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void turn(float angle) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int getNumWings() {
        return numWings;
    }

    @Override
    public void setNumWings(int numWings) {
        this.numWings = numWings;
    }

  
  

   
    
}
