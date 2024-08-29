
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dao.ConnectionProvider;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * ManageCategory class for managing product categories
 * Allows users to add, update, and view categories
 * Fetches data from and writes data to a database
 */
public class ManageCategory extends javax.swing.JFrame {
    private int categoryPK =0;// Stores the primary key of the selected category
    
    /**
     * Creates new form ManageCategory
     */
    public ManageCategory() {
        initComponents();
        setLocationRelativeTo(null);// Centers the form on the screen
    }
   
     /**
     * Validates the input fields
     * @return true if all fields are filled, false otherwise
     */
    private boolean validateFields(){
        if(!txtName.getText().equals("")){
        return false;
        
        }
        else{
        return true;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCategory = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1500, 600));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1460, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1460, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        tableCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCategory);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 730, 540));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 160, 30));

        txtName.setPreferredSize(new java.awt.Dimension(75, 25));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 330, 50));

        btnSave.setBackground(new java.awt.Color(0, 255, 0));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 210, 50));

        btnUpdate.setBackground(new java.awt.Color(0, 255, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 210, 50));

        btnReset.setBackground(new java.awt.Color(0, 255, 0));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 210, 50));

        btnClose.setBackground(new java.awt.Color(0, 0, 102));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("Close");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       
        DefaultTableModel model = ( DefaultTableModel)tableCategory.getModel();
        
        try{
       java.sql.Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from category ");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("category_pk"), rs.getString("name")});
            }
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
         btnUpdate.setEnabled(false); // Disable the update button initially
    }//GEN-LAST:event_formComponentShown

    /**
     * Saves a new category to the database
     * @param evt the event that triggered this method
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name = txtName.getText();
         
        if (validateFields()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
           
            try {
                 java.sql.Connection con = ConnectionProvider.getcon();
                PreparedStatement ps = con.prepareStatement("insert into category(name) values(?)");
                ps.setString(1, name);

                ps.executeUpdate();

                JOptionPane.showMessageDialog(null, "Category added successfully");
                setVisible(false);
                new ManageCategory().setVisible(true);


            } catch (SQLException ex) {
                Logger.getLogger(ManageCategory.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }//GEN-LAST:event_btnSaveActionPerformed

     /**
     * Updates the selected category in the database
     */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       
        String name = txtName.getText();
        if (validateFields()) {
        JOptionPane.showMessageDialog(null, "All fields are required");
    } else {
        java.sql.Connection con = ConnectionProvider.getcon();
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE category SET name=? WHERE category_pk=?");
            ps.setString(1, name);
            ps.setInt(2, categoryPK);

            int updatedRows = ps.executeUpdate();
            if (updatedRows > 0) {
                JOptionPane.showMessageDialog(null, "Category updated successfully");

                // Update the table model with the new data
                DefaultTableModel model = (DefaultTableModel) tableCategory.getModel();
                int selectedRowIndex = tableCategory.getSelectedRow();
                model.setValueAt(name, selectedRowIndex, 1);
               
               
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update category");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

     /**
     * Resets the form by closing and reopening it
     */
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
          setVisible(false);
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

      /**
     * Closes the form
     */
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
          setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    
     /**
     * Handles mouse click events on the category table
     */
    private void tableCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategoryMouseClicked
      
         int index =tableCategory.getSelectedRow();
        TableModel model=tableCategory.getModel();
        
        String id=model.getValueAt(index, 0).toString();
        categoryPK=Integer.parseInt(id);
        
        String name=model.getValueAt(index, 1).toString();
        txtName.setText(name);
        
           btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_tableCategoryMouseClicked

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
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCategory;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
