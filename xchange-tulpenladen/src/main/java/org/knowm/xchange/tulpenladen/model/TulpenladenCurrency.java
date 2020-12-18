package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TulpenladenCurrency {
    private String currency;
    private String name;
    private double txFee;
    private double minAmount;
    private boolean active;

    public TulpenladenCurrency(
            @JsonProperty("currency") String currency,
            @JsonProperty("name") String name,
            @JsonProperty("txFee") double txFee,
            @JsonProperty("minAmount") double minAmount,
            @JsonProperty("active") boolean active) {
        this.currency = currency;
        this.name = name;
        this.txFee = txFee;
        this.minAmount = minAmount;
        this.active = active;
    }

    public String getCurrency() {
        return currency;
    }

    public String getName() {
        return name;
    }

    public double getTxFee() {
        return txFee;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public boolean isActive() {
        return active;
    }
}