package com.bdonvr.BananaConverter;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

import com.bdonvr.BananaConverter.units.MeasurementUnitCurrency;
import com.bdonvr.BananaConverter.units.MeasurementUnitFahrenheit;
import com.bdonvr.BananaConverter.units.MeasurementUnitKelvin;
//import com.bdonvr.BananaConverter.units.MeasurementUnitMileageKPL;
//import com.bdonvr.BananaConverter.units.MeasurementUnitMileageMPG;

public class MeasurementFactory
{
	public final static String MEASURE_LENGTH       = "Length";
	public final static String MEASURE_WEIGHT       = "Weight";
	public final static String MEASURE_TEMPERATURE  = "Temperature";
	public final static String MEASURE_VOLUME       = "Volume";
	public final static String MEASURE_MILEAGE      = "Gas Mileage";
	public final static String MEASURE_AREA         = "Area";
	public final static String MEASURE_POWER		= "Power";
	public final static String MEASURE_PRESSURE		= "Pressure";
	public final static String MEASURE_SPEED		= "Speed";
	public final static String MEASURE_RADIATION    = "Radiation";
	public final static String MEASURE_ANGLE        = "Angle Measurments";
	public final static String MEASURE_STORAGE      = "Digital Storage";
	public final static String MEASURE_CURRENCY     = "Currency";

	public final static String UNIT_LENGTH_CM       = "centimeter";
	public final static String UNIT_LENGTH_METER    = "meter";
	public final static String UNIT_LENGTH_KM       = "kilometer";
	public final static String UNIT_LENGTH_INCH     = "inch";
	public final static String UNIT_LENGTH_FOOT     = "foot";
	public final static String UNIT_LENGTH_MILE     = "mile";
	public final static String UNIT_LENGTH_BANANA   = "banana";
	public final static String UNIT_LENGTH_MILLIMETER     = "millimeter";
	
	public final static String UNIT_WEIGHT_GRAM     = "gram";
	public final static String UNIT_WEIGHT_KG       = "kilogram";
	public final static String UNIT_WEIGHT_POUND    = "pound";
	public final static String UNIT_WEIGHT_OUNCE    = "ounce";
	public final static String UNIT_WEIGHT_TON      = "metric ton";
	public final static String UNIT_WEIGHT_BANANA   = "banana";

	public final static String UNIT_VOLUME_LITER     = "liter";
	public final static String UNIT_VOLUME_MILILITER = "mililiter";
	public final static String UNIT_VOLUME_GALLON    = "gallon";
	public final static String UNIT_VOLUME_CUP       = "cup";
	public final static String UNIT_VOLUME_PINT      = "pint";
	public final static String UNIT_VOLUME_QUART     = "quart";
	public final static String UNIT_VOLUME_OUNCE     = "ounce";
	public final static String UNIT_VOLUME_BANANA    = "banana";

	public final static String UNIT_TEMP_CELSIUS    = "celsius";
	public final static String UNIT_TEMP_FAHRENHEIT = "fahrenheit";
	public final static String UNIT_TEMP_KELVIN     = "kelvin";
	public final static String UNIT_TEMP_BANANA     = "banana";

	public final static String UNIT_AREA_SQ_METER   = "square meter";
	public final static String UNIT_AREA_SQ_KM      = "square km";
	public final static String UNIT_AREA_SQ_INCH    = "square inch";
	public final static String UNIT_AREA_SQ_FOOT    = "square foot";
	public final static String UNIT_AREA_SQ_YARD    = "square yard";
	public final static String UNIT_AREA_SQ_MILE    = "square mile";
	public final static String UNIT_AREA_ACRE       = "acre";
	public final static String UNIT_AREA_HECTARE    = "hectare";
	public final static String UNIT_AREA_SQ_BANANA  = "square bananas";
	
	//public final static String UNIT_POWER_WATT		= "watt";
	//public final static String UNIT_POWER_HORSEPOWER = "horsepower";
	//public final static String UNIT_POWER_CALORIES_PER_SECOND = "calories per second";
	//public final static String UNIT_POWER_BTU_PER_SECOND = "BTU per second";
	//public final static String UNIT_POWER_MEGAWATT		= "megawatt";
	//public final static String UNIT_POWER_KILOWATT		= "kilowatt";

