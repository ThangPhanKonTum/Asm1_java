/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Student;
import Model.StudentThang;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author thanh
 */
public class StudentMainForm extends javax.swing.JFrame {
    SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy"); //create 1 variable format by day/month/year
    StudentThang dao = new StudentThang(); 
    /**
     * Creates new form StudentMainForm
     */
    
    public void fillDataTABLE(){ 
        DefaultTableModel model = (DefaultTableModel)tbStudent.getModel();
        model.setRowCount(0);//clear table
        for (Student st : dao.getAllStudent()){
            Object rowData[] = new Object[6];
            rowData[0]=st.getStudentId();
            rowData[1]=st.getName();
            rowData[2]=date_format.format(st.getBirthday());
            rowData[3]=st.isSex()? "Male":"Female";
            rowData[4]=st.getEmail();
            rowData[5]=st.getAddress();
            model.addRow(rowData);
        }
    }
    
    public StudentMainForm() {
        initComponents();
        openFile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(255, 0, 0));
        jLabel2 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtBirthday = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        btn_SaveFile = new javax.swing.JButton();
        btn_OpenFile = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management Student");
        setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 33)); // NOI18N
        jLabel1.setText("Student Management System");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Student ID:");

        txtStudentId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtBirthday.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdayActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Birthday:");

        buttonGroup1.add(rdMale);
        rdMale.setSelected(true);
        rdMale.setText("Male");
        rdMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");
        rdFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFemaleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Sex:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Email:");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Address:");

        tbStudent.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        	},
        	new String[] {
        		"Student ID", "Name", "Birthday", "Sex", "Email", "Address"
        	}
        ));
        tbStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStudentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbStudent);

        btn_SaveFile.setBackground(new Color(0, 0, 255));
        btn_SaveFile.setForeground(new java.awt.Color(0, 0, 0));
        btn_SaveFile.setText("Save file");
        btn_SaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveFileActionPerformed(evt);
            }
        });

        btn_OpenFile.setBackground(new Color(0, 0, 255));
        btn_OpenFile.setForeground(new java.awt.Color(0, 0, 0));
        btn_OpenFile.setText("Open File");
        btn_OpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OpenFileActionPerformed(evt);
            }
        });
        btnAdd = new javax.swing.JButton();
        
                btnAdd.setBackground(new Color(128, 255, 0));
                btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                btnAdd.setForeground(new java.awt.Color(0, 0, 0));
                btnAdd.setText("Add");
                btnAdd.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnAddActionPerformed(evt);
                    }
                });
        btnUpdate = new javax.swing.JButton();
        
                btnUpdate.setBackground(new Color(0, 128, 128));
                btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
                btnUpdate.setText("Update");
                btnUpdate.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnUpdateActionPerformed(evt);
                    }
                });
        btnDelete = new javax.swing.JButton();
        
                btnDelete.setBackground(new Color(255, 0, 0));
                btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                btnDelete.setForeground(new java.awt.Color(0, 0, 0));
                btnDelete.setText("Delete");
                btnDelete.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnDeleteActionPerformed(evt);
                    }
                });
        btnSave = new javax.swing.JButton();
        
                btnSave.setBackground(new Color(0, 255, 255));
                btnSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                btnSave.setForeground(new java.awt.Color(0, 0, 0));
                btnSave.setText("Save");
                btnSave.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnSaveActionPerformed(evt);
                    }
                });
        jLabel3 = new javax.swing.JLabel();
        
                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel3.setText("Student ID:");
        txtfind = new javax.swing.JTextField();
        
                txtfind.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                txtfind.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        txtfindActionPerformed(evt);
                    }
                });
        btnSearch = new javax.swing.JButton();
        
                btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                btnSearch.setForeground(new java.awt.Color(0, 0, 0));
                btnSearch.setText("Search");
                btnSearch.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnSearchActionPerformed(evt);
                    }
                });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGap(125)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel4)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel2)
        							.addGap(35)
        							.addComponent(txtStudentId, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel5)
        								.addComponent(jLabel6)
        								.addComponent(jLabel7)
        								.addComponent(jLabel8))
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jScrollPane1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtBirthday, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(rdMale)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(rdFemale))
        								.addComponent(txtEmail, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))))
        					.addGap(45)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(btnSave, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        								.addComponent(btnUpdate, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        								.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addGap(29)
        							.addComponent(jLabel3)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(btn_SaveFile)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(btn_OpenFile))
        								.addComponent(txtfind, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(btnSearch)
        							.addGap(84)))
        					.addGap(3, 33, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 936, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(178)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 594, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
        			.addGap(104)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(7)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(btn_SaveFile)
        							.addComponent(btn_OpenFile)))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtfind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnSearch)
        					.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
        					.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        					.addGap(16))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtStudentId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtBirthday, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel5))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(rdMale)
        						.addComponent(rdFemale)
        						.addComponent(jLabel6))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel7))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel8))
        					.addContainerGap(211, Short.MAX_VALUE))))
        );
        getContentPane().setLayout(layout);

       
        
        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void reset(){
        txtStudentId.setText("");
        txtAddress.setText("");
        txtName.setText("");
        txtBirthday.setText("");
        rdMale.isSelected();
        txtEmail.setText("");
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnAddActionPerformed
    public boolean validateForm(){
        if (txtStudentId.getText().isEmpty() || txtName.getText().isEmpty()
                || txtBirthday.getText().isEmpty()|| rdMale.getText().isEmpty()|| rdFemale.getText().isEmpty()|| txtAddress.getText().isEmpty()
                || txtEmail.getText().isEmpty()){
            return false;
        }
        return true;
       
    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try {
            if (txtfind.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have not entered your student code");
            
            }else{
            Student st = dao.getStudentByID(Integer.parseInt(txtfind.getText()));
                if (st !=null){ //other null means found.
                
                txtStudentId.setText(st.getStudentId()+"");
                txtName.setText(st.getName());
                txtBirthday.setText(date_format.format(st.getBirthday()));
                txtAddress.setText(st.getAddress());
                txtEmail.setText(st.getEmail());
                boolean s = st.isSex();
                    if(st.isSex()){
                    rdMale.setSelected(true); 
                    }else{
                    rdFemale.setSelected(true);
                    }
                
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "you must type id with Integer datatype");
        }   
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfindActionPerformed
    public Student getModel() throws NumberFormatException, ParseException{
        Student st = new Student();
        st.setStudentId(Integer.parseInt(txtStudentId.getText()));
        st.setName(txtName.getText());
        boolean s = false;
        if (rdMale.isSelected()){
            s = true;
        }
        st.setSex(s);
        st.setAddress(txtAddress.getText());
        st.setBirthday(date_format.parse(txtBirthday.getText()));
        st.setEmail(txtEmail.getText());
        return st;
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        try {
            if (validateForm()){
            
                if ((Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", txtEmail.getText()))){

                        Student st = null;
                    try {
                        st = getModel();
                    } catch (ParseException ex) {
                        Logger.getLogger(StudentMainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        if(dao.add(st)>0){
                            JOptionPane.showMessageDialog(this, "Save successfully");
                            fillDataTABLE();
                        }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error save", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            
            }else{
                JOptionPane.showMessageDialog(this, "You have not entered enough information");
            }
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(this, "you must type id with Integer datatype");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            if (validateForm()){
                if ((Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", txtEmail.getText()))){

                        Student st = null;
                    try {
                        st = getModel();
                    } catch (ParseException ex) {
                        Logger.getLogger(StudentMainForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        if (dao.updateStudentByID(st)>0){
                        JOptionPane.showMessageDialog(this, "Update successfully");
                        fillDataTABLE();
                        }

                    }else{
                    JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error update", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }else{
                JOptionPane.showMessageDialog(this, "You have not entered enough information");

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "you must type id with Integer datatype");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (txtStudentId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have not entered information to delete");
            
        }else{
            if (dao.delStudentById(Integer.parseInt(txtStudentId.getText()))>0){
                JOptionPane.showMessageDialog(this, "Delete successfully");
                fillDataTABLE();
            }else{
                JOptionPane.showMessageDialog(this, "Can't find students to delete");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

     private void wrFile(){
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try{
            fos = new FileOutputStream("thanh.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dao);
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                try{
                    oos.close();
                    fos.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
    }
    
    private void rFile(){
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            try{
            fis = new FileInputStream("thanh.txt");
            ois = new ObjectInputStream(fis);
            dao = (StudentThang)ois.readObject();
            }catch(FileNotFoundException e){
                   JOptionPane.showConfirmDialog(this, "Not data ");

            }catch(Exception e){
                e.printStackTrace();
            }finally{
                try{
                    if(ois!=null && fis!=null){
                        ois.close();
                        fis.close();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
    }
    private void openFile(){
        
        rFile();
        fillDataTABLE();
    }
    
    private void txtBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthdayActionPerformed

    private void rdMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMaleActionPerformed

    private void rdFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdFemaleActionPerformed
    public void setModel(Student st){
        txtStudentId.setText(st.getStudentId()+"");
        txtName.setText(st.getName());
        txtBirthday.setText(date_format.format(st.getBirthday()));
        txtAddress.setText(st.getAddress());
        txtEmail.setText(st.getEmail());
        boolean s = st.isSex();
        if(st.isSex()){
            rdMale.setSelected(true);
        }else{
            rdFemale.setSelected(true);
        }
    }
    private void tbStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStudentMouseClicked
        // TODO add your handling code here:f
        int id = tbStudent.rowAtPoint(evt.getPoint());
        String studentid = tbStudent.getValueAt(id,0).toString();
        Student st = dao.getStudentByID(Integer.parseInt(studentid));
        setModel(st);
    }//GEN-LAST:event_tbStudentMouseClicked

    private void btn_SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveFileActionPerformed
        // TODO add your handling code here:
        wrFile();
        JOptionPane.showMessageDialog(this, "Save file sucessfully");
    }//GEN-LAST:event_btn_SaveFileActionPerformed

    private void btn_OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OpenFileActionPerformed
        // TODO add your handling code here:
        openFile();
    }//GEN-LAST:event_btn_OpenFileActionPerformed

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
            java.util.logging.Logger.getLogger(StudentMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_OpenFile;
    private javax.swing.JButton btn_SaveFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtfind;
    // End of variables declaration//GEN-END:variables
}