/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_result_managment;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author gupta
 */
public class Result extends javax.swing.JFrame {

    /**
     * Creates new form Result
     */
    public Result() {
        initComponents();
        setSize(700,500);
    }
    public Result(String Rollno)
    {
        initComponents();
        jTextField5.setText(Rollno);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();

        jTextField7.setText("Total Marks");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField9.setText("jTextField9");

        jTextField11.setText("jTextField11");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField13.setText("jTextField13");

        jTextField14.setText("jTextField14");

        jTextField15.setText("jTextField15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel1.setText("Course :-");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel2.setText("Name :-");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel3.setText("Father Name :-");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel4.setText("Branch :-");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel5.setText("Roll No. :-");

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("Result ");
        jLabel21.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel30.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jLabel30.setText("Pass/Fail :-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(268, 268, 268)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(230, 230, 230)
                                                .addComponent(jLabel5))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(222, 222, 222)
                                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel21)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 1, 706, 170));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel7.setText("Passing Marks");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 193, 119, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel8.setText("Marks Obtained");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 189, -1, 26));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel9.setText("Subjects");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 194, 90, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jLabel10.setText("Total Marks");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 193, 90, -1));

        jLabel11.setText("100");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 230, 48, -1));

        jLabel12.setText("100");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 314, 48, -1));

        jLabel13.setText("100");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 275, 48, -1));

        jLabel14.setText("100");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 356, 48, -1));

        jLabel15.setText("100");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 398, 48, -1));

        jLabel16.setText("30");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 230, 48, -1));

        jLabel17.setText("30");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 272, 48, -1));

        jLabel18.setText("30");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 314, 48, -1));

        jLabel19.setText("30");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 356, 48, -1));

        jLabel20.setText("30");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 398, 48, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 227, 83, -1));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 269, 83, -1));

        jLabel22.setText("Physics");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 230, 48, -1));

        jLabel23.setText("Chemistry");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 275, -1, -1));

        jLabel24.setText("Maths");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 314, 48, -1));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 391, 48, -1));

        jLabel26.setText("DBMS");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 398, 48, -1));

        jLabel27.setText("EM");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 356, 48, -1));

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 311, 83, -1));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 353, 83, -1));

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 395, 83, -1));

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 437, 83, -1));

        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 473, 83, -1));

        jLabel28.setText("Total Marks Obtained");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 440, -1, -1));

        jLabel29.setText("Percentage :-");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 476, 91, -1));

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 310, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling c
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jPanel1ComponentShown

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         String Rollno = jTextField5.getText();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/san","root","Sanchit123@");
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery("select * from student inner join result  where result.Rollno  ='"+Rollno+"'and student.Rollno ='"+Rollno+"'");
//            ResultSet rs= st.executeQuery("Select * sum()")
           if(rs.next())
           {
               
               // above panel 
               jTextField1.setText(rs.getString(2));
               jTextField2.setText(rs.getString(4));
               jTextField3.setText(rs.getString(6));
               jTextField4.setText(rs.getString(3));
               
               //
              int mark1=Integer.valueOf(rs.getString(8));
              jTextField10.setText(mark1+"");
              int mark2=Integer.valueOf(rs.getString(9));
              jTextField12.setText(mark2+"");
              int mark3=Integer.valueOf(rs.getString(10));
              jTextField16.setText(mark3+"");
              int mark4=Integer.valueOf(rs.getString(11));
              jTextField17.setText(mark4+"");
              int mark5=Integer.valueOf(rs.getString(12));
              jTextField18.setText(mark5+"");
              int sum = mark1 + mark2 + mark3 +mark4 +mark5;
              jTextField19.setText(sum+"");
              int result = sum/5;
              jTextField20.setText(result+" %");
              if(result>30)
              {
                 jTextField6.setText("Pass");
                 jTextField21.setText("Congrats you got pass Hurray!");
              }
              else
              {
                  jTextField6.setText("Fail");
                 jTextField21.setText("Sad to say  you are not passed !");
              }
              JOptionPane.showMessageDialog(null,"Press Ok");   
           }
           else
           {
               System.out.println();
           }
        }
        catch(Exception e)
         {
                JOptionPane.showMessageDialog(null, e.toString());    
                }
    }//GEN-LAST:event_formComponentShown

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
