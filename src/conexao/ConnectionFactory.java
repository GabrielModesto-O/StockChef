/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



        
public class ConnectionFactory {
    
    //decraracao de variaveis
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String  URL = "jdbc:mysql://localhost:3306/projectjava";
    private static final String USER = "root";
    private static final String PASS = "";
    
    
    //abrindo banco de dados 
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro de Conexão!" + ex);
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }
    
    //fechando a conexao com o banco de dados 
    public static void closeConnection(Connection con){
      try{
          if(con!=null){
              con.close();
          }
      }  
      catch(SQLException ex){
          throw new RuntimeException("Erro de Conexão" + ex);
      }
    }
    
       public static void closeConnection(Connection con, PreparedStatement sql){
           closeConnection(con);
      try{
          if(sql!=null){
              sql.close();
          }
      }  
      catch(SQLException ex){
          throw new RuntimeException("Erro de Conexão" + ex);
      }
    }
       
        public static void closeConnection(Connection con, PreparedStatement sql, ResultSet rs){
           closeConnection(con,sql);
      try{
          if(rs!=null){
              rs.close();
          }
      }  
      catch(SQLException ex){
          throw new RuntimeException("Erro de Conexão" + ex);
      }
    }
}
