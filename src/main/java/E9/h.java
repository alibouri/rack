package e9;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.TooltipTarget.CARD_RECHARGE;
import com.sendwave.backend.type.TooltipTarget.HOME_ACCOUNT_SWITCHER_PILL;
import com.sendwave.backend.type.TooltipTarget.HOME_AIRTIME;
import com.sendwave.backend.type.TooltipTarget.HOME_BANK;
import com.sendwave.backend.type.TooltipTarget.HOME_EXPAND_MORE;
import com.sendwave.backend.type.TooltipTarget.HOME_OVERDRAFT;
import com.sendwave.backend.type.TooltipTarget.HOME_PAYMENTS;
import com.sendwave.backend.type.TooltipTarget.HOME_PAYMENT_CARD;
import com.sendwave.backend.type.TooltipTarget.HOME_REWARDS;
import com.sendwave.backend.type.TooltipTarget.HOME_SAVINGS;
import com.sendwave.backend.type.TooltipTarget.HOME_SEND_P2P;
import com.sendwave.backend.type.TooltipTarget.HOME_SETTINGS;
import com.sendwave.backend.type.TooltipTarget.SEND_SCAN_QR;
import com.sendwave.backend.type.TooltipTarget.UNKNOWN__;
import com.sendwave.backend.type.TooltipTarget.VAULT_LOCK_VAULT;
import com.sendwave.backend.type.TooltipTarget;
import com.sendwave.backend.type.UserInterface.AGENT_PORTAL;
import com.sendwave.backend.type.UserInterface.API;
import com.sendwave.backend.type.UserInterface.AUTOMATIC;
import com.sendwave.backend.type.UserInterface.BUSINESS_PORTAL;
import com.sendwave.backend.type.UserInterface.CUSTOMER_APP_IOS;
import com.sendwave.backend.type.UserInterface.DISTRIBUTOR_APP;
import com.sendwave.backend.type.UserInterface.FRONTAPP;
import com.sendwave.backend.type.UserInterface.INTEGRATIONS_RECONCILIATION_PORTAL;
import com.sendwave.backend.type.UserInterface.KIOSK_NFC;
import com.sendwave.backend.type.UserInterface.KIOSK_QR;
import com.sendwave.backend.type.UserInterface.MERCHANT_QR;
import com.sendwave.backend.type.UserInterface.MERCHANT_QR_API;
import com.sendwave.backend.type.UserInterface.REBALANCE_API;
import com.sendwave.backend.type.UserInterface.SLACK_TOOL;
import com.sendwave.backend.type.UserInterface.SMARTPHONE_APP;
import com.sendwave.backend.type.UserInterface.TREASURY_APP;
import com.sendwave.backend.type.UserInterface.USSD;
import com.sendwave.backend.type.UserInterface;
import com.sendwave.backend.type.UserOverdraftChargeFrequency.DAILY;
import com.sendwave.backend.type.UserOverdraftChargeFrequency.MONTHLY;
import com.sendwave.backend.type.UserOverdraftChargeFrequency.ONLY_ONCE;
import com.sendwave.backend.type.UserOverdraftChargeFrequency.WEEKLY;
import com.sendwave.backend.type.UserOverdraftChargeFrequency;
import com.sendwave.backend.type.UserOverdraftChargeType.INTEREST;
import com.sendwave.backend.type.UserOverdraftChargeType.LATE_FEE;
import com.sendwave.backend.type.UserOverdraftChargeType.SETUP_FEE;
import com.sendwave.backend.type.UserOverdraftChargeType;
import d9.C4;
import d9.W4;

public final class h implements Adapter {
    public final int a;
    public static final h b;
    public static final h c;
    public static final h d;

    static {
        h.b = new h(1);
        h.c = new h(4);
        h.d = new h(5);
    }

    public h(int v) {
        this.a = v;
        super();
    }

