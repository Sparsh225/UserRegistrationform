package technical;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class CommonUtils {
	Locale locale;

	public CommonUtils(String lang, String country) {
		locale = new Locale(lang, country);
	}
    public String getProperName(String name) {
    	String[] namearr=name.split(" ");
		String propername = " ";
    	
    	for(String n : namearr) {
    		char firstchar=n.charAt(0); //r
			String firstletter = String.valueOf(firstchar).toUpperCase();
			String remaining = n.substring(1).toLowerCase();
			propername = propername + firstletter + remaining + " ";
    	}

		return propername;
    }

	public String FormatDate() {

		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, locale);
		String formatedDate = df.format(date);
		return formatedDate;
	}

	public String FormatSalary(double salary) {

		NumberFormat df = NumberFormat.getCurrencyInstance(locale);
		return df.format(salary);
	}
}
