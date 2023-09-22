
package Vistas;

import javax.swing.table.DefaultTableModel;
import Entidades.Alumno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ManejoDeInscripciones extends javax.swing.JInternalFrame {

    public ManejoDeInscripciones() {
        initComponents();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBSalir = new javax.swing.JButton();
        jBAnularInscripcion = new javax.swing.JButton();
        jBIncribir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListadoMaterias = new javax.swing.JTable();
        jRMateriasNoInscriptas = new javax.swing.JRadioButton();
        jRMateriasIncriptas = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jCbSeleccioneUnAlumno = new javax.swing.JComboBox<>();
        jTSeleccioneUnAlumno = new javax.swing.JTextField();
        jTFormularioDeInscripción = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        jBSalir.setForeground(new java.awt.Color(0, 0, 0));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBAnularInscripcion.setForeground(new java.awt.Color(0, 0, 0));
        jBAnularInscripcion.setText("Anular inscripción");
        jBAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscripcionActionPerformed(evt);
            }
        });

        jBIncribir.setForeground(new java.awt.Color(0, 0, 0));
        jBIncribir.setText("Inscribir");
        jBIncribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncribirActionPerformed(evt);
            }
        });

        jTListadoMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTListadoMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTListadoMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTListadoMaterias);

        jRMateriasNoInscriptas.setForeground(new java.awt.Color(0, 0, 0));
        jRMateriasNoInscriptas.setText("Materias no Inscriptas");
        jRMateriasNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMateriasNoInscriptasActionPerformed(evt);
            }
        });

        jRMateriasIncriptas.setForeground(new java.awt.Color(0, 0, 0));
        jRMateriasIncriptas.setText("Materias Inscriptas");
        jRMateriasIncriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMateriasIncriptasActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setText("Listado de Materias");

        jCbSeleccioneUnAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbSeleccioneUnAlumnoActionPerformed(evt);
            }
        });

        jTSeleccioneUnAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jTSeleccioneUnAlumno.setText("Seleccione un alumno:");

        jTFormularioDeInscripción.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTFormularioDeInscripción.setForeground(new java.awt.Color(0, 0, 0));
        jTFormularioDeInscripción.setText("Formulario de Inscripción");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jTFormularioDeInscripción, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRMateriasIncriptas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRMateriasNoInscriptas))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTSeleccioneUnAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(84, 84, 84)
                                    .addComponent(jCbSeleccioneUnAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jSeparator1)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBIncribir)
                                    .addGap(80, 80, 80)
                                    .addComponent(jBAnularInscripcion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTFormularioDeInscripción, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTSeleccioneUnAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbSeleccioneUnAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRMateriasIncriptas)
                    .addComponent(jRMateriasNoInscriptas))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnularInscripcion)
                    .addComponent(jBSalir)
                    .addComponent(jBIncribir))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTListadoMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTListadoMateriasMouseClicked
       DefaultTableModel modelo = (DefaultTableModel) jTListadoMaterias.getModel();
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jTListadoMateriasMouseClicked

    private void jBIncribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncribirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBIncribirActionPerformed

    private void jBAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAnularInscripcionActionPerformed

    private void jCbSeleccioneUnAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbSeleccioneUnAlumnoActionPerformed
        // TODO add your handling code here:
      List<Alumno> alumnos = new ArrayList<>();
        
      
    }//GEN-LAST:event_jCbSeleccioneUnAlumnoActionPerformed

    private void jRMateriasIncriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMateriasIncriptasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRMateriasIncriptasActionPerformed

    private void jRMateriasNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMateriasNoInscriptasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRMateriasNoInscriptasActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnularInscripcion;
    private javax.swing.JButton jBIncribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Alumno> jCbSeleccioneUnAlumno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRMateriasIncriptas;
    private javax.swing.JRadioButton jRMateriasNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFormularioDeInscripción;
    private javax.swing.JTable jTListadoMaterias;
    private javax.swing.JTextField jTSeleccioneUnAlumno;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
private void cargarCombo(){
    jCbSeleccioneUnAlumno.addItem(new Alumno(WIDTH, title, title, LocalDate.MIN, isIcon));
    

}
}
