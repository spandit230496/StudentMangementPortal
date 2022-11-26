/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentmanagementportal;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sandy
 */
public class RegisteredStudent extends javax.swing.JFrame {

    /**
     * Creates new form RegisteredStudent
     */
    public RegisteredStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        addStudent = new javax.swing.JButton();
        insertStudent = new javax.swing.JButton();
        regStudent = new javax.swing.JButton();
        allStudent = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        toFind = new javax.swing.JTextField();
        findItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(10, 10));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        addStudent.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        addStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementportal/logo/add (1).png"))); // NOI18N
        addStudent.setText("Add new Student");
        addStudent.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, null));
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        insertStudent.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        insertStudent.setText("Insert new result");
        insertStudent.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, null));
        insertStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertStudentActionPerformed(evt);
            }
        });

        regStudent.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        regStudent.setForeground(new java.awt.Color(255, 102, 102));
        regStudent.setText("Registered Student");
        regStudent.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, null));
        regStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regStudentActionPerformed(evt);
            }
        });

        allStudent.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        allStudent.setText("All Students List");
        allStudent.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, null));
        allStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudentActionPerformed(evt);
            }
        });

        logOut.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementportal/logo/logoutlogo.png"))); // NOI18N
        logOut.setText("Log out");
        logOut.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.blue, null));
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(regStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(logOut)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(addStudent)
                .addGap(50, 50, 50)
                .addComponent(insertStudent)
                .addGap(47, 47, 47)
                .addComponent(regStudent)
                .addGap(50, 50, 50)
                .addComponent(allStudent)
                .addGap(34, 34, 34)
                .addComponent(logOut)
                .addContainerGap(294, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 700));

        toFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFindActionPerformed(evt);
            }
        });
        toFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toFindKeyReleased(evt);
            }
        });

        findItem.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        findItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementportal/logo/search2.png"))); // NOI18N
        findItem.setText("Find");
        findItem.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.blue, null));
        findItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(toFind, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(findItem, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(toFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(findItem)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 210, -1));

        studentList.setAutoCreateRowSorter(true);
        studentList.setModel(new javax.swing.table.DefaultTableModel(
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
        studentList.setEnabled(false);
        studentList.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(studentList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1030, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        // TODO add your handling code here:
         setVisible(false);
     new addNewStudent().setVisible(true);
    }//GEN-LAST:event_addStudentActionPerformed

    private void insertStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertStudentActionPerformed
        // TODO add your handling code here:
         setVisible(false);
     new InsertResult().setVisible(true);
    }//GEN-LAST:event_insertStudentActionPerformed

    private void allStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudentActionPerformed
        // TODO add your handling code here:
         setVisible(false);
     new AllStudentResult().setVisible(true);
    }//GEN-LAST:event_allStudentActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
       
        
         int a=JOptionPane.showConfirmDialog(this, "Do You Really Want to LogOut");
        if(a==0){
            new index().setVisible(true);
        
        
        }
        else
            
         setVisible(true);
//        
                           
    }//GEN-LAST:event_logOutActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","210396");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from student");
            studentList.setModel(DbUtils.resultSetToTableModel(rs));
      }
         
    catch(Exception e){
JOptionPane.showMessageDialog(null, e.toString());
   }
    }//GEN-LAST:event_formComponentShown

    private void regStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regStudentActionPerformed

    private void findItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findItemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_findItemActionPerformed

    private void toFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toFindKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table= ( DefaultTableModel)studentList.getModel();
        String search =toFind.getText();
        TableRowSorter<DefaultTableModel>tr= new TableRowSorter<DefaultTableModel>(table);
        studentList.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_toFindKeyReleased

    private void toFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toFindActionPerformed

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
            java.util.logging.Logger.getLogger(RegisteredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisteredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisteredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisteredStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisteredStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent;
    private javax.swing.JButton allStudent;
    private javax.swing.JButton findItem;
    private javax.swing.JButton insertStudent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOut;
    private javax.swing.JButton regStudent;
    private javax.swing.JTable studentList;
    private javax.swing.JTextField toFind;
    // End of variables declaration//GEN-END:variables
}