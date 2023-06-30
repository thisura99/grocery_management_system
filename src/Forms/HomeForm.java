package Forms;

public class HomeForm extends javax.swing.JFrame {

    JpanelLoader jpload = new JpanelLoader();

    public HomeForm() {
        initComponents();
        homebtn();
        //this.setExtendedState(HomeForm.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home_btn_group = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        pannel_loader = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        home = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 720));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        pannel_loader.setBackground(new java.awt.Color(204, 204, 255));
        pannel_loader.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pannel_loaderLayout = new javax.swing.GroupLayout(pannel_loader);
        pannel_loader.setLayout(pannel_loaderLayout);
        pannel_loaderLayout.setHorizontalGroup(
            pannel_loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        pannel_loaderLayout.setVerticalGroup(
            pannel_loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/category.png"))); // NOI18N
        jToggleButton2.setText("Category");
        jToggleButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(jToggleButton4);
        jToggleButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/supplier.png"))); // NOI18N
        jToggleButton4.setText("Supllier");
        jToggleButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(jToggleButton5);
        jToggleButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton5.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Stock.png"))); // NOI18N
        jToggleButton5.setText("Stock");
        jToggleButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(jToggleButton6);
        jToggleButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton6.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Invoice.png"))); // NOI18N
        jToggleButton6.setText("Invoice");
        jToggleButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(jToggleButton7);
        jToggleButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Sales.png"))); // NOI18N
        jToggleButton7.setText("Sales");
        jToggleButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(jToggleButton8);
        jToggleButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton8.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/report.png"))); // NOI18N
        jToggleButton8.setText("Reports");
        jToggleButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(jToggleButton9);
        jToggleButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton9.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jToggleButton9.setText("Logout");
        jToggleButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(home);
        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N
        home.setText("Home");
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
        });
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/product.png"))); // NOI18N
        jToggleButton1.setText("Product");
        jToggleButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton10.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(jToggleButton10);
        jToggleButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton10.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Employee.png"))); // NOI18N
        jToggleButton10.setText("Employee");
        jToggleButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setBackground(new java.awt.Color(0, 0, 204));
        home_btn_group.add(jToggleButton11);
        jToggleButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton11.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/exit.png"))); // NOI18N
        jToggleButton11.setText("Exit");
        jToggleButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton2)
                .addGap(4, 4, 4)
                .addComponent(jToggleButton4)
                .addGap(4, 4, 4)
                .addComponent(jToggleButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grocery Management System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("(GSM)");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shopicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(949, 949, 949))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pannel_loader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pannel_loader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        ProductForm pro = new ProductForm();
        jpload.jPanelLoader(pannel_loader, pro);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        CatogoryForm cat = new CatogoryForm();
        jpload.jPanelLoader(pannel_loader, cat);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        SupplierForm sup = new SupplierForm();
        jpload.jPanelLoader(pannel_loader, sup);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        RepotesForm report = new RepotesForm();
        jpload.jPanelLoader(pannel_loader, report);
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        SalesForm sales = new SalesForm();
        jpload.jPanelLoader(pannel_loader, sales);
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        InvoiceForm invoice = new InvoiceForm();
        jpload.jPanelLoader(pannel_loader, invoice);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        StockForm1 stock = new StockForm1();
        jpload.jPanelLoader(pannel_loader, stock);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        homebtn();
    }//GEN-LAST:event_homeActionPerformed
    public void homebtn() {
        MainMenuForm main = new MainMenuForm();
        jpload.jPanelLoader(pannel_loader, main);
    }
    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        // TODO add your handling code here:
        home.setToolTipText("home");
    }//GEN-LAST:event_homeMouseEntered

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        // TODO add your handling code here:
        EmployeeForm main = new EmployeeForm();
        jpload.jPanelLoader(pannel_loader, main);
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jToggleButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton home;
    private javax.swing.ButtonGroup home_btn_group;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JPanel pannel_loader;
    // End of variables declaration//GEN-END:variables
}
