package com.laptrinhjavaweb.utils;

import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FormUtil {
	
	@SuppressWarnings("unchecked")
	public static <T> T toModel (Class<T> clazz, HttpServletRequest request) {
		T object = null;
		try {
			object = clazz.newInstance();
			BeanUtils.populate(object, request.getParameterMap()); //chuyển Param vào Map -> ParameterMap chứa dữ liệu từ request theo kiểu key-value(value có  thể là mảng) rồi gán vào object
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
			System.out.print(e.getMessage());
		}  
		return object;
		
	}
}
