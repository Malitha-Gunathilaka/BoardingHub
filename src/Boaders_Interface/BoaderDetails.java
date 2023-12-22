/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to  change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Boaders_Interface;

import Home.BH_Home;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author User
 */
public class BoaderDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form BoaderDetails
     */
    String BNICNO;
    String BDFname;
    String BDLname;
    String BDAddress;
    String BDEmail;
    String BDPhoneNo;
    String BDWorkPlace;
    
    public BoaderDetails(String nic, String Fname, String Lname, String Address, String Email, String PhoneNo, String WorkPlace) {
        initComponents();
        //////B_Interface////////
        this.BNIC.setText(nic);
        this.BFName.setText(Fname);
        this.BSName.setText(Lname);
        this.BAsdderss.setText(Address);
        this.BEmail.setText(Email);
        this.BPhone.setText(PhoneNo);
        this.BWorkPlace.setText(WorkPlace);
        
        
        ////BDetails//////
        BNICNO =new String(nic);
        BDFname =new String(Fname);
        BDLname =new String(Lname);
        BDAddress =new String(Address);
        BDEmail =new String(Email);
        BDPhoneNo =new String(PhoneNo);
        BDWorkPlace =new String(WorkPlace);
        ////BDetails//////
        
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

        BDetails = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        NIC = new javax.swing.JLabel();
        Fname = new javax.swing.JLabel();
        Sname = new javax.swing.JLabel();
        Adderss1 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        Phone1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        BWorkPlace = new javax.swing.JLabel();
        BPhone = new javax.swing.JLabel();
        BEmail = new javax.swing.JLabel();
        BAsdderss = new javax.swing.JLabel();
        BSName = new javax.swing.JLabel();
        BFName = new javax.swing.JLabel();
        BNIC = new javax.swing.JLabel();
        profilePIC = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();

        BDetails.setBackground(new java.awt.Color(255, 255, 255));
        BDetails.setPreferredSize(new java.awt.Dimension(864, 440));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));

        NIC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NIC.setText("NIC");

        Fname.setBackground(new java.awt.Color(54, 161, 212));
        Fname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Fname.setText("Frist Name");

        Sname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sname.setText("Second Name ");

        Adderss1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Adderss1.setText("Adderss");

        Email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Email.setText("Email");

        Phone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Phone.setText("Phone Number");

        Phone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Phone1.setText("University/School");

        Label2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Label2.setText("WorkPlace\t");

        BWorkPlace.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BWorkPlace.setText("jLabel3");
        BWorkPlace.setPreferredSize(new java.awt.Dimension(250, 25));

        BPhone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BPhone.setText("jLabel3");
        BPhone.setPreferredSize(new java.awt.Dimension(250, 25));

        BEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BEmail.setText("jLabel3");
        BEmail.setPreferredSize(new java.awt.Dimension(250, 25));

        BAsdderss.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BAsdderss.setText("jLabel3");
        BAsdderss.setPreferredSize(new java.awt.Dimension(250, 25));

        BSName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BSName.setText("jLabel3");
        BSName.setPreferredSize(new java.awt.Dimension(250, 25));

        BFName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BFName.setText("fname");
        BFName.setPreferredSize(new java.awt.Dimension(250, 25));

        BNIC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BNIC.setText("nic");
        BNIC.setPreferredSize(new java.awt.Dimension(250, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fname, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(Sname, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(Adderss1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(NIC, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Phone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Phone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAsdderss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BWorkPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NIC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(Sname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Adderss1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(Phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Label2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(BFName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BSName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(BAsdderss, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BWorkPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        profilePIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user.png"))); // NOI18N
        profilePIC.setToolTipText("");

        Delete.setText("Delect Account");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(profilePIC)
                        .addGap(87, 87, 87)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Update)
                        .addGap(35, 35, 35)
                        .addComponent(Delete)
                        .addGap(193, 193, 193))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(profilePIC))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(Delete))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BDetailsLayout = new javax.swing.GroupLayout(BDetails);
        BDetails.setLayout(BDetailsLayout);
        BDetailsLayout.setHorizontalGroup(
            BDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BDetailsLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        BDetailsLayout.setVerticalGroup(
            BDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BDetailsLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
        try {
            String ID =BNIC.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boardinghub", "root", "");
            // executeUpdate(String SQL):
            String s = "delete from Customer where NIC=?";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, ID);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Youer Account is Delete auto logout");

            //        B_Body body = new B_Body();
            //        B_Interface.RE_Body.removeAll();
            //        B_Interface.RE_Body.add(body).setVisible(true);

            BH_Home reg1 =new BH_Home();
            reg1.show();
            this.dispose();
            reg1.setVisible(true);

            ps.close();
            con.close();

        }catch(HeadlessException | ClassNotFoundException | SQLException e){

            System.out.println(e);

        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        // TODO add your handling code here:
        String Nic1 = BNICNO;
        String Fname=BDFname;
        String Lname=BDLname;
        String Address=BDAddress;
        String Email=BDEmail;
        String PhoneNo=BDPhoneNo;
        String WorkPlace=BDWorkPlace;

        UpdateBoaderDetails bodaerdetails = new UpdateBoaderDetails(Nic1, Fname, Lname, Address, Email, PhoneNo, WorkPlace);
        BDetails.removeAll();
        BDetails.add(bodaerdetails).setVisible(true);
    }//GEN-LAST:event_UpdateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adderss1;
    private javax.swing.JLabel BAsdderss;
    private javax.swing.JPanel BDetails;
    private javax.swing.JLabel BEmail;
    private javax.swing.JLabel BFName;
    private javax.swing.JLabel BNIC;
    private javax.swing.JLabel BPhone;
    private javax.swing.JLabel BSName;
    private javax.swing.JLabel BWorkPlace;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel NIC;
    private javax.swing.JLabel Phone;
    private javax.swing.JLabel Phone1;
    private javax.swing.JLabel Sname;
    private javax.swing.JButton Update;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel profilePIC;
    // End of variables declaration//GEN-END:variables
}
