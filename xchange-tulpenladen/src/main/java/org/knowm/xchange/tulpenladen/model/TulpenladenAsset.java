package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TulpenladenAsset {

    private double available;
    private String name;
    private String symbol;
    private double total;

    public TulpenladenAsset(
            @JsonProperty("available") double available,
            @JsonProperty("name") String name,
            @JsonProperty("symbol") String symbol,
            @JsonProperty("total") double total) {
        this.available = available;
        this.name = name;
        this.symbol = symbol;
        this.total = total;
    }

    public double getAvailable() {
        return available;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getTotal() {
        return total;
    }
}