package com.codewithvish.thejobs.dao;
import com.codewithvish.thejobs.dao.dbutils.DbDriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.sql.Connection;
//import java.sql.SQLException;
import java.util.List;

import com.codewithvish.thejobs.model.Seeker;

public class SeekerManagerImpl implements SeekerManager {
	
	public SeekerManagerImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		
		DbDriverManagerFactory driverFactory = new DbDriverManagerFactory();
		DbDriverManager driverManager = driverFactory.getDbDriver("MySQL");
		
		return driverManager.getConnection(); 
	}

	@Override

		public boolean addSeeker(Seeker seeker) throws SQLException, ClassNotFoundException{
		
		Connection connection = getConnection();

		
		String query = "INSERT INTO seeker (name_seek, number_seek, email_seek, country_seek, job_seek, username, password) VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, seeker.getName_seek());
		ps.setString(2, seeker.getNumber_seek());
		ps.setString(3, seeker.getEmail_seek());
		ps.setString(4, seeker.getCountry_seek());
		ps.setString(5, seeker.getJob_seek());
		ps.setString(6, seeker.getUsername());
		ps.setString(7, seeker.getPassword());
		
		boolean result = false;
		
		if(ps.executeUpdate() > 0)
			result = true;		
		
		ps.close();
		connection.close();		
		return result;
	}


	@Override
	public Seeker fetchSeeker(int id_seek) throws SQLException, ClassNotFoundException {

		Connection connection = getConnection();
		String query = "SELECT * FROM seeker WHERE product_code=?";
		
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, id_seek);
		
		ResultSet rs = ps.executeQuery();
		
		Seeker seeker = new Seeker();
		
		while(rs.next()) {
			seeker.setId_seek(rs.getInt("id_seek"));
			seeker.setName_seek(rs.getString("name_seek"));
			seeker.setNumber_seek(rs.getString("number_seek"));
			seeker.setEmail_seek(rs.getString("email_seek"));
			seeker.setCountry_seek(rs.getString("country_seek"));
			seeker.setJob_seek(rs.getString("job_seek"));
		}
		
		ps.close();
		connection.close();		
		return seeker;
	}


	@Override
	public List<Seeker> fetchSeekers() throws SQLException, ClassNotFoundException {

		Connection connection = getConnection();
		
		String query = "SELECT * FROM seeker";
		Statement st = connection.createStatement();
		
		List<Seeker> seekerList = new ArrayList<Seeker>();
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			
			Seeker seeker = new Seeker();
			seeker.setId_seek(rs.getInt("id_seek"));
			seeker.setName_seek(rs.getString("name_seek"));
			seeker.setNumber_seek(rs.getString("number_seek"));
			seeker.setEmail_seek(rs.getString("email_seek"));
			seeker.setCountry_seek(rs.getString("country_seek"));
			seeker.setJob_seek(rs.getString("job_seek"));
			
			seekerList.add(seeker);
		}
		
		st.close();
		connection.close();
		
		return seekerList;
	}

}
