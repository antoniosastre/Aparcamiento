/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author antoniosastre
 */
public class Aparcamiento {
	
	private static GUI interfaz = new GUI();
	private static ArrayList<Vehiculo> lista = new ArrayList(2000);
	private static boolean archcargado=false;

/**
 *Constructor vacío de la clase aparcamiento.                                                   
 */	
	public void Aparcamiento(){
		
	}
	
	
/**
 *Iniciar la interfaz. Muestra la interfaz.                                                   
 */	
	public void iniciar(){
		mostrar();
		interfaz.numveh(lista.size());
	}
	
/**
 * Desecha la interfaz para salir del programa.                                                   
 */
	public static void salir(){
		interfaz.dispose();
	}
	
/**
 * Actualiza el cuadro de texto de la interfaz.
 * El que se coloca a la izquierda.
 */
	public static void cuadrotexto(){
	
		String todotexto= "";
		
		for (int i=0;i<lista.size();i++){
			
		
		if(lista.get(i) instanceof Coche){
			Coche c = (Coche)lista.get(i);
			
			todotexto += c.imprimir();
					
					
		}else if(lista.get(i) instanceof Motocicleta){
			Motocicleta m = (Motocicleta)lista.get(i);
				
			todotexto += m.imprimir();
			
					
		}else if(lista.get(i) instanceof Camion){		
			Camion ca = (Camion)lista.get(i);
					
			todotexto += ca.imprimir();
					
			}
		}
		interfaz.getCuadroTexto().setText(todotexto);
		
	}
	
/**
 *Añade un nuevo vehículo al ArrayList dependiendo
	 * del vehículo que se haya seleccionado
	 * en la interfaz.
 */
	public static void anadir(){
		
		
		if(lista.size()==2000){
			Ventana advert = new Ventana("El aparcamiento está lleno.","Espere a que salga algún vehículo.");
			advert.setLocationRelativeTo(null);
			advert.setVisible(true);
			
		}else{
			
		if(interfaz.getSelectorvehiculo().getSelectedIndex()==0){
			
		if(estaya(interfaz.getMatricula().getText())==true){
		
			Ventana advert = new Ventana("Matrícula ya introducida anteriormente.","No se puede introducir dos veces el mismo vehículo");
			advert.setLocationRelativeTo(null);
			advert.setVisible(true);
		
		}else{
		try{	
			Calendar calendario = new GregorianCalendar();
		
		if(interfaz.getTipovehiculo().getSelectedIndex()==0){
			
		Coche coche = new Coche(interfaz.dmatricula(), interfaz.dmarca(), interfaz.dmodelo(), interfaz.dcolor(), calendario.getTimeInMillis(),
			Integer.parseInt(interfaz.getPuertas().getText().replaceAll(" ","")),Integer.parseInt(interfaz.getPasajeros().getText().replaceAll(" ","")));
			lista.add(coche);
			interfaz.insertardesplegable(coche.getMatricula());
			
			
			
		}else if(interfaz.getTipovehiculo().getSelectedIndex()==1){
		Motocicleta motocicleta = new Motocicleta(interfaz.dmatricula(), interfaz.dmarca(), interfaz.dmodelo(), interfaz.dcolor(), calendario.getTimeInMillis(),
			Integer.parseInt(interfaz.getCilindrada().getText().replaceAll(" ","")), interfaz.getSidecar().isSelected());
			lista.add(motocicleta);
			interfaz.insertardesplegable(motocicleta.getMatricula());
		
		}else if(interfaz.getTipovehiculo().getSelectedIndex()==2){
			Camion camion = new Camion(interfaz.dmatricula(), interfaz.dmarca(), interfaz.dmodelo(), interfaz.dcolor(), calendario.getTimeInMillis(), 
				Integer.parseInt(interfaz.getTara().getText().replaceAll(" ","")),Integer.parseInt(interfaz.getPma().getText().replaceAll(" ","")));
			lista.add(camion);
			interfaz.insertardesplegable(camion.getMatricula());
			
		}
		}catch(Exception ex){
			Ventana adv = new Ventana("Debe rellenar todos los datos correctamente.","Debe rellenar todos los campos. Introduzca solo números en los campos numéricos y use \".\" como separador decimal.");
			adv.setLocationRelativeTo(null);
			adv.setVisible(true);
			
		}
		
		}	
		
		}
}
		cuadrotexto();
		interfaz.numveh(lista.size());
		interfaz.limpiar();
	}

	
	/**
 *Devuleve un boolean dependiendo si una matrícula ya ha sido introducida
	 * en el parking.
	 * 
	 * @param  mat La matrícula a buscar.
	 * 
	 * @return 
	 *	True en caso de que se encuentre.
	 *	False en caso de que no haya coincidencias.
 */
	public static boolean estaya(String mat){
		
		boolean result = false;
		
		for(int i=0;i<lista.size();i++){
		if (lista.get(i).getMatricula().replace(" ","").equalsIgnoreCase(mat.replace(" ",""))){
			return true;
			}
		
		}
		
		return result;
	}
	
