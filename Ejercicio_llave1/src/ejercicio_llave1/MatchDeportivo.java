/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_llave1;

/**
 *
 * @author LENOVO
 */
public class MatchDeportivo extends javax.swing.JFrame implements ejercicio_llave1 {

    /**
     * Creates new form MatchDeportivo
     */
    public MatchDeportivo() {
        initComponents();
        CambiarPartidoBasquet();
    }
    boolean cambio = false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Futbol = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        PanelBotones_Futbol = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Panel_Baloncesto = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Futbol.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Equipo Visitante:");
        Panel_Futbol.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 288, 289, 67));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Panel_Futbol.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 166, 267, 37));
        Panel_Futbol.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 362, 264, 36));

        jButton1.setText("Asignar nombre del Equipo Local");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel_Futbol.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 221, 267, 35));

        jButton2.setText("Asignar nombre del Equipo Visitante");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel_Futbol.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 416, 264, 33));

        jButton3.setText("Partido de Futbol");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel_Futbol.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 220, 50));

        PanelBotones_Futbol.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Goles Anotados:");
        PanelBotones_Futbol.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 96, 117, -1));

        jButton8.setText("Asignar Goles");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        PanelBotones_Futbol.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 165, 159, -1));

        jLabel8.setText("Goles Anotados:");
        PanelBotones_Futbol.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 333, 141, -1));

        jButton9.setText("Asignar Goles");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        PanelBotones_Futbol.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 407, 159, -1));
        PanelBotones_Futbol.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, -1));
        PanelBotones_Futbol.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 100, -1));

        Panel_Baloncesto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Asignar Canastas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel_Baloncesto.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 165, 159, -1));

        jLabel6.setText("Canastas Anotadas:");
        Panel_Baloncesto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 141, -1));

        jButton7.setText("Asignar Canastas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel_Baloncesto.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 407, 159, -1));

        jLabel5.setText("Canastas Anotadas:");
        Panel_Baloncesto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, -1));
        Panel_Baloncesto.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 110, -1));
        Panel_Baloncesto.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 110, -1));

        PanelBotones_Futbol.add(Panel_Baloncesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 560));

        Panel_Futbol.add(PanelBotones_Futbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 210, 520));

        jLabel1.setText("Equipo Local:");
        Panel_Futbol.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 270, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Futbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Futbol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setNombreEquipoVisitante(jTextField2.getText());
        jLabel2.setText("Equipo Visitante:"+ GuardarEquipoVisitante);
    }//GEN-LAST:event_jButton2ActionPerformed
        String GuardarEquipoVisitante = "";
        public void setNombreEquipoVisitante(String NombreEquipo2){
           GuardarEquipoVisitante = NombreEquipo2;
            
        }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling cod
        setNombreEquipoLocal(jTextField1.getText());
        
        jLabel1.setText("Equipo Local:"+ GuardarNombreLocal);
    }//GEN-LAST:event_jButton1ActionPerformed
           String GuardarNombreLocal = "";
    public void setNombreEquipoLocal(String NombreLocal){
                GuardarNombreLocal = NombreLocal;
            }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        setGuardarGolesLocal(jTextField3.getText());
        jLabel7.setText("Goles Anotados:"+ GuardarGolesLocal);
    }//GEN-LAST:event_jButton8ActionPerformed
        String GuardarGolesLocal = "";
        public void setGuardarGolesLocal(String GolLocal ){
            GuardarGolesLocal = GolLocal;
        }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        setGolesVisitante(jTextField4.getText());
        jLabel8.setText("Goles Anotados:"+ GuardarGolesVisitante);
    }//GEN-LAST:event_jButton9ActionPerformed
       String GuardarGolesVisitante = "";
    public void setGolesVisitante(String GolVisitante){
            GuardarGolesVisitante = GolVisitante;
        }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setCanastaLocal(jTextField5.getText());
        jLabel5.setText("Canastas Anotadas:"+ GuardarCanastaLocal);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        setCanastaVisitante(jTextField6.getText());
        jLabel6.setText("Canastas Anotadas:"+ GuardarCanastaVisitante);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       if(cambio == true){ CambiarPartidoBasquet();}
       else{ CambiarPartidoFutbol();}
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public void CambiarPartidoBasquet(){
           jButton3.setText("Partido de Basquet");
           for(int i=0;i<6;i++){
           Panel_Baloncesto.getComponent(i).setVisible(true);
           PanelBotones_Futbol.getComponent(i).setVisible(false);
           }
           cambio = false;
    }
           public void CambiarPartidoFutbol(){
           jButton3.setText("Partido de Futbol");
           for(int i=0;i<6;i++){
           Panel_Baloncesto.getComponent(i).setVisible(false);
           PanelBotones_Futbol.getComponent(i).setVisible(true);
           }
           cambio = true;
        }
    String GuardarCanastaVisitante = "";
    public void setCanastaVisitante(String CanastaVisitante){
        GuardarCanastaVisitante = CanastaVisitante;
    }
    
    String GuardarCanastaLocal = "";
     public void setCanastaLocal(String CanastaLocal){
         GuardarCanastaLocal = CanastaLocal;
        
        }
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
            java.util.logging.Logger.getLogger(MatchDeportivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatchDeportivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatchDeportivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatchDeportivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatchDeportivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBotones_Futbol;
    private javax.swing.JPanel Panel_Baloncesto;
    private javax.swing.JPanel Panel_Futbol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

   
   
    String setGolesLocal = ("");
    
    @Override public void setEquipoLocal(String NombreEquipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEquipoVisitante(String NombreEquipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
