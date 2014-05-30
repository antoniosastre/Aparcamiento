/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.text.DecimalFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author antoniosastre
 */
public class Camion extends Vehiculo{
	
	private double tara;
	private double pma;

		/**
 *Constructor de la clase Camion.
	 * 
	 * @param matricula String con la matrícula.
	 * @param marca String con la marca.
	 * @param modelo String con el modelo.
	 * @param color String con el color.
	 * @param tiempo Long con la fecha de entrada en milisegundos.
	 * @param tara Double con la tara del vehículo.
	 * @param pma Double con el P.M.A.
 */
	public Camion(String matricula, String marca, String modelo, String color, long tiempo, double tara, double pma) {
		super(matricula, marca, modelo, color, tiempo);
		this.tara = tara;
		this.pma = pma;
	}

	
		/**
 *Imprime la información de un camión con formato.
	 * @return String con el texto.
 */
	public String imprimir(){
		String texto="";
		
			texto += super.imprimir().replace("Vehículo", "Camión");
			//texto += "   Tara: "+getTara()+"Kg. Y P.M.A.: "+getPma()+"Kg."+System.getProperty("line.separator")+System.getProperty("line.separator");
			texto += System.getProperty("line.separator")+System.getProperty("line.separator");
		return texto;
	}
	
	/**
 *Imprime la información de un camión sin formato.
	 * @return String con el texto.
 */
	public String log(){
		String texto="";
		
		texto += super.log();
		texto += getTara()+System.getProperty("line.separator");
		texto += getPma();
		
		return texto;
	}
	
	
	/**
 *Calcula el coste de este vehículo (en céntimos) según
	 * el tiempo que lleva en el aparcamiento.
	 * @return Integer con los céntimos que se deben.
 */
	public int calcularprecio(){
		GregorianCalendar d = new GregorianCalendar();
		int preciohora=900;
		int preciominuto=15;
		
		if(this.getTara()>3500){
			preciominuto = 20;
			preciohora = 1200;
		}
		
		int centimos=0;
		long milis= d.getTimeInMillis() - super.getTiempo();
		
		if (milis<=3600000){
			centimos = preciohora;
		}else if(milis>3600000){
			
		}
		centimos = Integer.parseInt((milis/60000)*preciominuto+"");
		return centimos;
	}
	
	
	
	/**
	 * @return the tara
	 */
	public double getTara() {
		return tara;
	}

	/**
	 * @param tara the tara to set
	 */
	public void setTara(double tara) {
		this.tara = tara;
	}

	/**
	 * @return the pma
	 */
	public double getPma() {
		return pma;
	}

	/**
	 * @param pma the pma to set
	 */
	public void setPma(double pma) {
		this.pma = pma;
	}
	
	
	
}
