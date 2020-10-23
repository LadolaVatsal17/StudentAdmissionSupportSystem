/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentAdmissionSupportSystem;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author Bhautik
 */
class InvalidPasswordException extends Exception { 
  
    int passwordConditionViolated = 0; 
  
    public InvalidPasswordException(int conditionViolated) 
    { 
        super("Invalid Password: "); 
        passwordConditionViolated = conditionViolated; 
    } 
  
    public String printMessage() 
    { 
        // Call constructor of parent Exception 
        // according to the condition violated 
        switch (passwordConditionViolated) { 
  
        // Password length should be 
        // between 8 to 15 characters 
        case 1: 
            return ("Password length should be"
                    + " between 8 to 15 characters"); 
  
        // Password should not contain any space 
        case 2: 
            return ("Password should not"
                    + " contain any space"); 
  
        // Password should contain// at least one digit(0-9) 
        case 3: 
            return ("Password should contain"
                    + " at least one digit(0-9)"); 
  
        // Password should contain at least 
        // one special character ( @, #, %, &, !, $ ) 
        case 4: 
            return ("Password should contain at "
                    + "least one special character"); 
  
        // Password should contain at least 
        // one uppercase letter(A-Z) 
        case 5: 
            return ("Password should contain at"
                    + " least one uppercase letter(A-Z)"); 
  
        // Password should contain at least 
        // one lowercase letter(a-z) 
        case 6: 
            return ("Password should contain at"
                    + " least one lowercase letter(a-z)"); 
        } 
  
        return (""); 
    } 
} 
public class RegistrationScren extends javax.swing.JFrame {
    java.sql.Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public static void isValid(String password) 
        throws InvalidPasswordException 
    { 
  
        // for checking if password length 
        // is between 8 and 15 
        if (!((password.length() >= 8) 
              && (password.length() <= 15))) { 
            throw new InvalidPasswordException(1); 
        } 
  
        // to check space 
        if (password.contains(" ")) { 
            throw new InvalidPasswordException(2); 
        } 
        if (true) { 
            int count = 0; 
  
            // check digits from 0 to 9 
            for (int i = 0; i <= 9; i++) { 
  
                // to convert int to string 
                String str1 = Integer.toString(i); 
  
                if (password.contains(str1)) { 
                    count = 1; 
                } 
            } 
            if (count == 0) { 
                throw new InvalidPasswordException(3); 
            } 
        } 
  
        // for special characters 
        if (!(password.contains("@") || password.contains("#") 
              || password.contains("!") || password.contains("~") 
              || password.contains("$") || password.contains("%") 
              || password.contains("^") || password.contains("&") 
              || password.contains("*") || password.contains("(") 
              || password.contains(")") || password.contains("-") 
              || password.contains("+") || password.contains("/") 
              || password.contains(":") || password.contains(".") 
              || password.contains(", ") || password.contains("<") 
              || password.contains(">") || password.contains("?") 
              || password.contains("|"))) { 
            throw new InvalidPasswordException(4); 
        } 
  
        if (true) { 
            int count = 0; 
  
            // checking capital letters 
            for (int i = 65; i <= 90; i++) { 
  
                // type casting 
                char c = (char)i; 
  
                String str1 = Character.toString(c); 
                if (password.contains(str1)) { 
                    count = 1; 
                } 
            } 
            if (count == 0) { 
                throw new InvalidPasswordException(5); 
            } 
        } 
  
        if (true) { 
            int count = 0; 
  
            // checking small letters 
            for (int i = 90; i <= 122; i++) { 
  
                // type casting 
                char c = (char)i; 
                String str1 = Character.toString(c); 
  
                if (password.contains(str1)) { 
                    count = 1; 
                } 
            } 
            if (count == 0) { 
                throw new InvalidPasswordException(6); 
            } 
        } 
    }
    /**
     * Creates new form RegistrationScren
     */
    public RegistrationScren() {
        initComponents();
        this.setLocationRelativeTo(null );
    }
    public void showloginscreen()
    {
        HomeScreen hs = new  HomeScreen();
        hs.setVisible(true);
        hs.pack();
        hs.setLocationRelativeTo(null);
        hs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }
     public  void clearfield()
     {
         f_name.setText(null);
         l_name.setText(null);
         u_name.setText(null);
         email.setText(null);
         password.setText(null);
         contact.setText(null);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        f_name = new javax.swing.JTextField();
        l_name = new javax.swing.JTextField();
        u_name = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        contact = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();
        submitbutton = new javax.swing.JButton();
        flab = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        lsn = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Student Admission Support System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Registration ");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("User Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Password:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Contact:");

        backbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        submitbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        flab.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Last School Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(l_name, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(f_name, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(u_name, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lsn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(flab, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(211, 211, 211))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(187, 187, 187))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(submitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(f_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(flab))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(u_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        hs.pack();
        hs.setLocationRelativeTo(null);
        hs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        // TODO add your handling code here:
       
        String fname = f_name.getText();
        String lname = l_name.getText();
        String uname = u_name.getText();
        String pass = String.valueOf(password.getPassword());
        String Email = email.getText();
        String phoneno = contact.getText();
        String lsna = lsn.getText();
        
        if(f_name.getText().trim().isEmpty() && l_name.getText().trim().isEmpty() && u_name.getText().trim().isEmpty() && email.getText().trim().isEmpty() && password.getText().trim().isEmpty() && contact.getText().trim().isEmpty() && lsn.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Plz Insert All fileds  ");
            
            
        }else{
            
            if(f_name.getText().trim().isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Plz Insert First Name  ");
             
        }
        else if(l_name.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "plz Insert Last Name  ");
        }
        else if(email.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Plz Insert Email  ");
        }
        else if(u_name.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Plz Insert User Name  ");
        }
        else if(password.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Plz Insert Password  ");
        }
        else if(contact.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Plz Insert Contact");
        }
         else if(lsn.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Plz Insert School Name!");
        }
        else{
                PreparedStatement ps;
                String query = "INSERT INTO `user`(`firstname`, `lastname`, `username`, `password`, `email`,`phoneno`,`lsna`) VALUES (?,?,?,?,?,?,?)";
            
                try {
                     
             con=DriverManager.getConnection("jdbc:mysql://localhost/project_java","root","");
              ps = con.prepareStatement(query);
                    
             //   ps = MyConnect.getConnection().prepareStatement(query);
                String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                
                String password_pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
                
                String contact_pattern = "(0/91)?[7-9][0-9]{9}";
                
                 try { 
                       
                        isValid(pass); 
                       
                    } 
                    catch (InvalidPasswordException e) { 
                        
                         JOptionPane.showMessageDialog(null, e.printMessage());
                    } 
                
                
                
                
                
              if(!Email.matches(EMAIL_PATTERN)){
              JOptionPane.showMessageDialog(null, "Plz enter valid email!!");
              
              }
//              else if(!pass.matches(password_pattern)){
//                  JOptionPane.showMessageDialog(null, "Plz enter valid password(must be 8 digit,lower case,upercase and special charachter) !!");
//              }
              
              else if(!phoneno.matches(contact_pattern)){
                  JOptionPane.showMessageDialog(null, "Plz enter valid contact number !!");
              }
              
              else{
                   ps.setString(1,fname);
                ps.setString(2,lname);
                ps.setString(3,uname);
                ps.setString(4,pass);
                ps.setString(5,Email);
                ps.setString(6,phoneno);
                ps.setString(7,lsna);
             
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "Registration successfull ");
                    clearfield();
                    showloginscreen();

                }
              }
                              
               
             
            } catch (SQLException ex) {
                Logger.getLogger(RegistrationScren.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
            
        }
        
         
        
        
    }//GEN-LAST:event_submitbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationScren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationScren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationScren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationScren.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationScren().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JTextField f_name;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel flab;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField l_name;
    private javax.swing.JTextField lsn;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton submitbutton;
    private javax.swing.JTextField u_name;
    // End of variables declaration//GEN-END:variables
}
