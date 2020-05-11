/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente [] cartera;
        double promedioEdad = 0;
        int sumatoriaEdad = 0;
        int cliente5 = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de clientes: ");
        int cantCliente = sc.nextInt();
        
        cartera = new Cliente[cantCliente];
        for (int i = 0; i < cantCliente; i++) {
            System.out.print("Ingrese número cliente "+i+":");            
            int numero = sc.nextInt();
            
            System.out.print("Ingrese nombre cliente "+i+":");
            sc.nextLine();
            String nombre = sc.nextLine();
            
            System.out.print("Ingrese antigüedad cliente "+i+":");
            int antiguedad = sc.nextInt();
            
            System.out.print("Ingrese nombre mascota del cliente "+i+":");
            sc.nextLine();
            String mascota = sc.nextLine();
            
            System.out.print("Ingrese edad mascota del cliente "+i+":");
            int edadMascota = sc.nextInt();
            
            cartera[i] = new Cliente(numero,nombre,antiguedad,mascota,edadMascota);
        }
        
        
        
        for (int i = 0; i < cartera.length; i++) {
            sumatoriaEdad += cartera[i].getEdadMascota();
            promedioEdad = (double)sumatoriaEdad/cartera.length;
        }
        
        for (int i = 0; i < cartera.length; i++) {
            if(cartera[i].getAntiguedad()>= 5)
                cliente5++;
        }
        
        System.out.println("La cantidad de clientes es "+cantCliente);
        System.out.println("El promedio de edad de las mascotas es: "+promedioEdad);
        System.out.println("Los clientes con una antigüedad de más de 5 años son "+cliente5);
    }    
}
