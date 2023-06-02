/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View2;

/**
 *
 * @author Kevin Salazar
 */
public class MenuCamion extends javax.swing.JFrame {

    /**
     * Creates new form MenuCamion
     */
    public MenuCamion() {
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

        TituloMenuCamion = new javax.swing.JLabel();
        BottonIngresarCamion = new javax.swing.JButton();
        BottonBuscarCamion = new javax.swing.JButton();
        BottonVolverCamion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TituloMenuCamion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        TituloMenuCamion.setText("MENU DE CAMIONES");

        BottonIngresarCamion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        BottonIngresarCamion.setText("INGRESAR CAMION");
        BottonIngresarCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonIngresarCamionActionPerformed(evt);
            }
        });

        BottonBuscarCamion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        BottonBuscarCamion.setText("BUSCAR");

        BottonVolverCamion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        BottonVolverCamion.setText("VOLVER");
        BottonVolverCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottonVolverCamionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloMenuCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BottonIngresarCamion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(BottonBuscarCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BottonVolverCamion))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BottonVolverCamion)
                .addGap(18, 18, 18)
                .addComponent(TituloMenuCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BottonIngresarCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottonBuscarCamion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottonIngresarCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonIngresarCamionActionPerformed
        IngresarCamion camion = new IngresarCamion();
        camion.setVisible(true);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_BottonIngresarCamionActionPerformed

    private void BottonVolverCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottonVolverCamionActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_BottonVolverCamionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottonBuscarCamion;
    private javax.swing.JButton BottonIngresarCamion;
    private javax.swing.JButton BottonVolverCamion;
    private javax.swing.JLabel TituloMenuCamion;
    // End of variables declaration//GEN-END:variables
}
