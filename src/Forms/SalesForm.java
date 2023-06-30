/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SalesForm extends javax.swing.JPanel {
    
    public static String cashierid="0";
    
    public Double stock_qty=0.0;

    /**
     * Creates new form ProductForm
     */
    public SalesForm() {
        initComponents();
        Date();
        Time();
        dataload();
        
        proqty.setValue(1);
        
        btndisable();
        btnenable();
    }
    
   public void Date(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now=LocalDateTime.now();
        lbldate.setText(dtf.format(now));
    } 
    public void Time(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        lbltime.setText(dtf.format(now));
    }
    
    private void dataload(){
    try { 
            Statement st=DatabaseConnection.myconnection().createStatement();
            String sql = "SELECT * FROM `employee`";
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                String personname=res.getString("Emp_username");
                billperson.addItem(personname);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    
    try {
            Statement st=DatabaseConnection.myconnection().createStatement();
            String sql = "SELECT * FROM `product`";
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                String personname=res.getString("Pro_name");
                producname.addItem(personname);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    //load last invoice no
    try {
           Statement s=DatabaseConnection.myconnection().createStatement();
           ResultSet rs=s.executeQuery("SELECT * FROM `extra` WHERE `Extra_id`=1");
           
           if(rs.next()){
               invoiceno.setText(rs.getString("val"));
           }
           
        }
        catch (Exception e) {
        }
    
    //increase invoice no
    int i=Integer.valueOf(invoiceno.getText());
    i++;
    invoiceno.setText(String.valueOf(i));
    }
    
    public void loadinvoiceno(){
        try {
           Statement s=DatabaseConnection.myconnection().createStatement();
           ResultSet rs=s.executeQuery("SELECT * FROM `extra` WHERE `Extra_id`=1");
           
           if(rs.next()){
               invoiceno.setText(rs.getString("val"));
           }
           
        }
        catch (Exception e) {
        }
    
    //increase invoice no
    int i=Integer.valueOf(invoiceno.getText());
    i++;
    invoiceno.setText(String.valueOf(i));
    }
    
    public void caltotal(){
        //calculate total price of singal product
        if(Integer.valueOf((int) proqty.getValue())<0){
            JOptionPane.showMessageDialog(null, "Quantity Need Grater than 0 !");
            proqty.setValue(1);
        }
        else{
            Double qty=Double.valueOf((int) proqty.getValue());
            Double price=Double.valueOf(prounitprice.getText());
            Double tot=0.00;
            
            tot=Math.round((qty*price)*100)/100.0;
            //tot=qty*price;
            totalprice.setText(String.valueOf(tot));
        }
    }
    
    public void carttotal(){
        //calculate all cart total
        int numofrow=invoicetable.getRowCount();
        Double total=0.0;
        for (int i = 0; i < numofrow; i++) {
            double value=Double.valueOf(invoicetable.getValueAt(i, 5).toString());
            total=total+value;
        }
        carttoal.setText(Double.toString(total));
        
        //total quantity
        int numofproduct=invoicetable.getRowCount();
        int productquantity=0;
        for (int i = 0; i < numofrow; i++) {
            int value=Integer.valueOf(invoicetable.getValueAt(i, 3).toString());
            productquantity=productquantity+value;
        }
        totalcartqty.setText(Integer.toString(productquantity));
        
    }
    
    
    public void balance(){
        Double paid=Double.valueOf(paidprice.getText());
        Double carttot=Double.valueOf(carttoal.getText());
        Double due;
        
        due=Math.round((paid-carttot)*100)/100.0;
        
        balance.setText(String.valueOf(due));
    }
    public void btndisable(){
        DefaultTableModel dt=(DefaultTableModel) invoicetable.getModel();
        int rw=invoicetable.getRowCount();
        if(rw==0){
            remove.setEnabled(false);
            removeall.setEnabled(false);
            calbalance.setEnabled(false);
            payprint.setEnabled(false);
        }
        payprint.setEnabled(false);   
    }
    public void btnenable(){
        DefaultTableModel dt=(DefaultTableModel) invoicetable.getModel();
        int rw=invoicetable.getRowCount();
        if(rw>0){
            remove.setEnabled(true);
            removeall.setEnabled(true);
            calbalance.setEnabled(true);
            payprint.setEnabled(true);
        }
            
    }
    
    
    
    public void stockupdate(){
        DefaultTableModel dt=(DefaultTableModel) invoicetable.getModel();
        int rc=dt.getRowCount();
        
        for (int i = 0; i < rc; i++) {
            String id=dt.getValueAt(i,1).toString();
            String sellQty=dt.getValueAt(i,3).toString();
            
            System.out.println(id);
            System.out.println(sellQty);
            
            try {
                Statement s=DatabaseConnection.myconnection().createStatement();
                ResultSet rs=s.executeQuery("SELECT Pro_quantity FROM product WHERE Pro_id='"+id+"'");
                
                if(rs.next()){
                    stock_qty=Double.valueOf(rs.getString("Pro_quantity"));
                    System.out.println(stock_qty);
                }
            } 
            catch (Exception e) {
                System.out.println(e);
                
            }
            
            Double st_qty=stock_qty;
            Double sell_qty=Double.valueOf(sellQty);
            
            Double new_qty=st_qty-sell_qty;
            String newQty=String.valueOf(new_qty);
            
            availablestock.setText(newQty);
            
            try {
                Statement updateqty=DatabaseConnection.myconnection().createStatement();
                updateqty.executeUpdate("UPDATE product SET Pro_quantity='"+newQty+"' WHERE Pro_id='"+id+"'");
            } 
            catch (Exception e) {
                System.out.println(e);
            }
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        invoiceno = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoicetable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        billperson = new javax.swing.JComboBox<>();
        prounitprice = new javax.swing.JLabel();
        producname = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        totalprice = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        availablestock = new javax.swing.JLabel();
        proqty = new javax.swing.JSpinner();
        productid = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        addcart = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        removeall = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        carttoal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        payprint = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        paidprice = new javax.swing.JTextField();
        calbalance = new javax.swing.JButton();
        totalcartqty = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel4.setBackground(new java.awt.Color(102, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Invoice No : ");

        invoiceno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        invoiceno.setText("01");

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldate.setText("Date");

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltime.setText("Time");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(invoiceno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbldate)
                .addGap(18, 18, 18)
                .addComponent(lbltime)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(invoiceno)
                    .addComponent(lbldate)
                    .addComponent(lbltime))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        invoicetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice_ID", "Product_ID", "Product", "QTY", "Unit_Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(invoicetable);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Person :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Product : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("QTY : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Unit Price : ");

        billperson.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        billperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billpersonActionPerformed(evt);
            }
        });

        prounitprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prounitprice.setText("00.00");

        producname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        producname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                producnameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Total Price : ");

        totalprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalprice.setText("00.00");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Stock QTY :");

        availablestock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        availablestock.setText("00");

        proqty.setPreferredSize(new java.awt.Dimension(29, 23));
        proqty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                proqtyStateChanged(evt);
            }
        });
        proqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proqtyKeyReleased(evt);
            }
        });

        productid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productid.setText("00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billperson, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(producname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel18)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(proqty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(availablestock, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prounitprice)
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalprice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proqty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(availablestock)
                            .addComponent(productid)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(totalprice)
                        .addComponent(jLabel6)
                        .addComponent(prounitprice))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(producname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(billperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(102, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        addcart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addcart.setText("Add To Cart");
        addcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcartActionPerformed(evt);
            }
        });

        remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remove.setText("Remove ");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        removeall.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeall.setText("Remove All");
        removeall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(remove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeall, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addcart, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addcart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeall)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(102, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Paid Amount :");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        carttoal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        carttoal.setText("00.00");
        carttoal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Total Amount :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Balance/ Due :");

        balance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balance.setText("00.00");
        balance.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        payprint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        payprint.setText("Pay & Print");
        payprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payprint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carttoal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(carttoal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(balance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(payprint, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Total QTY :");

        paidprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paidprice.setText("0");

        calbalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calbalance.setText("Calculate");
        calbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calbalanceActionPerformed(evt);
            }
        });

        totalcartqty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalcartqty.setText("00");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calbalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paidprice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalcartqty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(totalcartqty))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(paidprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calbalance))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void payprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payprintActionPerformed
        // sent data to database
        //`Cart_id`, `Invoice_id`, `Product_name`, `Qty`, `Unit_price`, `Total_price`
        
        try {
            DefaultTableModel dt=(DefaultTableModel) invoicetable.getModel();
            
            int rc=dt.getRowCount();
                for (int i = 0; i < rc; i++) {
                    String inid=dt.getValueAt(i, 0).toString();
                    String productid=dt.getValueAt(i, 1).toString();
                    String productname=dt.getValueAt(i, 2).toString();
                    String qty=dt.getValueAt(i, 3).toString();
                    String unitprice=dt.getValueAt(i, 4).toString();
                    String totalprice=dt.getValueAt(i, 5).toString();
                    String date=lbldate.getText();
                    String time=lbltime.getText();
                    
                //card database    
                Statement st=DatabaseConnection.myconnection().createStatement();                
                st.executeUpdate("INSERT INTO `cart`(`Invoice_id`, `Product_id`, `Product_name`, `Qty`, `Unit_price`, `Total_price`,`Date`,`Time`) VALUES ('"+inid+"','"+productid+"','"+productname+"','"+qty+"','"+unitprice+"','"+totalprice+"','"+date+"','"+time+"')");
                
                }
                JOptionPane.showMessageDialog(null,"Data Saved ...");       
        } 
        catch (HeadlessException | SQLException e) {
            System.out.println(e);
        }
        
        //sales database
        Double due;
        Double paid=Double.valueOf(paidprice.getText());
        due=Math.round((paid)*100)/100.0;
        
        try {
            
            String inid=invoiceno.getText();
            String cashiername=billperson.getSelectedItem().toString();
            String totalqty=totalcartqty.getText();
            String toalamount=carttoal.getText();
            Double paidamount=due;
            String bal=balance.getText();
            String date=lbldate.getText();
            String time=lbltime.getText();
            
            //paid check
            Double total=Double.valueOf(carttoal.getText());
            Double payamount=Double.valueOf(paidprice.getText());
            String status=null;
            if(payamount.equals(0.0)){
                status="Unpaid";
            }
            else if(total>payamount){
                status="Partial";
            }
            else if(total<=payamount){
                status="Paid";
            }
            
            //`Sales_id`, `Invoice_id`, `Cart_id`, `Cashier_name`, `Total_qty`, `Total_amount`, `Paid_amount`, `Balance`
            
            Statement ste=DatabaseConnection.myconnection().createStatement();
            ste.executeUpdate("INSERT INTO `sales`(`Invoice_id`, `Cashier_id`, `Cashier_name`, `Total_qty`, `Total_amount`, `Paid_amount`, `Balance`,`Status`,`Date`,`Time`) VALUES ('"+inid+"','"+cashierid+"','"+cashiername+"','"+totalqty+"','"+toalamount+"','"+paidamount+"','"+bal+"','"+status+"','"+date+"','"+time+"')");
            
        } 
        catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
        
        try {
            String id=invoiceno.getText();
            Statement stea=DatabaseConnection.myconnection().createStatement();
            stea.executeUpdate("UPDATE `extra` SET `val`='"+id+"' WHERE `Extra_id`=1");
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
        
        //print bill
        try {
           HashMap para=new HashMap();
            para.put("inv_id", invoiceno.getText());
            ReportView r=new ReportView("src\\report\\printbill.jasper",para);
            r.setVisible(true);
         
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
        stockupdate();
        
        loadinvoiceno();
        
        removeall();
        
        
    }//GEN-LAST:event_payprintActionPerformed

    private void producnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_producnameActionPerformed
        // unit price load:
        String proname=producname.getSelectedItem().toString();
        try {
            Statement st=DatabaseConnection.myconnection().createStatement();
            ResultSet rs=st.executeQuery("SELECT Pro_sellprice,Pro_id,Pro_quantity FROM `product` WHERE Pro_name='"+proname+"'");
            if(rs.next()){
                Double uprice=Double.parseDouble(rs.getString("Pro_sellprice"));
                prounitprice.setText(uprice.toString());
                productid.setText(rs.getString("Pro_id"));
                availablestock.setText(rs.getString("Pro_quantity"));
            }
            caltotal();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_producnameActionPerformed

    private void proqtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_proqtyStateChanged
        // TODO add your handling code here:
        caltotal();
    }//GEN-LAST:event_proqtyStateChanged

    private void proqtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proqtyKeyReleased
        // TODO add your handling code here:
        caltotal();
    }//GEN-LAST:event_proqtyKeyReleased

    private void addcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcartActionPerformed
        // add product to cart:
        int x=Integer.valueOf((int) proqty.getValue());
        int y=Integer.parseInt(availablestock.getText().toString());
        
        if(x==0){
            JOptionPane.showMessageDialog(null, "Quantity Need To Grater 0 !");
            proqty.setValue(1);
        }
        else{
            if(x>y){
                JOptionPane.showMessageDialog(null,"Not Enough Stock !");
                proqty.setValue(y);
            }
            else{
                removeall.setEnabled(true);
                remove.setEnabled(true);
                String data []={invoiceno.getText(),productid.getText().toString(),producname.getSelectedItem().toString(),proqty.getValue().toString(),prounitprice.getText().toString(),totalprice.getText().toString()};

                DefaultTableModel dt=(DefaultTableModel) invoicetable.getModel();

                dt.addRow(data);

                carttotal();
                balance();   
                btnenable();
                payprint.setEnabled(false); 
            }
        } 
    }//GEN-LAST:event_addcartActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // remove item from cart:
        try {
            DefaultTableModel dt=(DefaultTableModel) invoicetable.getModel();
            int rw=invoicetable.getSelectedRow();           
            if(rw>-1){
                dt.removeRow(rw);
            }else{
                JOptionPane.showMessageDialog(null,"First Select the item record!");
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
        carttotal();
        balance();
        btndisable();
    }//GEN-LAST:event_removeActionPerformed

    public void removeall(){
        DefaultTableModel dt=(DefaultTableModel) invoicetable.getModel();
        dt.setRowCount(0);
        carttotal();
        balance();
        balance.setText("0.0");
        paidprice.setText("0");
        btndisable();
    }
    
    
    
    private void removeallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeallActionPerformed
        // remove all item from cart:
        removeall();
    }//GEN-LAST:event_removeallActionPerformed

    private void calbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calbalanceActionPerformed
        // TODO add your handling code here:
        if(paidprice.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Enter Paid Amout");        
        }
        else{
        balance();
        }
        payprint.setEnabled(true); 
    }//GEN-LAST:event_calbalanceActionPerformed

    private void billpersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billpersonActionPerformed
        // get cart id
        String empname=billperson.getSelectedItem().toString();
        try {
            Statement st=DatabaseConnection.myconnection().createStatement();
            ResultSet rs=st.executeQuery("SELECT Emp_id,Emp_name FROM `employee` WHERE Emp_name='"+empname+"'");
            if(rs.next()){
                cashierid=(rs.getString("Emp_id"));
            }
            
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_billpersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcart;
    private javax.swing.JLabel availablestock;
    private javax.swing.JLabel balance;
    private javax.swing.JComboBox<String> billperson;
    private javax.swing.JButton calbalance;
    private javax.swing.JLabel carttoal;
    private javax.swing.JLabel invoiceno;
    private javax.swing.JTable invoicetable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbltime;
    private javax.swing.JTextField paidprice;
    private javax.swing.JButton payprint;
    private javax.swing.JComboBox<String> producname;
    private javax.swing.JLabel productid;
    private javax.swing.JSpinner proqty;
    private javax.swing.JLabel prounitprice;
    private javax.swing.JButton remove;
    private javax.swing.JButton removeall;
    private javax.swing.JLabel totalcartqty;
    private javax.swing.JLabel totalprice;
    // End of variables declaration//GEN-END:variables
}
