
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yomal Randunu
 */
public class Lessons extends javax.swing.JFrame {

    /**
     * Creates new form Lessons
     */
    public Lessons() {
        initComponents();
        Show_Lessonsc_In_JTable();
    }
    
        public ArrayList<Lessonsc> getLessonscList()
    {
        Connection conn=null;
        ArrayList<Lessonsc> LessonscList = new ArrayList<Lessonsc>(); 
        conn=MysqlConnect.ConnectDB();
        String query="SELECT * FROM  lessons"; 
        Statement st;
        ResultSet rs;
        try {
            st=conn.createStatement();
            rs=st.executeQuery(query);
            Lessonsc lessonsc;
            
            while(rs.next())
            {
                lessonsc=new Lessonsc(rs.getString("Ls_no"),
                        rs.getString("Ls_name"),
                        rs.getString("Module_no"),
                        rs.getString("Lec_id"));
                LessonscList.add(lessonsc);
            }
        } catch (SQLException e) {
        }
        return LessonscList;
    }
    
    public void Show_Lessonsc_In_JTable()
    {
         ArrayList<Lessonsc> List = getLessonscList();
         DefaultTableModel model =(DefaultTableModel)jTablelesson.getModel();
         Object[] row = new Object[5];
          for (int i = 0; i< List.size();i++) {
            
              row[0]= List.get(i). getLs_no();
              row[1]= List.get(i). getLs_name();
              row[2]= List.get(i). getModules_no();
              row[3]= List.get(i). getLecture_id();
              
              model.addRow(row);
            
        }
    }
    
    //execute the sql querys 
    public void executeQuery(String query,String message){
        Connection conn = MysqlConnect.ConnectDB();
        Statement st;
        
        try{
        st=conn.createStatement();
        if((st.executeUpdate(query))== 1)
        {
            
            //refresh the jtable
            DefaultTableModel model = ( DefaultTableModel)jTablelesson.getModel();
            model.setRowCount(0);
            Show_Lessonsc_In_JTable();
            
            JOptionPane.showMessageDialog(null,"data"+ message+"Successfully");
        }else
            JOptionPane.showMessageDialog(null,"data not"+ message);
        
        
    }catch(HeadlessException | SQLException e){
         JOptionPane.showMessageDialog(null,e);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldlid = new javax.swing.JTextField();
        jTextFieldlsname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldmdno = new javax.swing.JTextField();
        jToggleButtonsave4 = new javax.swing.JToggleButton();
        jTextFieldlsid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jToggleButtonupdate4 = new javax.swing.JToggleButton();
        jToggleButtondelete4 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablelesson = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Lesson Id");

        jLabel6.setText("Lecture Id");

        jLabel7.setText("Lesson Name");

        jLabel8.setText("Modules No");

        jToggleButtonsave4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/19-32.png"))); // NOI18N
        jToggleButtonsave4.setText("Insert");
        jToggleButtonsave4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonsave4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Lessons Details");

        jToggleButtonupdate4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/43-32.png"))); // NOI18N
        jToggleButtonupdate4.setText("Update");
        jToggleButtonupdate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonupdate4ActionPerformed(evt);
            }
        });

        jToggleButtondelete4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/50-32.png"))); // NOI18N
        jToggleButtondelete4.setText("Delete");
        jToggleButtondelete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtondelete4ActionPerformed(evt);
            }
        });

        jTablelesson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lesson ID", "Lesson Name", "Modules No", "Lecture ID"
            }
        ));
        jTablelesson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablelessonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablelesson);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel1.setText("University Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldmdno, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldlsname, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldlsid, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldlid, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButtondelete4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonsave4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButtonupdate4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldlsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldlsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldmdno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldlid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButtonsave4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtondelete4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonupdate4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 808, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonsave4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonsave4ActionPerformed
        /*        String Student_id = jTextFieldid.getText();
        String first_name = jTextFieldfirst.getText();
        String middle_name = jTextFieldmiddle.getText();
        String last_name = jTextFieldlast.getText();
        String address = jTextFieldaddress.getText();
        String email = jTextFieldemail.getText();
        String nic = jTextFieldnic.getText();
        String Batch_id = jTextFieldbatchid.getText();
        Connection conn =null;
        PreparedStatement pst=null;
        try{
            conn=MysqlConnect.ConnectDB();
            pst=conn.prepareStatement("INSERT INTO student VALUES (?,?,?, ?, ?, ?, ?,?)");
            pst.setString(1, Student_id);
            pst.setString(2, first_name);
            pst.setString(3, middle_name);
            pst.setString(4, last_name);
            pst.setString(5, email);
            pst.setString(6, nic);
            pst.setString(7, address);
            pst.setString(8, Batch_id);
            int i = pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Data Save");

            }else
            JOptionPane.showMessageDialog(null, "Data not save");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);

        }

        */

        String query="INSERT INTO `university`.`lessons` (`Ls_no`, `Ls_name`, `Module_no`, `Lec_id`) VALUES ('"+jTextFieldlsid.getText()+"','"+jTextFieldlsname.getText()+"','"+jTextFieldmdno.getText()+"','"+jTextFieldlid.getText()+"')";
        executeQuery(query,"inserted");

    }//GEN-LAST:event_jToggleButtonsave4ActionPerformed

    private void jToggleButtonupdate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonupdate4ActionPerformed
        String query = " UPDATE `university`.`lessons` SET `Ls_no`='"+jTextFieldlsid.getText()+"', `Ls_name`='"+jTextFieldlsname.getText()+"', `Module_no`='"+jTextFieldmdno.getText()+"', `Lec_id`='"+jTextFieldlid.getText()+"' WHERE `Ls_no`='"+jTextFieldlsid.getText()+"'";
       
        executeQuery(query, "Inserted");

    }//GEN-LAST:event_jToggleButtonupdate4ActionPerformed

    private void jToggleButtondelete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtondelete4ActionPerformed
        String query = "DELETE FROM lessons WHERE `Ls_no`='"+jTextFieldlsid.getText()+"'";
        executeQuery(query, "Deleted");
    }//GEN-LAST:event_jToggleButtondelete4ActionPerformed

    private void jTablelessonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablelessonMouseClicked
       int i =jTablelesson.getSelectedRow();
        TableModel model = jTablelesson.getModel();
        jTextFieldlsid.setText(model.getValueAt(i,0).toString());
        jTextFieldlsname.setText(model.getValueAt(i,1).toString());
        jTextFieldmdno.setText(model.getValueAt(i,2).toString());
         jTextFieldlid.setText(model.getValueAt(i,3).toString());
     
        
    }//GEN-LAST:event_jTablelessonMouseClicked

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
            java.util.logging.Logger.getLogger(Lessons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lessons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lessons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lessons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lessons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablelesson;
    private javax.swing.JTextField jTextFieldlid;
    private javax.swing.JTextField jTextFieldlsid;
    private javax.swing.JTextField jTextFieldlsname;
    private javax.swing.JTextField jTextFieldmdno;
    private javax.swing.JToggleButton jToggleButtondelete4;
    private javax.swing.JToggleButton jToggleButtonsave4;
    private javax.swing.JToggleButton jToggleButtonupdate4;
    // End of variables declaration//GEN-END:variables
}
