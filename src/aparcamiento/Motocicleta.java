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
public class Motocicleta extends Vehiculo{
	
	private double cilindrada;
	private boolean sidecar;

	
	/**
 *Constructor de la clase Motocicleta.
	 * 
	 * @param matricula String con la matrícula.
	 * @param marca String con la marca.
	 * @param modelo String con el modelo.
	 * @param color String con el color.
	 * @param tiempo Long con la fecha de entrada en milisegundos.
	 * @param cilindrada Double con la cilindrada del vehículo.
	 * @param sidecar Boolean que indica si tiene o no sidecar.
 */
	public Motocicleta(String matricula, String marca, String modelo, String color, long tiempo, double cilindrada, boolean sidecar) {
		super(matricula, marca, modelo, color, tiempo);
		this.cilindrada = cilindrada;
		this.sidecar = sidecar;
	}
	
	/**
 *Imprime la información de una motocicleta con formato.
	 * @return String con el texto.
 */
	public String imprimir(){
		String texto="";
		String side = "No tiene sidecar";
		
		if(isSidecar()==true){
				side = "Tiene sidecar";
			}
		
			texto += super.imprimir().replace("Vehículo", "Motocicleta");
			//texto += "   Cilindrada: "+getCilindrada()+"cc. "+side+System.getProperty("line.separator")+System.getProperty("line.separator");
			texto += System.getProperty("line.separator")+System.getProperty("line.separator");
		return texto;
	}
	
	/**
 *Imprime la información de una motocicleta sin formato.
	 * @return String con el texto.
 */
	public String log(){
		String texto="";
		
		texto += super.log();
		texto += getCilindrada()+System.getProperty("line.separator");
		texto += isSidecar();
		
		return texto;
	}
	
	
	/**
 *Calcula el coste de este vehículo (en céntimos) según
	 * el tiempo que lleva en el aparcamiento.
	 * @return Integer con los céntimos que se deben.
 */
	public int calcularprecio(){
		GregorianCalendar d = new GregorianCalendar();
		int preciohora=300;
		int preciominuto = 5;
		
		if(this.isSidecar()){
			preciominuto = 10;
			preciohora = 600;
		}
		
		int centimos=0;
		long milis= d.getTimeInMillis() - super.getTiempo();
		
		if (milis<=3600000){
			centimos = preciohora;
		}else if(milis>3600000){
			
			centimos = Integer.parseInt((milis/60000)*preciominuto+"");
			
		}
		
		return centimos;
	}
	

	/**
	 * @return the cilindrada
	 */
	public double getCilindrada() {
		return cilindrada;
	}

	/**
	 * @param cilindrada the cilindrada to set
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * @return the sidecar
	 */
	public boolean isSidecar() {
		return sidecar;
	}

	/**
	 * @param sidecar the sidecar to set
	 */
	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}
	
	
}
