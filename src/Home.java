
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Home class representing the main interface for different user roles.
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    public Home(String role) {
        initComponents();
        setLocationRelativeTo(null);// Centers the form on the screen
        if (role.equals("Admin")) {
// Hides the user management button for Admin role
            btnuser.setVisible(false);
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
        btnlogout = new javax.swing.JButton();
        btnvieworder = new javax.swing.JButton();
        btnorder = new javax.swing.JButton();
        btncustomer = new javax.swing.JButton();
        btnproduct = new javax.swing.JButton();
        btncategory = new javax.swing.JButton();
        btnuser = new javax.swing.JButton();
        btnimages = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        btnvieworder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnvieworder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View-orders.png"))); // NOI18N
        btnvieworder.setText("View Order");
        btnvieworder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvieworderMouseClicked(evt);
            }
        });
        btnvieworder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvieworderActionPerformed(evt);
            }
        });

        btnorder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orders.png"))); // NOI18N
        btnorder.setText("Order");
        btnorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnorderMouseClicked(evt);
            }
        });
        btnorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderActionPerformed(evt);
            }
        });

        btncustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customers.png"))); // NOI18N
        btncustomer.setText("Customer");
        btncustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncustomerMouseClicked(evt);
            }
        });
        btncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerActionPerformed(evt);
            }
        });

        btnproduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        btnproduct.setText("Product");
        btnproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnproductMouseClicked(evt);
            }
        });
        btnproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductActionPerformed(evt);
            }
        });

        btncategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btncategory.setText("Category");
        btncategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncategoryMouseClicked(evt);
            }
        });
        btncategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoryActionPerformed(evt);
            }
        });

        btnuser.setBackground(new java.awt.Color(153, 153, 153));
        btnuser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users.png"))); // NOI18N
        btnuser.setText("User");
        btnuser.setPreferredSize(new java.awt.Dimension(70, 45));
        btnuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnuserMouseClicked(evt);
            }
        });
        btnuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserActionPerformed(evt);
            }
        });

        btnimages.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnimages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pic.png"))); // NOI18N
        btnimages.setText("Images");
        btnimages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnimagesMouseClicked(evt);
            }
        });
        btnimages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimagesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnuser, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btncategory, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btncustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnimages, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnorder, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnvieworder)
                .addGap(39, 39, 39)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnproduct)
                    .addComponent(btncategory, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncustomer)
                    .addComponent(btnorder)
                    .addComponent(btnuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvieworder)
                    .addComponent(btnlogout)
                    .addComponent(btnimages, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(877, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 // Method called when user management button is clicked
    private void btnuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserActionPerformed
        new ManageUser().setVisible(true);// Opens the ManageUser form
    }//GEN-LAST:event_btnuserActionPerformed

// Method called when user management button is clicked with mouse
    private void btnuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuserMouseClicked
        setButtonColors(btnuser);// Changes the button color on click
    }//GEN-LAST:event_btnuserMouseClicked

// Method called when category management button is clicked
    private void btncategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoryActionPerformed
        new ManageCategory().setVisible(true);// Opens the ManageCategory form
    }//GEN-LAST:event_btncategoryActionPerformed

// Method called when category management button is clicked with mouse
    private void btncategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncategoryMouseClicked
        setButtonColors(btncategory);//Changes the button color on click
    }//GEN-LAST:event_btncategoryMouseClicked

// Method called when product management button is clicked with mouse
    private void btnproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductActionPerformed
        new ManageProduct().setVisible(true);// Opens the ManageProduct form
    }//GEN-LAST:event_btnproductActionPerformed

// Method called when product management button is clicked with mouse
    private void btnproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnproductMouseClicked
        setButtonColors(btnproduct);// Changes the button color on click
    }//GEN-LAST:event_btnproductMouseClicked

// Method called when customer management button is clicked
    private void btncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerActionPerformed
        new ManageCustomer().setVisible(true);// Opens the ManageCustomer form
    }//GEN-LAST:event_btncustomerActionPerformed

    // Method called when customer management button is clicked with mouse
    private void btncustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncustomerMouseClicked
        setButtonColors(btncustomer);// Changes the button color on click
    }//GEN-LAST:event_btncustomerMouseClicked

    // Method called when order management button is clicked
    private void btnorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderActionPerformed
        new ManageOrder().setVisible(true);// Opens the ManageOrder form
    }//GEN-LAST:event_btnorderActionPerformed

    // Method called when order management button is clicked with mouse
    private void btnorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnorderMouseClicked
        setButtonColors(btnorder);// Changes the button color on click
    }//GEN-LAST:event_btnorderMouseClicked

    // Method called when view orders button is clicked
    private void btnvieworderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvieworderActionPerformed
        new ViewOrders().setVisible(true);// Opens the ViewOrders form
    }//GEN-LAST:event_btnvieworderActionPerformed

    // Method called when view orders button is clicked with mouse
    private void btnvieworderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvieworderMouseClicked
        setButtonColors(btnvieworder);// Changes the button color on click
    }//GEN-LAST:event_btnvieworderMouseClicked

    // Method called when logout button is clicked
    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        setButtonColors(btnlogout);// Changes the button color on click
        int a = JOptionPane.showConfirmDialog(null, "Do you want to logout application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {// If user confirms logout
            setVisible(false);// Hides the current form
            new Login().setVisible(true);// Opens the Login form

        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    // Method called when images button is clicked
    private void btnimagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimagesActionPerformed
        setButtonColors(btnimages);// Changes the button color on click
    }//GEN-LAST:event_btnimagesActionPerformed

    // Method called when images button is clicked with mouse
    private void btnimagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnimagesMouseClicked
        new Images().setVisible(true);// Opens the Images form
    }//GEN-LAST:event_btnimagesMouseClicked

    // Method to change the background color of the selected button
    private void setButtonColors(JButton selectedButton) {
        JButton[] buttons = {btnuser, btncategory, btncustomer, btnorder, btnproduct, btnvieworder, btnimages, btnlogout};
        for (JButton button : buttons) {
            button.setBackground(button == selectedButton ? new Color(153, 153, 153) : Color.white);
        }
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncategory;
    private javax.swing.JButton btncustomer;
    private javax.swing.JButton btnimages;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnorder;
    private javax.swing.JButton btnproduct;
    private javax.swing.JButton btnuser;
    private javax.swing.JButton btnvieworder;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
