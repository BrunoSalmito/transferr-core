package br.com.transferr.core.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class HelperNumberFormat {

	public static String currencyFormat(BigDecimal value) {
		Locale locale = new Locale( "pt", "BR" );
	    return NumberFormat.getCurrencyInstance(locale).format(value);
	}
	
	public static String getCurrencySimbleForDataBase() {
		return "'R$ '";
	}
	/**
	 * Formata um BigDecimal para o numero de casas decimais passadas como parametro.
	 * @param decimal
	 * @param scale
	 * @return
	 */
	public static String formatBigDecimal(BigDecimal decimal,int scale) {
		try{
			Locale locale = new Locale( "pt", "BR" );
			decimal = decimal.setScale(2, BigDecimal.ROUND_DOWN);
			DecimalFormat df = new DecimalFormat();
			df.setDecimalFormatSymbols(new DecimalFormatSymbols(locale));
			df.setMaximumFractionDigits(scale);
			df.setMinimumFractionDigits(0);
			df.setGroupingUsed(false);
			String result = df.format(decimal);
			return result;
		}catch(Exception e){
			return formatBigDecimal(new BigDecimal("0.0000"), scale);
		}
	}
	/**
	 * Formata uma String para o numero de casas decimais passadas como parametro.
	 * @param strDecimal
	 * @param scale
	 * @return (0,scale) onde scale é o numero de casas decimais passadas como parametro. 
	 */
	public static String formatBigDecimal(String strDecimal,int scale) {
		try{
			Locale locale = new Locale( "pt", "BR" );
			BigDecimal decimal = new BigDecimal(strDecimal); 
			decimal = decimal.setScale(2, BigDecimal.ROUND_DOWN);
			DecimalFormat df = new DecimalFormat();
			df.setDecimalFormatSymbols(new DecimalFormatSymbols(locale));
			df.setMaximumFractionDigits(scale);
			df.setMinimumFractionDigits(0);
			df.setGroupingUsed(false);
			String result = df.format(decimal);
			return result;
		}catch(Exception e){
			return formatBigDecimal(new BigDecimal("0.00000"), scale);
		}
	}
	/**
	 * 
	 * @param distancia
	 * @return
	 */
	public static String formatDistance(String distancia) {
		String formatedDistance = HelperNumberFormat.formatBigDecimal(distancia, 1);
		if(formatedDistance.equals("0")){
			formatedDistance = HelperNumberFormat.formatBigDecimal(distancia, 3);
			if(!formatedDistance.equals("0")){
				int intValue = new BigDecimal(distancia).multiply(new BigDecimal("1000")).intValue();
				formatedDistance= intValue+" m";
			}else{
				formatedDistance="0,0 Km";
			}
		}else{
			formatedDistance=formatedDistance+" Km";
		}
		return formatedDistance;
	}
}
