
package src;

public class VistaPrincipal extends javax.swing.JFrame {
    double valor;
    Divisas nuevaDivisa = new Divisas();
    
    public VistaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextValor = new javax.swing.JTextField();
        jComboBoxEscoger = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButtonConvertir = new javax.swing.JButton();
        jLabelSalida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor de divisas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Digite el valor a convertir");

        jComboBoxEscoger.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De Pesos Colombianos a Dolares", "De Pesos Colombianos a Euros", "De Pesos Colombianos a Yenes", "De Pesos Colombianos a Soles Peruanos", "De Pesos Colombianos a Pesos Argentinos", "De Pesos Colombianos a Pesos Bolivianos", "De Pesos Colombianos a Reales Brasileros", "De Pesos Colombianos a Pesos Chilenos", "De Pesos Colombianos a Colones Costarricense", "De Pesos Colombianos a Rupias Hindúes", "De Pesos Colombianos a Won Corenao" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Esoja la divisa");

        jButtonConvertir.setBackground(new java.awt.Color(51, 51, 255));
        jButtonConvertir.setText("Convertir");
        jButtonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertirActionPerformed(evt);
            }
        });

        jLabelSalida.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabelSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEscoger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(37, 37, 37)
                                    .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButtonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxEscoger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

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
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));       
        }else if (captura == "De Pesos Colombianos a Yenes"){
            nuevaDivisa.setTasa(0.03115);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));
        }else if (captura == "De Pesos Colombianos a Soles Peruanos"){
            nuevaDivisa.setTasa(0.00088);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));
        }else if(captura == "De Pesos Colombianos a Pesos Argentinos"){
            nuevaDivisa.setTasa(0.03095);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));
        }else if(captura == "De Pesos Colombianos a Pesos Bolivianos"){
            nuevaDivisa.setTasa(0.00157);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));
        }else if(captura == "De Pesos Colombianos a Reales Brasileros"){
            nuevaDivisa.setTasa(0.00118);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));
        }else if(captura == "De Pesos Colombianos a Pesos Chileno"){
            nuevaDivisa.setTasa(0.21481);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));
        }else if(captura == "De Pesos Colombianos a Colones Costarricense"){
            nuevaDivisa.setTasa(0.15157);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));
        }else if(captura == "De Pesos Colombianos a Rupias Hindúes"){
            nuevaDivisa.setTasa(0.01818);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));
        }else if(captura == "De Pesos Colombianos a Won Corenao"){
            nuevaDivisa.setTasa(0.30382);
            jLabelSalida.setText(String.valueOf(nuevaDivisa.convertir(valor,nuevaDivisa.getTasa())));
        }      
    }//GEN-LAST:event_jButtonConvertirActionPerformed

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
    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JComboBox<String> jComboBoxEscoger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSalida;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables
}
