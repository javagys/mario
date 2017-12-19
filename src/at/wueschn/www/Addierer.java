/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wueschn.www;

/**
 *
 * @author Mario
 */
public class Addierer
{
    
    public Addierer()
    {
        
        System.out.println("Sie nutzen den Addierer");
    }
    
    public void ending()
    {
        System.out.println("Auf Wiedersehen");
        System.exit(0);
        
    }
    
    //Method mit Ausgabe
    
    public int summingUp(int zahl1, int zahl2)
    {
        int sum = zahl1 + zahl2;
        return sum;
    }
    
    
}
