/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujibus;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bus mini = new Bus(10);
        
        mini.addpenumpang(5);
        mini.cetak();
        
        mini.addpenumpang(3);
        mini.cetak();
        
        mini.addpenumpang(5);
        mini.cetak();
        
        // TODO code application logic here
    }
    
}
