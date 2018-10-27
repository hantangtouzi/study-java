package com.hantangtouzi.thinkinjava.ch12;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WenLiang.
 * @date Feb 23, 2017 2:55:54 PM
 */

public class IOStreamDemo {

	public static void main(String[] args) throws IOException {
		String filePath = "D:\\Tools\\Eclipse\\workspaces\\basic\\ThinkInJava\\src\\main\\java\\com\\hantang\\thinkinjava\\ch12\\IOStreamDemo.java";
		BufferedReader in = new BufferedReader(new FileReader(filePath));
		String s, s2 = new String();
		while ((s = in.readLine()) != null)
			s2 += s + "\n";
		in.close();

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a line:");
		System.out.println(stdin.readLine());

		try {
			DataInputStream in3 = new DataInputStream(new ByteArrayInputStream(s2.getBytes()));
			while (true) {
				System.out.print((char) in3.readByte());
			}
		} catch (EOFException e) {
			System.out.println("End of stream");
		}
	}

}
