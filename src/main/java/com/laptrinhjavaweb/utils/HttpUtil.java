package com.laptrinhjavaweb.utils;

import java.io.BufferedReader;
import java.io.IOException;


import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpUtil {
	private String value;
	
	public HttpUtil (String value) {
		this.value = value;
	}
	
	public <T> T toModel (Class<T> tClass) {
		try {
			return new ObjectMapper().readValue(value, tClass);  // lấy string json (ở hàm dưới vừa làm) -> push vô cái model 
		} catch (Exception e) {
			System.out.print(e.getMessage());
		} 
		return null;
		
	}
	public static HttpUtil of (BufferedReader reader) { //hàm getReader chứa dữ liệu json, getReader có kiểu dữ liệu là BufferReader
		StringBuilder sb = new StringBuilder();
		try {
			String line;
			while((line = reader.readLine())!= null) { //convert json về string json
				sb.append(line);	
			}
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	
		return new HttpUtil(sb.toString());
		
	}
}
