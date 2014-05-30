/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUI.java
 *
 * Created on 16-nov-2011, 16:49:50
 */
package aparcamiento;

/**
 *
 * @author antoniosastre
 */
public class GUI extends javax.swing.JFrame {

	/** Creates new form GUI */
	public GUI() {
		initComponents();
		
		getCilindrada().setEnabled(false);
		getSidecar().setEnabled(false);
		getTara().setEnabled(false);
		getPma().setEnabled(false);
		bcalcular.setEnabled(false);
		beliminar.setEnabled(false);
		babandonar.setEnabled(false);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipovehiculo = new javax.swing.JComboBox();
        matricula = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        color = new javax.swing.JTextField();
        puertas = new javax.swing.JTextField();
        pasajeros = new javax.swing.JTextField();
        tara = new javax.swing.JTextField();
        pma = new javax.swing.JTextField();
        cilindrada = new javax.swing.JTextField();
        sidecar = new javax.swing.JCheckBox();
        selectorvehiculo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        cuadroTexto = new javax.swing.JTextArea();
        banadir = new javax.swing.JButton();
        beliminar = new javax.swing.JButton();
        bcalcular = new javax.swing.JButton();
        babandonar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bbuscar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        numveh = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aparcamiento 1.0");

        tipovehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Coche", "Motocicleta", "Camión" }));
        tipovehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipovehiculoActionPerformed(evt);
            }
        });

        sidecar.setText("Sidecar");

        selectorvehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Añadir / Buscar Vehiculo>" }));
        selectorvehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorvehiculoActionPerformed(evt);
            }
        });

        cuadroTexto.setColumns(20);
        cuadroTexto.setRows(5);
        jScrollPane1.setViewportView(cuadroTexto);

        banadir.setText("Añadir Vehículo");
        banadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                banadirMouseClicked(evt);
            }
        });

        beliminar.setText("Eliminar Vehículo");
        beliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beliminarMouseClicked(evt);
            }
        });

        bcalcular.setText("Calcular Precio");
        bcalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcalcularMouseClicked(evt);
            }
        });

        babandonar.setText("Abandonar Aparcamiento");
        babandonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                babandonarMouseClicked(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        titulo.setText("Aparcamiento 1.1");

        jLabel2.setText("Por Antonio Sastre");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Selector de Vehículo:");

        jLabel4.setText("Tipo de Vehículo:");

        jLabel5.setText("Matrícula:");

        jLabel6.setText("Color:");

        jLabel7.setText("Marca:");

        jLabel8.setText("Modelo:");

        jLabel9.setText("Puertas:");

        jLabel10.setText("Pasajeros:");

        jLabel11.setText("Tara:");

        jLabel12.setText("P.M.A.:");

        jLabel13.setText("Cilindrada:");

        bbuscar.setText("Buscar Matrícula");
        bbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bbuscarMouseClicked(evt);
            }
        });

        jLabel14.setText("Vehículos:");

        numveh.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        numveh.setText("0");

        jMenu3.setText("Aparcamiento");

        jMenuItem1.setText("Acerca de...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Archivo");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Guardar archivo de datos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Cargar archivo de datos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 376, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(36, 36, 36)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(bcalcular)
                                    .add(banadir))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(beliminar)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(bbuscar))
                                    .add(babandonar)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel3)
                                    .add(jLabel4)
                                    .add(jLabel5)
                                    .add(jLabel6)
                                    .add(jLabel7)
                                    .add(jLabel8)
                                    .add(jLabel9)
                                    .add(jLabel11)
                                    .add(jLabel13))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, selectorvehiculo, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, tipovehiculo, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(layout.createSequentialGroup()
                                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                        .add(cilindrada, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                        .add(puertas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jLabel10))
                                                .add(layout.createSequentialGroup()
                                                    .add(tara, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jLabel12)))
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(sidecar)
                                                .add(pma)
                                                .add(pasajeros, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, modelo)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, marca)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, color)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, matricula, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 206, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                                .add(75, 75, 75))))
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(titulo)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel2))
                    .add(layout.createSequentialGroup()
                        .add(80, 80, 80)
                        .add(jLabel14)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(numveh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(titulo)
                    .add(jLabel2))
                .add(10, 10, 10)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(numveh)
                    .add(jLabel14))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(24, 24, 24)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(selectorvehiculo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(tipovehiculo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel4))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(matricula, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(color, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel6))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(marca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel7))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(modelo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel8))
                        .add(27, 27, 27)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(puertas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10)
                            .add(pasajeros, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(tara, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel12)
                            .add(jLabel11)
                            .add(pma, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(cilindrada, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel13)
                            .add(sidecar))
                        .add(56, 56, 56)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(banadir)
                            .add(beliminar)
                            .add(bbuscar))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(bcalcular)
                            .add(babandonar)))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	/*
	 * Lo que ocurre cuando el botón "Añadir Vehículo" es pulsado.
	 */
	private void banadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_banadirMouseClicked
	
		//if(banadir.getText().equals("Añadir Vehiculo")){
			Aparcamiento.anadir();
			getTipovehiculo().setSelectedIndex(0);
		//}else if(banadir.getText().equals("Guardar Cambios")){
		//	Aparcamiento.modificar(getSelectorvehiculo().getSelectedIndex()-1);
		//	getTipovehiculo().setSelectedIndex(0);
		//}
		
		
		
	}//GEN-LAST:event_banadirMouseClicked

	/*
	 * Lo que ocurre cuando el botón "Eliminar Vehículo" es pulsado.
	 */
	private void beliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beliminarMouseClicked
		Aparcamiento.eliminar(getSelectorvehiculo().getSelectedIndex()-1);
		getSelectorvehiculo().setSelectedIndex(0);
	}//GEN-LAST:event_beliminarMouseClicked

	/*
	 * Lo que ocurre cuando se produce una acción sobre el selector de tipo de vehículo.
	 */
	private void tipovehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipovehiculoActionPerformed
		
		limpiar();
		
			if(getTipovehiculo().getSelectedIndex()==0){
			
				getPuertas().setEnabled(true);
				getPasajeros().setEnabled(true);
				getCilindrada().setEnabled(false);
				getSidecar().setEnabled(false);
				getTara().setEnabled(false);
				getPma().setEnabled(false);
				
			}
			if(getTipovehiculo().getSelectedIndex()==1){
				
				getPuertas().setEnabled(false);
				getPasajeros().setEnabled(false);
				getCilindrada().setEnabled(true);
				getSidecar().setEnabled(true);
				getTara().setEnabled(false);
				getPma().setEnabled(false);
				
			}
			if(getTipovehiculo().getSelectedIndex()==2){
				
				getPuertas().setEnabled(false);
				getPasajeros().setEnabled(false);
				getCilindrada().setEnabled(false);
				getSidecar().setEnabled(false);
				getTara().setEnabled(true);
				getPma().setEnabled(true);
				
			}	
			
		
		
	}//GEN-LAST:event_tipovehiculoActionPerformed

	/*
	 * Lo que ocurre cuando se pulsa el botón de "Buscar Matrícula".
	 * 
	 */
	private void bbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bbuscarMouseClicked
		Aparcamiento.buscar(matricula.getText());
	}//GEN-LAST:event_bbuscarMouseClicked

	/*
	 * Lo que ocurre cuando se produce una acción sobre el selector de vehículo.
	 */
	private void selectorvehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorvehiculoActionPerformed
		
		if(getSelectorvehiculo().getSelectedIndex()==0){
			limpiar();
			banadir.setEnabled(true);
			bbuscar.setEnabled(true);
			bcalcular.setEnabled(false);
			beliminar.setEnabled(false);
			babandonar.setEnabled(false);
			//banadir.setText("Añadir Vehículo");
		}else{
		Aparcamiento.rellenarCampos((getSelectorvehiculo().getSelectedIndex()-1));
			banadir.setEnabled(false);
			bbuscar.setEnabled(false);
			bcalcular.setEnabled(true);
			beliminar.setEnabled(true);
			babandonar.setEnabled(true);
			//banadir.setText("Guardar Cambios");
		}
		 
	}//GEN-LAST:event_selectorvehiculoActionPerformed

	/*
	 * Lo que ocurre cuando se pulsa el botón de "Acerca De..." del menú superior.
	 * 
	 */
	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
		
		AcercaDe vent = new AcercaDe();
		vent.setLocationRelativeTo(null);
		vent.setVisible(true);
		
		
	}//GEN-LAST:event_jMenuItem1ActionPerformed

	/*
	 * Lo que ocurre cuando se pulsa el botón de "Salir" del menú superior.
	 * 
	 */
	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
		ConfirmacionSalida conf = new ConfirmacionSalida();
		conf.setLocationRelativeTo(null);
		conf.setVisible(true);
		
	}//GEN-LAST:event_jMenuItem2ActionPerformed

	
	/*
	 * Lo que ocurre cuando se pulsa el botón de "Cargar archivo de datos" del menú superior.
	 * 
	 */
	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
		
		if(Aparcamiento.isArchcargado()==false){
		Aparcamiento.cargar();
		Aparcamiento.cuadrotexto();
		Aparcamiento.setArchcargado(true);
		}
		else{
			Ventana adv = new Ventana("No se pueden cargar dos archivos de datos.","");
			adv.setLocationRelativeTo(null);
			adv.setVisible(true);
			
		}
		
	}//GEN-LAST:event_jMenuItem4ActionPerformed

	
	/*
	 * Lo que ocurre cuando se pulsa el botón de "Guardar archivo de datos" del menú superior.
	 * 
	 */
	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

		Aparcamiento.guardar();
		
	}//GEN-LAST:event_jMenuItem3ActionPerformed

	/*
	 * Lo que ocurre cuando se pulsa el botón de "Calcular precio" del menú superior.
	 * 
	 */
	private void bcalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcalcularMouseClicked
		
		Aparcamiento.calcoste(getSelectorvehiculo().getSelectedIndex()-1);
		
		VentanaPrec res = new VentanaPrec(Aparcamiento.calcoste(getSelectorvehiculo().getSelectedIndex()-1));
		res.setLocationRelativeTo(null);
		res.setVisible(true);

		
		
		
	}//GEN-LAST:event_bcalcularMouseClicked

	
	/*
	 * Lo que ocurre cuando se pulsa el botón de "Abandonar aparcamiento" del menú superior.
	 * 
	 */
	private void babandonarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_babandonarMouseClicked
		
		VentanaAband abandonar = new VentanaAband(getSelectorvehiculo().getSelectedIndex()-1);
		abandonar.setLocationRelativeTo(null);
		abandonar.setVisible(true);
		
	}//GEN-LAST:event_babandonarMouseClicked

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton babandonar;
    private javax.swing.JButton banadir;
    private javax.swing.JButton bbuscar;
    private javax.swing.JButton bcalcular;
    private javax.swing.JButton beliminar;
    private javax.swing.JTextField cilindrada;
    private javax.swing.JTextField color;
    private javax.swing.JTextArea cuadroTexto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField modelo;
    private javax.swing.JLabel numveh;
    private javax.swing.JTextField pasajeros;
    private javax.swing.JTextField pma;
    private javax.swing.JTextField puertas;
    private javax.swing.JComboBox selectorvehiculo;
    private javax.swing.JCheckBox sidecar;
    private javax.swing.JTextField tara;
    private javax.swing.JComboBox tipovehiculo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    
    
    /**
     * Vacía todos los campos de la interfaz.
     * 
     */
	public void limpiar(){
		matricula.setText(null);
		marca.setText(null);
		modelo.setText(null);
		color.setText(null);
		puertas.setText(null);
		pasajeros.setText(null);
		tara.setText(null);
		pma.setText(null);
		cilindrada.setText(null);
		sidecar.setSelected(false);		
		
	}
	
	
	/**
	 * Inserta un String en el desplegable superior.
	 * 
	 * @param s String que será el que se introduzca en el desplegable. 
	 */
	public void insertardesplegable(String s){
		getSelectorvehiculo().addItem(s);
	}
	
	/**
	 * Eliminará una posición del desplegable superior.
	 * 
	 * @param i Int que será el de la posición a eliminar. 
	 */
	public void quitardesplegable(int i){
		
		getSelectorvehiculo().removeItemAt(i+1);
	}
	
	/**
	 * Actualiza la etiqueta que contiene el número de vehículos.
	 * 
	 * @param i El número de vehículos que se desea mostrar. 
	 */
	
	public void numveh(int i){
		numveh.setText(""+i);
	}
	
	public String dmatricula(){
		return matricula.getText();
	}
	public String dmarca(){
		return marca.getText();
	}
	public String dcolor(){
		return color.getText();
	}
	public String dmodelo(){
		return modelo.getText();
	}
	
	
	
	/**
	 * @return the cilindrada
	 */
	public javax.swing.JTextField getCilindrada() {
		return cilindrada;
	}

	/**
	 * @param cilindrada the cilindrada to set
	 */
	public void setCilindrada(javax.swing.JTextField cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * @return the color
	 */
	public javax.swing.JTextField getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(javax.swing.JTextField color) {
		this.color = color;
	}

	/**
	 * @return the marca
	 */
	public javax.swing.JTextField getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(javax.swing.JTextField marca) {
		this.marca = marca;
	}

	/**
	 * @return the matricula
	 */
	public javax.swing.JTextField getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(javax.swing.JTextField matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the modelo
	 */
	public javax.swing.JTextField getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(javax.swing.JTextField modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the pasajeros
	 */
	public javax.swing.JTextField getPasajeros() {
		return pasajeros;
	}

	/**
	 * @param pasajeros the pasajeros to set
	 */
	public void setPasajeros(javax.swing.JTextField pasajeros) {
		this.pasajeros = pasajeros;
	}

	/**
	 * @return the pma
	 */
	public javax.swing.JTextField getPma() {
		return pma;
	}

	/**
	 * @param pma the pma to set
	 */
	public void setPma(javax.swing.JTextField pma) {
		this.pma = pma;
	}

	/**
	 * @return the puertas
	 */
	public javax.swing.JTextField getPuertas() {
		return puertas;
	}

	/**
	 * @param puertas the puertas to set
	 */
	public void setPuertas(javax.swing.JTextField puertas) {
		this.puertas = puertas;
	}

	/**
	 * @return the selectorvehiculo
	 */
	public javax.swing.JComboBox getSelectorvehiculo() {
		return selectorvehiculo;
	}

	/**
	 * @param selectorvehiculo the selectorvehiculo to set
	 */
	public void setSelectorvehiculo(javax.swing.JComboBox selectorvehiculo) {
		this.selectorvehiculo = selectorvehiculo;
	}

	/**
	 * @return the sidecar
	 */
	public javax.swing.JCheckBox getSidecar() {
		return sidecar;
	}

	/**
	 * @param sidecar the sidecar to set
	 */
	public void setSidecar(javax.swing.JCheckBox sidecar) {
		this.sidecar = sidecar;
	}

	/**
	 * @return the tara
	 */
	public javax.swing.JTextField getTara() {
		return tara;
	}

	/**
	 * @param tara the tara to set
	 */
	public void setTara(javax.swing.JTextField tara) {
		this.tara = tara;
	}

	/**
	 * @return the tipovehiculo
	 */
	public javax.swing.JComboBox getTipovehiculo() {
		return tipovehiculo;
	}

	/**
	 * @param tipovehiculo the tipovehiculo to set
	 */
	public void setTipovehiculo(javax.swing.JComboBox tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}

	/**
	 * @return the cuadroTexto
	 */
	public javax.swing.JTextArea getCuadroTexto() {
		return cuadroTexto;
	}

	
}
