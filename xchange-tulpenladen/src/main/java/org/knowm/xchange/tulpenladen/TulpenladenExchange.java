package org.knowm.xchange.tulpenladen;

import org.knowm.xchange.BaseExchange;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.exceptions.ExchangeException;
import org.knowm.xchange.utils.nonce.AtomicLongIncrementalTime2013NonceFactory;
import si.mazi.rescu.SynchronizedValueFactory;

import java.io.IOException;
import java.util.List;

public class TulpenladenExchange extends BaseExchange implements Exchange {

    private SynchronizedValueFactory<Long> nonceFactory =
            new AtomicLongIncrementalTime2013NonceFactory();

    @Override
    protected void initServices() {
//        this.marketDataService = new TulpenladenMarketDataService(this);
//        this.accountService = new TulpenladenAccountService(this);
//        this.tradeService = new TulpenladenTradeService(this);
    }

    @Override
    public SynchronizedValueFactory<Long> getNonceFactory() {
        return nonceFactory;
    }

    @Override
    public ExchangeSpecification getDefaultExchangeSpecification() {
        ExchangeSpecification exchangeSpecification =
                new ExchangeSpecification(this.getClass().getCanonicalName());
        exchangeSpecification.setSslUri("https://api.tulpenladen.at/");
        exchangeSpecification.setHost("api.tulpenladen.at");
        exchangeSpecification.setPort(80);
        exchangeSpecification.setExchangeName("tulpenladen");
        exchangeSpecification.setExchangeDescription("Tulpenladen is a cryptocurrency and fiat exchange.");

        return exchangeSpecification;
    }

    //TODO
    @Override
    public void remoteInit() throws IOException, ExchangeException {

//        TulpenladenMarketDataServiceRaw dataService =
//            new TulpenladenMarketDataServiceRaw(this);
//        List<CurrencyPair> currencyPairs = dataService.getExchangeSymbols();
//        exchangeMetaData = TulpenladenAdapters.adaptMetaData(currencyPairs, exchangeMetaData);
//
//        final List<TulpenladenSymbolDetail> symbolDetails = dataService.getSymbolDetails();
//        exchangeMetaData = TulpenladenAdapters.adaptMetaData(exchangeMetaData, symbolDetails);
//
//        if (exchangeSpecification.getApiKey() != null && exchangeSpecification.getSecretKey() != null) {
//            // Additional remoteInit configuration for authenticated instances
//            TulpenladenAccountService accountService =
//                new TulpenladenAccountService(this);
//            final TulpenladenAccountFeesResponse accountFees = accountService.getAccountFees();
//            exchangeMetaData = TulpenladenAdapters.adaptMetaData(accountFees, exchangeMetaData);
//
//            TulpenladenTradeService tradeService =
//                new TulpenladenTradeService(this);
//            final TulpenladenAccountInfosResponse[] TulpenladenAccountInfos =
//                tradeService.getTulpenladenAccountInfos();
//
//            exchangeMetaData = TulpenladenAdapters.adaptMetaData(TulpenladenAccountInfos, exchangeMetaData);
//        }
    }
}
