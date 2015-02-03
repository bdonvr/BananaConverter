package com.bdonvr.BananaConverter;

import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Measurement
{
	private String name;
	private Map<String, MeasurementUnit> units;
	private NumberFormat numFormatter;
	private int decimalPlaces;

	public Measurement()
	{
		this("");
	}

	public Measurement(String name)
	{
		this.name = name;
		this.units = new TreeMap<String, MeasurementUnit>();
		this.numFormatter = NumberFormat.getNumberInstance();
		this.decimalPlaces = 4;
	}

	public String getName()
	{
		return name;
	}

	public void setName(final String name)
	{
		this.name = name;
	}

	public int getDecimalPlaces()
	{
		return decimalPlaces;
	}

	public void setDecimalPlaces(int decimalPlaces)
	{
		this.decimalPlaces = decimalPlaces;
	}

	public MeasurementUnit findUnit(final String unitName)
	{
		return units.get(unitName);
	}

	public void addUnit(final MeasurementUnit unit)
	{
		units.put(unit.getName(), unit);
	}

	public void addUnit(final String unitName, final MeasurementUnit unit)
	{
		units.put(unitName, unit);
	}

	public Set<String> getMeasurementUnitNames()
	{
		return units.keySet();
	}

	public String formatUnitValue(double value)
	{
		return numFormatter.format(value);
	}

	public String toString(double referenceValue)
	{
		StringBuilder buf = new StringBuilder();
		Set<Map.Entry<String, MeasurementUnit>> unitsSet = units.entrySet();
		Iterator<Entry<String, MeasurementUnit>> unitsIter = unitsSet.iterator();
		this.numFormatter.setMaximumFractionDigits(this.decimalPlaces);
		
		while(unitsIter.hasNext())
		{
			Entry<String, MeasurementUnit> e = unitsIter.next();
			buf.append(e.getKey()).append("\t");
			buf.append(numFormatter.format(e.getValue().convertFromReference(referenceValue))).append("\n");
		}
		buf.append("\n");

		return buf.toString();
	}
}
