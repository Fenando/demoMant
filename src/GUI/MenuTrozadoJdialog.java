package GUI;

/**
 *
 * @author ferna
 */
public class MenuTrozadoJdialog extends javax.swing.JDialog {

	BLL.Usuarios user;

	/**
	 * Creates new form MenuTrozadoJdialog
	 *
	 * @param user
	 */
	public MenuTrozadoJdialog(){
		super();
		initComponents();
	}

	/**
	 * Creates new form ChooseGui
	 *
	 * @param jp
	 */
	public void cambioVentana(javax.swing.JPanel jp) {
		Main.Main.instancia.cambioVentana(jp);
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

        jPanel1 = new javax.swing.JPanel();
        tituloLbl = new javax.swing.JLabel();
        botonesPanel = new javax.swing.JPanel();
        iluminariaBtn = new javax.swing.JButton();
        evaporadorBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        tituloLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLbl.setText("Menu Trozado");
        tituloLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tituloLbl.setMaximumSize(new java.awt.Dimension(68, 30));
        tituloLbl.setPreferredSize(new java.awt.Dimension(68, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 309;
        gridBagConstraints.ipady = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 0, 1);
        jPanel1.add(tituloLbl, gridBagConstraints);

        botonesPanel.setLayout(new java.awt.BorderLayout());

        iluminariaBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iluminariaBtn.setText("Iluminarias");
        iluminariaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iluminariaBtnActionPerformed(evt);
            }
        });
        botonesPanel.add(iluminariaBtn, java.awt.BorderLayout.PAGE_START);

        evaporadorBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        evaporadorBtn.setText("Evaporadores");
        evaporadorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaporadorBtnActionPerformed(evt);
            }
        });
        botonesPanel.add(evaporadorBtn, java.awt.BorderLayout.PAGE_END);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(59, 0, 53, 0);
        jPanel1.add(botonesPanel, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iluminariaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iluminariaBtnActionPerformed
		this.cambioVentana(new TrozadosIluminariasGui());
		dispose();

    }//GEN-LAST:event_iluminariaBtnActionPerformed

    private void evaporadorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaporadorBtnActionPerformed
		this.cambioVentana(new TrozadoEvaporadoresGui());
		dispose();
    }//GEN-LAST:event_evaporadorBtnActionPerformed

	/**
	 * @param args the command line arguments
	 */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuTrozadoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuTrozadoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuTrozadoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuTrozadoJdialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                MenuTrozadoJdialog dialog = new MenuTrozadoJdialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonesPanel;
    private javax.swing.JButton evaporadorBtn;
    private javax.swing.JButton iluminariaBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloLbl;
    // End of variables declaration//GEN-END:variables
}
