/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package O_Interface;


import com.mysql.cj.x.protobuf.MysqlxCrud;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author User
 */
public class O_BH extends javax.swing.JInternalFrame {

    /**
     * Creates new form O_Anex
     */
    public O_BH(String NIC) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        
        try {
        //String ONIC=NIC;
        //AID,Location,Address,Title,Price_Range,Amenities,BedRooms,BathRooms,Description
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = (Connection) java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/boardinghub", "root", "");
        String s = "SELECT BID, Location, Address, Title, Price_Range, Amenities, BedRooms, BathRooms, Description FROM boardinghouse WHERE NIC=?";
        PreparedStatement ps = con.prepareStatement(s);
        ps.setString(1, NIC);
        ResultSet rs =ps.executeQuery();
        
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        while(rs.next()){
            model.addRow(new String[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8),
                rs.getString(9)});
        }
        
        ps.executeQuery();
       // JOptionPane.showMessageDialog(malitha,rs+" Value Inserted Successfully");
       
        //The close() method is used to close the stream and release 
        //the resources that were busy in the stream
        ps.close();
        con.close();
        
   
           
        }catch(  SQLException ex){
        
            System.out.println("error;"+ex.getMessage());
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ADI", "Location", "Address", "Title", "Price", "Amenities", "BedRooms", "BathRooms", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Update)
                .addGap(47, 47, 47)
                .addComponent(Delete)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(Delete))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
       int selectedRowIndex = jTable1.getSelectedRow();

        
        if (selectedRowIndex != -1) {
            String aid = jTable1.getValueAt(selectedRowIndex, 0).toString();
            updateRecord(aid);
            refreshTable(); // Call refreshTable after updating
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to update.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    

    }//GEN-LAST:event_UpdateActionPerformed
    private void updateRecord(String aid) {
    // Implement the update logic here, similar to the previous example for updating a database record
     try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boardinghub", "root", "");
            String updateQuery = "UPDATE anex SET Location=?, Address=?, Title=?, Price_Range=?, Amenities=?, Bedrooms=?, BathRooms=?, Description=? WHERE AID=?";
            PreparedStatement updatePs = con.prepareStatement(updateQuery);

            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            int selectedRow = jTable1.getSelectedRow();

            if (selectedRow != -1 && selectedRow <= tblModel.getRowCount()) {
                
                String AID = tblModel.getValueAt(selectedRow, tblModel.findColumn("AID")).toString();
                String Location = tblModel.getValueAt(selectedRow, tblModel.findColumn("Location")).toString();
                String Address = tblModel.getValueAt(selectedRow, tblModel.findColumn("Address")).toString();
                String Title = tblModel.getValueAt(selectedRow, tblModel.findColumn("Title")).toString();
                String Price_Range = tblModel.getValueAt(selectedRow, tblModel.findColumn("Price")).toString();
                String Amenities = tblModel.getValueAt(selectedRow, tblModel.findColumn("Amenities")).toString();
                String Bedrooms = tblModel.getValueAt(selectedRow, tblModel.findColumn("BedRooms")).toString();
                String Bathrooms = tblModel.getValueAt(selectedRow, tblModel.findColumn("BathRooms")).toString();
                String Description = tblModel.getValueAt(selectedRow, tblModel.findColumn("Description")).toString();

                updatePs.setString(1, Location);
                updatePs.setString(2, Address);
                updatePs.setString(3, Title);
                updatePs.setString(4, Price_Range);
                updatePs.setString(5, Amenities);
                updatePs.setString(6, Bedrooms);
                updatePs.setString(7, Bathrooms);
                updatePs.setString(8, Description);
                updatePs.setString(9, AID);
                
                updatePs.executeUpdate();
                int rowsAffected = updatePs.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Record updated successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update record.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a valid row to update.", "Invalid Row Selected", JOptionPane.WARNING_MESSAGE);
            }

            updatePs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
}
        private void refreshTable(String aid) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boardinghub", "root", "");
            String s = "SELECT AID, Location, Address, Title, Price_Range, Amenities, BedRooms, BathRooms, Description FROM anex WHERE AID=?";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, aid);  // Assuming NIC is a class variable or a parameter passed to the constructor
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new String[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)});
            }

            ps.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    // ... (existing code)


    
    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();

    if (selectedRowIndex != -1) { // Check if a row is selected
        // Assuming AID is in the first column (index 0)
        String aid = jTable1.getValueAt(selectedRowIndex, 0).toString();

        // Perform the delete operation based on the selected AID
        deleteRecord(aid);
        
        // Refresh the table after deletion
        refreshTable();
    } else {
        // Display a message to inform the user that no row is selected
        JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_DeleteMouseClicked
    private void deleteRecord(String aid) {
    try {
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/boardinghub", "root", "");
        String s = "DELETE FROM boardinghouse WHERE BID=?";
        PreparedStatement ps = con.prepareStatement(s);
        ps.setString(1, aid);
        int rowsAffected = ps.executeUpdate();
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record deleted successfully.");
             tblModel.removeRow(jTable1.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete record.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        ps.close();
        con.close();
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
}

private void refreshTable(){}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}