	//public final static String UNIT_PRESSURE_PASCAL = "pascal";
	//public final static String UNIT_PRESSURE_ATMOSPHERE = "atmosphere";
	//public final static String UNIT_PRESSURE_BAR 	= "bar";
	//public final static String UNIT_PRESSURE_PSI 	= "psi";
	//public final static String UNIT_PRESSURE_TORR 	= "torr";
	
	public final static String UNIT_SPEED_KM_PER_HOUR = "kilometers per hour";
	public final static String UNIT_SPEED_MILES_PER_HOUR = "miles per hour";
	public final static String UNIT_SPEED_METERS_PER_SECOND = "meters per second";
	public final static String UNIT_SPEED_KNOTS = "knots";
	public final static String UNIT_SPEED_BANANAS_PER_SECOND = "bananas per second";
	
	public final static String UNIT_RADIATION_REM     = "rem";
	public final static String UNIT_RADIATION_RAD     = "rad";
	public final static String UNIT_RADIATION_BANANA  = "banana";
	
	public final static String UNIT_ANGLE_DEGREES   = "degrees";
	public final static String UNIT_ANGLE_RADIANS   = "radians";
	public final static String UNIT_ANGLE_GRADIANS  = "gradians";
	public final static String UNIT_ANGLE_BANANGLES = "banangles";
	
	public final static String UNIT_STORAGE_BYTES       = "bytes (B)";
	public final static String UNIT_STORAGE_KILOBYTES   = "kilobytes (KB)";
	public final static String UNIT_STORAGE_MEGABYTES   = "megabytes (MB)";
	public final static String UNIT_STORAGE_GIGABYTES   = "gigabytes (GB)";
	public final static String UNIT_STORAGE_TERABYTES   = "terabytes (TB)";
	public final static String UNIT_STORAGE_BANANAS     = "bananabytes (BA)";
	public final static String UNIT_STORAGE_KILOBANANAS = "kilobananas (KBA)";
	public final static String UNIT_STORAGE_MEGABANANAS = "megabananas (MBA)";
	public final static String UNIT_STORAGE_GIGABANANAS = "gigabananas (GBA)";
	public final static String UNIT_STORAGE_TERABANANAS = "terabananas (TBA)";
	
	public final static String UNIT_CURRENCY_USD = "U.S. Dollars";
	public final static String UNIT_CURRENCY_EUR = "Euros";
	public final static String UNIT_CURRENCY_GBP = "British Pounds";
	public final static String UNIT_CURRENCY_INR = "Indian Rupee";
	public final static String UNIT_CURRENCY_AUD = "Australian Dollars";
	public final static String UNIT_CURRENCY_CAD = "Canadian Dollars";
	public final static String UNIT_CURRENCY_BAN = "Banana Pounds";
	public final static String UNIT_CURRENCY_JPY = "Japanese Yen";
	public final static String UNIT_CURRENCY_CNY = "Chinese Yuan";
	public final static String UNIT_CURRENCY_RUB = "Russian Ruble";
	
	private Map<String, Measurement> measurements;
	private static MeasurementFactory instance = null;

	private MeasurementFactory()
	{
		this.measurements = new TreeMap<String, Measurement>();
	}

	public final static MeasurementFactory instance()
	{
		if(instance == null)
		{
			instance = new MeasurementFactory();
		}

		return instance;
	}

	public Set<String> getEntries()
	{
		return this.measurements.keySet();
	}

	public Measurement getMeasurement(final String measurementType)
	{
		return this.measurements.get(measurementType);
	}

