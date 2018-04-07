package com.sa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.sa.dao.impl.UserDaoImpl;
import com.sa.domain.User;
import com.sa.util.JDBCUtils;
import com.sa.web.ConnectionContext;
import com.sa.web.CriteriaUser;
import com.sa.web.Page;

class TestUserDaoImpl {
	private UserDaoImpl userDao = new UserDaoImpl();
	@Test
	void testGetUser() {
		try {
			Connection connection = JDBCUtils.getConnection();
			ConnectionContext.getInstance().bind(connection);
			User user = userDao.getUser("3151906212");
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testInsertUser() {
		try {
			Connection connection = JDBCUtils.getConnection();
			ConnectionContext.getInstance().bind(connection);
			User user = new User("111", "David", "环境科学与工程学院", "给排水工程", "给排水1502", "111","");
			userDao.insert(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testDelete() {
		try {
			Connection connection = JDBCUtils.getConnection();
			ConnectionContext.getInstance().bind(connection);
			userDao.delete("111");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testUpdateUser() {
		try {
			Connection connection = JDBCUtils.getConnection();
			ConnectionContext.getInstance().bind(connection);
			User user = new User("111", "^David", "^环境科学与工程学院", "^给排水工程",
					"^给排水1502", "^111","");
			userDao.update(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testGetPage() {
		try {
			Connection connection = JDBCUtils.getConnection();
			ConnectionContext.getInstance().bind(connection);
			CriteriaUser cu = new CriteriaUser(new User("", "", "", "软件工程", "", "",""),
					10);
			Page<User> page = userDao.getPage(cu);
			System.out.println(page);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testGetTotalBookNumber() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserPageList() {
		fail("Not yet implemented");
	}
}
