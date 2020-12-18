package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public final class TulpenladenQuoteDTO implements Serializable {
    private final double amount;
    private final double price;

    public TulpenladenQuoteDTO(@JsonProperty("amount") double amount, @JsonProperty("price") double price) {
        this.amount = amount;
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }
}