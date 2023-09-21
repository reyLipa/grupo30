
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;

public class MenuPpal extends javax.swing.JFrame {
    
    private AlumnoData ad;
    private MateriaData md;
    private InscripcionData id;

    public MenuPpal() {
        initComponents();
        ad = new AlumnoData();
        md = new MateriaData();
        id = new InscripcionData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jDEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMFormAlum = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMFormMat = new javax.swing.JMenuItem();
        jMAdm = new javax.swing.JMenu();
        jMInscripciones = new javax.swing.JMenuItem();
        jMNotas = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMAlumXMat = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jMAlumno.setText("Alumno");

        jMFormAlum.setText("Formulario Alumno");
        jMFormAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormAlumActionPerformed(evt);
            }
        });
        jMAlumno.add(jMFormAlum);

        jMenuBar1.add(jMAlumno);

        jMMateria.setText("Materia");

        jMFormMat.setText("Formulario Materia");
        jMFormMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormMatActionPerformed(evt);
            }
        });
        jMMateria.add(jMFormMat);

        jMenuBar1.add(jMMateria);

        jMAdm.setText("Administración");

        jMInscripciones.setText("Manejo de inscripciones");
        jMInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInscripcionesActionPerformed(evt);
            }
        });
        jMAdm.add(jMInscripciones);

        jMNotas.setText("Manipulación de notas");
        jMNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNotasActionPerformed(evt);
            }
        });
        jMAdm.add(jMNotas);

        jMenuBar1.add(jMAdm);

        jMConsultas.setText("Consultas");

        jMAlumXMat.setText("Alumnos por materia");
        jMAlumXMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlumXMatActionPerformed(evt);
            }
        });
        jMConsultas.add(jMAlumXMat);

        jMenuBar1.add(jMConsultas);

        jMenu7.setText("Salir");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMNotasActionPerformed

    private void jMFormAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormAlumActionPerformed
      jDEscritorio.removeAll();
      jDEscritorio.repaint();
      
      jDEscritorio.add(vap);
      jDEscritorio.moveToFront(vap);
// TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMFormAlumActionPerformed

    private void jMInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInscripcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMInscripcionesActionPerformed

    private void jMFormMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMFormMatActionPerformed

    private void jMAlumXMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlumXMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMAlumXMatActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPpal().setVisible(true);
            }
        });
    }

    
    
    
    // Gestion Alumnos
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JMenu jMAdm;
    private javax.swing.JMenuItem jMAlumXMat;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenuItem jMFormAlum;
    private javax.swing.JMenuItem jMFormMat;
    private javax.swing.JMenuItem jMInscripciones;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenuItem jMNotas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
