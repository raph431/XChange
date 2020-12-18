package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public final class TulpenladenSymbolDTO {

    private List<TulpenladenCurrency> currencies;

    public TulpenladenSymbolDTO(@JsonProperty("currencies") List<TulpenladenCurrency> currencies) {
        this.currencies = currencies;
    }

    public List<TulpenladenCurrency> getCurrencies() {
        return currencies;
    }

    public TulpenladenCurrency getCurrency(int index) {
        return currencies.get(index);
    }
}
