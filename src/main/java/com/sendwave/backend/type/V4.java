package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class v4 {
    public static final v4 a;

    static {
        v4.a = new v4();  // initializer: Ljava/lang/Object;-><init>()V
        new EnumType("SecurityQuestionFormPurpose", q.L(new String[]{"PERSISTENT", "SELF_SERVE_PIN_RECOVERY", "AUTHORIZE_NEW_DEVICE"}));
    }
}

