/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creating my objects
        Yacht y1 = new Yacht(120f, "Azimut", "Sloop", 5);
        Motorbike b1 = new Motorbike(100f, "Harley", "Cruiser", 1);
        Jet j1 = new Jet(300f, "Embraer", "Embraer 170", 12);

        System.out.println("That is our Jet: ");
       
        //getters to get the contructor properties of my object
        System.out.println("Max Speed: " + j1.getSpeed());
        System.out.println("Make: " + j1.getMake());
        System.out.println("Type: " + j1.getType());
        System.out.println("Num of passengers: " + j1.getNumPassengers());
       
        //using setters to define the extra properties of my object + its actual condition
        j1.setNumWings(2);
        System.out.println("Num of wings: " + j1.getNumWings());
        j1.setSpeed(290f);
        System.out.println("Actual speed: " + j1.getSpeed());
        j1.setDirection(120f);
        System.out.println("Going " + j1.getDirection() + " degrees north");
        j1.setNumPassengers(6);
        System.out.println("Number of passengers travelling: " + j1.getNumPassengers());

        System.out.println("This is our Motorbike: ");
        
        //getters to get the contructor properties of my object
        System.out.println("Max Speed: " + b1.getSpeed());
        System.out.println("Make: " + b1.getMake());
        System.out.println("Type: " + b1.getType());
        System.out.println("Num of passengers: " + b1.getNumPassengers());
        
         //using setters to define the extra properties of my object + its actual condition
        b1.setNumWheels(4);
        System.out.println("Num of wheels: " + b1.getNumWheels());
        b1.setSpeed(70f);
        System.out.println("Actual speed: " + b1.getSpeed());
        b1.setDirection(30f);
        System.out.println("Going " + b1.getDirection() + " degrees south");
        b1.setNumPassengers(1);
        System.out.println("Number of passengers travelling: " + b1.getNumPassengers());

        System.out.println("This is our Yacht: ");
        
        //getters to get the contructor properties of my object
        System.out.println("Max Speed: " + y1.getSpeed());
        System.out.println("Make: " + y1.getMake());
        System.out.println("Type: " + y1.getType());
        System.out.println("Num of passengers: " + y1.getNumPassengers());
        
         //using setters to define the extra properties of my object + its actual condition
        y1.setNumSails(2);
        System.out.println("Num of sails: " + y1.getNumSails());
        y1.setSpeed(110f);
        System.out.println("Actual speed: " + y1.getSpeed());
        y1.setDirection(90f);
        System.out.println("Going " + y1.getDirection() + " degrees north");
        y1.setNumPassengers(4);
        System.out.println("Number of passengers travelling: " + y1.getNumPassengers());

    }

}
