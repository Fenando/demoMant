/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.Manteciones;

/**
 *
 * @author CARR
 */
public class MenuGui extends javax.swing.JPanel {

    /**
     * Creates new form TrozadoGUI
     */
    private BLL.Usuarios user;
    public MenuGui(BLL.Usuarios user) {
        initComponents();
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tituloLbl = new javax.swing.JLabel();
        botonesPanel = new javax.swing.JPanel();
        trozadoBtn = new javax.swing.JButton();
        empaqueBtn = new javax.swing.JButton();
        procesosPosterioresBtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.GridBagLayout());

        tituloLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLbl.setText("Menu General");
        tituloLbl.setToolTipText("");
        tituloLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tituloLbl.setMaximumSize(new java.awt.Dimension(108, 30));
        tituloLbl.setPreferredSize(new java.awt.Dimension(108, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 370;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 20, 0, 1);
        add(tituloLbl, gridBagConstraints);

        botonesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonesPanel.setLayout(new java.awt.GridLayout(1, 0));

        trozadoBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        trozadoBtn.setForeground(new java.awt.Color(80, 105, 113));
        trozadoBtn.setText("Trozado");
        trozadoBtn.setToolTipText("");
        trozadoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        trozadoBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        trozadoBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        trozadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trozadoBtnActionPerformed(evt);
            }
        });
        botonesPanel.add(trozadoBtn);

        empaqueBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empaqueBtn.setForeground(new java.awt.Color(80, 105, 113));
        empaqueBtn.setText("Empaque");
        empaqueBtn.setToolTipText("");
        empaqueBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        empaqueBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        empaqueBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        empaqueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empaqueBtnActionPerformed(evt);
            }
        });
        botonesPanel.add(empaqueBtn);

        procesosPosterioresBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        procesosPosterioresBtn.setForeground(new java.awt.Color(80, 105, 113));
        procesosPosterioresBtn.setText("Procesos Posteriores");
        procesosPosterioresBtn.setToolTipText("");
        procesosPosterioresBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        procesosPosterioresBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        procesosPosterioresBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        procesosPosterioresBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesosPosterioresBtnActionPerformed(evt);
            }
        });
        botonesPanel.add(procesosPosterioresBtn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 17, 49, 0);
        add(botonesPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void trozadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trozadoBtnActionPerformed
        // TODO add your handling code here:
        MenuTrozadoJdialog mtj = new MenuTrozadoJdialog(this.user, this, this);
        mtj.setLocationRelativeTo(null);
        mtj.setVisible(true);
    }//GEN-LAST:event_trozadoBtnActionPerformed

    private void empaqueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empaqueBtnActionPerformed
        // TODO add your handling code here:
        new MenuProcesosGui(user, this, this);
    }//GEN-LAST:event_empaqueBtnActionPerformed

    private void procesosPosterioresBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesosPosterioresBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procesosPosterioresBtnActionPerformed
    private void nuevaVentana(String nombre){
        new EvaporadorCuatroGui2(nombre, this.user).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonesPanel;
    private javax.swing.JButton empaqueBtn;
    private javax.swing.JButton procesosPosterioresBtn;
    private javax.swing.JLabel tituloLbl;
    private javax.swing.JButton trozadoBtn;
    // End of variables declaration//GEN-END:variables
}
