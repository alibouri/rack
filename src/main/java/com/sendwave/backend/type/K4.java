package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class k4 {
    public static final k4 a;

    static {
        k4.a = new k4();  // initializer: Ljava/lang/Object;-><init>()V
        new EnumType("SecurityQuestionFormContent", q.L(new String[]{"KIOSK_PHOTO_ID_CHECK", "SUPPORT_IDENTITY_VERIFICATION", "USER_IDENTITY_VERIFICATION", "SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC1", "SELF_SERVE_PIN_RECOVERY_VERIFICATION_KYC2", "MAGIC_LINK", "SELF_SERVE_PIN_RECOVERY_VERIFICATION_EASIER_KYC2", "USER_USSD_VERIFICATION", "AGENT_PHOTO_ID_CHECK_KYC1", "AGENT_PHOTO_ID_CHECK_KYC2"}));
    }
}

