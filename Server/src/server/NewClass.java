package server;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
//String servername = "127.0.0.1";
//String portnum = "1433";
//String dbname0 = "Demo";
//String login0 = "Guru99";
//String loginpass = "12345"; 
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewClass { 
    public static void main(String[] args) throws SQLException {

     
			// Create a variable for the connection string.
			String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;databaseName=Demo;user=kalam;password=12345";

			try (Connection con = DriverManager.getConnection(connectionUrl);
					Statement stmt = con.createStatement();) {

				String SQL = null;
//					====================Create Table =========================
					String sql = "CREATE TABLE Trend " + "(id INTEGER identity(1,1) Primary key, "
							+ " InvoiceNo VARCHAR(55), " + " InvoiceDate VARCHAR(55), " + " InvoiceAddress VARCHAR(155), "+ " DeleviryAddress VARCHAR(155), "
							+ " AccountNo VARCHAR(55), " + " IBAN VARCHAR(55), " + " SWIFT VARCHAR(55), "
							+ " VatNo VARCHAR(55), " + " RegNo VARCHAR(55), " + " OnDate VARCHAR(55), "
							+ " LineCost VARCHAR(55), " + " VatCost VARCHAR(55), " +" Amount VARCHAR(55), " + " GoodsTotal VARCHAR(55), "
							+ " VatTotal VARCHAR(55), " + " TotalGBP VARCHAR(55))";
//					  stmt.executeUpdate(sql);
				// ===============insert value =============

				JFrame frame = new JFrame();
				Object result = JOptionPane.showInputDialog(frame, "Input any data Display Database or \nCancel"); 
//
//				SQL = "insert into Trend values('" + k12 + "','" + ivD1 + "','" + sum1 + "','" + daddress
//						+ "','" + banka3 + "','" + bankIb3 + "','" + banksw4 + "','" + bankvat3 + "','"
//						+ bankreg3 + "','" + ondate3 + "','" + getsum1 + "','" + vsm1 + "','" + amounts + "','"
//						+ groust3 + "','" + vatt3 + "','" + gbp3 + "')";
//
//				stmt.executeUpdate(SQL);

				String SQL1 = "SELECT  * FROM Trend";
				ResultSet rs = stmt.executeQuery(SQL1);
				String database=null;
				// Iterate through the data in the result set and display it.
				while (rs.next()) {
					 database = ("id = " + rs.getString("id") + "\nInvoiceNo = " + rs.getString("InvoiceNo")
							+ "\nInvoiceDate = " + rs.getString("InvoiceDate") + "\nInvoiceAddress = "
							+ rs.getString("InvoiceAddress") + "\nDeleviryAddress = "
							+ rs.getString("DeleviryAddress") + "\nAccountNo = " + rs.getString("AccountNo")
							+ "\nIBAN = " + rs.getString("IBAN") + "\nSWIFT = " + rs.getString("SWIFT")
							+ "\nVatNo = " + rs.getString("VatNo") + "\nREGNo =" + rs.getString("RegNo")
							+ "\nOnDate = " + rs.getString("OnDate") + "\nLineCost = "
							+ rs.getString("LineCost") + "\nVatCost = " + rs.getString("VatCost")
							+ "\nAmount = " + rs.getString("Amount") + "\nGoodsTotal = "
							+ rs.getString("GoodsTotal") + "\nVatTotal = " + rs.getString("VatTotal")
							+ "\nTotalGBP = " + rs.getString("TotalGBP") + "\n\n");
				}

				System.out.println(database);

			}

		}
    	
    	
    	
    	
    }
 
