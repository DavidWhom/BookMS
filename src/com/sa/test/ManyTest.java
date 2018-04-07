package com.sa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.junit.jupiter.api.Test;

class ManyTest {

	@Test
	void test() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(date));
		Calendar c = Calendar.getInstance();
		System.out.println(sdf.format(c.getTime()));
	}
	@Test
	void Test2() {
		System.out.println(5  %  4);
	}
	@Test
	void Test3() {
		HttpServletRequest request;
		File file = new File("/img/user/hah.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
