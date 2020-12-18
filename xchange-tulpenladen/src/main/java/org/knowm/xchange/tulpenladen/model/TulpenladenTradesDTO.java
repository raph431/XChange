package org.knowm.xchange.tulpenladen.model;

public final class TulpenladenTradesDTO {
    private long tid;
    private String timestamp;
    private String currPair;
    private String sellOrBuy;
    private double volume;
    private double price;

    public long getTid() {
        return tid;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getCurrPair() {
        return currPair;
    }

    public String getSellOrBuy() {
        return sellOrBuy;
    }

    public double getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }
}
