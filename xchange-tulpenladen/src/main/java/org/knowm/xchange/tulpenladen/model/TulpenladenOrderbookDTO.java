package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public final class TulpenladenOrderbookDTO implements Serializable {

    private final String pair;
    private final String curA;
    private final String curB;
    private final boolean isFrozen;
    private final long timestamp;
    private final int seq;
    private final List<TulpenladenQuoteDTO> asks;
    private final List<TulpenladenQuoteDTO> bids;

    public TulpenladenOrderbookDTO(
            @JsonProperty("pair") String pair,
            @JsonProperty("curA") String curA,
            @JsonProperty("curB") String curB,
            @JsonProperty("isFrozen") boolean isFrozen,
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("seq") int seq,
            @JsonProperty("asks") List<TulpenladenQuoteDTO> asks,
            @JsonProperty("bids") List<TulpenladenQuoteDTO> bids) {
        this.pair = pair;
        this.curA = curA;
        this.curB = curB;
        this.isFrozen = isFrozen;
        this.timestamp = timestamp;
        this.seq = seq;
        this.asks = asks;
        this.bids = bids;
    }

    public String getPair() {
        return pair;
    }

    public String getCurA() {
        return curA;
    }

    public String getCurB() {
        return curB;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getSeq() {
        return seq;
    }

    public List<TulpenladenQuoteDTO> getAsks() {
        return asks;
    }

    public List<TulpenladenQuoteDTO> getBids() {
        return bids;
    }
}