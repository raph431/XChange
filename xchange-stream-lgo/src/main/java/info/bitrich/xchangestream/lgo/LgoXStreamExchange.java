package info.bitrich.xchangestream.lgo;

import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.lgo.LgoEnv;


//TODO https://github.com/knowm/XChange/issues/3838
// using this LGO should work? Test it
public class LgoXStreamExchange extends LgoStreamingExchange {
    public LgoXStreamExchange() { }

    @Override
    public ExchangeSpecification getDefaultExchangeSpecification() {
        ExchangeSpecification env = LgoEnv.prod();

        ExchangeSpecification spec = new ExchangeSpecification(LgoXStreamExchange.class);
        //spec.setShouldLoadRemoteMetaData(false);
        spec.setExchangeName(env.getExchangeName());
        spec.setExchangeDescription(env.getExchangeDescription());
        spec.setExchangeSpecificParameters(env.getExchangeSpecificParameters());

        return spec;
    }
}