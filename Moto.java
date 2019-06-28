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
public class Moto extends Vehiculo{

    private int Cilindrada;
    
    public Moto(String marca, String modelo, float precio, int Cilindrada){
        super(marca,modelo,precio);
        this.Cilindrada=Cilindrada;
    }
    

    @Override
    public String ToString() {
        return "Marca: "+this.GetMarca()+" // Modelo: "+this.GetModelo()+" // Cilindrada: "+this.GetCilindrada()+" // Precio: "+this.GetPrecio()+" ";
    }

    @Override
    public String GetMarca() {
        return super.marca;
    }

    @Override
    public String GetModelo() {
        return super.modelo;
    }

    @Override
    public float GetPrecio() {
        return super.precio;
    }

    public int GetCilindrada() {
        return this.Cilindrada;
    }
} 

