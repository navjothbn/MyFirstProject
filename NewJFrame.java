
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abcd
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Info");
        setBackground(new java.awt.Color(255, 255, 0));
        setLocation(new java.awt.Point(100, 100));
        setPreferredSize(new java.awt.Dimension(894, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(440, 90, 30, 340);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(640, 90, 110, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("UserName");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 170, 100, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(517, 240, 90, 40);

        submit.setBackground(new java.awt.Color(0, 204, 255));
        submit.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        submit.setText("Submit");
        submit.setBorder(new javax.swing.border.MatteBorder(null));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                submitKeyPressed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(497, 338, 121, 39);

        cancel.setBackground(new java.awt.Color(0, 204, 255));
        cancel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.setBorder(new javax.swing.border.MatteBorder(null));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(718, 338, 122, 39);

        username.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(650, 170, 210, 30);

        password.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(648, 249, 210, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 120, 290, 310);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images (11).jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 0, 570, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper2you_241351.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 890, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        username=null;
    }//GEN-LAST:event_usernameActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       String un=username.getText();
       String p=password.getText();
       if(un.equals("navjothbn")&&p.equals("12345"))
       {
           NewJFrame1 f1=new NewJFrame1();
           f1.setVisible(true);
           username.setText(null);
           password.setText(null);
       }
       else
       {
           JOptionPane.showMessageDialog(null, "invalid login details");
           username.setText(null);
           password.setText(null);
       }
    }//GEN-LAST:event_submitActionPerformed

    private void submitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       {
            String un=username.getText();
            String p=password.getText();
            if(un.equals("navjothbn")&&p.equals("12345"))
       {
           NewJFrame1 f1=new NewJFrame1();
           f1.setVisible(true);
           //JOptionPane.showMessageDialog(null, "login successfull");
           username.setText(null);
           password.setText(null);
       }
       else
       {
           JOptionPane.showMessageDialog(null, "invalid login details");
           username.setText(null);
           password.setText(null);
       }
       }
    }//GEN-LAST:event_submitKeyPressed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        password=null;
    }//GEN-LAST:event_passwordActionPerformed

    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("nlogo.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton submit;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
