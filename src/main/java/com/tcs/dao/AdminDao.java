package com.tcs.dao;

import java.sql.Date;
import java.util.List;

import com.tcs.model.Professor;
import com.tcs.model.ReportCard;

public interface AdminDao {
	
	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */

	public Professor create(Professor professor);

	public Professor getProfessor(Integer pid);

	public List<Professor> listProfessor();

	public ReportCard generateCard(Integer studentId);


}
