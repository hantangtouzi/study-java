package com.hantangtouzi.thinkinjava.ch12;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

import com.hantangtouzi.thinkinjava.ch11.AlphabeticComparator;

/**
 * @author WenLiang.
 * @date Feb 27, 2017 4:48:50 PM
 */

public class DirList3 {

	public static void main(final String[] args) {
		File path = new File(".");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		} else {
			list = path.list(new FilenameFilter() {
				private Pattern pattern = Pattern.compile(args[0]);

				public boolean accept(File dir, String name) {
					return pattern.matcher(new File(name).getName()).matches();
				}
			});
		}

		Arrays.sort(list, new AlphabeticComparator());

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
