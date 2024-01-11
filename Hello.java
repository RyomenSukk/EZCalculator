/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package homework1;

import javax.swing.*;
/**
 *
 * @author john-
 */
public class Hello extends javax.swing.JFrame {

    /**
     * Creates new form Hello
     */
    public Hello() {
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

        Number1 = new javax.swing.JLabel();
        btmClear = new javax.swing.JButton();
        txtNumber1 = new javax.swing.JTextField();
        Operator = new javax.swing.JLabel();
        Number2 = new javax.swing.JLabel();
        Output = new javax.swing.JLabel();
        btmCalculate = new javax.swing.JButton();
        txtOperator = new javax.swing.JTextField();
        txtNumber2 = new javax.swing.JTextField();
        txtOutput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculater");

        Number1.setText("Number 1");

        btmClear.setText("Clear");
        btmClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmClearActionPerformed(evt);
            }
        });

        txtNumber1.setColumns(10);
        txtNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber1ActionPerformed(evt);
            }
        });

        Operator.setText("Operator");

        Number2.setText("Number2");

        Output.setText("Output");

        btmCalculate.setText("Calculate");
        btmCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCalculateActionPerformed(evt);
            }
        });

        txtOperator.setColumns(10);
        txtOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOperatorActionPerformed(evt);
            }
        });

        txtNumber2.setColumns(10);

        txtOutput.setColumns(10);
        txtOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Output)
                    .addComponent(Number2)
                    .addComponent(Number1)
                    .addComponent(Operator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btmClear)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btmCalculate)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Number1)
                    .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btmCalculate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Operator))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Number2)
                            .addComponent(btmClear))
                        .addGap(21, 21, 21)
                        .addComponent(Output)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCalculateActionPerformed
     try {
        double x = Double.parseDouble(txtNumber1.getText());
        double y = Double.parseDouble(txtNumber2.getText());
        double result = 0.0;

        String operator = txtOperator.getText();

        if (operator.equals("+")) {
            result = x + y;
        } else if (operator.equals("-")) {
            result = x - y;
        } else if (operator.equals("*")) {
            result = x * y;
        } else if (operator.equals("/")) {
            if (y != 0) {
                result = x / y;
            } else {
                txtOutput.setText("Error");
                return;
            }
        } else if (operator.equals("^")) {
            result = Math.pow(x, y);
        } else if (operator.equals("%")) {
            if (y != 0) {
                result = x % y;
            } else {
                txtOutput.setText("Error");
                return;
            }
        } else {
            txtOutput.setText("Error");
            return;
        }
        txtOutput.setText(" " + result);
    } catch (NumberFormatException ex) {
        txtOutput.setText("Error:Please Type Number");
    }
    }//GEN-LAST:event_btmCalculateActionPerformed

    private void btmClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmClearActionPerformed
    txtNumber1.setText("");
    txtNumber2.setText("");
    txtOperator.setText("");
    txtOutput.setText("");
    txtNumber1.requestFocusInWindow();
    }//GEN-LAST:event_btmClearActionPerformed

    private void txtNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumber1ActionPerformed

    private void txtOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOutputActionPerformed

    private void txtOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOperatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOperatorActionPerformed

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
            java.util.logging.Logger.getLogger(Hello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hello.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hello().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Number1;
    private javax.swing.JLabel Number2;
    private javax.swing.JLabel Operator;
    private javax.swing.JLabel Output;
    private javax.swing.JButton btmCalculate;
    private javax.swing.JButton btmClear;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber2;
    private javax.swing.JTextField txtOperator;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables
}
