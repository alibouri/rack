package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class f0 {
    public static final f0 a;
    public static final EnumType b;

    static {
        f0.a = new f0();  // initializer: Ljava/lang/Object;-><init>()V
        f0.b = new EnumType("DeviceApprovalStatus", q.L(new String[]{"PENDING", "APPROVED", "REJECTED", "DISABLED"}));
    }
}

