package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class b2 {
    public static final b2 a;
    public static final EnumType b;

    static {
        b2.a = new b2();  // initializer: Ljava/lang/Object;-><init>()V
        b2.b = new EnumType("LockUnlockState", q.L(new String[]{"LOCKED", "UNLOCKED"}));
    }
}

