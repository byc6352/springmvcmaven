/**
 * 
 */
package com.tlink.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tlink.utils.JDBCUtil;

/**
 * @author HUASINE
 *
 */
public class UserManager {
	private static String getPasswordByUserName(String loginName) {
		String sql = "select login_pwd from all_user where login_name = " +"'" + loginName+"'";
		Connection conn = JDBCUtil.getConn();
		Statement stmt=null; 
		ResultSet ret = null;  
		String password=null;
		try {
			stmt = conn.createStatement();
			ret = stmt.executeQuery(sql);
			while (ret.next()) {  
				password = ret.getString(1); 
			}
			ret.close();  
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return password;
	}
}
