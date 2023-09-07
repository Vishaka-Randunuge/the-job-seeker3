package com.codewithvish.thejobs.service;

import java.sql.SQLException;
import java.util.List;

import com.codewithvish.thejobs.dao.SeekerManager;
import com.codewithvish.thejobs.dao.SeekerManagerImpl;
import com.codewithvish.thejobs.model.Seeker;



public class SeekerService {

	public SeekerService() {

	}

	//public synchronized static SeekerService getProductService() {
	//	if(seekerServiceObj== null) {
	//		seekerServiceObj = new SeekerService();
	//	}
	//	return seekerServiceObj;
	//}
	
	public SeekerManager getProductManager() {
		return new SeekerManagerImpl();
		
	}
	
	public boolean addProduct(Seeker seeker) throws SQLException, ClassNotFoundException {
		return getProductManager().addSeeker(seeker);
	}
	

	public Seeker fetchSeeker(int id_seek) throws SQLException, ClassNotFoundException {
		return getProductManager().fetchSeeker(id_seek);
	}
	
	public List<Seeker> fetchAllProducts() throws SQLException, ClassNotFoundException{
		return getProductManager().fetchSeekers();
	}
}
