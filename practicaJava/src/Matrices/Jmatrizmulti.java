/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pc25
 */
public class Jmatrizmulti extends javax.swing.JFrame {

    /**
     * Creates new form Jmatrizmulti
     */
    public Jmatrizmulti() {
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

        txtrowA = new javax.swing.JTextField();
        txtcolumnA = new javax.swing.JTextField();
        txtrowB = new javax.swing.JTextField();
        txtcolumnB = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmatrizB = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblresultado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblmatrizA = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblmatrizB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblmatrizB);

        tblresultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblresultado);

        tblmatrizA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblmatrizA);

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtrowA, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcolumnA, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183)
                        .addComponent(txtrowB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcolumnB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrowA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcolumnB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtrowB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcolumnA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int fA = Integer.parseInt(txtrowA.getText());
        int cA = Integer.parseInt(txtcolumnA.getText());
        int fB = Integer.parseInt(txtrowB.getText());
        int cB = Integer.parseInt(txtcolumnB.getText());

        this.mostrarMatrizA(this.llenarMatrizA(fA, cA), fA, cA);
        this.mostrarMatrizB(this.llenarMatrizB(fB, cB), fB, cB);
        this.mostrarMultimM(this.multiMatriz(this.llenarMatrizA(fA, cA), this.llenarMatrizB(fB, cB), fA, cA, fB, cB), fA, cB);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Jmatrizmulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jmatrizmulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jmatrizmulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jmatrizmulti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jmatrizmulti().setVisible(true);
            }
        });
    }

    public void mostrarMatrizA(int mA[][], int f, int c) {
        DefaultTableModel model = (DefaultTableModel) tblmatrizA.getModel();
        model.setRowCount(f);
        model.setColumnCount(c);
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                tblmatrizA.setValueAt(mA[i][j], i, j);
            }
        }

    }

    public void mostrarMatrizB(int mB[][], int f, int c) {
        DefaultTableModel model = (DefaultTableModel) tblmatrizB.getModel();
        model.setRowCount(f);
        model.setColumnCount(c);
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                tblmatrizB.setValueAt(mB[i][j], i, j);
            }
        }
    }

    public void mostrarMultimM(int mM[][], int fA, int cB) {
        DefaultTableModel model = (DefaultTableModel) tblresultado.getModel();
        model.setRowCount(fA);
        model.setColumnCount(cB);
        for (int i = 0; i < fA; i++) {
            for (int j = 0; j < cB; j++) {
                tblresultado.setValueAt(mM[i][j], i, j);
            }
        }
    }

    public int[][] llenarMatrizA(int fA, int cA) {
        int mA[][] = new int[fA][cA];
        int a = 1;
        for (int i = 0; i < fA; i++) {
            for (int j = 0; j < cA; j++) {
                mA[i][j] = a;
                a++;
            }
        }
        return mA;
    }

    public int[][] llenarMatrizB(int fB, int cB) {
        int mB[][] = new int[fB][cB];
        int a = 2;
        for (int i = 0; i < fB; i++) {
            for (int j = 0; j < cB; j++) {
                mB[i][j] = a;
                a++;
            }
        }
        return mB;
    }

    public int[][] multiMatriz(int mA[][], int mB[][], int fA,int cA, int fB,int cB) {
        int mM[][] = new int[fA][cB];

        if (cA == fB) {
            for (int i = 0; i < fA; i++) {
                for (int j = 0; j < cB; j++) {
                    for (int k = 0; k < cA; k++) {
                        mM[i][j] += mA[i][k]*mB[k][j];
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "no tiene solucion");
        }
        return mM;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblmatrizA;
    private javax.swing.JTable tblmatrizB;
    private javax.swing.JTable tblresultado;
    private javax.swing.JTextField txtcolumnA;
    private javax.swing.JTextField txtcolumnB;
    private javax.swing.JTextField txtrowA;
    private javax.swing.JTextField txtrowB;
    // End of variables declaration//GEN-END:variables
}
