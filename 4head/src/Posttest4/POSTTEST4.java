/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postest4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Asus
 */
public class POSTTEST4 extends javax.swing.JFrame {

    /**
     * Creates new form POSTTEST4
     */
    public POSTTEST4() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        berat_barang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        diskon = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        reguler = new javax.swing.JRadioButton();
        express = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        persen = new javax.swing.JLabel();
        proses = new javax.swing.JButton();
        ulang = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 102, 204));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setText("Form Pelanggan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 204));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel2.setText("Nama : ");

        nama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                namaCaretUpdate(evt);
            }
        });
        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel3.setText("No Telpon :");

        telp.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                telpCaretUpdate(evt);
            }
        });
        telp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telpKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel4.setText("Berat Barang");

        berat_barang.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                berat_barangCaretUpdate(evt);
            }
        });
        berat_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berat_barangActionPerformed(evt);
            }
        });
        berat_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                berat_barangKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel5.setText("Kg");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama)
                    .addComponent(telp)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(berat_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(berat_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 204));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel6.setText("Atur Diskon :");

        diskon.setMajorTickSpacing(10);
        diskon.setPaintLabels(true);
        diskon.setPaintTicks(true);
        diskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                diskonStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel7.setText("Jenis Jasa :");

        buttonGroup1.add(reguler);
        reguler.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        reguler.setText("Reguler");

        buttonGroup1.add(express);
        express.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        express.setText("Express");

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel8.setText("Total Harga :");

        total.setEditable(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(persen))
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(reguler)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(express)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diskon, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(persen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reguler)
                    .addComponent(express))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        proses.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        proses.setText("Go");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });

        ulang.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        ulang.setText("Reset");
        ulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulangActionPerformed(evt);
            }
        });

        keluar.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        keluar.setText("Out");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(proses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ulang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keluar)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proses)
                    .addComponent(ulang)
                    .addComponent(keluar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        // TODO add your handling code here:
//        proses.setEnabled(false);
        double berat=0,ekpres,jenis = 0,totaldiskon,konstan_reguler=11500,disc,totaldisc;
        disc=diskon.getValue();
        nama.getText();
        telp.getText();
        berat = Integer.parseInt(berat_barang.getText());
        double regu = konstan_reguler*berat*(disc/100);
        double eks = konstan_reguler*1.5*berat*(disc/100);
        if (reguler.isSelected())
        {
            jenis = (konstan_reguler*berat)-regu;
        }
        else 
            if(express.isSelected())
        {
            jenis = (konstan_reguler*berat*1.5)-eks; 
        }
        total.setText(String.valueOf(jenis));
    }//GEN-LAST:event_prosesActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void namaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_namaCaretUpdate
        // TODO add your handling code here:
        if (nama.getText().length()!=0 && telp.getText().length()!=0 && berat_barang.getText().length()!=0) {
            proses.setEnabled(true);
            ulang.setEnabled(true);
        }else{
            proses.setEnabled(false);
            ulang.setEnabled(false);
        }
    }//GEN-LAST:event_namaCaretUpdate

    private void diskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_diskonStateChanged
        // TODO add your handling code here:
        persen.setText(String.valueOf(diskon.getValue())+"%");
    }//GEN-LAST:event_diskonStateChanged

    private void telpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_telpCaretUpdate
        // TODO add your handling code here:
        if (nama.getText().length()!=0 && telp.getText().length()!=0 && berat_barang.getText().length()!=0) {
            proses.setEnabled(true);
            ulang.setEnabled(true);
        }else{
            proses.setEnabled(false);
            ulang.setEnabled(false);
        }
    }//GEN-LAST:event_telpCaretUpdate

    private void berat_barangCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_berat_barangCaretUpdate
        // TODO add your handling code here:
        if (nama.getText().length()!=0 && telp.getText().length()!=0 && berat_barang.getText().length()!=0) {
            proses.setEnabled(true);
            ulang.setEnabled(true);
        }else{
            proses.setEnabled(false);
            ulang.setEnabled(false);
        }
    }//GEN-LAST:event_berat_barangCaretUpdate

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void ulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulangActionPerformed
        // TODO add your handling code here:
        nama.setText("");
        telp.setText("");
        berat_barang.setText("");
        total.setText("");
        diskon.setValue(0);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_ulangActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        nama.setText("");
        telp.setText("");
        berat_barang.setText("");
        total.setText("");
        diskon.setValue(0);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_formWindowOpened

    private void namaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyPressed
        // TODO add your handling code here:
        nama.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
            char karakter = e.getKeyChar();
                if ((((karakter<'a' || karakter > 'z'))&&((karakter<'A' || karakter > 'Z'))&& (karakter != '\b'))&&(karakter !='.')) {
                e.consume();
                }
            }
});
    }//GEN-LAST:event_namaKeyPressed

    private void telpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telpKeyPressed
        // TODO add your handling code here:
             telp.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
            char karakter = e.getKeyChar();
                if ((((karakter<'0' || karakter > '9'))&& (karakter != '\b'))&&(karakter !='.')) {
                e.consume();
                }
            }
});
    }//GEN-LAST:event_telpKeyPressed

    private void berat_barangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_berat_barangKeyPressed
        // TODO add your handling code here:
        berat_barang.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e){
            char karakter = e.getKeyChar();
                if ((((karakter<'0' || karakter > '9'))&& (karakter != '\b'))&&(karakter !='.')) {
                e.consume();
                }
            }
});
        
    }//GEN-LAST:event_berat_barangKeyPressed

    private void berat_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berat_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_berat_barangActionPerformed

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
            java.util.logging.Logger.getLogger(POSTTEST4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSTTEST4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSTTEST4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSTTEST4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSTTEST4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField berat_barang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSlider diskon;
    private javax.swing.JRadioButton express;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel persen;
    private javax.swing.JButton proses;
    private javax.swing.JRadioButton reguler;
    private javax.swing.JTextField telp;
    private javax.swing.JTextField total;
    private javax.swing.JButton ulang;
    // End of variables declaration//GEN-END:variables
}
