/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class ProductForm extends javax.swing.JPanel {

    
   
   
    /**
     * Creates new form ProductForm
     */
    public ProductForm() {
        initComponents();
        getcatagory();
        getsupplier();
        clearfield();
        tableload();
    }
    
private void getcatagory(){
    try {
            
            Statement st=DatabaseConnection.myconnection().createStatement();
            String sql = "SELECT * FROM `productcategory`";
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                String catname=res.getString("Category_name");
                procategory.addItem(catname);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}
private void getsupplier(){
    try {
            
            Statement st=DatabaseConnection.myconnection().createStatement();
            String sql = "SELECT * FROM `supplier`";
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                String supname=res.getString("Sup_name");
                prosupplier.addItem(supname);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
}

public void tableload(){
        //load to data into the table   
            try {
            
            Statement sta=DatabaseConnection.myconnection().createStatement();
            ResultSet res = sta.executeQuery("SELECT `Pro_id`, `Pro_name`, `Pro_category`, `Pro_costprice`, `Pro_sellprice`, `Pro_quantity`, `Pro_suplier`, `Pro_date` FROM `product`");
            producttable.setModel(DbUtils.resultSetToTableModel(res));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

public void clearfield(){
        proid.setText("");
        proname.setText("");
        procategory.setSelectedItem("");
        procostprice.setText("");
        prosellprice.setText("");
        proquantity.setText("");
        prosupplier.setSelectedItem("");
        prodate.setText("");
        proid.requestFocus();
        date();
    }

public void date(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now=LocalDateTime.now();
        prodate.setText(dtf.format(now));
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        proname = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        procostprice = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        procategory = new javax.swing.JComboBox<>();
        prosellprice = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        proquantity = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        prodate = new javax.swing.JTextField();
        prosupplier = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        producttable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        proid = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        prosearch = new javax.swing.JTextField();
        btnrefresh = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel7.setBackground(new java.awt.Color(102, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setPreferredSize(new java.awt.Dimension(390, 270));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Product Name :");

        proname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Delete.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Update.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Clear.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Category :");

        procostprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Cost Price :");

        prosellprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Sell Price :");

        proquantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Quantity :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Date :");

        prodate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Supplier :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel34)
                            .addComponent(jLabel28)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(procostprice, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(prosellprice)
                            .addComponent(proquantity)
                            .addComponent(prodate)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(prosupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(procategory, 0, 201, Short.MAX_VALUE)
                            .addComponent(proname))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclear)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(proname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(procategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(procostprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(prosellprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(proquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prosupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(3, 3, 3)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(prodate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btnclear))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        producttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product_ID", "Product_Name", "Category", "Cost_price", "Sell_Price", "Quantity", "Supplier", "Date"
            }
        ));
        producttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producttableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(producttable);

        jPanel11.setBackground(new java.awt.Color(102, 153, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Product ID :");

        proid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Product Information :");

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search.png"))); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proid, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(proid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Search By Name :");

        prosearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prosearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prosearchKeyReleased(evt);
            }
        });

        btnrefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prosearch, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnrefresh)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(prosearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnrefresh))
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // Data Save:
        if(proname.getText().isEmpty()||proid.getText().isEmpty()||proquantity.getText().isEmpty()||procostprice.getText().isEmpty()|| prosellprice.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Some Component Are Missing");
        }
        else{
            
            String id=proid.getText();
            String name=proname.getText();
            String category=(String) procategory.getSelectedItem();
            Double cost=Double.parseDouble(procostprice.getText());
            Double sell=Double.parseDouble(prosellprice.getText());
            Integer quantity=Integer.parseInt(proquantity.getText());
            String supplier=(String) prosupplier.getSelectedItem();
            String date=prodate.getText();
        
            Double costprice = Math.round(cost*100)/100.0;
            Double sellprice = (Math.round(sell*100)/100.00);
            
            try {
                Statement st=DatabaseConnection.myconnection().createStatement();
                st.executeUpdate("INSERT INTO `product`(`Pro_id`, `Pro_name`, `Pro_category`, `Pro_costprice`, `Pro_sellprice`, `Pro_quantity`, `Pro_suplier`, `Pro_date`) VALUES"
                        + " ('"+id+"','"+name+"','"+category+"','"+costprice+"','"+sellprice+"','"+quantity+"','"+supplier+"','"+date+"')");
                JOptionPane.showMessageDialog(null,"Data Saved Successfully");
            } catch (Exception e) {
                System.out.println(e);
            }
            tableload();
            clearfield();
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
            String id=proid.getText();
            String name=proname.getText();
            String category=(String) procategory.getSelectedItem();
            Double cost=Double.parseDouble(procostprice.getText());
            Double sell=Double.parseDouble(prosellprice.getText());
            Integer quantity=Integer.parseInt(proquantity.getText());
            String supplier=(String) prosupplier.getSelectedItem();
            String date=prodate.getText();
        
            Double costprice = Math.round(cost*100)/100.0;
            Double sellprice = (Math.round(sell*100)/100.00);
        
        if(proid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No Record Are Selected");
        }
        else{
            try {
                Statement st=DatabaseConnection.myconnection().createStatement();
                st.executeUpdate("UPDATE `product` SET `Pro_id`='"+id+"',`Pro_name`='"+name+"',`Pro_category`='"+category+"',"
                + "`Pro_costprice`='"+costprice+"',`Pro_sellprice`='"+sellprice+"',`Pro_quantity`='"+quantity+"',`Pro_suplier`='"+supplier+"',`Pro_date`='"+date+"' WHERE `Pro_id`='"+id+"'");
                
                JOptionPane.showMessageDialog(null,"Data Update Successfully");
            } catch (Exception e) {
            }
            tableload();
            clearfield();
        }
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void producttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producttableMouseClicked
        // TODO add your handling code here:
        
        int r=producttable.getSelectedRow();
        
        String id=producttable.getValueAt(r, 0).toString();
        String name=producttable.getValueAt(r, 1).toString();
        String category=producttable.getValueAt(r, 2).toString();
        String costprice=producttable.getValueAt(r, 3).toString();
        String sellprice=producttable.getValueAt(r, 4).toString();
        String quantity=producttable.getValueAt(r,5).toString();
        String supplier=producttable.getValueAt(r, 6).toString();
        String date=producttable.getValueAt(r, 7).toString();
        
        proid.setText(id);
        proname.setText(name);
        procategory.setSelectedItem(category);
        procostprice.setText(costprice);
        prosellprice.setText(sellprice);
        proquantity.setText(quantity);
        prosupplier.setSelectedItem(supplier);
        prodate.setText(date);
    }//GEN-LAST:event_producttableMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clearfield();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       // Delete Data:
        if(proid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No Record Are Selected");
        }
        else{
            int response = JOptionPane.showConfirmDialog(this,"Do You Want To Delete This Record","Confrim",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);


            if(response==JOptionPane.YES_OPTION){
                String id=proid.getText();
                try {
                    Statement st=DatabaseConnection.myconnection().createStatement();
                    st.executeUpdate("DELETE FROM `product` WHERE   Pro_id='"+id+"'");
                    JOptionPane.showMessageDialog(null,"Data Delete Successfully");
                    
                } catch (Exception e) {
                    System.out.println(e);
                }
                tableload();
                clearfield();
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // Search Data:
        
        String id=proid.getText();
        
        if(proid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter Product ID First!");
        }
        else{
            try {

                Statement st=DatabaseConnection.myconnection().createStatement();
                ResultSet rs=st.executeQuery("SELECT * FROM `product` WHERE Pro_id='"+id+"'");

                if(rs.next()){
                    proname.setText(rs.getString("Pro_name"));
                    procategory.setSelectedItem(rs.getString("Pro_category"));
                    procostprice.setText(rs.getString("Pro_costprice"));
                    prosellprice.setText(rs.getString("Pro_sellprice"));
                    proquantity.setText(rs.getString("Pro_quantity"));
                    prosupplier.setSelectedItem(rs.getString("Pro_suplier"));
                    prodate.setText(rs.getString("Pro_date"));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Data Is Not In Database, Try Again!");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } 
    }//GEN-LAST:event_btnsearchActionPerformed

    private void prosearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prosearchKeyReleased
        // TODO add your handling code here:
        String name=prosearch.getText();
        try {
            DefaultTableModel dt=(DefaultTableModel)producttable.getModel();
            dt.setRowCount(0);
            Statement sta=DatabaseConnection.myconnection().createStatement();
            ResultSet res = sta.executeQuery("SELECT * FROM `product` WHERE Pro_name like'%"+name+"%'");
            producttable.setModel(DbUtils.resultSetToTableModel(res));
        } catch (Exception e) {
            tableload();
        }
    }//GEN-LAST:event_prosearchKeyReleased

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        tableload();
        prosearch.setText("");
        prosearch.requestFocus();
    }//GEN-LAST:event_btnrefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> procategory;
    private javax.swing.JTextField procostprice;
    private javax.swing.JTextField prodate;
    private javax.swing.JTable producttable;
    private javax.swing.JTextField proid;
    private javax.swing.JTextField proname;
    private javax.swing.JTextField proquantity;
    private javax.swing.JTextField prosearch;
    private javax.swing.JTextField prosellprice;
    private javax.swing.JComboBox<String> prosupplier;
    // End of variables declaration//GEN-END:variables
}
