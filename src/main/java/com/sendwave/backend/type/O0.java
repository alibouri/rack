package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class o0 {
    public static final o0 a;
    public static final EnumType b;

    static {
        o0.a = new o0();  // initializer: Ljava/lang/Object;-><init>()V
        o0.b = new EnumType("HomescreenMenuButton", q.L(new String[]{"SEND", "BILLS", "PAYMENTS", "AIRTIME", "BANK", "REWARDS", "VAULT", "CARD", "TRANSPORT", "SPI", "LEBALMA"}));
    }
}

