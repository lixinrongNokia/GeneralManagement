package com.gzwl.demo.util;

import java.io.UnsupportedEncodingException;
import java.util.Random;

public final class MyUtils {
	// 自动生成名字（中文）
		public static String getRandomNickName() {
			int max = 4;
			int min = 2;
			int len = new Random().nextInt(max) % (max - min + 1) + min;
			String ret = "";
			try {
				for (int i = 0; i < len; i++) {
					int hightPos, lowPos; // 定义高低位
					Random random = new Random();
					hightPos = (176 + Math.abs(random.nextInt(39))); // 获取高位值
					lowPos = (161 + Math.abs(random.nextInt(93))); // 获取低位值
					byte[] b = new byte[2];
					b[0] = (new Integer(hightPos).byteValue());
					b[1] = (new Integer(lowPos).byteValue());
					ret += new String(new String(b, "GBK").getBytes("UTF-8"), "ISO-8859-1");
				}
				return new String(ret.getBytes("ISO-8859-1"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return ret;
		}
}
