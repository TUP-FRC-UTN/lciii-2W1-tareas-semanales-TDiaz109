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
public class Cliente {
    protected String nombre;
    protected int nroCliente;
    protected String telefono;

    public Cliente(String nombre, int nroCliente, String telefono) {
        this.nombre = nombre;
        this.nroCliente = nroCliente;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    

    @Override
    public String toString() {
        return "Número de cliente: "+nroCliente+"\n"+"Nombre de cliente: "+nombre+"\n"+"Teléfono de cliente: "+telefono+"\n";
    }    
}
