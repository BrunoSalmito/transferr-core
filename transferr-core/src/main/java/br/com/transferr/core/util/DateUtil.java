package br.com.transferr.core.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.joda.time.DateTime;

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
}
