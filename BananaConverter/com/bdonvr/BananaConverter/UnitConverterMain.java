package com.bdonvr.BananaConverter;

public class UnitConverterMain
{
	private static final String ARG_LENGTH_CM     = "-cm";
	private static final String ARG_LENGTH_METER  = "-m";
	private static final String ARG_LENGTH_KM     = "-km";
	private static final String ARG_LENGTH_INCH   = "-in";
	private static final String ARG_LENGTH_FOOT   = "-ft";
	private static final String ARG_LENGTH_MILE   = "-mi";
	private static final String ARG_LENGTH_BANANA = "-bl";

	private static final String ARG_WEIGHT_GRAM   = "-g";
	private static final String ARG_WEIGHT_KG     = "-kg";
	private static final String ARG_WEIGHT_POUND  = "-lb";
	private static final String ARG_WEIGHT_OUNCE  = "-oz";
	private static final String ARG_WEIGHT_BANANA = "-bw";

	private static final String ARG_VOLUME_LITER  = "-l";
	private static final String ARG_VOLUME_GALLON = "-ga";
	private static final String ARG_VOLUME_CUP    = "-cp";
	private static final String ARG_VOLUME_PINT   = "-p";
	private static final String ARG_VOLUME_QUART  = "-q";
	private static final String ARG_VOLUME_OUNCE  = "-foz";
	private static final String ARG_VOLUME_BANANA  = "-bv";

	private static final String ARG_TEMP_CELSIUS    = "-c";
	private static final String ARG_TEMP_FAHRENHEIT = "-f";
	private static final String ARG_TEMP_KELVIN     = "-k";
	private static final String ARG_TEMP_BANANA     = "-bt";
	
	//private static final String ARG_POWER_WATT		           = "-w";
	//private static final String ARG_POWER_HORSEPOWER          = "-hp";
	//private static final String ARG_POWER_CALORIES_PER_SECOND = "-cps";
	//private static final String ARG_POWER_BTU_PER_SECOND      = "-btu";
	//private static final String ARG_POWER_MEGAWATT		       = "-mw";
	//private static final String ARG_POWER_KILOWATT		       = "-kw";

	//private static final String ARG_PRESSURE_PASCAL     = "-pa";
	//private static final String ARG_PRESSURE_ATMOSPHERE = "-atm";
	//private static final String ARG_PRESSURE_BAR 	     = "-bar";
	//private static final String ARG_PRESSURE_PSI 	     = "-psi";
	//private static final String ARG_PRESSURE_TORR 	     = "-torr";

	//private static final String ARG_MILEAGE_KPL   = "-kpl";
	//private static final String ARG_MILEAGE_MPG   = "-mpg";
	//private static final String ARG_MILEAGE_LPK   = "-lpk";

	private static final String ARG_AREA_SQ_METER = "-m2";
	private static final String ARG_AREA_SQ_KM    = "-km2";
	private static final String ARG_AREA_SQ_INCH  = "-in2";
	private static final String ARG_AREA_SQ_FOOT  = "-ft2";
	private static final String ARG_AREA_SQ_YARD  = "-yd2";
	private static final String ARG_AREA_SQ_MILE  = "-mi2";
	private static final String ARG_AREA_ACRE     = "-ac";
	private static final String ARG_AREA_HECTARE  = "-ha";
	private static final String ARG_AREA_SQ_BANANA   = "-b2";
	
	private static final String ARG_SPEED_KMH                = "-kmh";
	private static final String ARG_SPEED_MPH                = "-mph";
	private static final String ARG_SPEED_MS                 = "-ms";
	private static final String ARG_SPEED_KNOTS              = "-kn";
	private static final String ARG_SPEED_BANANAS_PER_SECOND = "-bps";
	
	private static final String ARG_ANGLE_DEGREES = "-dg";
	private static final String ARG_ANGLE_RADIANS = "-rad";
	private static final String ARG_ANGLE_GRADIANS = "-gr";
	private static final String ARG_ANGLE_BANANGLES = "-ba";

	private static final String ARG_HELP_H        = "-h";
	private static final String ARG_HELP          = "-help";
	private static final String ARG_HELP_QMARK    = "-?";

	private static class Input
	{
		public String measurementType;
		public String measurementUnit;
		public double value;
	}