	/*
	public static void modificar(int pos){
		
		if(lista.get(pos) instanceof Coche){
			Coche c = (Coche)lista.get(pos);
			
					
					
		}else if(lista.get(pos) instanceof Motocicleta){
			Motocicleta m = (Motocicleta)lista.get(pos);
				
			
					
		}else if(lista.get(pos) instanceof Camion){		
			Camion ca = (Camion)lista.get(pos);
					
					
			}
		
		
		
		
	}
	 * 
	 */
	
	/**
 *Calcula la deuda en céntimos de lo que lleva
	 * un vehículo en el aparcamiento.
	 * 
	 * @param pos Posición de vehículo en el ArrayList lista.
	 * 
	 * @return Integer del valor en céntimos.
 */
	
	public static int calcoste(int pos){
		
		int coste = 0;
		
		if(lista.get(pos) instanceof Coche){
			Coche c = (Coche)lista.get(pos);
			
			coste = c.calcularprecio();
					
					
		}else if(lista.get(pos) instanceof Motocicleta){
			Motocicleta m = (Motocicleta)lista.get(pos);
				
			coste = m.calcularprecio();
			
					
		}else if(lista.get(pos) instanceof Camion){		
			Camion ca = (Camion)lista.get(pos);
					
			coste = ca.calcularprecio();
					
			}
		
		return coste;
	}
	
	
	/**
 *Rellena los campos de la interfaz gráfica con los
	 * datos del vehículo que se haya introducido.
	 * 
	 * @param  mat String con una matrícula.
	 * 
 */
	public static void buscar(String mat){
		
		interfaz.limpiar();
		int result=0;
		for(int i=0;i<lista.size();i++){
			if (lista.get(i).getMatricula().replace(" ","").equalsIgnoreCase(mat.replace(" ",""))){
				rellenarCampos(i);
				result++;
			}	
		}
		
		if (result==0){
			Ventana advertencia = new Ventana("No existen registros que coincidan con su búsqueda.","Pruebe con otra matrícula.");
			advertencia.setLocationRelativeTo(null);
			advertencia.setVisible(true);
			
		}
		
	}
	
	/**
 *Muestra la interfaz y la centra.                                                   
 */
	public void mostrar(){
		
	getInterfaz().setLocationRelativeTo(null);
		getInterfaz().setVisible(true);	
	}
	
	
	/**
 *Rellena los campos de la interfaz con la posición
	 * del ArrayList lista especificada. Teniendo en cuenta el tipo
	 * de vehículo del que se trata.
	 * 
	 * @param i Integer con la posición del ArrayList
 */
	public static void rellenarCampos(int i){
		
		interfaz.limpiar();
		
		
		if(lista.get(i) instanceof Coche){
			Coche c = (Coche)lista.get(i);
					
			interfaz.getTipovehiculo().setSelectedIndex(0);
		
			interfaz.getMatricula().setText(c.getMatricula());
			interfaz.getColor().setText(c.getColor());
			interfaz.getMarca().setText(c.getMarca());
			interfaz.getModelo().setText(c.getModelo());
			interfaz.getPuertas().setText(""+c.getPuertas());
			interfaz.getPasajeros().setText(""+c.getPasajeros());
					
					
		}else if(lista.get(i) instanceof Motocicleta){
					
			Motocicleta m = (Motocicleta)lista.get(i);
			interfaz.getTipovehiculo().setSelectedIndex(1);
					
			interfaz.getMatricula().setText(m.getMatricula());
			interfaz.getColor().setText(m.getColor());
			interfaz.getMarca().setText(m.getMarca());
			interfaz.getModelo().setText(m.getModelo());
			interfaz.getCilindrada().setText(""+m.getCilindrada());
			interfaz.getSidecar().setSelected(m.isSidecar());
					
					
		}else if(lista.get(i) instanceof Camion){
					
			Camion ca = (Camion)lista.get(i);
			interfaz.getTipovehiculo().setSelectedIndex(2);
					
			interfaz.getMatricula().setText(ca.getMatricula());
			interfaz.getColor().setText(ca.getColor());
			interfaz.getMarca().setText(ca.getMarca());
			interfaz.getModelo().setText(ca.getModelo());
			interfaz.getTara().setText(""+ca.getTara());
			interfaz.getPma().setText(""+ca.getPma());
					
			}
		
	}
	
		/**
 *Elimina un vehículo del aparcameinto en todos los registros
	 * en los que está incluido.
	 * 
	 * @param pos Posición del ArrayList.
 */
	
	public static void eliminar(int pos){
		
		if(interfaz.getSelectorvehiculo().getSelectedIndex()!=0){
			
		lista.remove(pos);
		
		interfaz.quitardesplegable(pos);
		
	}
		cuadrotexto();
		interfaz.numveh(lista.size());
	}
	
