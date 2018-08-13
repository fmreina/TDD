package entidadeImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static final String FORMAT_DATE_BR = "dd/MM/yyyy";
	 
		public static Date parseDate(String stringDate, String format) {
			Date date;
			if(format == null){
				format = FORMAT_DATE_BR;
			}
				
			if (stringDate != null) {
				SimpleDateFormat formatter = new SimpleDateFormat(format);
				try {
					date = formatter.parse(stringDate);
				} catch (ParseException e) {
					return null;
				}
			} else {
				date = null;
			}
			return date;
		}
		
		public static int diasAteHoje(Date data) {
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			c1.setTime(data);
			c2.setTime(new Date());
			long milis = c2.getTimeInMillis() - c1.getTimeInMillis();
			Long dias = milis / 1000 / 60 / 60 / 24;
			return dias.intValue();
		}
		
		public static String formatDate(Date date) {
			String stringDate;
			if (date != null) {
				SimpleDateFormat formatter = new SimpleDateFormat(FORMAT_DATE_BR);
				stringDate = formatter.format(date);
			} else {
				stringDate = "-";
			}
			return stringDate;
		}
		
		public static String calculateIdade(Date data){
			int dias = diasAteHoje(data);
			if(dias>=360){
				return dias/360 + " anos";
			}else if (dias > 30){
				return dias/30 + " meses";
			}
			return dias + " dias";
		}
}
