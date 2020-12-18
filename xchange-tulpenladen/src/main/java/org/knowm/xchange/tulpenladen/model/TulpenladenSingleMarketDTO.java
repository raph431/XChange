package org.knowm.xchange.tulpenladen.model;

public class TulpenladenSingleMarketDTO {

    private String name;
    private String currencyAname;
    private String currencyBname;
    private String currencypair;
    private int priceDecimals;
    private int amountDecimals;
    private double minTradeSizeCurA;
    private double minTradeSizeCurB;
    private double fee;
    private boolean active;

    public String getName() {
        return name;
    }

    public String getCurrencyAname() {
        return currencyAname;
    }

    public String getCurrencyBname() {
        return currencyBname;
    }

    public String getCurrencypair() {
        return currencypair;
    }

    public int getPriceDecimals() {
        return priceDecimals;
    }

    public int getAmountDecimals() {
        return amountDecimals;
    }

    public double getMinTradeSizeCurA() {
        return minTradeSizeCurA;
    }

    public double getMinTradeSizeCurB() {
        return minTradeSizeCurB;
    }

    public double getFee() {
        return fee;
    }

    public boolean isActive() {
        return active;
    }
}