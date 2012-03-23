package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class DBConnection {
	
	
	private Connection conn;
	
	
	private String mysqlDriver;
	private String url;
	
	
	public DBConnection(Properties connectionProperties) throws ClassNotFoundException, SQLException
	{	
		//read parameters for the connection
	
		mysqlDriver=connectionProperties.getProperty("jdbcDriver");
		url=connectionProperties.getProperty("dbAddress");
		
		initializeDB();
	}
	
	private void initializeDB() throws ClassNotFoundException, SQLException
	{
		Class.forName(mysqlDriver);  // remember to add to the classpath the right jdbc driver
									// otherwise it will throw an exception here.
		
		Properties props = new Properties(); /*This in another properties object
											Not the one we initialized with the Properties.properties file
		 										*/
		props.setProperty("user","root");
		props.setProperty("password","");
		
		conn = DriverManager.getConnection(url, props);
	}
	
	public ResultSet makeSingleQuery(String query) throws SQLException
	{
		Statement st=conn.createStatement();
		//st.setQueryTimeout(10800);
		ResultSet rs= st.executeQuery(query);
		return rs;
	}
	
	/**
	 * Make single update query like insert or update
	 * 
	 * @param query
	 * @return
	 * @throws SQLException
	 */
	public int makeUpdate(String query) throws SQLException
	{
		Statement st=conn.createStatement();
		int res=st.executeUpdate(query);
		return res;
	}
	
	/**
	 * For making batch updates like many insertions.
	 * 
	 * */
	public PreparedStatement preparedStatement(String sql) throws SQLException
	{
		return conn.prepareStatement(sql);
	}
	
	
	public void closeQuery(ResultSet rs) throws SQLException
	{
		if(rs.getStatement()!=null)
			rs.getStatement().close();
		else
			rs.close();
	}
	
	public void closeConnection() throws SQLException
	{
		conn.close();
	}

}
