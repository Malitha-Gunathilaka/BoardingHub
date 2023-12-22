/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Home;

import Login.LoginHome;
import Register.Register_Home;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author User
 */
public class Body extends javax.swing.JInternalFrame {

    /**
     * Creates new form Body
     */
    public Body() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b_body = new javax.swing.JPanel();
        LOGING = new javax.swing.JLabel();
        SINGUP1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(766, 115));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_body.setBackground(new java.awt.Color(29, 119, 209));
        b_body.setToolTipText("");
        b_body.setPreferredSize(new java.awt.Dimension(1024, 440));

        LOGING.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        LOGING.setForeground(new java.awt.Color(255, 255, 255));
        LOGING.setText("           LOGIN");
        LOGING.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LOGING.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        LOGING.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LOGING.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                LOGINGMouseDragged(evt);
            }
        });
        LOGING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGINGMouseClicked(evt);
            }
        });

        SINGUP1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        SINGUP1.setForeground(new java.awt.Color(255, 255, 255));
        SINGUP1.setText("       SINGUP  ");
        SINGUP1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        SINGUP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SINGUP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SINGUP1MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/D_ICON/dp3.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins Black", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONNECTING  YOU   TO YOUR ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to Anex Search,Your Primier destinatino ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("for finding the perfect rental rooms. Explore a  ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("curates selection of  comfortable and affordable ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("annex spaces,tailored to suit your needs.");

        jLabel7.setFont(new java.awt.Font("Poppins Black", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PERFECT  STAY");

        javax.swing.GroupLayout b_bodyLayout = new javax.swing.GroupLayout(b_body);
        b_body.setLayout(b_bodyLayout);
        b_bodyLayout.setHorizontalGroup(
            b_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(b_bodyLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(b_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, b_bodyLayout.createSequentialGroup()
                        .addGroup(b_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(b_bodyLayout.createSequentialGroup()
                                .addGroup(b_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(b_bodyLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(b_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(b_bodyLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, b_bodyLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(LOGING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, b_bodyLayout.createSequentialGroup()
                        .addComponent(SINGUP1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        b_bodyLayout.setVerticalGroup(
            b_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(b_bodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(LOGING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(b_bodyLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(SINGUP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(b_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINGMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGINGMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGINGMouseDragged

    private void LOGINGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGINGMouseClicked
        // TODO add your handling code here:
        LoginHome login = new LoginHome();
        b_body.removeAll();
        b_body.add(login).setVisible(true);
    }//GEN-LAST:event_LOGINGMouseClicked

    private void SINGUP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SINGUP1MouseClicked
        // TODO add your handling code here:
        Register_Home reg = new Register_Home();
        b_body.removeAll();
        b_body.add(reg).setVisible(true);
    }//GEN-LAST:event_SINGUP1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGING;
    private javax.swing.JLabel SINGUP1;
    private javax.swing.JPanel b_body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
