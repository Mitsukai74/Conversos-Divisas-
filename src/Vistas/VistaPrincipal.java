
package Vistas;

import src.Divisas;

public class VistaPrincipal extends javax.swing.JFrame {
    double valor;
    Divisas nuevaDivisa = new Divisas();
    
    public VistaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextValor = new javax.swing.JTextField();
        jComboBoxEscoger = new javax.swing.JComboBox<>();
        jLabelSalida = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonConvertir = new javax.swing.JButton();
        jButtonCambiar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor de divisas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 238, 32));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite el valor a convertir");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jTextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 106, 39));

        jComboBoxEscoger.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Pesos Colombianos a Dolares", "De Pesos Colombianos a Euros", "De Pesos Colombianos a Yenes", "De Pesos Colombianos a Soles Peruanos", "De Pesos Colombianos a Pesos Argentinos", "De Pesos Colombianos a Pesos Bolivianos", "De Pesos Colombianos a Reales Brasileros", "De Pesos Colombianos a Pesos Chilenos", "De Pesos Colombianos a Colones Costarricense", "De Pesos Colombianos a Rupias Hindúes", "De Pesos Colombianos a Won Corenao" }));
        getContentPane().add(jComboBoxEscoger, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 280, -1));

        jLabelSalida.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelSalida.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        getContentPane().add(jLabelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 230, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escoja la divisa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jButtonConvertir.setBackground(new java.awt.Color(51, 51, 255));
        jButtonConvertir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonConvertir.setText("Convertir");
        jButtonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 155, 35));

        jButtonCambiar.setFont(new java.awt.Font("Arial Narrow", 1, 11)); // NOI18N
        jButtonCambiar.setText("Desea calcular otra divisa");
        jButtonCambiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCambiar.setRolloverEnabled(false);
        jButtonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 160, 40));

        jButtonVolver.setBackground(new java.awt.Color(51, 255, 255));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fondo.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel4");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertirActionPerformed
        //capturando valor del jtext
        valor = Double.parseDouble(jTextValor.getText());
        //enviando valor a la clase divisas
        nuevaDivisa.setValor(valor);
        //capturando el valor del comboBox
        String captura = jComboBoxEscoger.getSelectedItem().toString();
        if(captura == "De Pesos Colombianos a Dolares" || captura == "De Pesos Colombianos a Euros"){
            nuevaDivisa.setTasa(0.00023);
            //nuevaDivisa.convertir(valor,nuevaDivisa.getTasa());
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa()))+" Dolares");       
        }else if (captura == "De Pesos Colombianos a Yenes"){
            nuevaDivisa.setTasa(0.03115);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa()))+" Yenes");
        }else if (captura == "De Pesos Colombianos a Soles Peruanos"){
            nuevaDivisa.setTasa(0.00088);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa()))+" Soles");
        }else if(captura == "De Pesos Colombianos a Pesos Argentinos"){
            nuevaDivisa.setTasa(0.03095);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa()))+" Pesos Arg");
        }else if(captura == "De Pesos Colombianos a Pesos Bolivianos"){
            nuevaDivisa.setTasa(0.00157);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa()))+" Pesos Bol");
        }else if(captura == "De Pesos Colombianos a Reales Brasileros"){
            nuevaDivisa.setTasa(0.00118);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa()))+" Reales");
        }else if(captura == "De Pesos Colombianos a Pesos Chileno"){
            nuevaDivisa.setTasa(0.21481);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa()))+" Pesos Chil");
        }else if(captura == "De Pesos Colombianos a Colones Costarricense"){
            nuevaDivisa.setTasa(0.15157);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));
        }else if(captura == "De Pesos Colombianos a Rupias Hindúes"){
            nuevaDivisa.setTasa(0.01818);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa()))+" Rupias");
        }else if(captura == "De Pesos Colombianos a Won Corenao"){
            nuevaDivisa.setTasa(0.30382);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa()))+" Won");
        }      
    }//GEN-LAST:event_jButtonConvertirActionPerformed

    private void jTextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorActionPerformed

    private void jButtonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarActionPerformed
        jTextValor.setText("");
        jLabelSalida.setText("");
    }//GEN-LAST:event_jButtonCambiarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        VistaPrincipal cerrarVista = new VistaPrincipal();
        Entrada principal = new Entrada();        
        principal.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_jButtonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambiar;
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxEscoger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelSalida;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables
}
