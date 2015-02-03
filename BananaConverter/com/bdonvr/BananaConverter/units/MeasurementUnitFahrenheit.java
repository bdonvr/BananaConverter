package com.bdonvr.BananaConverter.units;

import com.bdonvr.BananaConverter.MeasurementUnit;

public class MeasurementUnitFahrenheit extends MeasurementUnit
{
	public MeasurementUnitFahrenheit()
	{
		super();
	}

	public MeasurementUnitFahrenheit(String name)
	{
		super(name);
	}

	// Given a measurement of this type, return the reference measurement
	// For example, if this unit is inches and the reference is centimeters,
	// passing in 10 inches, should return 25.4 centimeters
	// inches -> cm
	public double convertToReference(double refValue)
	{
		return (refValue - 32.0)/1.8;
	}

	// Given a reference measurement, return this type reference
	// For example, if this unit is inches and the reference is centimeters,
	// passing in 25.4 centimeters, this will return 10 inches
	// cm -> inches
	public double convertFromReference(double refValue)
	{
		return (refValue * 1.8) + 32.0;
	}
}
