
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioonready;

import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class Concesionaria implements IConcesionaria {

    private ArrayList<Vehiculo> lista;
    
    public Concesionaria ()
    {
        this.lista= new ArrayList<Vehiculo>();
    }

    public void Agregar(Vehiculo v)
    {
	this.lista.add(v);
    }    

    @Override
    public String MostrarVehiculos() {
        int i;
        String retorno="";
        for(i=0; i<this.lista.size() ;i++)
        {
            retorno = retorno + "\n" + this.lista.get(i).ToString();
        }
        return retorno;
    }

    @Override
    public String MostrarMasCaro() {
        int i;
        String retorno="";
        float Caro=0;
        for(i=0; i<this.lista.size();i++)
        {
            if(this.lista.get(i).GetPrecio()>Caro)
            {
                retorno= this.lista.get(i).GetMarca()+" "+this.lista.get(i).GetModelo();
                Caro=this.lista.get(i).GetPrecio();
            }
            
        }
        return "Vehículo más caro: "+retorno;
    }

    @Override
    public String MostrarMasBarato() {
            int i;
        String retorno="";
        float Barato=0;
        for(i=0; i<this.lista.size();i++)
        {
            if(i==0)
            {
                Barato=this.lista.get(i).GetPrecio();
            }
            if(this.lista.get(i).GetPrecio()<Barato)
            {
                retorno= this.lista.get(i).GetMarca()+" "+this.lista.get(i).GetModelo();
            }
            
        }
        return "Vehículo más barato: "+retorno;
    }

    @Override
    public String MostrarModeloConLetra(char letra) {
        int i;
        int j;
        String retorno="Vehículo que contiene en el modelo la letra ‘"+letra+"’: \n";
        for(i=0; i<this.lista.size();i++)
        {
        	
        	for(j=0; j<this.lista.get(i).GetModelo().length();j++)
            {
            if(this.lista.get(i).GetModelo().contains(letra+""))
                {
            		
                    retorno = retorno + this.lista.get(i).GetMarca()+" "+this.lista.get(i).GetModelo()+" "+this.lista.get(i).GetPrecio()+"\n";
                    break;//Solo encuentra el primer Modelo que contiene la letra pasada como parametro
                }
            }
        }
        return retorno;
    }

    @Override
	public String OrdenarMenorMayor() {
		int i, j;
		StringBuilder sb = new StringBuilder();
		sb.append("Vehículos ordenados por precio de mayor a menor:\n");
		Vehiculo aux;
		for (i = 0; i < this.lista.size() - 1; i++) {
			for (j = i + 1; j < this.lista.size(); j++) {
				if (this.lista.get(j).GetPrecio() > this.lista.get(i).GetPrecio()) {
					aux = this.lista.get(j);
					this.lista.set(j, this.lista.get(i));
					this.lista.set(i, aux);
				}
			}
		}
	for(i=0; i<this.lista.size();i++)
	{
		sb.append("\n");
		sb.append(this.lista.get(i).GetMarca()+" "+this.lista.get(i).GetModelo());
	}
	return sb.toString();
    }
}
    
