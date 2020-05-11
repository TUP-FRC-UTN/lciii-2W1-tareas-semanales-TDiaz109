/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author tomas
 */
public class Equipo {   
    
    private String nombreEquipo;    
    private int puntos;
    private int pGanados;
    private int pEmpatados;
    private int pPerdidos;
    private int gFavor;
    private int gContra;
    private int posicion;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getpGanados() {
        return pGanados;
    }

    public void setpGanados(int pGanados) {
        this.pGanados = pGanados;
    }

    public int getpEmpatados() {
        return pEmpatados;
    }

    public void setpEmpatados(int pEmpatados) {
        this.pEmpatados = pEmpatados;
    }

    public int getpPerdidos() {
        return pPerdidos;
    }

    public void setpPerdidos(int pPerdidos) {
        this.pPerdidos = pPerdidos;
    }

    public int getgFavor() {
        return gFavor;
    }

    public void setgFavor(int gFavor) {
        this.gFavor = gFavor;
    }

    public int getgContra() {
        return gContra;
    }

    public void setgContra(int gContra) {
        this.gContra = gContra;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Equipo(String nombreEquipo, int puntos, int pGanados, int pEmpatados, int pPerdidos, int gFavor, int gContra, int posicion) {
        this.nombreEquipo = nombreEquipo;
        this.puntos = puntos;
        this.pGanados = pGanados;
        this.pEmpatados = pEmpatados;
        this.pPerdidos = pPerdidos;
        this.gFavor = gFavor;
        this.gContra = gContra;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", puntos=" + puntos + ", pGanados=" + pGanados + ", pEmpatados=" + pEmpatados + ", pPerdidos=" + pPerdidos + ", gFavor=" + gFavor + ", gContra=" + gContra + ", posicion=" + posicion + '}';
    }
    
    
}
