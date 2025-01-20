package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class k5 {
    public static final k5 a;

    static {
        k5.a = new k5();  // initializer: Ljava/lang/Object;-><init>()V
        new EnumType("UserInterface", q.L(new String[]{"USSD", "SMARTPHONE_APP", "BUSINESS_PORTAL", "AGENT_PORTAL", "KIOSK_NFC", "KIOSK_QR", "FRONTAPP", "AUTOMATIC", "MERCHANT_QR", "MERCHANT_QR_API", "API", "SLACK_TOOL", "DISTRIBUTOR_APP", "INTEGRATIONS_RECONCILIATION_PORTAL", "CUSTOMER_APP_IOS", "TREASURY_APP", "REBALANCE_API"}));
    }
}

