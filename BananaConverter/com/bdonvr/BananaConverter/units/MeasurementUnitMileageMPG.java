package com.bdonvr.BananaConverter.units;

import com.bdonvr.BananaConverter.MeasurementUnit;

public class MeasurementUnitMileageMPG extends MeasurementUnit
{
	public MeasurementUnitMileageMPG()
	{
		this("mileage");
	}

	public MeasurementUnitMileageMPG(String name)
	{
		super(name);

		// 1 gallon = 3.7854 liters
		// 1 mile = .0000254*12*5280.0 Km
		this.referenceFactor = (.0000254*12*5280.0) / (3.7854 * 100.0);
	}

	// Given a measurement of this type, return the reference measurement
	// For example, if this unit is inches and the reference is centimeters,
	// passing in 10 inches, should return 25.4 centimeters
	// inches -> cm
	public double convertToReference(double refValue)
	{
		return 1.0/(refValue*this.referenceFactor);
	}

	// Given a reference measurement, return this type reference
	// For example, if this unit is inches and the reference is centimeters,
	// passing in 25.4 centimeters, this will return 10 inches
	// cm -> inches
	public double convertFromReference(double refValue)
	{
		return 1.0/(refValue*this.referenceFactor);
	}
}
