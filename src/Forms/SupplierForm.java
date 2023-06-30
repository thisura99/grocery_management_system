/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

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
public class SupplierForm extends javax.swing.JPanel {

    /**
     * Creates new form ProductForm
     */
    public SupplierForm() {
        initComponents();
        date();
        tableload();
    }
    
    public void tableload(){
        //load to data into the table   
            try {
            
            Statement sta=DatabaseConnection.myconnection().createStatement();
            ResultSet res = sta.executeQuery("SELECT `Sup_id`, `Sup_name`, `Sup_telephone`, `Sup_address`, `Sup_nic`, `Sup_gender`, `Sup_working_company`, `Sup_contact_person`, `Sup_contact_person_tel`, `Sup_date` FROM `supplier`");
            suppliertable.setModel(DbUtils.resultSetToTableModel(res));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void clearfield(){
        supid.setText("");
        supname.setText("");
        supgender.setSelectedItem("");
        suptelephone.setText("");
        supaddress.setText("");
        supnic.setText("");
        supworkcompany.setText("");
        supcontactperson.setText("");
        supcontactpersontel.setText("");
        supdate.setText(""); 
        supid.requestFocus();
        date();
    }
    
    public void date(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now=LocalDateTime.now();
        supdate.setText(dtf.format(now));
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        supname = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        suptelephone = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        supnic = new javax.swing.JTextField();
        supaddress = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        supworkcompany = new javax.swing.JTextField();
        supdate = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        supcontactperson = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        supcontactpersontel = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        supgender = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        suppliertable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        supid = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        supsearch = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel7.setBackground(new java.awt.Color(102, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setRequestFocusEnabled(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Supplier Name :");

        supname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

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

        suptelephone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Tepephone :");

        supnic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        supaddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("NIC :");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Address :");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Working Company :");

        supworkcompany.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        supdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Date :");

        supcontactperson.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Contact Person :");

        supcontactpersontel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Con. Person Tel :");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Gender :");

        supgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnclear))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel34)
                                .addComponent(jLabel35)
                                .addComponent(jLabel36)
                                .addComponent(jLabel37))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(supworkcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(supdate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(supcontactperson, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(supcontactpersontel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addGap(18, 18, 18)
                            .addComponent(supname, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel30)
                                .addComponent(jLabel31)
                                .addComponent(jLabel29))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(supaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(supnic, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(supgender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addGap(18, 18, 18)
                            .addComponent(suptelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(supname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(suptelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(supaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(supnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(supworkcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supcontactperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(supcontactpersontel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(supdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btnclear))
                .addGap(31, 31, 31))
        );

        suppliertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Telephone", "Address", "NIC", "Gender", "Company", "Contact_Pesron", "Con_Per_Tel", "Date"
            }
        ));
        suppliertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliertableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(suppliertable);

        jPanel11.setBackground(new java.awt.Color(102, 153, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Supplier ID :");

        supid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Supplier Information :");

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
                .addComponent(supid, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(supid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        supsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supsearchKeyReleased(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Search By Name :");

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
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(supsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnrefresh))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // Data Save:
        String id=supid.getText();
        String name=supname.getText();
        String telephone=suptelephone.getText();
        String address=supaddress.getText();
        String nic=supnic.getText();
        String gender=(String) supgender.getSelectedItem();
        String workingcopmany=supworkcompany.getText();
        String contactpersone=supcontactperson.getText();
        String conpertel=supcontactpersontel.getText();
        String date=supdate.getText();
        if(name.isEmpty()||telephone.isEmpty()||conpertel.isEmpty()||workingcopmany.isEmpty()){
            JOptionPane.showMessageDialog(null,"Some Component Are Missing");
        }
        else{
            try {
                Statement st=DatabaseConnection.myconnection().createStatement();
                st.executeUpdate("INSERT INTO `supplier`(`Sup_id`, `Sup_name`, `Sup_telephone`, `Sup_address`, `Sup_nic`, `Sup_gender`, `Sup_working_company`, `Sup_contact_person`, `Sup_contact_person_tel`, `Sup_date`) VALUES ('"+id+"','"+name+"','"+telephone+"','"+address+"','"+nic+"','"+gender+"','"+workingcopmany+"','"+contactpersone+"','"+conpertel+"','"+date+"')");
                JOptionPane.showMessageDialog(null,"Data Saved Successfully");
            } catch (Exception e) {
                System.out.println(e);
            }
            tableload();
            clearfield();
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // Update Data:
        String id=supid.getText();
        String name=supname.getText();
        String telephone=suptelephone.getText();
        String address=supaddress.getText();
        String nic=supnic.getText();
        String gender=(String) supgender.getSelectedItem();
        String workingcopmany=supworkcompany.getText();
        String contactpersone=supcontactperson.getText();
        String conpertel=supcontactpersontel.getText();
        String date=supdate.getText();
        
        if(supid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No Record Are Selected");
        }
        else{
            try {
                Statement st=DatabaseConnection.myconnection().createStatement();
                st.executeUpdate("UPDATE `supplier` SET `Sup_id`='"+id+"',`Sup_name`='"+name+"',`Sup_telephone`='"+telephone+"',`Sup_address`='"+address+"',`Sup_nic`='"+nic+"',`Sup_gender`='"+gender+"',`Sup_working_company`='"+workingcopmany+"',`Sup_contact_person`='"+contactpersone+"',`Sup_contact_person_tel`='"+conpertel+"',`Sup_date`='"+date+"' WHERE `sup_id`='"+id+"'");
                
                JOptionPane.showMessageDialog(null,"Data Update Successfully");
            } catch (Exception e) {
            }
            tableload();
            clearfield();
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // Delete Data:
        if(supid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No Record Are Selected");
        }
        else{
            int response = JOptionPane.showConfirmDialog(this,"Do You Want To Delete This Record","Confrim",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);


            if(response==JOptionPane.YES_OPTION){
                String id=supid.getText();
                try {
                    Statement st=DatabaseConnection.myconnection().createStatement();
                    st.executeUpdate("DELETE FROM `supplier` WHERE  sup_id='"+id+"'");
                    JOptionPane.showMessageDialog(null,"Data Delete Successfully");
                    
                } catch (Exception e) {
                    System.out.println(e);
                }
                tableload();
                clearfield();
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clearfield();
    }//GEN-LAST:event_btnclearActionPerformed

    private void suppliertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliertableMouseClicked
        // TODO add your handling code here:
        int r=suppliertable.getSelectedRow();
        
        String id=suppliertable.getValueAt(r, 0).toString();
        String name=suppliertable.getValueAt(r, 1).toString();
        String telephone=suppliertable.getValueAt(r, 2).toString();
        String address=suppliertable.getValueAt(r, 3).toString();
        String nic=suppliertable.getValueAt(r, 4).toString();
        String gender=suppliertable.getValueAt(r,5).toString();
        String workingcompany=suppliertable.getValueAt(r, 6).toString();
        String contactpersone=suppliertable.getValueAt(r, 7).toString();
        String conpertel=suppliertable.getValueAt(r, 8).toString();
        String date=suppliertable.getValueAt(r, 9).toString();
        
        supid.setText(id);
        supname.setText(name);
        suptelephone.setText(telephone);
        supaddress.setText(address);
        supnic.setText(nic);
        supgender.setSelectedItem(gender);
        supworkcompany.setText(workingcompany);
        supcontactperson.setText(contactpersone);
        supcontactpersontel.setText(conpertel);
        supdate.setText(date);
    }//GEN-LAST:event_suppliertableMouseClicked

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
       // Search Data:
        
        String id=supid.getText();
        
        if(supid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter Supplier ID First!");
        }
        else{
            try {

                Statement st=DatabaseConnection.myconnection().createStatement();
                ResultSet rs=st.executeQuery("SELECT * FROM `supplier` WHERE sup_id='"+id+"'");

                if(rs.next()){
                    supname.setText(rs.getString("Sup_name"));
                    suptelephone.setText(rs.getString("Sup_telephone"));
                    supaddress.setText(rs.getString("Sup_address"));
                    supnic.setText(rs.getString("Sup_nic"));
                    supgender.setSelectedItem(rs.getString("Sup_gender"));
                    supworkcompany.setText(rs.getString("Sup_working_company"));
                    supcontactperson.setText(rs.getString("Sup_contact_person"));
                    supcontactpersontel.setText(rs.getString("Sup_contact_person_tel"));
                    supdate.setText(rs.getString("Sup_date"));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Data Is Not In Database, Try Again!");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } 
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        tableload();
        supsearch.setText("");
        supsearch.requestFocus();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void supsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supsearchKeyReleased
        // TODO add your handling code here:
        String name=supsearch.getText();
        try {
            DefaultTableModel dt=(DefaultTableModel)suppliertable.getModel();
            dt.setRowCount(0);
            Statement sta=DatabaseConnection.myconnection().createStatement();
            ResultSet res = sta.executeQuery("SELECT * FROM `supplier` WHERE Sup_name like'%"+name+"%'");
            suppliertable.setModel(DbUtils.resultSetToTableModel(res));
        } catch (Exception e) {
            tableload();
        }
    }//GEN-LAST:event_supsearchKeyReleased


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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField supaddress;
    private javax.swing.JTextField supcontactperson;
    private javax.swing.JTextField supcontactpersontel;
    private javax.swing.JTextField supdate;
    private javax.swing.JComboBox<String> supgender;
    private javax.swing.JTextField supid;
    private javax.swing.JTextField supname;
    private javax.swing.JTextField supnic;
    private javax.swing.JTable suppliertable;
    private javax.swing.JTextField supsearch;
    private javax.swing.JTextField suptelephone;
    private javax.swing.JTextField supworkcompany;
    // End of variables declaration//GEN-END:variables
}
