package com.bdonvr.BananaConverter.units;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MeasurementUnitCurrency implements CurrencyConverter{
	    public float convert(String currencyFrom, String currencyTo) throws IOException {
	    	Document doc = Jsoup.connect("https://www.google.com/finance/converter?a=1&from="+ currencyFrom +"&to=" + currencyTo).get();
	        Elements ps = doc.select("span");
	        return(Float.parseFloat((ps.text().substring(0, ps.text().length()-5))));
	    }
	    
	    //Get exchange rates
	    
	    public float getRate(String IR){
	    	MeasurementUnitCurrency getCurrentRate = new MeasurementUnitCurrency();
	    	try {
	    		return getCurrentRate.convert("USD", IR);
	    	}
	    	catch (Exception e) {
		        e.printStackTrace();
		    }
	    	return 0;
	    }

	}

