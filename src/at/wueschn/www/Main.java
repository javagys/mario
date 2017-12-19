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
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Addierer a1 = new Addierer();
        int summe = a1.summingUp(10, 20);
        System.out.println("Sie Summe ist: " +  summe);
    }
    
}
