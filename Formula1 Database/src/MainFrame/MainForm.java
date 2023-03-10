/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import java.text.DateFormat;
import javax.swing.table.DefaultTableModel;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
/**
 *
 * @author thama
 */
public class MainForm extends javax.swing.JFrame { 

 
    
    

    public MainForm() {
        initComponents();
        
        
        
        
    }

  
  
    
    
    
    
    
    
    
 //function   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        desktopPanelControl = new javax.swing.JDesktopPane();
        btnConstructor = new javax.swing.JButton();
        btnDriver = new javax.swing.JButton();
        btnPractice = new javax.swing.JButton();
        btnQualifying = new javax.swing.JButton();
        btnCircuit = new javax.swing.JButton();
        btnRace = new javax.swing.JButton();
        btnRaceTime = new javax.swing.JButton();
        btnTyre = new javax.swing.JButton();
        btnPitstop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 25, true));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 50, true));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\thama\\OneDrive\\Documents\\NetBeansProjects\\306proj\\f1-logo-2017-640x480.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana Pro Cond Black", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Database");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -20, 1060, 220));

        javax.swing.GroupLayout desktopPanelControlLayout = new javax.swing.GroupLayout(desktopPanelControl);
        desktopPanelControl.setLayout(desktopPanelControlLayout);
        desktopPanelControlLayout.setHorizontalGroup(
            desktopPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        desktopPanelControlLayout.setVerticalGroup(
            desktopPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel1.add(desktopPanelControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 780, 570));

        btnConstructor.setText("constructor");
        btnConstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConstructorActionPerformed(evt);
            }
        });
        jPanel1.add(btnConstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        btnDriver.setText("driver");
        btnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverActionPerformed(evt);
            }
        });
        jPanel1.add(btnDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, -1));

        btnPractice.setText("practice");
        btnPractice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPracticeActionPerformed(evt);
            }
        });
        jPanel1.add(btnPractice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 90, -1));

        btnQualifying.setText("qualifying");
        btnQualifying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQualifyingActionPerformed(evt);
            }
        });
        jPanel1.add(btnQualifying, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        btnCircuit.setText("circuit");
        btnCircuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircuitActionPerformed(evt);
            }
        });
        jPanel1.add(btnCircuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        btnRace.setText("race");
        btnRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaceActionPerformed(evt);
            }
        });
        jPanel1.add(btnRace, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        btnRaceTime.setText("race time");
        btnRaceTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaceTimeActionPerformed(evt);
            }
        });
        jPanel1.add(btnRaceTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        btnTyre.setText("tyre");
        btnTyre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTyreActionPerformed(evt);
            }
        });
        jPanel1.add(btnTyre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        btnPitstop.setText("pitstop");
        btnPitstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPitstopActionPerformed(evt);
            }
        });
        jPanel1.add(btnPitstop, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConstructorActionPerformed
      
        desktopPanelControl.removeAll();
        constructor c = new constructor();//JInternalFrame object
        desktopPanelControl.add(c).setVisible(true);
    }//GEN-LAST:event_btnConstructorActionPerformed
   
    
   /*private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {                                               
      
        desktopPanelControl.removeAll();
        driver d = new driver();//JInternalFrame object
        desktopPanelControl.add(d).setVisible(true);
    } */
    private void btnPracticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPracticeActionPerformed
        desktopPanelControl.removeAll();
        practice pr = new practice();//JInternalFrame object
        desktopPanelControl.add(pr).setVisible(true);
    }//GEN-LAST:event_btnPracticeActionPerformed

    private void btnQualifyingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQualifyingActionPerformed
        desktopPanelControl.removeAll();
        qualifying q = new qualifying();//JInternalFrame object
        desktopPanelControl.add(q).setVisible(true);    }//GEN-LAST:event_btnQualifyingActionPerformed

  /*  private void btnCircuitActionPerformed(java.awt.event.ActionEvent evt) {                                           
        desktopPanelControl.removeAll();
        circuit ci = new circuit();//JInternalFrame object
        desktopPanelControl.add(ci).setVisible(true);
    } */
   /* private void btnRaceActionPerformed(java.awt.event.ActionEvent evt) {                                           
        desktopPanelControl.removeAll();
        race r = new race();//JInternalFrame object
        desktopPanelControl.add(r).setVisible(true);
    } */
    
    private void btnRaceTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaceTimeActionPerformed
        desktopPanelControl.removeAll();
        raceTime rt = new raceTime();//JInternalFrame object
        desktopPanelControl.add(rt).setVisible(true);    }//GEN-LAST:event_btnRaceTimeActionPerformed
    
   /* private void btnTyreActionPerformed(java.awt.event.ActionEvent evt) {                                           
        desktopPanelControl.removeAll();
        tyre t = new tyre();//JInternalFrame object
        desktopPanelControl.add(t).setVisible(true);
    } */
    
    private void btnPitstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPitstopActionPerformed
        desktopPanelControl.removeAll();
        pitstop p = new pitstop();//JInternalFrame object
        desktopPanelControl.add(p).setVisible(true);
    }//GEN-LAST:event_btnPitstopActionPerformed

    private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverActionPerformed
       desktopPanelControl.removeAll();
        driver d = new driver();//JInternalFrame object
        desktopPanelControl.add(d).setVisible(true);  
    }//GEN-LAST:event_btnDriverActionPerformed

    private void btnCircuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircuitActionPerformed
        desktopPanelControl.removeAll();
        circuit ci = new circuit();//JInternalFrame object
        desktopPanelControl.add(ci).setVisible(true);
    }//GEN-LAST:event_btnCircuitActionPerformed

    private void btnRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaceActionPerformed
        desktopPanelControl.removeAll();
        race r = new race();//JInternalFrame object
        desktopPanelControl.add(r).setVisible(true);
    }//GEN-LAST:event_btnRaceActionPerformed

    private void btnTyreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTyreActionPerformed
       desktopPanelControl.removeAll();
        tyre t = new tyre();//JInternalFrame object
        desktopPanelControl.add(t).setVisible(true);
    
    }//GEN-LAST:event_btnTyreActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCircuit;
    private javax.swing.JButton btnConstructor;
    private javax.swing.JButton btnDriver;
    private javax.swing.JButton btnPitstop;
    private javax.swing.JButton btnPractice;
    private javax.swing.JButton btnQualifying;
    private javax.swing.JButton btnRace;
    private javax.swing.JButton btnRaceTime;
    private javax.swing.JButton btnTyre;
    private javax.swing.JDesktopPane desktopPanelControl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
