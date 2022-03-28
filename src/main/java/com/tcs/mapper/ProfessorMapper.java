/**
 * 
 */
package com.tcs.mapper;

import java.sql.Date;

/**
 * @author springuser19
 *
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.Professor;

public class ProfessorMapper implements  RowMapper<Professor> {
	
	public Professor mapRow (ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Professor professor = new Professor();
		professor.setpId(rs.getInt("pId"));
		professor.setFname(rs.getString("fname"));
		professor.setLname(rs.getString("lname"));
		professor.setMobileno(rs.getInt("mobileno"));
		professor.setDob(rs.getDate("Dob"));
		professor.setEmail(rs.getString("email"));
		
		return professor;
		

	}

}
