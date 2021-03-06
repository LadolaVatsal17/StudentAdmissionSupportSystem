/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentAdmissionSupportSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author 2000b
 */
public class commercescreen extends javax.swing.JFrame {
    public String selectcourse;
    /**
     * Creates new form commercescreen
     */
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public commercescreen() {
        initComponents();
        fetchcourse();
        fetchpercentile();
        fetchstate();
        fetchcity();
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        course = new javax.swing.JComboBox<>();
        report = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        per = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        state = new javax.swing.JComboBox<>();
        city = new javax.swing.JComboBox<>();
        searchstate = new javax.swing.JButton();
        searchcity = new javax.swing.JButton();
        viewrequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Student Admission Support System");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Select Course");

        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });

        report.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        report.setText("Generate Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Clg Name", "per", "course", "fee", "state", "city"
            }
        ));
        tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl1);

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Select Per");

        per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Select State");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Select City");

        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select State" }));
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City" }));

        searchstate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchstate.setText("Search By State");
        searchstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchstateActionPerformed(evt);
            }
        });

        searchcity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchcity.setText("Search By City");
        searchcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcityActionPerformed(evt);
            }
        });

        viewrequest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewrequest.setText("View Request");
        viewrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewrequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewrequest)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchstate)
                                .addGap(32, 32, 32)
                                .addComponent(searchcity)))))
                .addContainerGap(195, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchstate)
                            .addComponent(searchcity))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewrequest))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fetchcity(){
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost/project_java","root","");
            String query ="SELECT  `c_name`  FROM `city_data`";  
            ps=con.prepareStatement(query);
              rs=ps.executeQuery(query);
              
              while(rs.next())
              {
                  String name=rs.getString("c_name"); 
                  city.addItem(name);

              }
              
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex);
        }
    }
    private void fetchstate()
    {
        try{
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/project_java","root","");
            String query ="SELECT  `s_name`  FROM `state_data`";  
            ps=con.prepareStatement(query);
            rs=ps.executeQuery(query);

              while(rs.next())
              {
                  String name=rs.getString("s_name"); 
                  state.addItem(name);

              }

        }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex);
        }
    }
    private void fetchpercentile()
    {
        try{

            con=DriverManager.getConnection("jdbc:mysql://localhost/project_java","root","");
            String query ="SELECT  `percentile_data`  FROM `percentile_data`";  
            ps=con.prepareStatement(query);
              rs=ps.executeQuery(query);

              while(rs.next())
              {
                  String name=rs.getString("percentile_data"); 
                  per.addItem(name);

              }
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex);
        }
    }
    private void fetchcourse()
    {
        try{
            
            con=DriverManager.getConnection("jdbc:mysql://localhost/project_java","root","");
            String query ="SELECT  `course_name`  FROM `course_data_12_comm`";  
            ps=con.prepareStatement(query);
              rs=ps.executeQuery(query);
              
              while(rs.next())
              {
                  String name=rs.getString("course_name"); 
                  course.addItem(name);  
              }
              
        }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    
    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        selectcourse = course.getSelectedItem().toString();        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:
        //String strincome = selectincome;
        //  String strper = per;
        //String strcourse = selectcourse;
        String a=course.getSelectedItem().toString();
        String b=per.getSelectedItem().toString();
        String c=state.getSelectedItem().toString();
        String d=city.getSelectedItem().toString();

        //                     System.out.print(a);
        //                     System.out.print(b);
        //                     System.out.print(c);
        //                     System.out.print(d);

        try {
            PreparedStatement ps;
            String sql = "SELECT `id`, `clgname`, `per`, `course`, `clg_fee`, `state`, `city` FROM `info_12_comm` WHERE `course` = ? and `per` = ? and `state`= ? and `city` = ?  " ;

            con=DriverManager.getConnection("jdbc:mysql://localhost/project_java","root","");
            ps = con.prepareStatement(sql);
            ps.setString(1, String.valueOf(course.getSelectedItem()));
            ps.setString(2, String.valueOf(per.getSelectedItem()));
            ps.setString(3, String.valueOf(state.getSelectedItem()));
            ps.setString(4, String.valueOf(city.getSelectedItem()));

            //  ps.setString(5, String.valueOf(course.getSelectedItem()));
            //r3ee222222222222222ps.setString(6, String.valueOf(per.getSelectedItem()));
            rs=ps.executeQuery();

            tbl1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_reportActionPerformed

    private void tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel tblModel = (DefaultTableModel)tbl1.getModel();
        String cid = tblModel.getValueAt(tbl1.getSelectedRow(),0).toString();
        String cname = tblModel.getValueAt(tbl1.getSelectedRow(),1).toString();
        String per = tblModel.getValueAt(tbl1.getSelectedRow(),2).toString();
        String course = tblModel.getValueAt(tbl1.getSelectedRow(),3).toString();
        String fee = tblModel.getValueAt(tbl1.getSelectedRow(),4).toString();
        String state = tblModel.getValueAt(tbl1.getSelectedRow(),5).toString();
        String city = tblModel.getValueAt(tbl1.getSelectedRow(),6).toString();

        makerequest_12_comm as = new makerequest_12_comm();
        as.setVisible(true);
        as.pack();
        as.setLocationRelativeTo(null);
        as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

        makerequest_12_comm.r_id.setText(cid);
        makerequest_12_comm.r_name.setText(cname);
        makerequest_12_comm.fee.setText(fee);
        makerequest_12_comm.course.setText(course);
        makerequest_12_comm.rper.setText(per);
        makerequest_12_comm.rstate.setText(state);
        makerequest_12_comm.rcity.setText(city);

    }//GEN-LAST:event_tbl1MouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        choosestreem as = new choosestreem();
        as.setVisible(true);
        as.pack();
        as.setLocationRelativeTo(null);
        as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void perActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void searchstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchstateActionPerformed
        // TODO add your handling code here:
        searchstate_comm as = new searchstate_comm ();
        as.setVisible(true);
        as.pack();
        as.setLocationRelativeTo(null);
        as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_searchstateActionPerformed

    private void searchcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcityActionPerformed
        // TODO add your handling code here:
        searchcity_comm as = new searchcity_comm();
        as.setVisible(true);
        as.pack();
        as.setLocationRelativeTo(null);
        as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_searchcityActionPerformed

    private void viewrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewrequestActionPerformed
        // TODO add your handling code here:
        studentrequest_comm as=new studentrequest_comm();
        as.setVisible(true);
        as.pack();
        as.setLocationRelativeTo(null);
        as.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_viewrequestActionPerformed

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
            java.util.logging.Logger.getLogger(commercescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(commercescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(commercescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(commercescreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new commercescreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> per;
    private javax.swing.JButton report;
    private javax.swing.JButton searchcity;
    private javax.swing.JButton searchstate;
    private javax.swing.JComboBox<String> state;
    public static javax.swing.JTable tbl1;
    private javax.swing.JButton viewrequest;
    // End of variables declaration//GEN-END:variables
}
