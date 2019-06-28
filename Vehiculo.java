
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonready;

import java.util.Properties;

/**
 *
 * @author Cristian
 */
public abstract class Vehiculo {
    public String marca;
    public String modelo;
    public float precio;
    
    public Vehiculo(String marca, String modelo, float precio){
	    this.marca=marca;
	    this.modelo=modelo;
	    this.precio=precio;
    }
    
    public abstract String GetMarca();
    public abstract String GetModelo();
    public abstract float GetPrecio();
    
    
    public abstract String ToString();
}