	//
	// Later on, this will use Spring to load everything
	//
	public void load()
	{
		//
		// Lengths
		//   The reference will be centimeters: 1 inch = 2.54 cm
		// 
		Measurement lengthMeasurements = new Measurement(MEASURE_LENGTH);
		lengthMeasurements.addUnit(new MeasurementUnit(UNIT_LENGTH_CM));
		lengthMeasurements.addUnit(new MeasurementUnit(UNIT_LENGTH_METER,  0.01));
		lengthMeasurements.addUnit(new MeasurementUnit(UNIT_LENGTH_KM,     0.00001));
		lengthMeasurements.addUnit(new MeasurementUnit(UNIT_LENGTH_INCH,   1.0/2.54));
		lengthMeasurements.addUnit(new MeasurementUnit(UNIT_LENGTH_FOOT,   1.0/(12.0*2.54)));
		lengthMeasurements.addUnit(new MeasurementUnit(UNIT_LENGTH_MILE,   1.0/(2.54*12*5280.0)));
		lengthMeasurements.addUnit(new MeasurementUnit(UNIT_LENGTH_MILLIMETER,   1.0/0.01));
		lengthMeasurements.addUnit(new MeasurementUnit(UNIT_LENGTH_BANANA, 1.0/19.812)); //average 7.8 in

		//
		// Weights
		//   The reference will be grams: 1 kg = 2.2 pounds
		//
		Measurement weightMeasurements = new Measurement(MEASURE_WEIGHT);
		weightMeasurements.addUnit(new MeasurementUnit(UNIT_WEIGHT_GRAM));
		weightMeasurements.addUnit(new MeasurementUnit(UNIT_WEIGHT_KG,     0.001));
		weightMeasurements.addUnit(new MeasurementUnit(UNIT_WEIGHT_POUND,  2.2/1000.0));
		weightMeasurements.addUnit(new MeasurementUnit(UNIT_WEIGHT_OUNCE,  (2.2*16.0)/1000.0));
		weightMeasurements.addUnit(new MeasurementUnit(UNIT_WEIGHT_TON,    1.0/1000000));
		weightMeasurements.addUnit(new MeasurementUnit(UNIT_WEIGHT_BANANA, 1.0/120)); //average 120 grams

		//
		// Temperature
		//   The reference will be celsius: F = (C * 1.8) + 32 
		//
		Measurement temperatureMeasurements = new Measurement(MEASURE_TEMPERATURE);
		temperatureMeasurements.setDecimalPlaces(1);
		temperatureMeasurements.addUnit(new MeasurementUnit(UNIT_TEMP_CELSIUS));
		temperatureMeasurements.addUnit(new MeasurementUnitFahrenheit(UNIT_TEMP_FAHRENHEIT));
		temperatureMeasurements.addUnit(new MeasurementUnitKelvin(UNIT_TEMP_KELVIN));
		temperatureMeasurements.addUnit(new MeasurementUnit(UNIT_TEMP_BANANA, 1.0/28.0)); //Optimal growing temperature for bananas
		
		//
		// Volume
		//   The reference will be liters: 1 gallon = 3.7854 liters
		//
		Measurement volumeMeasurements = new Measurement(MEASURE_VOLUME);
		volumeMeasurements.addUnit(new MeasurementUnit(UNIT_VOLUME_LITER));
		volumeMeasurements.addUnit(new MeasurementUnit(UNIT_VOLUME_MILILITER, 1000.0));
		volumeMeasurements.addUnit(new MeasurementUnit(UNIT_VOLUME_GALLON,    1.0/3.7854));
		volumeMeasurements.addUnit(new MeasurementUnit(UNIT_VOLUME_QUART,     4.0/3.7854)); // 1 gallon = 4 quarts
		volumeMeasurements.addUnit(new MeasurementUnit(UNIT_VOLUME_PINT,      8.0/3.7854));
		volumeMeasurements.addUnit(new MeasurementUnit(UNIT_VOLUME_CUP,       16.0/3.7854));
		volumeMeasurements.addUnit(new MeasurementUnit(UNIT_VOLUME_OUNCE,     128.0/3.7854));
		volumeMeasurements.addUnit(new MeasurementUnit(UNIT_VOLUME_BANANA,    1.0/0.0788627)); //1/3 cup mashed banana ~1 banana

		//
		// Area
		//   The reference will be square meters
		//
		Measurement areaMeasurements = new Measurement(MEASURE_AREA);
		//areaMeasurements.setDecimalPlaces(6);
		areaMeasurements.addUnit(new MeasurementUnit(UNIT_AREA_SQ_METER));
		areaMeasurements.addUnit(new MeasurementUnit(UNIT_AREA_HECTARE,   Math.pow(0.01, 2)));
		areaMeasurements.addUnit(new MeasurementUnit(UNIT_AREA_SQ_KM,     Math.pow(0.001, 2)));
		areaMeasurements.addUnit(new MeasurementUnit(UNIT_AREA_SQ_INCH,   Math.pow((100.0/(2.54)), 2)));
		areaMeasurements.addUnit(new MeasurementUnit(UNIT_AREA_SQ_FOOT,   Math.pow((100.0/(12.0*2.54)), 2)));
		areaMeasurements.addUnit(new MeasurementUnit(UNIT_AREA_SQ_YARD,   Math.pow((100.0/(12.0*3.0*2.54)), 2)));
		areaMeasurements.addUnit(new MeasurementUnit(UNIT_AREA_SQ_MILE,   Math.pow((100.0/(12.0*5280.0*2.54)), 2)));
		areaMeasurements.addUnit(new MeasurementUnit(UNIT_AREA_ACRE,      Math.pow((100.0/(12.0*5280.0*2.54)), 2)*640.0));
		areaMeasurements.addUnit(new MeasurementUnit(UNIT_AREA_SQ_BANANA, Math.pow((100.0/(19.812)), 2))); //see banana length

		//
		// Power
		//   The reference will be watt
		// Currently unable to find a way to connect to bananas!
		//Measurement powerMeasurements = new Measurement(MEASURE_POWER);
		//powerMeasurements.setDecimalPlaces(3);
		//powerMeasurements.addUnit(new MeasurementUnit(UNIT_POWER_WATT));
		//powerMeasurements.addUnit(new MeasurementUnit(UNIT_POWER_HORSEPOWER, 1.0/745.699872));
		//powerMeasurements.addUnit(new MeasurementUnit(UNIT_POWER_CALORIES_PER_SECOND, 0.239005736));
		//powerMeasurements.addUnit(new MeasurementUnit(UNIT_POWER_BTU_PER_SECOND, 0.00094781712));
		//powerMeasurements.addUnit(new MeasurementUnit(UNIT_POWER_KILOWATT, 1.0/1000));
		//powerMeasurements.addUnit(new MeasurementUnit(UNIT_POWER_MEGAWATT, 1.0/1000000));
		
		
		//
		// Pressure
		//    The reference will be pascal
		// Currently unable to find a way to connect to bananas! (maybe pressure required to burst the peel?)
		//Measurement pressureMeasurements = new Measurement(MEASURE_PRESSURE);
		//pressureMeasurements.addUnit(new MeasurementUnit(UNIT_PRESSURE_PASCAL));
		//pressureMeasurements.addUnit(new MeasurementUnit(UNIT_PRESSURE_ATMOSPHERE, 1.0/101325));
		//pressureMeasurements.addUnit(new MeasurementUnit(UNIT_PRESSURE_BAR, 1.0/100000));
		//pressureMeasurements.addUnit(new MeasurementUnit(UNIT_PRESSURE_PSI, 1.0/6894.75729));
		//pressureMeasurements.addUnit(new MeasurementUnit(UNIT_PRESSURE_TORR,1.0/133.322368));
		
		//
		// Speed
		//   The reference will be kilometers per hour
		//
		Measurement speedMeasurements = new Measurement(MEASURE_SPEED);
		speedMeasurements.addUnit(new MeasurementUnit(UNIT_SPEED_KM_PER_HOUR));
		speedMeasurements.addUnit(new MeasurementUnit(UNIT_SPEED_METERS_PER_SECOND,  1.0/3.6));
		speedMeasurements.addUnit(new MeasurementUnit(UNIT_SPEED_MILES_PER_HOUR,     1.0/1.609344));
		speedMeasurements.addUnit(new MeasurementUnit(UNIT_SPEED_KNOTS,              1.0*0.539956803));
		speedMeasurements.addUnit(new MeasurementUnit(UNIT_SPEED_BANANAS_PER_SECOND, 1.0/0.713232));
		
		//
		//Radiation
		//   The reference will be REM
		//
		Measurement radiationMeasurements = new Measurement(MEASURE_RADIATION);
		radiationMeasurements.addUnit(new MeasurementUnit(UNIT_RADIATION_REM));
		radiationMeasurements.addUnit(new MeasurementUnit(UNIT_RADIATION_RAD, 1/1.041666));
		radiationMeasurements.addUnit(new MeasurementUnit(UNIT_RADIATION_BANANA, 1/0.0001));
		
		//
		//Angular Measure
		//   The reference will be Degrees
		//
		Measurement angleMeasurements = new Measurement(MEASURE_ANGLE);
		angleMeasurements.addUnit(new MeasurementUnit(UNIT_ANGLE_DEGREES));
		angleMeasurements.addUnit(new MeasurementUnit(UNIT_ANGLE_RADIANS, 1.0/57.2957795));
		angleMeasurements.addUnit(new MeasurementUnit(UNIT_ANGLE_GRADIANS, 1.0/0.9));
		angleMeasurements.addUnit(new MeasurementUnit(UNIT_ANGLE_BANANGLES, 1.0/11)); //Average ~11 degrees
		
		//
		//Digital Storage
		//   The reference will be Bytes
		//
		Measurement storageMeasurements = new Measurement(MEASURE_STORAGE);
		storageMeasurements.addUnit(new MeasurementUnit(UNIT_STORAGE_BYTES));
		storageMeasurements.addUnit(new MeasurementUnit(UNIT_STORAGE_KILOBYTES,   1.0/1024.0));
		storageMeasurements.addUnit(new MeasurementUnit(UNIT_STORAGE_MEGABYTES,   1.0/1024000.0));
		storageMeasurements.addUnit(new MeasurementUnit(UNIT_STORAGE_GIGABYTES,   1.0/1073741824.0));
		storageMeasurements.addUnit(new MeasurementUnit(UNIT_STORAGE_TERABYTES,   1.0/1099511627776.0));
		storageMeasurements.addUnit(new MeasurementUnit(UNIT_STORAGE_BANANAS,     1.0/7.0)); //7 bytes to store the word banana
		storageMeasurements.addUnit(new MeasurementUnit(UNIT_STORAGE_KILOBANANAS, 1.0/7168.0));
		storageMeasurements.addUnit(new MeasurementUnit(UNIT_STORAGE_MEGABANANAS, 1.0/7343000.0));
		storageMeasurements.addUnit(new MeasurementUnit(UNIT_STORAGE_GIGABANANAS, 1.0/7518000000.0));
		storageMeasurements.addUnit(new MeasurementUnit(UNIT_STORAGE_TERABANANAS, 1.0/7700000000000.0));
		
		//
		//Currency
		//	The reference will be U.S. Dollars (USD)
		//
		Measurement currencyMeasurements = new Measurement(MEASURE_CURRENCY);
		MeasurementUnitCurrency rate = new MeasurementUnitCurrency();
		currencyMeasurements.addUnit(new MeasurementUnit(UNIT_CURRENCY_USD));
		currencyMeasurements.addUnit(new MeasurementUnit(UNIT_CURRENCY_EUR, 1.0*rate.getRate("EUR")));
		currencyMeasurements.addUnit(new MeasurementUnit(UNIT_CURRENCY_GBP, 1.0*rate.getRate("GBP")));
		currencyMeasurements.addUnit(new MeasurementUnit(UNIT_CURRENCY_INR, 1.0*rate.getRate("INR")));
		currencyMeasurements.addUnit(new MeasurementUnit(UNIT_CURRENCY_AUD, 1.0*rate.getRate("AUD")));
		currencyMeasurements.addUnit(new MeasurementUnit(UNIT_CURRENCY_CAD, 1.0*rate.getRate("CAD")));
		currencyMeasurements.addUnit(new MeasurementUnit(UNIT_CURRENCY_BAN, 1.0/0.6)); //66 cents per pound (average) Anyone know an API for banana prices?
		currencyMeasurements.addUnit(new MeasurementUnit(UNIT_CURRENCY_JPY, 1.0*rate.getRate("JPY")));
		currencyMeasurements.addUnit(new MeasurementUnit(UNIT_CURRENCY_CNY, 1.0*rate.getRate("CNY")));
		currencyMeasurements.addUnit(new MeasurementUnit(UNIT_CURRENCY_RUB, 1.0*rate.getRate("RUB")));
		
		
		//
		// Populate the map
		//
		this.measurements.put(MEASURE_LENGTH,       lengthMeasurements);
		this.measurements.put(MEASURE_WEIGHT,       weightMeasurements);
		this.measurements.put(MEASURE_TEMPERATURE,  temperatureMeasurements);
		this.measurements.put(MEASURE_VOLUME,       volumeMeasurements);
		this.measurements.put(MEASURE_AREA,         areaMeasurements);
		//this.measurements.put(MEASURE_POWER, 		powerMeasurements);
		//this.measurements.put(MEASURE_PRESSURE, 	pressureMeasurements);
		this.measurements.put(MEASURE_SPEED, 	    speedMeasurements);
		this.measurements.put(MEASURE_RADIATION,    radiationMeasurements);
		this.measurements.put(MEASURE_ANGLE,        angleMeasurements);
		this.measurements.put(MEASURE_STORAGE,      storageMeasurements);
		this.measurements.put(MEASURE_CURRENCY,     currencyMeasurements);
	}
}
