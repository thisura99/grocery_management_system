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
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class EmployeeForm extends javax.swing.JPanel {

    /**
     * Creates new form ProductForm
     */
    public EmployeeForm() {
        initComponents();
        date();
        tableload();
    }
    
    public void tableload(){
        //load to data into the table
//        try {
//            DefaultTableModel dt=(DefaultTableModel) employeetable.getModel();
//            dt.setRowCount(0);
//            
//            Statement st=DatabaseConnection.myconnection().createStatement();
//            ResultSet rs=st.executeQuery("SELECT * FROM `employee`");
            
            try {
            
            Statement sta=DatabaseConnection.myconnection().createStatement();
            ResultSet res = sta.executeQuery("SELECT `Emp_id`, `Emp_name`, `Emp_post`, `Emp_gender`, `Emp_telephone`, `Emp_address`, `Emp_nic`, `Emp_contact_person`, `Emp_contact_person_tel`, `Emp_date`, `Emp_username`, `Emp_password` FROM `employee` ");
            employeetable.setModel(DbUtils.resultSetToTableModel(res));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
//            while(rs.next()){
//                Vector v=new Vector();
//                
//                v.add(rs.getString(1));
//                v.add(rs.getString(2));
//                v.add(rs.getString(3));
//                v.add(rs.getString(4));
//                v.add(rs.getString(5));
//                v.add(rs.getString(6));
//                v.add(rs.getString(7));
//                v.add(rs.getString(8));
//                v.add(rs.getString(9));
//                v.add(rs.getString(10));
//                
//                dt.addRow(v);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
    
    public void clearfield(){
        empid.setText("");
        empname.setText("");
        emppost.setSelectedItem("");
        empgender.setSelectedItem("");
        emptelephone.setText("");
        empaddress.setText("");
        empnic.setText("");
        empcontactperson.setText("");
        empcontactpersontel.setText("");
        empdate.setText(""); 
        empusername.setText("");
        emppassword.setText("");
        empname.requestFocus();
        date();
    }
    
    public void date(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now=LocalDateTime.now();
        empdate.setText(dtf.format(now));
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        brnclear = new javax.swing.JButton();
        emptelephone = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        empnic = new javax.swing.JTextField();
        empaddress = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        empcontactperson = new javax.swing.JTextField();
        empdate = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        empname = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        emppost = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        empcontactpersontel = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        empgender = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        empusername = new javax.swing.JTextField();
        emppassword = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeetable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        empid = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel7.setBackground(new java.awt.Color(102, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setRequestFocusEnabled(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Employee Post : ");

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

        brnclear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        brnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Clear.png"))); // NOI18N
        brnclear.setText("Clear");
        brnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnclearActionPerformed(evt);
            }
        });

        emptelephone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Tepephone :");

        empnic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        empaddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("NIC :");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Address :");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Contact Person :");

        empcontactperson.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        empdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Date :");

        empname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("Employee Name :");

        emppost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Con. Person Tel:");

        empcontactpersontel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Gender :");

        empgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("User Name :");

        empusername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        emppassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Password :");

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
                        .addComponent(brnclear))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel34)
                                .addComponent(jLabel35)
                                .addComponent(jLabel37)
                                .addComponent(jLabel29)
                                .addComponent(jLabel38)
                                .addComponent(jLabel39))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(empcontactperson, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(empdate, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(empcontactpersontel, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(empgender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(empusername, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(emppassword, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addGap(18, 18, 18)
                            .addComponent(emppost, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel36)
                            .addGap(18, 18, 18)
                            .addComponent(empname, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel30)
                                .addComponent(jLabel31))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(empaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(empnic, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addGap(18, 18, 18)
                            .addComponent(emptelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(empname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(emppost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(emptelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(empaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(empnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(empgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(empcontactperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(empcontactpersontel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(empdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(empusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(emppassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(brnclear))
                .addGap(31, 31, 31))
        );

        employeetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Post", "Gender", "Telephone", "Address", "NIC", "Contact_Person", "Con_Per_Tel", "Date", "User_Name", "Password"
            }
        ));
        employeetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeetableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(employeetable);

        jPanel11.setBackground(new java.awt.Color(102, 153, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Empoloyee ID :");

        empid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empid.setToolTipText("Not necessarily. Auto Fill!");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Employee Information :");

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
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        // Data Saved To Database:
        String id=empid.getText();
        String name=empname.getText();
        String post=(String) emppost.getSelectedItem();
        String gender=(String) empgender.getSelectedItem();
        String telephone=emptelephone.getText();
        String address=empaddress.getText();
        String nic=empnic.getText();
        String contactpersone=empcontactperson.getText();
        String conpertel=empcontactpersontel.getText();
        String date=empdate.getText();
        String username=empusername.getText();
        String password=emppassword.getText();
        if(name.isEmpty()||telephone.isEmpty()||conpertel.isEmpty()){
            JOptionPane.showMessageDialog(null,"Some Component Are Missing");
        }
        else{
            try {
                Statement st=DatabaseConnection.myconnection().createStatement();
                st.executeUpdate("INSERT INTO `employee`( `Emp_name`, `Emp_post`, `Emp_gender`, `Emp_telephone`, `Emp_address`, `Emp_nic`, `Emp_contact_person`, `Emp_contact_person_tel`, `Emp_date`, `Emp_username`, `Emp_password`) VALUES ('"+name+"','"+post+"','"+gender+"','"+telephone+"','"+address+"','"+nic+"','"+contactpersone+"','"+conpertel+"','"+date+"','"+username+"'','"+password+"')");
                JOptionPane.showMessageDialog(null,"Data Saved Successfully");
            } catch (Exception e) {
                System.out.println(e);
            }
            tableload();
            clearfield();
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // Search Data:
        
        String id=empid.getText();
        
        if(empid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter Employee ID First!");
        }
        else{
            try {

                Statement st=DatabaseConnection.myconnection().createStatement();
                ResultSet rs=st.executeQuery("SELECT * FROM `employee` WHERE Emp_id='"+id+"'");

                if(rs.next()){
                    empname.setText(rs.getString("Emp_name"));
                    emppost.setSelectedItem(rs.getString("Emp_post"));
                    empgender.setSelectedItem(rs.getString("Emp_gender"));
                    emptelephone.setText(rs.getString("Emp_telephone"));
                    empaddress.setText(rs.getString("Emp_address"));
                    empnic.setText(rs.getString("Emp_nic"));
                    empcontactperson.setText(rs.getString("Emp_contact_person"));
                    empcontactpersontel.setText(rs.getString("Emp_contact_person_tel"));
                    empdate.setText(rs.getString("Emp_date"));
                    empusername.setText(rs.getString("Emp_username"));
                    emppassword.setText(rs.getString("Emp_password"));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Data Is Not In Database, Try Again!");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }    
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // Update Data:
        String id=empid.getText();
        String name=empname.getText();
        String post=(String) emppost.getSelectedItem();
        String gender=(String) empgender.getSelectedItem();
        String telephone=emptelephone.getText();
        String address=empaddress.getText();
        String nic=empnic.getText();
        String contactpersone=empcontactperson.getText();
        String conpertel=empcontactpersontel.getText();
        String date=empdate.getText();
        String username=empusername.getText();
        String password=emppassword.getText();
        
        if(empid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No Record Are Selected");
        }
        else{
            try {
                Statement st=DatabaseConnection.myconnection().createStatement();
                st.executeUpdate("UPDATE `employee` SET `Emp_name`='"+name+"',`Emp_post`='"+post+"',`Emp_gender`='"+gender+"',`Emp_telephone`='"+telephone+"',`Emp_address`='"+address+"',`Emp_nic`='"+nic+"',`Emp_contact_person`='"+contactpersone+"',`Emp_contact_person_tel`='"+conpertel+"',`Emp_date`='"+date+"', `Emp_username`='"+username+"', `Emp_password`='"+password+"' WHERE `Emp_id`='"+id+"'");
                JOptionPane.showMessageDialog(null,"Data Update Successfully");
            } catch (Exception e) {
            }
            tableload();
            clearfield();
        }
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // Delete Data:
        if(empid.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No Record Are Selected");
        }
        else{
            int response = JOptionPane.showConfirmDialog(this,"Do You Want To Delete This Record","Confrim",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);


            if(response==JOptionPane.YES_OPTION){
                String id=empid.getText();
                try {
                    Statement st=DatabaseConnection.myconnection().createStatement();
                    st.executeUpdate("DELETE FROM `employee` WHERE Emp_id='"+id+"'");
                    JOptionPane.showMessageDialog(null,"Data Delete Successfully");
                    //JOptionPane.showMessageDialog(null,"Data Saved Successfully");
                } catch (Exception e) {
                    System.out.println(e);
                }
                tableload();
                clearfield();
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void employeetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeetableMouseClicked
        // Table Mouse Clicked:
        int r=employeetable.getSelectedRow();
        
        String id=employeetable.getValueAt(r, 0).toString();
        String name=employeetable.getValueAt(r, 1).toString();
        String post=employeetable.getValueAt(r, 2).toString();
        String gender=employeetable.getValueAt(r, 3).toString();
        String telephone=employeetable.getValueAt(r, 4).toString();
        String address=employeetable.getValueAt(r, 5).toString();
        String nic=employeetable.getValueAt(r, 6).toString();
        String contactpersone=employeetable.getValueAt(r, 7).toString();
        String conpertel=employeetable.getValueAt(r, 8).toString();
        String date=employeetable.getValueAt(r, 9).toString();
        String username=employeetable.getValueAt(r, 10).toString();
        String password=employeetable.getValueAt(r,11).toString();
        
        empid.setText(id);
        empname.setText(name);
        emppost.setSelectedItem(post);
        empgender.setSelectedItem(gender);
        emptelephone.setText(telephone);
        empaddress.setText(address);
        empnic.setText(nic);
        empcontactperson.setText(contactpersone);
        empcontactpersontel.setText(conpertel);
        empdate.setText(date);
        empusername.setText(username);
        emppassword.setText(password);
    }//GEN-LAST:event_employeetableMouseClicked

    private void brnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnclearActionPerformed
        // Clear The Field set:
        clearfield();
    }//GEN-LAST:event_brnclearActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTextField empaddress;
    private javax.swing.JTextField empcontactperson;
    private javax.swing.JTextField empcontactpersontel;
    private javax.swing.JTextField empdate;
    private javax.swing.JComboBox<String> empgender;
    private javax.swing.JTextField empid;
    private javax.swing.JTable employeetable;
    private javax.swing.JTextField empname;
    private javax.swing.JTextField empnic;
    private javax.swing.JTextField emppassword;
    private javax.swing.JComboBox<String> emppost;
    private javax.swing.JTextField emptelephone;
    private javax.swing.JTextField empusername;
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
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