	//
	//	 Simple Command line parser
	//
	private static boolean parseCommandLine(final String[] args, Input input) throws Exception
	{
		if(args.length == 1)
		{
			if(ARG_HELP.equals(args[0]) || ARG_HELP_H.equals(args[0]) || ARG_HELP_QMARK.equals(args[0]))
		    {
		      printUsage();
		      return false;
		    }
			else
			{
				throw new Exception("Invalid command line argument: " + args[0] );
			}
		}

		if(args.length > 2)
		{
			throw new Exception("Invalid number of command line arguments: " + args.length );
		}

		for(int i = 0; i < args.length; i++)
		{
			String argv = args[i];
			input.value = Double.parseDouble(args[++i]);

			//
			// Lengths
			//

			if(ARG_LENGTH_CM.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_LENGTH;
				input.measurementUnit = MeasurementFactory.UNIT_LENGTH_CM;
			}
			else if(ARG_LENGTH_METER.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_LENGTH;
				input.measurementUnit = MeasurementFactory.UNIT_LENGTH_METER;
			}
			else if(ARG_LENGTH_KM.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_LENGTH;
				input.measurementUnit = MeasurementFactory.UNIT_LENGTH_KM;
			}
			else if(ARG_LENGTH_INCH.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_LENGTH;
				input.measurementUnit = MeasurementFactory.UNIT_LENGTH_INCH;
			}
			else if(ARG_LENGTH_FOOT.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_LENGTH;
				input.measurementUnit = MeasurementFactory.UNIT_LENGTH_FOOT;
			}
			else if(ARG_LENGTH_MILE.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_LENGTH;
				input.measurementUnit = MeasurementFactory.UNIT_LENGTH_MILE;
			}
			else if(ARG_LENGTH_BANANA.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_LENGTH;
				input.measurementUnit = MeasurementFactory.UNIT_LENGTH_BANANA;
			}

			//
			// Weights
			//
			else if(ARG_WEIGHT_GRAM.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_WEIGHT;
				input.measurementUnit = MeasurementFactory.UNIT_WEIGHT_GRAM;
			}
			else if(ARG_WEIGHT_KG.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_WEIGHT;
				input.measurementUnit = MeasurementFactory.UNIT_WEIGHT_KG;
			}
			else if(ARG_WEIGHT_POUND.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_WEIGHT;
				input.measurementUnit = MeasurementFactory.UNIT_WEIGHT_POUND;
			}
			else if(ARG_WEIGHT_OUNCE.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_WEIGHT;
				input.measurementUnit = MeasurementFactory.UNIT_WEIGHT_OUNCE;
			}
			else if(ARG_WEIGHT_BANANA.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_WEIGHT;
				input.measurementUnit = MeasurementFactory.UNIT_WEIGHT_BANANA;
			}

			//
			// Volumes
			//
			else if(ARG_VOLUME_LITER.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_VOLUME;
				input.measurementUnit = MeasurementFactory.UNIT_VOLUME_LITER;
			}
			else if(ARG_VOLUME_GALLON.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_VOLUME;
				input.measurementUnit = MeasurementFactory.UNIT_VOLUME_GALLON;
			}
			else if(ARG_VOLUME_CUP.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_VOLUME;
				input.measurementUnit = MeasurementFactory.UNIT_VOLUME_CUP;
			}
			else if(ARG_VOLUME_OUNCE.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_VOLUME;
				input.measurementUnit = MeasurementFactory.UNIT_VOLUME_OUNCE;
			}
			else if(ARG_VOLUME_PINT.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_VOLUME;
				input.measurementUnit = MeasurementFactory.UNIT_VOLUME_PINT;
			}
			else if(ARG_VOLUME_QUART.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_VOLUME;
				input.measurementUnit = MeasurementFactory.UNIT_VOLUME_QUART;
			}
			else if(ARG_VOLUME_BANANA.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_VOLUME;
				input.measurementUnit = MeasurementFactory.UNIT_VOLUME_BANANA;
			}

			//
			// Temperatures
			//
			else if(ARG_TEMP_CELSIUS.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_TEMPERATURE;
				input.measurementUnit = MeasurementFactory.UNIT_TEMP_CELSIUS;
			}
			else if(ARG_TEMP_FAHRENHEIT.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_TEMPERATURE;
				input.measurementUnit = MeasurementFactory.UNIT_TEMP_FAHRENHEIT;
			}
			else if(ARG_TEMP_KELVIN.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_TEMPERATURE;
				input.measurementUnit = MeasurementFactory.UNIT_TEMP_KELVIN;
			}
			else if(ARG_TEMP_BANANA.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_TEMPERATURE;
				input.measurementUnit = MeasurementFactory.UNIT_TEMP_BANANA;
			}
			
			//
			// Power
			//
			//else if(ARG_POWER_WATT.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_POWER;
			//	input.measurementUnit = MeasurementFactory.UNIT_POWER_WATT;
			//}
			//else if(ARG_POWER_HORSEPOWER.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_POWER;
			//	input.measurementUnit = MeasurementFactory.UNIT_POWER_HORSEPOWER;
			//}
			//else if(ARG_POWER_CALORIES_PER_SECOND.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_POWER;
			//	input.measurementUnit = MeasurementFactory.UNIT_POWER_CALORIES_PER_SECOND;
			//}
			//else if(ARG_POWER_BTU_PER_SECOND.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_POWER;
			//	input.measurementUnit = MeasurementFactory.UNIT_POWER_BTU_PER_SECOND;
			//}
			//else if(ARG_POWER_MEGAWATT.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_POWER;
			//	input.measurementUnit = MeasurementFactory.UNIT_POWER_MEGAWATT;
			//}
			//else if(ARG_POWER_KILOWATT.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_POWER;
			//	input.measurementUnit = MeasurementFactory.UNIT_POWER_KILOWATT;
			//}
			
			//
			// Pressure
			//
			//else if(ARG_PRESSURE_PASCAL.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_PRESSURE;
			//	input.measurementUnit = MeasurementFactory.UNIT_PRESSURE_PASCAL;
			//}
			//else if(ARG_PRESSURE_ATMOSPHERE.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_PRESSURE;
			//	input.measurementUnit = MeasurementFactory.UNIT_PRESSURE_ATMOSPHERE;
			//}
			//else if(ARG_PRESSURE_BAR.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_PRESSURE;
			//	input.measurementUnit = MeasurementFactory.UNIT_PRESSURE_BAR;
			//}
			//else if(ARG_PRESSURE_PSI.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_PRESSURE;
			//	input.measurementUnit = MeasurementFactory.UNIT_PRESSURE_PSI;
			//}
			//else if(ARG_PRESSURE_TORR.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_PRESSURE;
			//	input.measurementUnit = MeasurementFactory.UNIT_PRESSURE_TORR;
			//}
			
			//
			// Mileage
			//
			//else if(ARG_MILEAGE_KPL.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_MILEAGE;
			//	input.measurementUnit = MeasurementFactory.UNIT_MILEAGE_KPL;
			//}
			//else if(ARG_MILEAGE_LPK.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_MILEAGE;
			//	input.measurementUnit = MeasurementFactory.UNIT_MILEAGE_LPK;
			//}
			//else if(ARG_MILEAGE_MPG.equals(argv))
			//{
			//	input.measurementType = MeasurementFactory.MEASURE_MILEAGE;
			//	input.measurementUnit = MeasurementFactory.UNIT_MILEAGE_MPG;
			//}

			//
			// Area
			//
			else if(ARG_AREA_SQ_METER.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_AREA;
				input.measurementUnit = MeasurementFactory.UNIT_AREA_SQ_METER;
			}
			else if(ARG_AREA_SQ_KM.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_AREA;
				input.measurementUnit = MeasurementFactory.UNIT_AREA_SQ_KM;
			}
			else if(ARG_AREA_SQ_INCH.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_AREA;
				input.measurementUnit = MeasurementFactory.UNIT_AREA_SQ_INCH;
			}
			else if(ARG_AREA_SQ_FOOT.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_AREA;
				input.measurementUnit = MeasurementFactory.UNIT_AREA_SQ_FOOT;
			}
			else if(ARG_AREA_SQ_YARD.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_AREA;
				input.measurementUnit = MeasurementFactory.UNIT_AREA_SQ_YARD;
			}
			else if(ARG_AREA_SQ_MILE.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_AREA;
				input.measurementUnit = MeasurementFactory.UNIT_AREA_SQ_MILE;
			}
			else if(ARG_AREA_ACRE.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_AREA;
				input.measurementUnit = MeasurementFactory.UNIT_AREA_ACRE;
			}
			else if(ARG_AREA_HECTARE.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_AREA;
				input.measurementUnit = MeasurementFactory.UNIT_AREA_HECTARE;
			}
			else if(ARG_AREA_SQ_BANANA.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_AREA;
				input.measurementUnit = MeasurementFactory.UNIT_AREA_SQ_BANANA;
			}
			
			//
			// Speed
			//
			else if(ARG_SPEED_KMH.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_SPEED;
				input.measurementUnit = MeasurementFactory.UNIT_SPEED_KM_PER_HOUR;
			}
			else if(ARG_SPEED_MPH.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_SPEED;
				input.measurementUnit = MeasurementFactory.UNIT_SPEED_MILES_PER_HOUR;
			}
			else if(ARG_SPEED_MS.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_SPEED;
				input.measurementUnit = MeasurementFactory.UNIT_SPEED_METERS_PER_SECOND;
			}
			else if(ARG_SPEED_KNOTS.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_SPEED;
				input.measurementUnit = MeasurementFactory.UNIT_SPEED_KNOTS;
			}
			else if(ARG_SPEED_BANANAS_PER_SECOND.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_SPEED;
				input.measurementUnit = MeasurementFactory.UNIT_SPEED_BANANAS_PER_SECOND;
			}
			
			//
			// Angle Measurements
			//
			else if(ARG_ANGLE_DEGREES.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_ANGLE;
				input.measurementUnit = MeasurementFactory.UNIT_ANGLE_DEGREES;
			}
			else if(ARG_ANGLE_RADIANS.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_ANGLE;
				input.measurementUnit = MeasurementFactory.UNIT_ANGLE_RADIANS;
			}
			else if(ARG_ANGLE_GRADIANS.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_ANGLE;
				input.measurementUnit = MeasurementFactory.UNIT_ANGLE_GRADIANS;
			}
			else if(ARG_ANGLE_BANANGLES.equals(argv))
			{
				input.measurementType = MeasurementFactory.MEASURE_ANGLE;
				input.measurementUnit = MeasurementFactory.UNIT_ANGLE_BANANGLES;
			}

			//
			// Other args
			//
		    else
		    {
		      throw new Exception("Invalid command line argument: " + argv );
		    }
		}
		
		return true;
	}

