package com.sendwave.backend.type;

import Bb.q;
import com.apollographql.apollo.api.EnumType;

public final class n2 {
    public static final n2 a;
    public static final EnumType b;

    static {
        n2.a = new n2();  // initializer: Ljava/lang/Object;-><init>()V
        n2.b = new EnumType("PartnerOrg", q.L(new String[]{"BF_ORABANK", "BF_UBA", "BJ_ORABANK", "BJ_UBA", "ET_SMFI", "SN_UBA", "SN_ECOBANK", "CI_ORABANK", "CI_UBA", "CI_ECOBANK", "UG_EQUITYBANK", "ML_ORABANK", "ML_UBA", "QQ_FAKEBANK", "TG_ORABANK", "GM_MEGABANK", "NE_ORABANK", "NE_ECOBANK", "NE_BIA", "GM_ACCESSBANK", "SN_WDF", "CM_CBC", "GN_WAVE", "QQ_DUMMYEMI", "GM_WTL", "SL_WTL", "UNKNOWN__"}));
    }

    public static PartnerOrg a(String s) {
        switch(s.hashCode()) {
            case 0x87C098B4: {
                if(s.equals("ML_UBA")) {
                    return ML_UBA.X;
                }
                break;
            }
            case -1995274670: {
                if(s.equals("NE_BIA")) {
                    return NE_BIA.X;
                }
                break;
            }
            case 0x90823699: {
                if(s.equals("GM_ACCESSBANK")) {
                    return GM_ACCESSBANK.X;
                }
                break;
            }
            case 0x91FDB629: {
                if(s.equals("SL_WTL")) {
                    return SL_WTL.X;
                }
                break;
            }
            case 0x9219DB70: {
                if(s.equals("SN_UBA")) {
                    return SN_UBA.X;
                }
                break;
            }
            case 0x9219E335: {
                if(s.equals("SN_WDF")) {
                    return SN_WDF.X;
                }
                break;
            }
            case 0xA5F88B21: {
                if(s.equals("CI_ORABANK")) {
                    return CI_ORABANK.X;
                }
                break;
            }
            case 0xA6140F49: {
                if(s.equals("SN_ECOBANK")) {
                    return SN_ECOBANK.X;
                }
                break;
            }
            case 0xAA3CF2A5: {
                if(s.equals("NE_ECOBANK")) {
                    return NE_ECOBANK.X;
                }
                break;
            }
            case 0xB650302E: {
                if(s.equals("TG_ORABANK")) {
                    return TG_ORABANK.X;
                }
                break;
            }
            case 0xC6ECA650: {
                if(s.equals("QQ_FAKEBANK")) {
                    return QQ_FAKEBANK.X;
                }
                break;
            }
            case -930263833: {
                if(s.equals("GM_MEGABANK")) {
                    return GM_MEGABANK.X;
                }
                break;
            }
            case 0xD40EAB72: {
                if(s.equals("NE_ORABANK")) {
                    return NE_ORABANK.X;
                }
                break;
            }
            case 0xD6C6AA2D: {
                if(s.equals("ET_SMFI")) {
                    return ET_SMFI.X;
                }
                break;
            }
            case -362552950: {
                if(s.equals("UNKNOWN__")) {
                    return LEGACY_UNKNOWN__.X;
                }
                break;
            }
            case -308001958: {
                if(s.equals("ML_ORABANK")) {
                    return ML_ORABANK.X;
                }
                break;
            }
            case 0xF4E1CCFF: {
                if(s.equals("BF_ORABANK")) {
                    return BF_ORABANK.X;
                }
                break;
            }
            case 487317080: {
                if(s.equals("QQ_DUMMYEMI")) {
                    return QQ_DUMMYEMI.X;
                }
                break;
            }
            case 911717201: {
                if(s.equals("GN_WAVE")) {
                    return GN_WAVE.X;
                }
                break;
            }
            case 0x45F38903: {
                if(s.equals("BJ_ORABANK")) {
                    return BJ_ORABANK.X;
                }
                break;
            }
            case 1957084377: {
                if(s.equals("BF_UBA")) {
                    return BF_UBA.X;
                }
                break;
            }
            case 0x74DF1ADD: {
                if(s.equals("BJ_UBA")) {
                    return BJ_UBA.X;
                }
                break;
            }
            case 0x7685DBFB: {
                if(s.equals("CI_UBA")) {
                    return CI_UBA.X;
                }
                break;
            }
            case 0x76BDF66F: {
                if(s.equals("CM_CBC")) {
                    return CM_CBC.X;
                }
                break;
            }
            case 2082918996: {
                if(s.equals("CI_ECOBANK")) {
                    return CI_ECOBANK.X;
                }
                break;
            }
            case 2106697270: {
                if(s.equals("GM_WTL")) {
                    return GM_WTL.X;
                }
                break;
            }
            case 0x7DDE024E: {
                if(s.equals("UG_EQUITYBANK")) {
                    return UG_EQUITYBANK.X;
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

