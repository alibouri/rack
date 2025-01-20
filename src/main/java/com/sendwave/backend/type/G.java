package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class g {
    public static final g a;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
        new EnumType("ActionSource", q.L(new String[]{"ANNOUNCEMENT", "CONTACT_SEARCH", "BUSINESS_SEARCH", "ENTER_DETAILS", "SCAN_QR", "SCAN_QR_SEND_SCREEN", "PAYMENT_LINK", "CHECKOUT_API", "MERCHANT_SCAN", "MERCHANT_QR_API", "B2B_PAYER_SCAN", "B2B_RECEIVER_SCAN", "RAPIDSCAN"}));
    }

    public static ActionSource a(String s) {
        switch(s.hashCode()) {
            case -1820904121: {
                if(s.equals("ANNOUNCEMENT")) {
                    return ANNOUNCEMENT.X;
                }
                break;
            }
            case -1666006237: {
                if(s.equals("SCAN_QR")) {
                    return SCAN_QR.X;
                }
                break;
            }
            case -1421250253: {
                if(s.equals("MERCHANT_QR_API")) {
                    return MERCHANT_QR_API.X;
                }
                break;
            }
            case 0xD8016F07: {
                if(s.equals("BUSINESS_SEARCH")) {
                    return BUSINESS_SEARCH.X;
                }
                break;
            }
            case 0xE1615781: {
                if(s.equals("CHECKOUT_API")) {
                    return CHECKOUT_API.X;
                }
                break;
            }
            case 0xE666FB9B: {
                if(s.equals("ENTER_DETAILS")) {
                    return ENTER_DETAILS.X;
                }
                break;
            }
            case 0xE6813959: {
                if(s.equals("RAPIDSCAN")) {
                    return RAPIDSCAN.X;
                }
                break;
            }
            case -93770348: {
                if(s.equals("B2B_PAYER_SCAN")) {
                    return B2B_PAYER_SCAN.X;
                }
                break;
            }
            case 0x814A6C7: {
                if(s.equals("CONTACT_SEARCH")) {
                    return CONTACT_SEARCH.X;
                }
                break;
            }
            case 523060064: {
                if(s.equals("B2B_RECEIVER_SCAN")) {
                    return B2B_RECEIVER_SCAN.X;
                }
                break;
            }
            case 0x370E9A94: {
                if(s.equals("MERCHANT_SCAN")) {
                    return MERCHANT_SCAN.X;
                }
                break;
            }
            case 0x6E3F62B3: {
                if(s.equals("PAYMENT_LINK")) {
                    return PAYMENT_LINK.X;
                }
                break;
            }
            case 2080400871: {
                if(s.equals("SCAN_QR_SEND_SCREEN")) {
                    return SCAN_QR_SEND_SCREEN.X;
                }
                break;
            }
            default: {
                return new UNKNOWN__(s);
            }
        }
        return new UNKNOWN__(s);
    }
}

