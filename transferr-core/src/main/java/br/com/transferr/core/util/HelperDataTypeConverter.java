package br.com.transferr.core.util;

import java.math.BigDecimal;

public class HelperDataTypeConverter {
	
	public static int parseInt(String value) {
		int result = 0;
		try {
			result = Integer.parseInt(value);
		} catch (Exception e) {
			result = 0;
		}
		return result;
	}
	
	public static BigDecimal parseBigDecimal(String value) {
		try {
			return new BigDecimal(value);
		} catch (Exception e) {
			return new BigDecimal(0);
		}
	}

}
