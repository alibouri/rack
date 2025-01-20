package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class b6 {
    public static final b6 a;

    static {
        b6.a = new b6();  // initializer: Ljava/lang/Object;-><init>()V
        new EnumType("WalletType", q.L(new String[]{"PERSONAL", "BUSINESS", "AGENT", "PROMO", "CREDIT", "PAYMENT_CARD", "SAVINGS", "INTEROP", "OVERDRAFT_PRINCIPAL", "OVERDRAFT_CHARGES"}));
    }

    public static WalletType a(String s) {
        switch(s.hashCode()) {
            case -1704036199: {
                if(s.equals("SAVINGS")) {
                    return SAVINGS.X;
                }
                break;
            }
            case 0x9F81379D: {
                if(s.equals("INTEROP")) {
                    return INTEROP.X;
                }
                break;
            }
            case 0xEA4AAFC0: {
                if(s.equals("BUSINESS")) {
                    return BUSINESS.X;
                }
                break;
            }
            case 0x3B54AE5: {
                if(s.equals("AGENT")) {
                    return AGENT.X;
                }
                break;
            }
            case 0x48DD0EF: {
                if(s.equals("PROMO")) {
                    return PROMO.X;
                }
                break;
            }
            case 480565116: {
                if(s.equals("OVERDRAFT_PRINCIPAL")) {
                    return OVERDRAFT_PRINCIPAL.X;
                }
                break;
            }
            case 0x32521B0D: {
                if(s.equals("OVERDRAFT_CHARGES")) {
                    return OVERDRAFT_CHARGES.X;
                }
                break;
            }
            case 0x49101640: {
                if(s.equals("PERSONAL")) {
                    return PERSONAL.X;
                }
                break;
            }
            case 1849372105: {
                if(s.equals("PAYMENT_CARD")) {
                    return PAYMENT_CARD.X;
                }
                break;
            }
            case 0x76F89EF9: {
                if(s.equals("CREDIT")) {
                    return CREDIT.X;
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

