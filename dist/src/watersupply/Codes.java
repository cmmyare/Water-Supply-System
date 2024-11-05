package watersupply;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Codes {

    Connection con;
    Statement std;
    ResultSet rs;
    String message;
    
    public void updateComo(JComboBox box, String sql, String col) {
        this.setConnect();
        try {
            std = con.createStatement();
            rs = std.executeQuery(sql);
            while (rs.next()) {
                box.addItem(rs.getString(col));
            }
        } catch (Exception e) {
        }
    }

    public void report(String path, String sql) {
        try {
            this.setConnect();
            JasperDesign des = JRXmlLoader.load(path);
            JRDesignQuery qry = new JRDesignQuery();
            qry.setText(sql);
            des.setQuery(qry);
            JasperReport rep = JasperCompileManager.compileReport(des);
            JasperPrint pr = JasperFillManager.fillReport(rep, null, con);
            JasperViewer.viewReport(pr, false);

        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, exp.getMessage());
        }
    }

    public void setConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/biilkoob", "root", "");
            std = con.createStatement();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }// end of setConnect

    public void setSQL(String sql) {
        try {
            setConnect();
            rs=std.executeQuery(sql);
            if(rs.next()){
                message = rs.getString("msg");
                JOptionPane.showMessageDialog(null, rs.getString("msg"));
            }
                else
                JOptionPane.showMessageDialog(null, "failed");
            
            con.close();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }// end of setSQL method

    public void viw_colum(JTextField fild, String sql) {
        setConnect();
        try {
            rs = std.executeQuery(sql);
            fild.setText(rs.toString());
        } catch (SQLException ex) {
            Logger.getLogger(Codes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public String getid(String sql,String col)
    {
        String nu="";
       setConnect();
        try{
            rs=std.executeQuery(sql);
            if(rs.next()){
               nu=rs.getString(col);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return nu;
    }

    public void viewTable(JTable table, String sql) {
        try {
            setConnect();
            rs = std.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(rs));
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }// end of viewTable

    public void count(JLabel label, String sql,String colm) {
        try {
            setConnect(); 
           ResultSet rs = std.executeQuery(sql);
           while(rs.next()){
           int count = rs.getInt(colm);
           label.setText(String.valueOf(count));
           }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    

    public ResultSet search(String sql) {
        try {
            setConnect();
            rs = std.executeQuery(sql);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return rs;
    }
}
