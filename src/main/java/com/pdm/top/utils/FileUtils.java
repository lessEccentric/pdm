package com.pdm.top.utils;

import java.io.IOException;
import java.net.URLEncoder;

import sun.misc.BASE64Encoder;

public class FileUtils {
	public static String encodDownLoadFileName(String filename, String agent) throws IOException {
		if(agent.contains("FireFox")) {
			filename = "=?UTF-8?B?" + new BASE64Encoder().encode(filename.getBytes("utf-8"));
			filename = filename.replace("\r\n", "");
		} else { // IE及其他浏览器
			filename = URLEncoder.encode(filename, "utf-8");
			filename = filename.replaceAll("\r\n", "");
		}
		return filename;
	}
}
