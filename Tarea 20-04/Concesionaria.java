/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Concesionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int años;
        int cantAutos = 0;
        int cantNuevo = 0;
        int cantPoco = 0;
        int cantMucho = 0;
        int cantAnt = 0;
        int sumAños = 0;
        Scanner sc = new Scanner(System.in);      
        
        do {
            System.out.print("Años de antigüedad del vehículo: ");
        años = sc.nextInt();
             if(años>=1 && años<=5){
                System.out.println("NUEVO");
                cantAutos++;
                cantNuevo++;
                sumAños+=años;
            }else if(años>=6 && años<=10){
                System.out.println("POCO USO");
                cantAutos++;
                cantPoco++;
                sumAños+=años;
            }else if(años>=11 && años<=20){
                System.out.println("MUCHO USO");
                cantAutos++;
                cantMucho++;
                sumAños+=años;
            }else if(años>20){
                System.out.println("MUY ANTIGUO");
                cantAutos++;
                cantAnt++;
            }
        } while (años != 0);
        
        System.out.println("Cantidad total de autos: "+cantAutos);
        System.out.println("Cantidad total de autos con poco uso: "+cantPoco);
        double promedio = (double)sumAños/(cantAutos-cantAnt);
        System.out.println("Promedio de antigüedad: "+promedio);
    }    
}
