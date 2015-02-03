package com.bdonvr.BananaConverter;

public class MeasurementUnit
{
	protected String name;
	protected double referenceFactor;
	
	public MeasurementUnit()
	{
		this("no unit", 1.0);
	}

	public MeasurementUnit(final String name)
	{
		this(name, 1.0);
	}

	// One reference unit is how many units of this type?
	// For example, if the reference type is cm and this type is inches,
	// then the referenceFactor should be 1/2.54
	public MeasurementUnit(String name, double referenceFactor) 
	{
		this.name = name;
		this.referenceFactor = referenceFactor;
	}

	public final String getName()
	{
		return name;
	}

	public final void setName(final String name)
	{
		this.name = name;
	}
	
	
	public double getReferenceFactor()
	{
		return referenceFactor;
	}

	public void setReferenceFactor(double referenceFactor)
	{
		this.referenceFactor = referenceFactor;
	}

	// Given a measurement of this type, return the reference measurement
	// For example, if this unit is inches and the reference is centimeters,
	// passing in 10 inches, should return 25.4 centimeters
	public double convertToReference(double refValue)
	{
		return refValue / referenceFactor;
	}

	// Given a reference measurement, return this type reference
	// For example, if this unit is inches and the reference is centimeters,
	// passing in 25.4 centimeters, this will return 10 inches 
	public double convertFromReference(double refValue)
	{
		return refValue * referenceFactor;
	}
}
