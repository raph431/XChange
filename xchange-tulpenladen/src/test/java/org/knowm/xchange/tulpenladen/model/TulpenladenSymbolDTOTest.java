package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TulpenladenSymbolDTOTest {

    @Test
    public void unMarshall() throws IOException {
        // Read in the JSON from the example resources
        InputStream is = TulpenladenSymbolDTOTest.class.getResourceAsStream("/symbols-data.json");

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        TulpenladenSymbolDTO tulpen = mapper.readValue(is, TulpenladenSymbolDTO.class);

        // Verify that the example data was unmarshalled correctly
        assertEquals("BTC", tulpen.getCurrency(1).getCurrency());
        assertEquals("Bitcoin", tulpen.getCurrency(1).getName());
        assertEquals(0.00001, tulpen.getCurrency(1).getTxFee(), 0.000000000000000000D);
        assertEquals(0.0001, tulpen.getCurrency(1).getMinAmount(), 0.000000000000000000D);
        assertTrue(tulpen.getCurrency(1).isActive());
    }
}