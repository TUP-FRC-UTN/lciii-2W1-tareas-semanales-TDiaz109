/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author tomas
 */
public class Producto {
    private String descripcion;
    private Material [] materiales;
    private int cantidad;

    public Producto(String descripcion, int cantidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        materiales = new Material[cantidad];
    }    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void agregarMaterial(Material material){
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] == null){
                materiales[i] = material;
                break;
            }            
        }
    }
    
    public double costoTotal(){
        double costoTotal = 0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null){
                if(materiales[i].getValorUnitario()>0)
                    costoTotal+= materiales[i].getValorUnitario();
            }           
        }
        return costoTotal;
    }
    
    public boolean formaParte(int codigo){
        boolean formaParte = false;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i] != null){
                if(materiales[i].getCodigo() == codigo ){
                    formaParte = true;
                    break;
                }                    
            }           
        }
        return formaParte;
    }
}