	private static void printUsage()
	{
	  System.out.println(
		   "\nUsage:\n" +
		   "\t If started with no arguments, the GUI will be launched\n" +
	       "Specify one of the following and the rest of the units of that measurement will be displayed\n" +

	       "\nLengths:\n\t" +
	       ARG_LENGTH_CM     + "\t centimeters\n\t" +
	       ARG_LENGTH_METER  + "\t meters\n\t" +
	       ARG_LENGTH_KM     + "\t kilometers\n\t" +
	       ARG_LENGTH_INCH   + "\t inches\n\t" +
	       ARG_LENGTH_FOOT   + "\t feet\n\t" +
	       ARG_LENGTH_MILE   + "\t miles\n" +
	       ARG_LENGTH_BANANA + "\t banana lengths\n" +

	       "\nWeights:\n\t" +
	       ARG_WEIGHT_GRAM    + "\t grams\n\t" +
	       ARG_WEIGHT_KG      + "\t kilograms\n\t" +
	       ARG_WEIGHT_POUND   + "\t pounds\n\t" +
	       ARG_WEIGHT_OUNCE   + "\t ounces\n" +
	       ARG_WEIGHT_BANANA  + "\t banana weights\n" +
	       
	       "\nVolumes:\n\t" +
	       ARG_VOLUME_LITER  + "\t liters\n\t" +
	       ARG_VOLUME_GALLON + "\t gallons\n\t" +
	       ARG_VOLUME_OUNCE  + "\t fluid ounces\n\t" +
	       ARG_VOLUME_PINT   + "\t pints\n\t" +
	       ARG_VOLUME_QUART  + "\t quarts\n\t" +
	       ARG_VOLUME_CUP    + "\t cups\n" +
	       ARG_VOLUME_BANANA + "\t bananas\n" +

	       "\nTemperatures:\n\t" +
	       ARG_TEMP_CELSIUS     + "\t degrees celsius\n\t" +
	       ARG_TEMP_FAHRENHEIT  + "\t degrees fahrenheit\n\t" +
	       ARG_TEMP_KELVIN      + "\t degrees kelvin\n\t" +
	       ARG_TEMP_BANANA      + "\t degrees banana\n\t" +
	       
	      //"\nPower:\n\t" +
	      // ARG_POWER_WATT                + "\t watts\n\t" +
	      // ARG_POWER_HORSEPOWER          + "\t horsepower\n\t" +
	      // ARG_POWER_CALORIES_PER_SECOND + "\t calories per second\n\t" +
	      // ARG_POWER_BTU_PER_SECOND      + "\t BTU per second\n\t" +
	      // ARG_POWER_KILOWATT            + "\t kilowatts\n\t" +
	      // ARG_POWER_MEGAWATT            + "\t megawatts\n\t" +
	       
          // "\nPressure:\n\t" +
          // ARG_PRESSURE_PASCAL     + "\t pascal\n\t" +
          // ARG_PRESSURE_ATMOSPHERE + "\t atosphere\n\t" +
          // ARG_PRESSURE_BAR        + "\t bar\n\t" +
          // ARG_PRESSURE_PSI        + "\t psi\n\t" +
          // ARG_PRESSURE_TORR       + "\t torr\n\t" +
           
	       
	      // "\nGas Mileage:\n\t" +
	      // ARG_MILEAGE_MPG + "\t miles per gallon\n\t" +
	      // ARG_MILEAGE_LPK + "\t liters per 100 km\n" +

	       "\nArea:\n\t" +
	       ARG_AREA_SQ_METER  + "\t square meters\n\t" +
	       ARG_AREA_HECTARE   + "\t hectares\n\t" +
	       ARG_AREA_SQ_KM     + "\t square kilo meters\n\t" +
	       ARG_AREA_SQ_INCH   + "\t square inches\n\t" +
	       ARG_AREA_SQ_FOOT   + "\t square feet\n\t" +
	       ARG_AREA_SQ_YARD   + "\t square yards\n\t" +
	       ARG_AREA_SQ_MILE   + "\t square miles\n\t" +
	       ARG_AREA_ACRE      + "\t acres\n\t" +
	       ARG_AREA_SQ_BANANA + "\t square bananas\n\t" +
	       
	       "\nSpeed:\n\t" +
	       ARG_SPEED_KMH                + "\t kilometers per hour\n\t" +
	       ARG_SPEED_MPH                + "\t miles per hour\n\t" +
	       ARG_SPEED_MS                 + "\t meters per second\n\t" +
	       ARG_SPEED_KNOTS              + "\t knots (nautical miles)\n\t" +
	       ARG_SPEED_BANANAS_PER_SECOND + "\t bananas per second\n\t" +
	       
		   "\nAngular Measure:\n\t" +
		   ARG_ANGLE_DEGREES   + "\t degrees\n\t" +
		   ARG_ANGLE_RADIANS   + "\t radians\n\t" +
		   ARG_ANGLE_GRADIANS  + "\t gradians\n\t" +
		   ARG_ANGLE_BANANGLES + "\t banangles (Banana Angles)\n\t" +

	       "\nOther Commands:\n\t" +
	       ARG_HELP_H + "\t Display this message, same as: " + ARG_HELP + " and " + ARG_HELP_QMARK + "\n");
	}

	public static void main(String[] args) 
	{
		MeasurementFactory factory = MeasurementFactory.instance();
		factory.load();

		// Launch the gui if no args set
		if(args.length == 0)
		{
			UnitConverterGui gui = new UnitConverterGui(factory);
			gui.init();
			return;
		}

		// otherwise parse the command line args
		Input input = new Input();
		try
		{
			if(!parseCommandLine(args, input))
			{
				return;
			}
		}
		catch(Exception e)
		{
			System.err.println("Error parsing command line: " + e.getMessage());
			printUsage();
			return;
		}

		Measurement m = factory.getMeasurement(input.measurementType);
		if(m == null)
		{
			System.err.println("The measurement type does not exist: " + input.measurementType);
			return;
		}

		MeasurementUnit mu = m.findUnit(input.measurementUnit);
		if(mu == null)
		{
			System.err.println("The measurement unit does not exist: " + input.measurementUnit);
			return;
		}

		System.out.println("Converting: " + input.measurementType + "[" + input.measurementUnit + "] " + input.value);
		System.out.println(m.toString(mu.convertToReference(input.value)));
	}
}
