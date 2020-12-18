package org.knowm.xchange.tulpenladen;

import org.junit.Before;
import org.junit.Test;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.dto.account.AccountInfo;
import org.knowm.xchange.service.account.AccountService;

import java.io.IOException;

public class Tests {

    private Exchange tulpenladen;

    //TODO
    @Before
    void setup() {
        ExchangeSpecification exSpec = new TulpenladenExchange().getDefaultExchangeSpecification();
        exSpec.setUserName("34387");
        exSpec.setApiKey("a4SDmpl9s6xWJS5fkKRT6yn41vXuY0AM");
        exSpec.setSecretKey("sisJixU6Xd0d1yr6w02EHCb9UwYzTNuj");
        tulpenladen = ExchangeFactory.INSTANCE.createExchange(exSpec);

    }

    @Test
    void getAccountInformation() throws IOException {

        // Get the account information
        AccountService accountService = tulpenladen.getAccountService();
        AccountInfo accountInfo = accountService.getAccountInfo();
        System.out.println(accountInfo.toString());
    }
}