		/**
 *Guarda un archivo de texto con todos los datos de vehículos
	 * introducidos en el aparcamiento.
 */
	public static void guardar(){
		
		File dir = new File(System.getProperty("user.dir"));
		String barra = System.getProperty("file.separator");
		PrintWriter nuevoregistro = null;
        try {
            nuevoregistro = new PrintWriter(dir+barra+"Archivo.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Fallo al crear el archivo de texto.");
        }

	
	for(int i=0; i<lista.size();i++){
		
		if(lista.get(i) instanceof Coche){
			Coche v = (Coche)lista.get(i);
			
			nuevoregistro.println("Coche");
			nuevoregistro.println(v.log());
					
					
		}else if(lista.get(i) instanceof Motocicleta){
			Motocicleta m = (Motocicleta)lista.get(i);
			
			nuevoregistro.println("Motocicleta");
			nuevoregistro.println(m.log());
			
					
		}else if(lista.get(i) instanceof Camion){		
			Camion ca = (Camion)lista.get(i);
			
			nuevoregistro.println("Camion");
			nuevoregistro.println(ca.log());
					
			}
		
		
		
		
		
	}

        nuevoregistro.close();
	}
	
		/**
 *Carga los datos del archivo de texto en el que
	 * se guardan los datos de todos los vehículos.
 */
	public static void cargar(){
		
		File dir = new File(System.getProperty("user.dir"));
		String barra = System.getProperty("file.separator");
		
            BufferedReader lecturalog = null;
	    
	   try{
	    lecturalog = new BufferedReader(new FileReader(dir+barra+"Archivo.txt"));
	   
		String tipo = lecturalog.readLine();
		
	    while(tipo.equals("Coche")||tipo.equals("Motocicleta")||tipo.equals("Camion")){
	    
	    if(tipo.equals("Coche")){
		    
		    Coche vehiculo = new Coche(lecturalog.readLine(),
			    lecturalog.readLine(),
			    lecturalog.readLine(),
			    lecturalog.readLine(),
			    Long.parseLong(lecturalog.readLine()),
			    Integer.parseInt(lecturalog.readLine().replaceAll(" ","")),
			    Integer.parseInt(lecturalog.readLine().replaceAll(" ","")));
			
			lista.add(vehiculo);
			interfaz.insertardesplegable(vehiculo.getMatricula());
			
		    
		    
	    }else if (tipo.equals("Motocicleta")){
		    
		   Motocicleta vehiculo = new Motocicleta(lecturalog.readLine(),
			    lecturalog.readLine(),
			    lecturalog.readLine(),
			    lecturalog.readLine(),
			   Long.parseLong(lecturalog.readLine()),
			    Double.parseDouble(lecturalog.readLine().replaceAll(" ","")),
			    Boolean.parseBoolean(lecturalog.readLine()));
			
			lista.add(vehiculo);
			interfaz.insertardesplegable(vehiculo.getMatricula());
		    
		    
	    }else if (tipo.equals("Camion")){
		    
		    Camion vehiculo = new Camion(lecturalog.readLine(),
			    lecturalog.readLine(),
			    lecturalog.readLine(),
			    lecturalog.readLine(),
			    Long.parseLong(lecturalog.readLine()),
			    Double.parseDouble(lecturalog.readLine().replaceAll(" ","")),
			    Double.parseDouble(lecturalog.readLine().replaceAll(" ","")));
			
			lista.add(vehiculo);
			interfaz.insertardesplegable(vehiculo.getMatricula());
		
	    }
	    
	    
	    tipo = lecturalog.readLine();
	    if(tipo==null){
		    break;
	    }
	     
	    }   
	    lecturalog.close();
	    
	    cuadrotexto();
		interfaz.numveh(lista.size());
	   
	    }catch (Exception ex){
		    
		    Ventana adv = new Ventana("Fallo al cargar el archivo de datos guardados.","Quizás sea por que no hay ningún archivo guardado previamente.");
		    adv.setLocationRelativeTo(null);
		    adv.setVisible(true);
	    }
	   
		
	}
	

	     
	/**
	 * @return the interfaz
	 */
	public GUI getInterfaz() {
		return interfaz;
	}

	/**
	 * @param interfaz the interfaz to set
	 */
	public void setInterfaz(GUI interfaz) {
		this.interfaz = interfaz;
	}

	/**
	 * @return the lista
	 */
	public static ArrayList getLista() {
		return lista;
	}

	/**
	 * @param lista the lista to set
	 */
	public void setLista(ArrayList lista) {
		this.lista = lista;
	}

	/**
	 * @return the archcargado
	 */
	public static boolean isArchcargado() {
		return archcargado;
	}

	/**
	 * @param aArchcargado the archcargado to set
	 */
	public static void setArchcargado(boolean aArchcargado) {
		archcargado = aArchcargado;
	}
	
}
