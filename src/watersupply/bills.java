/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watersupply;

import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdullahi Dere
 */
public class bills extends javax.swing.JFrame {
Codes co = new Codes();
    public void display() {
        co.viewTable(Table, "select * from bills ORDER by b_no ASC ");
    }// display 
    String id = null;
    String date;

    public void clear() {
        cusH_no.setSelectedItem("select One");
        ex_rate.setText("");
        cur_rate.setText("");
        rate.setText("");
        cur_rate.setText("");
        bil_date.setDate(null);
    }
    public bills() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Bills Registration");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        String sql = "SELECT cus_h_no FROM customer_homes order by cus_h_no ASC";
        String col = "cus_H_no";
        co.updateComo(cusH_no,sql,col);
        display();
        
        // Simple Date Format
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
        cur_rate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        cusH_no = new javax.swing.JComboBox<>();
        label2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        ex_rate = new javax.swing.JTextField();
        ser = new javax.swing.JButton();
        serch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inser = new javax.swing.JButton();
        upda = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clearr = new javax.swing.JButton();
        bil_date = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 127, 117));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cur_rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cur_rateActionPerformed(evt);
            }
        });
        jPanel1.add(cur_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 220, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ex_rate");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        label1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Cus_home_no");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        cusH_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One" }));
        cusH_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusH_noActionPerformed(evt);
            }
        });
        jPanel1.add(cusH_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 227, 40));

        label2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Curent_Rate");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rate");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 160, -1));

        rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateActionPerformed(evt);
            }
        });
        jPanel1.add(rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 220, 30));

        ex_rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex_rateActionPerformed(evt);
            }
        });
        jPanel1.add(ex_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 220, 30));

        ser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search11.png"))); // NOI18N
        ser.setText("Search");
        ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serActionPerformed(evt);
            }
        });
        jPanel1.add(ser, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 140, -1));

        serch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serchActionPerformed(evt);
            }
        });
        jPanel1.add(serch, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 230, 40));

        Table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1200, 390));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register New Billin");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bills_date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        inser.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        inser.setForeground(new java.awt.Color(0, 51, 51));
        inser.setText("Save");
        inser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserActionPerformed(evt);
            }
        });
        jPanel1.add(inser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 139, 51));

        upda.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        upda.setText("Update");
        upda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updaActionPerformed(evt);
            }
        });
        jPanel1.add(upda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 139, 51));

        delete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 139, 51));

        clearr.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        clearr.setText("Clear");
        clearr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearrActionPerformed(evt);
            }
        });
        jPanel1.add(clearr, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 139, 51));
        jPanel1.add(bil_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 940));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cur_rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cur_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cur_rateActionPerformed

    private void cusH_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusH_noActionPerformed
        // TODO add your handling code here:
        // co.updateComo(addNo);
    }//GEN-LAST:event_cusH_noActionPerformed

    private void rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateActionPerformed

    private void ex_rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ex_rateActionPerformed

    private void serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serActionPerformed
        String sql = "select * from bills where b_no ='"+serch.getText()+"'";
        co.search(sql);
        try{
            if(co.rs.next()){
                id = co.rs.getString("b_no");
                String selected = co.rs.getString("cus_h_no");
                cusH_no.setSelectedItem(selected);
                ex_rate.setText(co.rs.getString("ex_rate"));
                cur_rate.setText(co.rs.getString("current_rate"));
                rate.setText(co.rs.getString("rate"));
                bil_date.setDate(co.rs.getDate("bil_date"));
                serch.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "record not found");
            }
        }catch(Exception exp){
            JOptionPane.showMessageDialog(null,exp.getMessage());
        }
    }//GEN-LAST:event_serActionPerformed

    private void serchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serchActionPerformed

    private void inserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserActionPerformed

        if(cusH_no.getSelectedItem().equals("select One") ||  ex_rate.getText().equals("")||cur_rate.getText().equals("") || rate.getText().equals("")||bil_date.getDate().equals(null)){
            JOptionPane.showMessageDialog(null, "Please Fill all the blanks");
        }
        else{
            SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
            date = sm.format(bil_date.getDate());
            String oper = "insert";
            String sql = "call bills_pro('"+ cusH_no.getSelectedItem()+"','"+ex_rate.getText()+"','"+cur_rate.getText()+"','"+rate.getText()+"','"+date+"','"+oper+"',null)";
            co.setSQL(sql);
            display();
            clear();
            // report
         if(co.message.equals("Inserted successfully")){
        String numm = co.getid("SELECT MAX(b_no) as mxnumb FROM bills", "mxnumb");
        String sqlReport = "SELECT b_no as Bill_Number,cus_H_no as Home_Number,ex_rate as Ex_rate,Current_rate,Current_rate - ex_rate as Difference,rate as Rate,(Current_rate - ex_rate) * rate as Total,bil_date as Bill_date FROM bills WHERE b_no ='" +numm + "'";
        co.report("src\\watersupply\\bills12.jrxml", sqlReport);
         }
         
        }
    }//GEN-LAST:event_inserActionPerformed

    private void updaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaActionPerformed
       if(id== null){
           JOptionPane.showMessageDialog(null, "Please Search Valid Id, Then delete");
        }else{
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
       date = sm.format(bil_date.getDate());
       String oper = "update";
       String sql = "call bills_pro('"+ cusH_no.getSelectedItem()+"','"+ex_rate.getText()+"','"+cur_rate.getText()+"','"+rate.getText()+"','"+date+"','"+oper+"','"+id+"')";
       co.setSQL(sql);
       display();
       clear();
       }
    }//GEN-LAST:event_updaActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(id == null){
            JOptionPane.showMessageDialog(null, "Please Search Valid Id, Then delete");
        }else{
        if(JOptionPane.showConfirmDialog(null, "Mahubtaa!")==JOptionPane.YES_OPTION){
            SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
            date = sm.format(bil_date.getDate());
            String oper = "delete";
            String sql = "call bills_pro('"+ cusH_no.getSelectedItem()+"','"+ex_rate.getText()+"','"+cur_rate.getText()+"','"+rate.getText()+"','"+date+"','"+oper+"','"+id+"')";
            co.setSQL(sql);
            display();
            clear();
        }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearrActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearrActionPerformed

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
            java.util.logging.Logger.getLogger(bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private com.toedter.calendar.JDateChooser bil_date;
    private javax.swing.JButton clearr;
    private javax.swing.JTextField cur_rate;
    private javax.swing.JComboBox<String> cusH_no;
    private javax.swing.JButton delete;
    private javax.swing.JTextField ex_rate;
    private javax.swing.JButton inser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JTextField rate;
    private javax.swing.JButton ser;
    private javax.swing.JTextField serch;
    private javax.swing.JButton upda;
    // End of variables declaration//GEN-END:variables
}
