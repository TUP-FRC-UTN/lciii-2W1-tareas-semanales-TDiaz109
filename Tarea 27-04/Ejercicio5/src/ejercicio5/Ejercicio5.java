/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author tomas
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo t = new Triangulo(4,6,4);
        
        System.out.println("Perímetro: "+t.perimetro());
        if(t.perimetro()>10){
            System.out.println("El perímetro es mayor a 10");
        }else{
            System.out.println("El perímetro es menor o igual a 10");
        }
    }
    
}
