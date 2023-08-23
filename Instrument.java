/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrument;

/**
 *
 * @author ianut
 */

abstract public class Instrument implements Playable{
    // member data
    protected static int _cCount = 0;
    protected int _iCount = 0;
    
    // Constructor
    public Instrument(){
        _cCount++;
        _iCount++;
    }
    
    // accessors
    public int getcCount(){
        return _cCount;
    }
    
    public int getiCount(){
        return _iCount;
    }
}
