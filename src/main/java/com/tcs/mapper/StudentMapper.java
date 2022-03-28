/**
 * 
 */
package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.ReportCard;

/**
 * @author springuser19
 *
 */
public class StudentMapper implements  RowMapper<ReportCard> {

	@Override
	public ReportCard mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ReportCard reportcard = new ReportCard();
		reportcard.setStudentId(rs.getInt("studentId"));
		reportcard.setStudentName(rs.getString("studentName"));
		reportcard.setCourseId(rs.getInt("courseId"));
		reportcard.setCourseName(rs.getString("courseName"));
		reportcard.setMarks(rs.getInt("marks"));
		return reportcard;
	}

	
}
