
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
public class Lecture extends javax.swing.JFrame {

    /**
     * Creates new form Lecture
     */
    public Lecture() {
        initComponents();
        Show_Lecturec_In_JTable();

    }
    
     public ArrayList<Lecturec> getLecturecList()    {
        Connection conn=null;
        ArrayList<Lecturec> LecturecList = new ArrayList<Lecturec>(); 
        conn=MysqlConnect.ConnectDB();
        String query="SELECT * FROM  lecture"; 
        Statement st;
        ResultSet rs;
        try {
            st=conn.createStatement();
            rs=st.executeQuery(query);
            Lecturec lecturec;
            
            while(rs.next())
            {
                lecturec=new Lecturec(rs.getString("Lec_id"),
                        rs.getString("Lec_name"),
                        rs.getString("Email")
                       );
               LecturecList.add(lecturec);
            }
        } catch (SQLException e) {
        }
        return LecturecList ;
    }
    
    public void Show_Lecturec_In_JTable()
    {
         ArrayList<Lecturec> List = getLecturecList();
         DefaultTableModel model =(DefaultTableModel)jTablelec.getModel();
         Object[] row = new Object[4];
          for (int i = 0; i< List.size();i++) {
            
              row[0]= List.get(i). getLec_id();
              row[1]= List.get(i). getLec_name();
              row[2]= List.get(i). getEmail();
             
              
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
            DefaultTableModel model = ( DefaultTableModel)jTablelec.getModel();
            model.setRowCount(0);
            Show_Lecturec_In_JTable();
            
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablelec = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldlid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldlname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldlemail = new javax.swing.JTextField();
        jToggleButtonsave2 = new javax.swing.JToggleButton();
        jToggleButtondelete2 = new javax.swing.JToggleButton();
        jToggleButtonupdate2 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablelec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lecture ID", "Lecture Name", "Email"
            }
        ));
        jTablelec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablelecMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablelec);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel1.setText("University Management System");

        jLabel3.setText("Lecture Id");

        jLabel10.setText("Lecture Name");

        jLabel7.setText("E-Mail ");

        jToggleButtonsave2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/19-32.png"))); // NOI18N
        jToggleButtonsave2.setText("Insert");
        jToggleButtonsave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonsave2ActionPerformed(evt);
            }
        });

        jToggleButtondelete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/50-32.png"))); // NOI18N
        jToggleButtondelete2.setText("Delete");
        jToggleButtondelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtondelete2ActionPerformed(evt);
            }
        });

        jToggleButtonupdate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/43-32.png"))); // NOI18N
        jToggleButtonupdate2.setText("Update");
        jToggleButtonupdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonupdate2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Lecture Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToggleButtonsave2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToggleButtondelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButtonupdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldlid, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldlemail, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldlname, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldlid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldlemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButtonsave2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtondelete2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButtonupdate2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonsave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonsave2ActionPerformed
  

        String query="INSERT INTO `university`.`lecture` (`Lec_id`, `Lec_name`, `Email`) VALUES ('"+jTextFieldlid.getText()+"','"+jTextFieldlname.getText()+"','"+jTextFieldlemail.getText()+"')";
        executeQuery(query,"inserted");

    }//GEN-LAST:event_jToggleButtonsave2ActionPerformed

    private void jToggleButtondelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtondelete2ActionPerformed
        String query = "DELETE FROM lecture WHERE `Lec_id`='"+jTextFieldlid.getText()+"'";

        executeQuery(query, "Deleted");
    }//GEN-LAST:event_jToggleButtondelete2ActionPerformed

    private void jToggleButtonupdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonupdate2ActionPerformed
        String query = " UPDATE `university`.`lecture` SET `Lec_id`='"+jTextFieldlid.getText()+"', `Lec_name`='"+jTextFieldlname.getText()+"', `Email`='"+jTextFieldlemail.getText()+"' WHERE `Lec_id`='"+jTextFieldlid.getText()+"'";
        
        executeQuery(query, "Inserted");

    }//GEN-LAST:event_jToggleButtonupdate2ActionPerformed

    private void jTablelecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablelecMouseClicked
        // TODO add your handling code here:
        
         int i =jTablelec.getSelectedRow();
        TableModel model = jTablelec.getModel();
        jTextFieldlid.setText(model.getValueAt(i,0).toString());
        jTextFieldlname.setText(model.getValueAt(i,1).toString());
        jTextFieldlemail.setText(model.getValueAt(i,2).toString());
        
    }//GEN-LAST:event_jTablelecMouseClicked

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
            java.util.logging.Logger.getLogger(Lecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablelec;
    private javax.swing.JTextField jTextFieldlemail;
    private javax.swing.JTextField jTextFieldlid;
    private javax.swing.JTextField jTextFieldlname;
    private javax.swing.JToggleButton jToggleButtondelete2;
    private javax.swing.JToggleButton jToggleButtonsave2;
    private javax.swing.JToggleButton jToggleButtonupdate2;
    // End of variables declaration//GEN-END:variables
}