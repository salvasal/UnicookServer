package com.univaq.mobile.unicookserver.domain;

public enum TipologiaTempoCottura {
    tc30(30), tc60(60), tc90(90), tc120(120);

    private final int tempocottura;

    TipologiaTempoCottura(int tempocottura) {
        this.tempocottura = tempocottura;
    }

    public int getValue() {
        return tempocottura;
    }
}
