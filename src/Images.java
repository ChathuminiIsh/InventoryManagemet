
import dao.ConnectionProvider;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author chath
 */
/**
 * Images class for managing product images
 * Allows users to add, display, and remove images associated with products
 * Fetches data from and writes data to a database
 */
public class Images extends javax.swing.JFrame {

    private String selectedProductId;// Stores the currently selected product ID
     private File selectedImageFile; // Stores the currently selected image file


    /**
     * Creates new form Images
     */
    public Images() {
        initComponents();
        setLocationRelativeTo(null);// Centers the form on the screen
        setupListeners();// Sets up action listeners for buttons and other components
    }

     /**
     * Populates the category combo box with data from the database.
     */
    private void getAllCategory() {
        try {
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from category");
            comboBoxCategory.removeAllItems();
            while (rs.next()) {
                comboBoxCategory.addItem(rs.getString("category_PK") + "-" + rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Displays all images related to a specific product in the list.
     * @param productId The ID of the selected product.
     */
    
    private void displayImageForProduct(String productId) {
       DefaultListModel<String> model = new DefaultListModel<>();
    list.setModel(model); // Clear the list
    try {
        Connection con = ConnectionProvider.getcon();
        PreparedStatement ps = con.prepareStatement("SELECT image_pk FROM images WHERE product_fk = ?");
        ps.setString(1, productId);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            model.addElement(rs.getString("image_pk"));
        }
        list.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }

     /**
     * Opens a file chooser dialog for the user to select an image file
     * Displays the selected image in the label
     */
    private void chooseImage() {
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png", "jpeg");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        selectedImageFile = chooser.getSelectedFile();
        ImageIcon imageIcon = new ImageIcon(selectedImageFile.getAbsolutePath());
        // Resize image to fit lblimage
        Image img = imageIcon.getImage();
        Image resizedImage = img.getScaledInstance(lblimage.getWidth(), lblimage.getHeight(), Image.SCALE_SMOOTH);
        lblimage.setIcon(new ImageIcon(resizedImage));
    }
}

 /**
     * Adds the selected image to the database for the selected product
     */
   private void addImageToDatabase() {
        if (selectedProductId == null) {
            JOptionPane.showMessageDialog(null, "Please select a product");
            return;
        }

        if (selectedImageFile == null) { // Check if an image is selected
            JOptionPane.showMessageDialog(null, "Please choose an image first");
            return;
        }

        try {
            Connection con = ConnectionProvider.getcon();
            FileInputStream fis = new FileInputStream(selectedImageFile);
            PreparedStatement ps = con.prepareStatement("INSERT INTO images (product_fk, image) VALUES (?, ?)");
            ps.setString(1, selectedProductId);
            ps.setBinaryStream(2, fis, (int) selectedImageFile.length());
            ps.executeUpdate();
            fis.close();
            JOptionPane.showMessageDialog(null, "Image added successfully!");
            selectedImageFile = null; // Clear the selected image after successful insertion
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
   }
/**
     * Sets up event listeners for the buttons and components
     */
    private void setupListeners() {
        btnchoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImage();
            }
        });

        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageToDatabase();
            }
        });

        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        comboBoxCategory = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        btnchoose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        lblimage = new javax.swing.JLabel();
        btnremove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoryActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 190, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Category");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 40));

        btnadd.setBackground(new java.awt.Color(0, 255, 0));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.setText("Add");
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, 170, 50));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name"
            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduct);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 510, 440));

        btnchoose.setBackground(new java.awt.Color(0, 255, 0));
        btnchoose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnchoose.setText("Choose");
        jPanel1.add(btnchoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 170, 50));

        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 170, 40));

        lblimage.setBackground(new java.awt.Color(204, 204, 204));
        lblimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblimage.setOpaque(true);
        jPanel1.add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 520, 440));

        btnremove.setBackground(new java.awt.Color(0, 51, 102));
        btnremove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnremove.setForeground(new java.awt.Color(255, 255, 255));
        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 600, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       getAllCategory();
    DefaultTableModel model = (DefaultTableModel) tableProduct.getModel();
    model.setRowCount(0); // Clear the table
    try {
        Connection con = ConnectionProvider.getcon();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select product_pk, name from product");
        while (rs.next()) {
            model.addRow(new Object[]{rs.getString("product_pk"), rs.getString("name")});
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_formComponentShown

    /**
     * Filters and displays products based on the selected category
     * @param evt the event that triggered this method
     */
    private void comboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoryActionPerformed

        DefaultTableModel model = (DefaultTableModel) tableProduct.getModel();
    model.setRowCount(0); // Clear the table
    try {
        Connection con = ConnectionProvider.getcon();
        String selectedCategory = comboBoxCategory.getSelectedItem().toString();
        String categoryPK = selectedCategory.split("-")[0]; // Assuming category_PK is the first part before "-"
        PreparedStatement ps = con.prepareStatement("SELECT product_pk, name FROM product WHERE category_fk = ?");
        ps.setString(1, categoryPK);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[]{rs.getString("product_pk"), rs.getString("name")});
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_comboBoxCategoryActionPerformed

    
    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        if (list.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Please select an image ID first.");
            return;
        }

        try {
            Connection con = ConnectionProvider.getcon();
            String selectedImageId = list.getSelectedValue();
            PreparedStatement ps = con.prepareStatement("DELETE FROM images WHERE image_pk = ?");
            ps.setString(1, selectedImageId);
            int deleted = ps.executeUpdate();
            if (deleted > 0) {
                JOptionPane.showMessageDialog(null, "Image deleted successfully!");
                lblimage.setIcon(null);
                // Refresh the list of images after deletion
                displayImageForProduct(selectedProductId);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete image.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        int row = tableProduct.getSelectedRow();
        selectedProductId = tableProduct.getValueAt(row, 0).toString();
        displayImageForProduct(selectedProductId);
    }//GEN-LAST:event_tableProductMouseClicked

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        try {
        Connection con = ConnectionProvider.getcon();
        String selectedImageId = list.getSelectedValue();
        PreparedStatement ps = con.prepareStatement("SELECT image FROM images WHERE image_pk = ?");
        ps.setString(1, selectedImageId);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            byte[] img = rs.getBytes("image");
            ImageIcon imageIcon = new ImageIcon(img);
            // Resize image to fit lblimage
            Image imgObj = imageIcon.getImage();
            Image resizedImage = imgObj.getScaledInstance(lblimage.getWidth(), lblimage.getHeight(), Image.SCALE_SMOOTH);
            lblimage.setIcon(new ImageIcon(resizedImage));
        } else {
            lblimage.setIcon(null);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_listMouseClicked

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
            java.util.logging.Logger.getLogger(Images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Images().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnchoose;
    private javax.swing.JButton btnremove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblimage;
    private javax.swing.JList<String> list;
    private javax.swing.JTable tableProduct;
    // End of variables declaration//GEN-END:variables

}
