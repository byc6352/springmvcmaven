/**
 * 
 */
package springmvcmaven;

import com.tlink.dao.UserManager;

/**
 * @author HUASINE
 *
 */
public class TestDB {
	public static void main(String[] args){
		String pwd=UserManager.getPasswordByUserName("byc");
		System.out.println("test:"+pwd);
	}
}
