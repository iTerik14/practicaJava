/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ERIK
 */
public class JMatrizGusaito extends javax.swing.JFrame {

    /**
     * Creates new form JMatrizGusaito
     */
    public JMatrizGusaito() {
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

        btnmatriz = new javax.swing.JButton();
        txtcolumna = new javax.swing.JTextField();
        txtfila = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmatriz = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnmatriz.setText("Generar");
        btnmatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmatrizActionPerformed(evt);
            }
        });

        tblmatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblmatriz);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfila)
                    .addComponent(txtcolumna))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(txtfila, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcolumna, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmatrizActionPerformed
        // TODO add your handling code here:
        int f = Integer.parseInt(txtfila.getText());// 2 5 4
        int c = Integer.parseInt(txtcolumna.getText());
        int mM [][] = this.matrizGusano(f,c);
        this.mostrarMatriz(mM, f, c);
    }//GEN-LAST:event_btnmatrizActionPerformed

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
            java.util.logging.Logger.getLogger(JMatrizGusaito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMatrizGusaito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMatrizGusaito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMatrizGusaito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMatrizGusaito().setVisible(true);
            }
        });
    }

    public void mostrarMatriz(int m[][], int f, int c) {
        DefaultTableModel model = (DefaultTableModel) tblmatriz.getModel();
        model.setRowCount(f);
        model.setColumnCount(c);
        for (int i = 0; i < f; i = i + 1) {
            for (int j = 0; j < c; j++) {
                tblmatriz.setValueAt(m[i][j], i, j);
            }
        }
    }

    /*
    
    0    1   2   3   4   5           
    1    10  9   8   7   6
    2    11  12  13  14  15
    3    20  19  18  17  16
    4    21  22  23  24  25
    
     */

    public int[][] matrizGusano(int f, int c) {
        int m[][] = new int[f][c];
        int a = 1;
        for (int i = 0; i < f; i++) {        //  0 1

            if (i % 2 == 0) { // 1/2=1 / 1 
                for (int j = 0; j < c; j=j+1) { // 0 1 2 3 4 5
                    m[i][j]=a;  // 1 2 3
                    a=a+1; // 6
                }
            } else {
                for (int j = c-1; j>=0 ; j--) {
                    m[i][j]=a;
                    a++;
                }
            }

        }
        return m;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmatriz;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmatriz;
    private javax.swing.JTextField txtcolumna;
    private javax.swing.JTextField txtfila;
    // End of variables declaration//GEN-END:variables
}
