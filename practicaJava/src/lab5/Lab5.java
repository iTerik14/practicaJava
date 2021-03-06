/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ERIK
 */
public class Lab5 extends javax.swing.JFrame {

    /**
     * Creates new form Lab5
     */
    public Lab5() {
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

        serie = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        fibo = new javax.swing.JButton();
        prim = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        serie.setText("Serie");
        serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serieActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl);

        fibo.setText("Fibonacci");
        fibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiboActionPerformed(evt);
            }
        });

        prim.setText("Primos");
        prim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(fibo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fibo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prim, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fiboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiboActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(txt1.getText());
        this.mostrar(this.fibo(n), n);
    }//GEN-LAST:event_fiboActionPerformed

    private void serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serieActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(txt1.getText());
        this.mostrar(this.serie(n), n);
    }//GEN-LAST:event_serieActionPerformed

    private void primActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(txt1.getText());
        this.mostrar(this.primo(n), n);
    }//GEN-LAST:event_primActionPerformed

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
            java.util.logging.Logger.getLogger(Lab5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab5().setVisible(true);
            }
        });
    }
    
    public void mostrar(int v[],int n){
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(1);
        model.setColumnCount(n);
        for (int i = 0; i < n; i++) {
            tbl.setValueAt(v[i], 0, i);
        }
    }
    public int [] fibo(int n){
        int v[]=new int [n];
        int x=0;
        int y=1;
        int aux=0;
        for (int i = 0; i < n; i++) {
            v[i]= x;
            aux=x+y;
            x=y;
            y=aux;        
        }
        return v;
    }
    
    public int[] primo(int n) {
        int a[] = new int[n];
        int c=0;
        int p=2;
        int d=2;
        while (c < a.length) {
            if (p%d==0) {
                if (p==d) {
                    a[c]=p;
                    c++;
                }
                d=2;
                p++;
            }else{
                d++;
            }
        }
        return a;
    }
    
    public int[] serie(int n) {
        int a[] = new int[n];
        int i = 0,j=1,x=1;
        while (i < a.length) {
            if (j<x) {
                a[i]=0;
                j++;
            }else{
                a[i]=x;
                x++;
                j=1;
            }
            i++;
        }
        return a;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fibo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prim;
    private javax.swing.JButton serie;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
