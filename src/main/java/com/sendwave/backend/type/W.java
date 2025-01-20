package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class w {
    public static final w a;
    public static final EnumType b;

    static {
        w.a = new w();  // initializer: Ljava/lang/Object;-><init>()V
        w.b = new EnumType("AnnouncementFrequencyUnit", q.L(new String[]{"MINUTES", "HOURS", "DAYS", "WEEKS"}));
    }
}

