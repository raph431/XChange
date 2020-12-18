package org.knowm.xchange.tulpenladen.model;

import java.util.Map;

public class TulpenladenWalletDTO {

    private Map<String, TulpenladenAsset> assets;

//    public TulpenladenWalletDTO(Map<String, TulpenladenAsset> assets) {
//        this.assets = assets;
//    }

    public Map<String, TulpenladenAsset> getAssets() {
        return assets;
    }
}
