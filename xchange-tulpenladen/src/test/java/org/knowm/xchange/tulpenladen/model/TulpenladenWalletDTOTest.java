package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class TulpenladenWalletDTOTest {

    @Test
    public void unMarshall() throws IOException {
        // Read in the JSON from the example resources
        InputStream is = TulpenladenWalletDTO.class.getResourceAsStream("/wallets-data.json");

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        TulpenladenWalletDTO tulpen = mapper.readValue(is, TulpenladenWalletDTO.class);

        // Verify that the example data was unmarshalled correctly
        assertEquals(1000D, tulpen.getAssets().get("euro").getAvailable(), 0.000000000000000000D);
        assertEquals("Bitcoin", tulpen.getAssets().get("bitcoin").getName());
        assertEquals("ltc", tulpen.getAssets().get("litecoin").getSymbol());
        assertEquals(2D, tulpen.getAssets().get("bitcoin").getTotal(), 0.000000000000000000D);
    }
}
