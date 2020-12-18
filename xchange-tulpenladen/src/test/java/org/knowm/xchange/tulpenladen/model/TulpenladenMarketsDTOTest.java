package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TulpenladenMarketsDTOTest {

    @Test
    public void unMarshall() throws IOException {

        // Read in the JSON from the example resources
        InputStream is = TulpenladenMarketsDTOTest.class.getResourceAsStream("/markets-data.json");

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
        TulpenladenMarketsDTO markets = mapper.readValue(is, TulpenladenMarketsDTO.class);

        // Verify that the example data was unmarshalled correctly
        assertEquals("BitcoinLitecoin", markets.getMarket(1).getName());
        assertEquals("BTCLTC", markets.getMarket(1).getCurrencyAname());
        assertEquals("BTCLTC", markets.getMarket(1).getCurrencyBname());
        assertEquals("BTCLTC", markets.getMarket(1).getCurrencypair());
        assertEquals(8, markets.getMarket(1).getPriceDecimals());
        assertEquals(8, markets.getMarket(1).getAmountDecimals());
        assertEquals(0.0001, markets.getMarket(1).getMinTradeSizeCurA(), 0.000000000000000000D);
        assertEquals(0.001, markets.getMarket(1).getMinTradeSizeCurB(), 0.000000000000000000D);
        assertEquals(0.001, markets.getMarket(1).getFee(), 0.000000000000000000D);
        assertTrue(markets.getMarket(1).isActive());
    }
}
