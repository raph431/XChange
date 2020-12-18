package org.knowm.xchange.tulpenladen.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TulpenladenTradesDTOTest {

    @Test
    public void unMarshall() throws IOException {

        // Read in the JSON from the example resources
        InputStream is = TulpenladenTradesDTOTest.class.getResourceAsStream("/trades-data.json");

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
        List<TulpenladenTradesDTO> tulpen = mapper.readValue(is, new TypeReference<ArrayList<TulpenladenTradesDTO>>() {});

        // Verify that the example data was unmarshalled correctly
        assertEquals(7266L, tulpen.get(0).getTid());
        assertEquals("BTCEUR", tulpen.get(0).getCurrPair());
        assertEquals("2018-11-03T03:23:06.000+0000", tulpen.get(0).getTimestamp());
        assertEquals("B", tulpen.get(0).getSellOrBuy());
        assertEquals(0.006118000000000005D, tulpen.get(0).getVolume(), 0.000000000000000000D);
        assertEquals(5305, tulpen.get(0).getPrice(), 0.000000000000000000D);
    }
}
