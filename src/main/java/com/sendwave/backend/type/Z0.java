package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class z0 {
    public static final z0 a;
    public static final EnumType b;

    static {
        z0.a = new z0();  // initializer: Ljava/lang/Object;-><init>()V
        z0.b = new EnumType("IdPhotoStatus", q.L(new String[]{"UPLOADING", "FAILED_TO_UPLOAD", "REVIEWING", "ACCEPTED", "REJECTED", "CANCELLED", "SOFT_REJECTED", "NOT_FOR_REVIEW"}));
    }
}

