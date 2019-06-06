package br.com.transferr.core.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.joda.time.DateTime;

import br.com.transferr.core.enums.EnumLanguage;

public class DateUtil {

	public static Boolean isInDefaultHourToMap() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH");
		Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
		Integer hourFormat = Integer.parseInt(sdf.format(hora))   ;
		if(hourFormat >=7 && hourFormat<=17) {
			return true;
		}else {
			return false;
		}
	}

	public static Date addDaysForADate(Date date,int days) {
		Date added = new DateTime(date).plusDays(days).toDate();
		return added;
	}
	
	public static Map<EnumLanguage, String> getApproximateDate(Date date) {
		if(date == null) {
			return new HashMap<>();
		}
		Date now = new Date();
		long difference = now.getTime() - date.getTime();
		long inMinutes = TimeUnit.MILLISECONDS.toMinutes(difference);
		long inSecunds = TimeUnit.MILLISECONDS.toSeconds(difference);
		long inHours   = TimeUnit.MILLISECONDS.toHours(difference);
		Map<EnumLanguage, String> result = new HashMap<>();
		String valueForES = "";
		String valueForPT = "";
		String valueForEN = "";
		
		if(inSecunds < 10) {
			valueForES = "Actualizado ahora";
		    valueForPT = "Atualizado agora";   
		    valueForEN = "Updated now";      
		}else
		if(inSecunds < 59 ) {
			valueForES = "Actualizado hace "+inSecunds+" segundos";
			valueForPT = "Atualizado há "+inSecunds+" segundos atrás";
			valueForEN = "Updated "+inSecunds+" seconds ago";
		}else if(inMinutes < 59) {
			//In muter
		    valueForES = "Actualizado hace "+inMinutes+" minutes";
		    valueForPT = "Atualizado há "+inMinutes+" minutos atrás";
		    valueForEN = "Updated "+inMinutes+" minutes ago";
		}else if(inMinutes < (36*60)) {
			//In hours
		    valueForES = "Actualizado hace "+inHours+" horas";
		    valueForPT = "Atualizado há "+inHours+" horas atrás";
		    valueForEN = "Updated "+inHours+" hours ago";
		}else if(inMinutes < (100*60)) {
			//Few days
			valueForES = "Actualizado hace unos días";
		    valueForPT = "Atualizado há poucos dias atrás";
		    valueForEN = "Updated few days ago";
		}else {
			//Some days
		    valueForES = "Actualizado hace pocos días";
		    valueForPT = "Atualizado há alguns dias";
		    valueForEN = "Updated some days ago";
		}	
		result.put(EnumLanguage.EN_USA, valueForEN);
		result.put(EnumLanguage.PT_BR, valueForPT);
		result.put(EnumLanguage.ES_ES, valueForES);
		return result;
	}
}
