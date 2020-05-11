/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autos;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Autos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precioDia = 300;
        double kilometraje;        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cantidad de KM realizados?: ");
        kilometraje = sc.nextDouble();
        
        if(kilometraje <= 200){
            System.out.println("Importe a cobrar: $"+precioDia);
        }else if(kilometraje > 200 && kilometraje<=1000){
            double recargo = (kilometraje-200)*5;
            double importe  = precioDia + recargo;
            System.out.println("Importe a cobrar: $"+importe);
        }else{
            double recargo = (kilometraje-200)*10;
            double importe  = precioDia + recargo;
            System.out.println("Importe a cobrar: $"+importe);
        }
    }
    
}

