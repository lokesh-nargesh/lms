/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author lokesh nargesh
 */
public class newBook extends javax.swing.JFrame {

    /**
     * Creates new form newBook
     */
    public newBook() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bookidtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        publishertxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        publisheryeartxt = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 153, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Publisher");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 201, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 256, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Publisher Year");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 306, -1, -1));

        bookidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookidtxtActionPerformed(evt);
            }
        });
        getContentPane().add(bookidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 210, -1));
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 210, -1));

        publishertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishertxtActionPerformed(evt);
            }
        });
        getContentPane().add(publishertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 210, -1));

        pricetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetxtActionPerformed(evt);
            }
        });
        getContentPane().add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 210, -1));
        getContentPane().add(publisheryeartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 302, 210, -1));

        buttonSave.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        buttonSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\lokesh nargesh\\Documents\\NetBeansProjects\\Library Management System\\images\\save-icon--1.png")); // NOI18N
        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 100, 47));

        buttonClose.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        buttonClose.setIcon(new javax.swing.ImageIcon("C:\\Users\\lokesh nargesh\\Documents\\NetBeansProjects\\Library Management System\\images\\close.png")); // NOI18N
        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });
        getContentPane().add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 100, 47));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\lokesh nargesh\\Documents\\NetBeansProjects\\Library Management System\\images\\new.png")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void publishertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publishertxtActionPerformed

    private void pricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetxtActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        
        String bookID = bookidtxt.getText();
        String name = nametxt.getText();
        String publisher = publishertxt.getText();
        String price = pricetxt.getText();
        String publisherYear = publisheryeartxt.getText();
        try {
            Connection conn = ConnectionProvider.getCon();
            Statement st = conn.createStatement();
            st.executeUpdate("insert into book values('"+bookID+"','"+name+"','"+publisher+"','"+price+"','"+publisherYear+"')");
            JOptionPane.showMessageDialog(null, "Successfully Added");
            setVisible(false);
            new newBook().setVisible(true);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Book Id already exists");
            setVisible(false);
            new newBook().setVisible(true);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void bookidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookidtxtActionPerformed

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
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookidtxt;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField publishertxt;
    private javax.swing.JTextField publisheryeartxt;
    // End of variables declaration//GEN-END:variables
}