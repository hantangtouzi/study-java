package com.hantangtouzi.thinkinjava.ch09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author WenLiang.
 * @date Feb 11, 2017 1:10:42 PM
 */

public class Cleanup {

	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("Cleanup.java");
			String s;
			int i = 1;
			while ((s = in.getLine()) != null) {

			}
			in.dispose();
		} catch (Exception e) {
			System.err.println("Caughy Exception in main()");
			e.printStackTrace();
		}
	}

}

class InputFile {
	private BufferedReader in;

	public InputFile(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fname));
		} catch (FileNotFoundException e) {
			System.err.println("Could not open " + fname);
			throw e;
		} catch (Exception e) {
			try {
				in.close();
			} catch (IOException e2) {
				System.err.println("in.close() unsuccessfult");
			}
			throw e;
		} finally {

		}
	}

	public String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch (IOException e) {
			throw new RuntimeException("readline() failed");
		}
		return s;
	}

	public void dispose() {
		try {
			in.close();
			System.out.println("dispose() successful");
		} catch (IOException e2) {
			throw new RuntimeException("in.close() failed");
		}
	}
}
