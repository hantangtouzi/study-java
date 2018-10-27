package com.hantangtouzi.core.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author WenLiang.
 * @date Feb 27, 2017 8:07:22 PM
 */

public class JavaIODemo {

	public static void main(String[] args) {
		String file = "D:\\Tools\\Eclipse\\workspaces\\basic\\javacore\\src\\main\\java\\com\\hantang\\javacore\\io\\JavaIODemo.java";

		InputStream inputStream = null;

		try {
			inputStream = new FileInputStream(file);
			int c;
			while ((c = inputStream.read()) != -1) {
				System.out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
