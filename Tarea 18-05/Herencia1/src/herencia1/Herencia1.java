/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

/**
 *
 * @author tomas
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c = new Cliente("Pedro",1,"3516129876");
        ClientePreferencial c2 = new ClientePreferencial("Juan",2,"3516543217");
        
        c2.setDomicilio("Calle 123");
        c2.setLimite(250);
        c2.setSaldo(100);
        
        System.out.println(c);
        System.out.println(c2);
    }
    
}
