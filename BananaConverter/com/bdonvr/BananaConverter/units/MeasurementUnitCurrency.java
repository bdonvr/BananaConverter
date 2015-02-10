package com.bdonvr.BananaConverter.units;

import java.io.IOException;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

public class MeasurementUnitCurrency implements CurrencyConverter{
	    @SuppressWarnings("deprecation")
		public float convert(String currencyFrom, String currencyTo) throws IOException {
	        HttpClient httpclient = new DefaultHttpClient();
	        HttpGet httpGet = new HttpGet("http://quote.yahoo.com/d/quotes.csv?s=" + currencyFrom + currencyTo + "=X&f=l1&e=.csv");
	        ResponseHandler<String> responseHandler = new BasicResponseHandler();
	        String responseBody = httpclient.execute(httpGet, responseHandler);
	        httpclient.getConnectionManager().shutdown();
	        return Float.parseFloat(responseBody);
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
	    
	    public static void main(String[] args) {
	    	MeasurementUnitCurrency mcc = new MeasurementUnitCurrency();
	        try {
	            float current = mcc.convert("USD", "ILS");
	            System.out.println(current);
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

