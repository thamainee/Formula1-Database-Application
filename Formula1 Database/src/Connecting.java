/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
/**
 *
 * @author thama
 */
public class Connecting {
    public static void main(String[] args) {
		System.out.println("Connecting to database...");
		try{
                Connection conn =getConnection();
                
                Statement stmt = conn.createStatement();
                
                    String query="SELECT* FROM constructor";
                    
                    ResultSet rs =stmt.executeQuery(query);
                    while(rs.next())
                    {
                    String constructorID = rs.getString("constuctorID");
                    String constructorName = rs.getString("constructorName");
                    String constructorNationality = rs.getString("constructorNationality");
                    String points = rs.getString("points");
                   
                    System.out.format("%s \t %s \t %s \t %s\n",constructorID,constructorName,constructorNationality,points);
                    }
                                conn.close();

                }
	catch(Exception e){
        System.out.println("Something went wrong!");
			e.printStackTrace();
        
        }
	}
    private static Connection getConnection(){
    
    try {
			// 2. Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 3. Create a Connection object
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj", "root", "Thaliaon23_");
			
			// Congratulate myself
			System.out.println("Connection established.");
			
			// 4. Close the connection
			conn.close();
			
                        return conn;
		} 
    catch(Exception e) {
			System.out.println("Something went wrong!");
			e.printStackTrace();
                        return null;
		}

    
    
    }
}



        

       
