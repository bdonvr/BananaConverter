package com.bdonvr.BananaConverter.units;

public interface CurrencyConverter {
    public float convert(String currencyFrom, String currencyTo) throws Exception;
}