    public static TooltipTarget a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        TooltipTarget.P.getClass();
        switch(s.hashCode()) {
            case 0x860867A4: {
                if(s.equals("HOME_REWARDS")) {
                    return HOME_REWARDS.X;
                }
                break;
            }
            case -1909188155: {
                if(s.equals("HOME_ACCOUNT_SWITCHER_PILL")) {
                    return HOME_ACCOUNT_SWITCHER_PILL.X;
                }
                break;
            }
            case 0x93BA74D7: {
                if(s.equals("HOME_SEND_P2P")) {
                    return HOME_SEND_P2P.X;
                }
                break;
            }
            case -1710413460: {
                if(s.equals("SEND_SCAN_QR")) {
                    return SEND_SCAN_QR.X;
                }
                break;
            }
            case 0x9BB64E8D: {
                if(s.equals("HOME_PAYMENTS")) {
                    return HOME_PAYMENTS.X;
                }
                break;
            }
            case -1630602365: {
                if(s.equals("HOME_SETTINGS")) {
                    return HOME_SETTINGS.X;
                }
                break;
            }
            case 0xA7AF9E7A: {
                if(s.equals("HOME_EXPAND_MORE")) {
                    return HOME_EXPAND_MORE.X;
                }
                break;
            }
            case -1295594035: {
                if(s.equals("HOME_OVERDRAFT")) {
                    return HOME_OVERDRAFT.X;
                }
                break;
            }
            case 0xB410BD39: {
                if(s.equals("HOME_SAVINGS")) {
                    return HOME_SAVINGS.X;
                }
                break;
            }
            case 0xC9AE0A4B: {
                if(s.equals("VAULT_LOCK_VAULT")) {
                    return VAULT_LOCK_VAULT.X;
                }
                break;
            }
            case -114909450: {
                if(s.equals("CARD_RECHARGE")) {
                    return CARD_RECHARGE.X;
                }
                break;
            }
            case 0x953E797: {
                if(s.equals("HOME_AIRTIME")) {
                    return HOME_AIRTIME.X;
                }
                break;
            }
            case 610979113: {
                if(s.equals("HOME_PAYMENT_CARD")) {
                    return HOME_PAYMENT_CARD.X;
                }
                break;
            }
            case 0x2613FD9C: {
                if(s.equals("HOME_BANK")) {
                    return HOME_BANK.X;
                }
                break;
            }
            default: {
                return new UNKNOWN__(s);
            }
        }
        return new UNKNOWN__(s);
    }

    public static UserOverdraftChargeFrequency b(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        UserOverdraftChargeFrequency.T.getClass();
        switch(s.hashCode()) {
            case 0x98627481: {
                if(s.equals("WEEKLY")) {
                    return WEEKLY.X;
                }
                break;
            }
            case -1185766604: {
                if(s.equals("ONLY_ONCE")) {
                    return ONLY_ONCE.X;
                }
                break;
            }
            case 0x3DCE5F9: {
                if(s.equals("DAILY")) {
                    return DAILY.X;
                }
                break;
            }
            case 0x74811BED: {
                if(s.equals("MONTHLY")) {
                    return MONTHLY.X;
                }
                break;
            }
            default: {
                return new com.sendwave.backend.type.UserOverdraftChargeFrequency.UNKNOWN__(s);
            }
        }
        return new com.sendwave.backend.type.UserOverdraftChargeFrequency.UNKNOWN__(s);
    }

    public static UserOverdraftChargeType c(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        UserOverdraftChargeType.U.getClass();
        switch(s.hashCode()) {
            case 0xD89E064D: {
                if(s.equals("LATE_FEE")) {
                    return LATE_FEE.X;
                }
                break;
            }
            case 0x30C0A84: {
                if(s.equals("SETUP_FEE")) {
                    return SETUP_FEE.X;
                }
                break;
            }
            case 0x50A5972A: {
                if(s.equals("INTEREST")) {
                    return INTEREST.X;
                }
                break;
            }
            default: {
                return new com.sendwave.backend.type.UserOverdraftChargeType.UNKNOWN__(s);
            }
        }
        return new com.sendwave.backend.type.UserOverdraftChargeType.UNKNOWN__(s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        switch(this.a) {
            case 0: {
                return h.a(jsonReader0, customScalarAdapters0);
            }
            case 1: {
                String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
                UserInterface.Q.getClass();
                switch(s.hashCode()) {
                    case -2077612411: {
                        if(s.equals("TREASURY_APP")) {
                            return TREASURY_APP.X;
                        }
                        break;
                    }
                    case -2004610298: {
                        if(s.equals("AGENT_PORTAL")) {
                            return AGENT_PORTAL.X;
                        }
                        break;
                    }
                    case 0xA28DFFF8: {
                        if(s.equals("MERCHANT_QR")) {
                            return MERCHANT_QR.X;
                        }
                        break;
                    }
                    case -1421250253: {
                        if(s.equals("MERCHANT_QR_API")) {
                            return MERCHANT_QR_API.X;
                        }
                        break;
                    }
                    case 0xD37791CB: {
                        if(s.equals("BUSINESS_PORTAL")) {
                            return BUSINESS_PORTAL.X;
                        }
                        break;
                    }
                    case -614067740: {
                        if(s.equals("REBALANCE_API")) {
                            return REBALANCE_API.X;
                        }
                        break;
                    }
                    case 0xDBC60A28: {
                        if(s.equals("INTEGRATIONS_RECONCILIATION_PORTAL")) {
                            return INTEGRATIONS_RECONCILIATION_PORTAL.X;
                        }
                        break;
                    }
                    case 0xE4926F58: {
                        if(s.equals("FRONTAPP")) {
                            return FRONTAPP.X;
                        }
                        break;
                    }
                    case 0xF43E1515: {
                        if(s.equals("KIOSK_NFC")) {
                            return KIOSK_NFC.X;
                        }
                        break;
                    }
                    case 0xF5EC1907: {
                        if(s.equals("SLACK_TOOL")) {
                            return SLACK_TOOL.X;
                        }
                        break;
                    }
                    case 0xFDFA: {
                        if(s.equals("API")) {
                            return API.X;
                        }
                        break;
                    }
                    case 0x27E56F: {
                        if(s.equals("USSD")) {
                            return USSD.X;
                        }
                        break;
                    }
                    case 0x9DA420B: {
                        if(s.equals("AUTOMATIC")) {
                            return AUTOMATIC.X;
                        }
                        break;
                    }
                    case 0x10230957: {
                        if(s.equals("KIOSK_QR")) {
                            return KIOSK_QR.X;
                        }
                        break;
                    }
                    case 0x19F11D89: {
                        if(s.equals("DISTRIBUTOR_APP")) {
                            return DISTRIBUTOR_APP.X;
                        }
                        break;
                    }
                    case 0x2E9CCC07: {
                        if(s.equals("SMARTPHONE_APP")) {
                            return SMARTPHONE_APP.X;
                        }
                        break;
                    }
                    case 1667021134: {
                        if(s.equals("CUSTOMER_APP_IOS")) {
                            return CUSTOMER_APP_IOS.X;
                        }
                        break;
                    }
                    default: {
                        return new com.sendwave.backend.type.UserInterface.UNKNOWN__(s);
                    }
                }
                return new com.sendwave.backend.type.UserInterface.UNKNOWN__(s);
            }
            case 2: {
                return h.b(jsonReader0, customScalarAdapters0);
            }
            case 3: {
                return h.c(jsonReader0, customScalarAdapters0);
            }
            case 4: {
                throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
            }
            default: {
                throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
            }
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        switch(this.a) {
            case 0: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((TooltipTarget)object0), "value");
                jsonWriter0.value(((TooltipTarget)object0).a());
                return;
            }
            case 1: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((UserInterface)object0), "value");
                jsonWriter0.value(((UserInterface)object0).a());
                return;
            }
            case 2: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((UserOverdraftChargeFrequency)object0), "value");
                jsonWriter0.value(((UserOverdraftChargeFrequency)object0).a());
                return;
            }
            case 3: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((UserOverdraftChargeType)object0), "value");
                jsonWriter0.value(((UserOverdraftChargeType)object0).a());
                return;
            }
            case 4: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((C4)object0), "value");
                jsonWriter0.name("frequency");
                jsonWriter0.value(((C4)object0).a.a());
                jsonWriter0.name("type");
                jsonWriter0.value(((C4)object0).b.a());
                return;
            }
            default: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((W4)object0), "value");
                jsonWriter0.name("host");
                Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((W4)object0).a);
                jsonWriter0.name("numPacketsSent");
                o.D(((W4)object0).b, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "numPacketsReceived");
                o.D(((W4)object0).c, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "percentPacketsLost");
                Adapters.DoubleAdapter.toJson(jsonWriter0, customScalarAdapters0, ((double)((W4)object0).d));
                jsonWriter0.name("rttAvg");
                Adapters.DoubleAdapter.toJson(jsonWriter0, customScalarAdapters0, ((double)((W4)object0).e));
                jsonWriter0.name("rttMin");
                Adapters.DoubleAdapter.toJson(jsonWriter0, customScalarAdapters0, ((double)((W4)object0).f));
                jsonWriter0.name("rttMax");
                Adapters.DoubleAdapter.toJson(jsonWriter0, customScalarAdapters0, ((double)((W4)object0).g));
                jsonWriter0.name("rttStddev");
                Adapters.DoubleAdapter.toJson(jsonWriter0, customScalarAdapters0, ((double)((W4)object0).h));
            }
        }
    }
}

