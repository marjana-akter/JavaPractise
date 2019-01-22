package io.mtech.dbUtil;

//import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;


import java.sql.SQLException;
import java.util.logging.Logger;


public class DBConn{
public static void main(String[] args) {
	Logger log= Logger.getLogger(DBConn.class.getName());
	// Create a variable for the connection string.
    String connectionUrl = "jdbc:sqlserver://vNTDACWSSQLD002:1433;databaseName=DEV_TEST; user=dev_test_dbo;password=dev_test_dbo123";
    
    try {
    	    //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
    		Connection con = DriverManager.getConnection(connectionUrl); 
    		log.info("successful");
    }
    // Handle any errors that may have occurred.
    catch (SQLException e) {
        e.printStackTrace();
    }
}
}


