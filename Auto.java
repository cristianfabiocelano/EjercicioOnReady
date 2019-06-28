
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonready;

/**
 *
 * @author Cristian
 */
public class Auto extends Vehiculo {

    private int puertas;
    
    public Auto(String marca, String modelo, float precio, int puertas){
        super(marca,modelo,precio);
        this.puertas=puertas;
        
    }
    
    
    
    @Override
    public String ToString() {
        return "Marca: "+ this.GetMarca() +" // Modelo: "+this.GetModelo()+" // Puertas: "+this.GetPuertas()+" // Precio: "+this.GetPrecio()+" ";
    }

    @Override
    public String GetMarca() {
        return  super.marca;
    }

    @Override
    public String GetModelo() {
        return super.modelo;
    }

    @Override
    public float GetPrecio() {
        return super.precio;
    }
    
    public int GetPuertas() {
        return this.puertas;
    }
}
