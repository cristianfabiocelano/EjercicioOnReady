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
public class EjercicioOnReady {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  	Moto m1= new Moto("Honda","Titan",(float) 60000.00,125);
	Moto m2= new Moto("Yamaha","YBR",(float)80500.50,160);
	Auto a1= new Auto("Peugeot","206",(float)200000.00,4);
	Auto a2= new Auto("Peugeot","208",(float)250000.00,5);
	
	Concesionaria c= new Concesionaria();
	c.Agregar(a1);
	c.Agregar(m1);
	c.Agregar(a2);
	c.Agregar(m2);	

	System.out.println(c.MostrarVehiculos());
	System.out.println("=============================");
	System.out.println(c.MostrarMasCaro());
	System.out.println("=============================");
	System.out.println(c.MostrarMasBarato());
	System.out.println("=============================");
	System.out.println(c.MostrarModeloConLetra('Y'));
	System.out.println("=============================");
	System.out.println(c.OrdenarMenorMayor());
	System.out.println("=============================");
    }
    
}
