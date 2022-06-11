package Client;

import javax.swing.*;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblConWords = new javax.swing.JLabel();
        lblConLines = new javax.swing.JLabel();
        lblConCoincidences = new javax.swing.JLabel();
        lblConTime = new javax.swing.JLabel();
        lblSecWords = new javax.swing.JLabel();
        lblSecLines = new javax.swing.JLabel();
        lblSecCoincidences = new javax.swing.JLabel();
        lblSecTime = new javax.swing.JLabel();
        txtLog = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        lblExeWords = new javax.swing.JLabel();
        lblExeLines = new javax.swing.JLabel();
        lblExeCoincidences = new javax.swing.JLabel();
        lblExeTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        // txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
        // public void keyTyped(java.awt.event.KeyEvent evt) {
        // txtSearchKeyTyped(evt);
        // }
        // });

        jLabel1.setText("Concurrente");

        jLabel2.setText("Secuencial");

        jLabel3.setText("Palabras");

        jLabel4.setText("Lineas");

        jLabel5.setText("Coincidencias");

        jLabel6.setText("Tiempo (ms)");

        lblConWords.setText("-");

        lblConLines.setText("-");

        lblConCoincidences.setText("-");

        lblConTime.setText("-");

        lblSecWords.setText("-");

        lblSecLines.setText("-");

        lblSecCoincidences.setText("-");

        lblSecTime.setText("-");

        txtLog.setColumns(20);
        txtLog.setRows(5);

        jLabel8.setText("Executor");

        lblExeWords.setText("-");

        lblExeLines.setText("-");

        lblExeCoincidences.setText("-");

        lblExeTime.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 303,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSearch)
                                                .addGap(29, 29, 29))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(lblConWords)
                                                                        .addComponent(lblSecWords)
                                                                        .addComponent(lblExeWords))
                                                                .addGap(41, 41, 41)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(lblConLines)
                                                                        .addComponent(lblSecLines)
                                                                        .addComponent(lblExeLines))
                                                                .addGap(38, 38, 38)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(lblConCoincidences)
                                                                        .addComponent(lblSecCoincidences)
                                                                        .addComponent(lblExeCoincidences))
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblExeTime)
                                                                        .addComponent(lblSecTime)
                                                                        .addComponent(lblConTime)
                                                                        .addComponent(jLabel6)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGap(28, 28, 28)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)))
                                                .addContainerGap(33, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(0, 0, Short.MAX_VALUE)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(lblConWords)
                                        .addComponent(lblConLines)
                                        .addComponent(lblConCoincidences)
                                        .addComponent(lblConTime))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(lblSecWords)
                                        .addComponent(lblSecLines)
                                        .addComponent(lblSecCoincidences)
                                        .addComponent(lblSecTime))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblExeWords)
                                                .addComponent(lblExeLines)
                                                .addComponent(lblExeCoincidences)
                                                .addComponent(lblExeTime)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSearch)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSearchActionPerformed
        if (!txtSearch.getText().equals("")) {
                JLabel[] labels = new JLabel[] {

                        lblSecWords, lblSecLines, lblSecCoincidences, lblSecTime,
                        lblExeWords, lblExeLines, lblExeCoincidences, lblExeTime,
                        lblConWords, lblConLines, lblConCoincidences, lblConTime,
                };
            new RMIClient().init(txtSearch.getText(), labels);
        } else {
            JOptionPane.showMessageDialog(null, "Escriba una palabra a buscar.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1; // Concurrente label
    private javax.swing.JLabel jLabel2; // Secuencial label
    private javax.swing.JLabel jLabel3; // Palabras label
    private javax.swing.JLabel jLabel4; // Lineas label
    private javax.swing.JLabel jLabel5; // Coincidencias label
    private javax.swing.JLabel jLabel6; // Tiempo label
    private javax.swing.JLabel jLabel8; // Executor label
    // Con
    private javax.swing.JLabel lblConWords;
    private javax.swing.JLabel lblConCoincidences;
    private javax.swing.JLabel lblConLines;
    private javax.swing.JLabel lblConTime;
    // Sec
    private javax.swing.JLabel lblSecWords;
    private javax.swing.JLabel lblSecCoincidences;
    private javax.swing.JLabel lblSecLines;
    private javax.swing.JLabel lblSecTime;
    // Exe
    private javax.swing.JLabel lblExeWords;
    private javax.swing.JLabel lblExeCoincidences;
    private javax.swing.JLabel lblExeLines;
    private javax.swing.JLabel lblExeTime;

    private javax.swing.JTextArea txtLog;
    public javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}