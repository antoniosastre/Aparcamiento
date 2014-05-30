/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author antoniosastre
 */
public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private long tiempo;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd'/'MM'/'yyyy' a las' HH:mm");
	
	
	/**
 *Constructor de la clase Vehículo.
	 * 
	 * @param matricula String con la matrícula.
	 * @param marca String con la marca.
	 * @param modelo String con el modelo.
	 * @param color String con el color.
	 * @param tiempo Long con la fecha de entrada en milisegundos.
 */
	public Vehiculo(String matricula, String marca, String modelo, String color, long tiempo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tiempo = tiempo;
	}

	
	/**
 *Imprime la información de un Vehículo con formato.
	 * @return String con el texto.
 */
	public String imprimir(){
		Date d = new Date(getTiempo());
		String texto="";
			texto += getMatricula()+System.getProperty("line.separator");
			texto += "   Vehículo marca: "+getMarca()+System.getProperty("line.separator");
			texto += "   Modelo: "+getModelo()+" Color: "+getColor()+System.getProperty("line.separator");
			texto += "   Introducido : "+sdf.format(d)+System.getProperty("line.separator");
			
		return texto;
	}
	
	/**
 *Imprime la información de un Vehículo sin formato.
	 * @return String con el texto.
 */
	public String log(){
		String texto="";
		
		
		texto += getMatricula()+System.getProperty("line.separator");
		texto += getMarca()+System.getProperty("line.separator");
		texto += getModelo()+System.getProperty("line.separator");
		texto += getColor()+System.getProperty("line.separator");
		texto += getTiempo()+System.getProperty("line.separator");
		
		return texto;
	}
	
	
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the tiempo
	 */
	public long getTiempo() {
		return tiempo;
	}

	/**
	 * @param tiempo the tiempo to set
	 */
	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}
	
}
