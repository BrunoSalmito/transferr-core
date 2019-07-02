package br.com.transferr.core.util;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class HelperJSON {

	public static String toJSON(Object obj) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(obj);
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
