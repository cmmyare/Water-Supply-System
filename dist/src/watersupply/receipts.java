/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watersupply;

import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static mondrian.olap.fun.vba.Vba.rate;

/**
 *
 * @author Abdullahi Dere
 */
public class receipts extends javax.swing.JFrame {

    Codes co = new Codes();

    public void display() {
        co.viewTable(Table, "select * from receipt ORDER by rec_no ASC ");
    }// display 
    String peopleInfo = "";
    String accountsINof = "";
    String id = null;
    String date;

    public void clear() {
        people_no.setSelectedItem("Select One");
        amount.setText("");
        account_no.setSelectedItem("Select One");
        rec_date.setDate(null);
    }

    public receipts() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("New Receipts");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        display();
        String sql1 = "SELECT concat(people_no,', ',name)as person FROM people ORDER by people_no ASC";
        String col1 = "person";
        String sql = "SELECT concat(acc_no,',',acc_name) as accInof FROM accounts order by acc_no ASC";
        String col = "accInof";
        co.updateComo(people_no, sql1, col1);
        co.updateComo(account_no, sql, col);
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
        label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ser = new javax.swing.JButton();
        serch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        inser = new javax.swing.JButton();
        upda = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clearr = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rec_date = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        account_no = new javax.swing.JComboBox<>();
        people_no = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 127, 117));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("People_no");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amount");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Reciepts");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rec_date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        jPanel1.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 220, 30));

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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Acc_no");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 160, -1));
        jPanel1.add(rec_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 227, 41));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 421, 1330, 420));

        account_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One" }));
        account_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_noActionPerformed(evt);
            }
        });
        jPanel1.add(account_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 227, 40));

        people_no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One" }));
        people_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                people_noActionPerformed(evt);
            }
        });
        jPanel1.add(people_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 227, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serActionPerformed
        String sql = "select rec_no,amount,rec_date,concat(p.people_no,', ',p.name) as poeNum,concat(a.acc_no,',',a.acc_name) as accInfos from  people p,accounts a,receipt r  where a.acc_no  = r.acc_no and p.people_no = r.people_no and rec_no ='" + serch.getText() + "'";
        co.search(sql);
        try {
            if (co.rs.next()) {
                id = co.rs.getString("rec_no");
                String selected = co.rs.getString("poeNum");
                String acc_NOm = co.rs.getString("accInfos");
                people_no.setSelectedItem(selected);
                amount.setText(co.rs.getString("amount"));
                rec_date.setDate(co.rs.getDate("rec_date"));              
                account_no.setSelectedItem(acc_NOm);
                
                serch.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "record not found");
            }
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, exp.getMessage());
        }
    }//GEN-LAST:event_serActionPerformed

    private void serchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serchActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void inserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserActionPerformed

        
       if(people_no.getSelectedItem().equals("Select One") || amount.getText().equals("") || account_no.getSelectedItem().equals("Select One")){
       JOptionPane.showMessageDialog(null, "Please Fill All the blanks");
       }else{
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        date = sm.format(rec_date.getDate());
        String oper = "insert";
        String sql = "call recip_pro('" +peopleInfo+ "','" + amount.getText() + "','" + date + "','" +accountsINof + "','" + oper + "',null)";
        co.setSQL(sql);
        display();
        clear();
       // report
       if(co.message.equals("Inserted successfully")){
        String numm = co.getid("SELECT MAX(rec_no) as mxnumb FROM receipt", "mxnumb");
        String sqlReport = "select rec_no,name,village,zone,institution,acc_name,amount,rec_date from people p, accounts a, receipt r, \n" +
"address d where d.add_no=p.add_no and\n" +
"a.acc_no=r.acc_no and p.people_no=r.people_no and rec_no ='" +numm + "'";
        co.report("src\\watersupply\\receipts13.jrxml", sqlReport);

       }
       }   
    }//GEN-LAST:event_inserActionPerformed

    private void updaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updaActionPerformed
        if(id== null){
            JOptionPane.showMessageDialog(null, "Please Search Valid Id, Then delete");
        }else{
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        date = sm.format(rec_date.getDate());
        String oper = "update";
        String sql = "call recip_pro('" + peopleInfo + "','" + amount.getText() + "','" + date + "','" + accountsINof + "','" + oper + "','" + id + "')";
        co.setSQL(sql);
        display();
        clear();
        }
    }//GEN-LAST:event_updaActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Mahubtaa!") == JOptionPane.YES_OPTION) {
            
            if(id == null){
                JOptionPane.showMessageDialog(null, "Please search Valid Id, then delete");
            }else{
            SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
            date = sm.format(rec_date.getDate());
            String oper = "delete";
            String sql = "call recip_pro('" + peopleInfo + "','" + amount.getText() + "','" + date + "','" + accountsINof + "','" + oper + "','" + id + "')";
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

    private void account_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_noActionPerformed
        // TODO add your handling code here:
        String array[] = account_no.getSelectedItem().toString().split(",");
        accountsINof = array[0];
    }//GEN-LAST:event_account_noActionPerformed

    private void people_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_people_noActionPerformed
        // TODO add your handling code here:
        String array[] = people_no.getSelectedItem().toString().split(",");
        peopleInfo = array[0];
    }//GEN-LAST:event_people_noActionPerformed

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
            java.util.logging.Logger.getLogger(receipts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JComboBox<String> account_no;
    private javax.swing.JTextField amount;
    private javax.swing.JButton clearr;
    private javax.swing.JButton delete;
    private javax.swing.JButton inser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JComboBox<String> people_no;
    private com.toedter.calendar.JDateChooser rec_date;
    private javax.swing.JButton ser;
    private javax.swing.JTextField serch;
    private javax.swing.JButton upda;
    // End of variables declaration//GEN-END:variables
}