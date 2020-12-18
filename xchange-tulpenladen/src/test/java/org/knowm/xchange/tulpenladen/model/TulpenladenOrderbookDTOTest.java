package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TulpenladenOrderbookDTOTest {

    @Test
    public void unMarshall() throws IOException {

        // Read in the JSON from the example resources
        InputStream is = TulpenladenOrderbookDTO.class.getResourceAsStream("/orderbook-data.json");

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
        TulpenladenOrderbookDTO book = mapper.readValue(is, TulpenladenOrderbookDTO.class);

        // Verify that the example data was unmarshalled correctly
        assertEquals("BTCEUR", book.getPair());
        assertEquals("BTC", book.getCurA());
        assertEquals("EUR", book.getCurB());
        assertTrue(!book.isFrozen());
        assertEquals(1529672832422L, book.getTimestamp());
        assertEquals(1000, book.getSeq());
        assertEquals(1.01D, book.getAsks().get(1).getAmount(), 0.000000000000000000D);
        assertEquals(3100.0D, book.getAsks().get(1).getPrice(), 0.000000000000000000D);
        assertEquals(0.01D, book.getBids().get(1).getAmount(), 0.000000000000000000D);
        assertEquals(3100.0D, book.getBids().get(1).getPrice(), 0.000000000000000000D);
    }
}
