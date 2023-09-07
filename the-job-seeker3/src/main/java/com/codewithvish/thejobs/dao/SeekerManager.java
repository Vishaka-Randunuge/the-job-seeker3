package com.codewithvish.thejobs.dao;

import java.sql.SQLException;
import java.util.List;

import com.codewithvish.thejobs.model.Seeker;

public interface SeekerManager {
	
	public boolean addSeeker(Seeker seeker)throws SQLException, ClassNotFoundException;

	public Seeker fetchSeeker(int id_seek)throws SQLException, ClassNotFoundException;
	public List<Seeker> fetchSeekers()throws SQLException, ClassNotFoundException;
}
