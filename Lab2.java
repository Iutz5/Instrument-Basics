/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import Instrument.*;

/**
 *
 * @author ianut
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Instrument i = new Instrument();
        System.out.println("Instrument cannot be instantiated because it is an abstract class");
        
        StringInstrument violin = new StringInstrument();
        StringInstrument viola = new StringInstrument();
        StringInstrument viola2 = viola;
        StringInstrument cello = new StringInstrument();
        StringInstrument bass = new StringInstrument();
        
        WindInstrument flute = new WindInstrument();
        WindInstrument clarinet = new WindInstrument();
        WindInstrument oboe = new WindInstrument();
        WindInstrument bassClarinet = new WindInstrument();
        WindInstrument bassoon = new WindInstrument();
        WindInstrument saxophone = new WindInstrument();
        WindInstrument piccolo = new WindInstrument();
        
        violin.play();
        cello.play();
        clarinet.play();
        piccolo.play();
        
        System.out.println(violin.getcCount());
        System.out.println(violin.getiCount());
        System.out.println(viola.getcCount());
        System.out.println(viola.getiCount());
        System.out.println(cello.getcCount());
        System.out.println(cello.getiCount());
        System.out.println(bass.getcCount());
        System.out.println(bass.getiCount());
        System.out.println(flute.getcCount());
        System.out.println(flute.getiCount());
        System.out.println(clarinet.getcCount());
        System.out.println(clarinet.getiCount());
        System.out.println(oboe.getcCount());
        System.out.println(oboe.getiCount());
        System.out.println(bassClarinet.getcCount());
        System.out.println(bassClarinet.getiCount());
        System.out.println(bassoon.getcCount());
        System.out.println(bassoon.getiCount());
        System.out.println(saxophone.getcCount());
        System.out.println(saxophone.getiCount());
        System.out.println(piccolo.getcCount());
        System.out.println(piccolo.getiCount());
        
        System.out.println("The cCount is keeping track of how many total instruments are called whereas "
                + "iCount is keeping track of how instruments are called once it is instantiated. "
                + "When a new instrument (String or Wind) is called and newly instantiated, the iCount resets to 0 "
                + "and then increments by 1");
    }
    
}
