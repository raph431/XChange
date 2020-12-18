package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TulpenladenMarketsDTO {

    private List<TulpenladenSingleMarketDTO> markets;

    public TulpenladenMarketsDTO(@JsonProperty("markets") List<TulpenladenSingleMarketDTO> markets) {this.markets = markets;}

    public List<TulpenladenSingleMarketDTO> getMarkets() {
        return markets;
    }

    public TulpenladenSingleMarketDTO getMarket(int index) {
        return markets.get(index);
    }
}