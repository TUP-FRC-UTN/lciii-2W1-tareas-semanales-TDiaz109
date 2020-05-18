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
public class ClientePreferencial extends Cliente{
    
    private double saldo;
    private double limite;
    private String domicilio;
    
    public ClientePreferencial(String nombre, int nroCliente, String telefono) {
        super(nombre, nroCliente, telefono);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return super.toString()+"Saldo: $"+saldo+"\n"+"Limite: $"+limite+"\n"+"Domicilio del cliente: "+domicilio;
    }
    
    
}
