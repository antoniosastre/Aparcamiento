/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author antoniosastre
 */
public class Coche extends Vehiculo{
	
	private int puertas;
	private int pasajeros;
	

	/**
 *Constructor de la clase Coche.
	 * 
	 * @param matricula String con la matrícula.
	 * @param marca String con la marca.
	 * @param modelo String con el modelo.
	 * @param color String con el color.
	 * @param tiempo Long con la fecha de entrada en milisegundos.
	 * @param puertas Integer con el número de puertas.
	 * @param pasajeros Integer con el número de pasajeros.
 */
	public Coche(String matricula, String marca, String modelo, String color, long tiempo, int puertas, int pasajeros) {
		super(matricula, marca, modelo, color, tiempo);
		this.puertas = puertas;
		this.pasajeros = pasajeros;
	}
	
	/**
 *Imprime la información de un coche con formato.
	 * @return String con el texto.
 */
	public String imprimir(){
		String texto="";
		
			texto += super.imprimir().replace("Vehículo", "Coche");
			//texto += "   Nº de Puertas: "+getPuertas()+" Y Nº de Pasajeros: "+getPasajeros()+System.getProperty("line.separator")+System.getProperty("line.separator");
			texto += System.getProperty("line.separator")+System.getProperty("line.separator");
		return texto;
	}
	
	/**
 *Imprime la información de un coche sin formato.
	 * @return String con el texto.
 */
	public String log(){
		String texto="";
		
		texto += super.log();
		texto += getPuertas()+System.getProperty("line.separator");
		texto += getPasajeros();
		
		return texto;
	}
	
	/**
 *Calcula el coste de este vehículo (en céntimos) según
	 * el tiempo que lleva en el aparcamiento.
	 * @return Integer con los céntimos que se deben.
 */
	public int calcularprecio(){
		long d = new GregorianCalendar().getTimeInMillis();
		int preciohora = 600;
		int preciominuto = 10;
		int centimos=0;
		
		long milis= d - super.getTiempo();
		
		if (milis<=3600000){
			centimos = preciohora;
		}else if(milis>3600000){
			
			centimos = Integer.parseInt((milis/60000)*preciominuto+"");
			
		}
		
		return centimos;
	}
	
	

	/**
	 * @return the puertas
	 */
	public int getPuertas() {
		return puertas;
	}

	/**
	 * @param puertas the puertas to set
	 */
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	/**
	 * @return the pasajeros
	 */
	public int getPasajeros() {
		return pasajeros;
	}

	/**
	 * @param pasajeros the pasajeros to set
	 */
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	

	
	
}
