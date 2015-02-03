package com.bdonvr.BananaConverter.units;

import com.bdonvr.BananaConverter.MeasurementUnit;

public class MeasurementUnitKelvin extends MeasurementUnit
{
	public MeasurementUnitKelvin()
	{
		super();
	}

	public MeasurementUnitKelvin(String name)
	{
		super(name);
	}

	// Given a measurement of this type, return the reference measurement
	// For example, if this unit is inches and the reference is centimeters,
	// passing in 10 inches, should return 25.4 centimeters
	// inches -> cm
	public double convertToReference(double refValue)
	{
		return (refValue - 273.15);
	}

	// Given a reference measurement, return this type reference
	// For example, if this unit is inches and the reference is centimeters,
	// passing in 25.4 centimeters, this will return 10 inches
	// cm -> inches
	public double convertFromReference(double refValue)
	{
		return (refValue + 273.15);
	}
}
