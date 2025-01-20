package a9;

import Bb.q;
import Nb.j;
import P4.c;
import Y8.o;
import Y8.t0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import g9.h;
import java.util.List;

public final class c5 implements Adapter {
    public static final c5 a;
    public static final List b;

    static {
        c5.a = new c5();  // initializer: Ljava/lang/Object;-><init>()V
        c5.b = q.L(new String[]{"termsAndConditions", "maxLimit", "usedLimit", "maxDurationDays", "chargesFormula", "setupFee", "lateFee", "interest", "availableLimitMessage", "feesMessage", "interestMessage", "optInMessage", "acceptTermsMessage", "introAudioUrl", "termsSummary"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        W4 w41;
        Integer integer1;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        W4 w40 = null;
        CurrencyAmount currencyAmount0 = null;
        CurrencyAmount currencyAmount1 = null;
        h h0 = null;
        V4 v40 = null;
        S4 s40 = null;
        R4 r40 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(c5.b)) {
                case 0: {
                    w40 = (W4)Adapters.-obj$default(f5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    integer0 = integer0;
                    continue;
                }
                case 1: {
                    integer1 = integer0;
                    w41 = w40;
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 2: {
                    integer1 = integer0;
                    w41 = w40;
                    currencyAmount1 = o.u(jsonReader0);
                    break;
                }
                case 3: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 4: {
                    h0 = t0.a(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 5: {
                    integer1 = integer0;
                    w41 = w40;
                    v40 = (V4)Adapters.-obj$default(e5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    integer1 = integer0;
                    w41 = w40;
                    s40 = (S4)Adapters.-obj$default(b5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 7: {
                    integer1 = integer0;
                    w41 = w40;
                    r40 = (R4)Adapters.-obj$default(a5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 8: {
                    s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 9: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 10: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 11: {
                    s3 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 12: {
                    s4 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 13: {
                    s5 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 14: {
                    integer1 = integer0;
                    w41 = w40;
                    list0 = Adapters.-list(Adapters.-obj$default(g5.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
            integer0 = integer1;
            w40 = w41;
        }
        if(w40 == null) {
            throw o.q(jsonReader0, "termsAndConditions");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "maxLimit");
        }
        if(currencyAmount1 == null) {
            throw o.q(jsonReader0, "usedLimit");
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "maxDurationDays");
        }
        int v = (int)integer0;
        if(h0 == null) {
            throw o.q(jsonReader0, "chargesFormula");
        }
        if(v40 == null) {
            throw o.q(jsonReader0, "setupFee");
        }
        if(s40 == null) {
            throw o.q(jsonReader0, "lateFee");
        }
        if(r40 == null) {
            throw o.q(jsonReader0, "interest");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "feesMessage");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "interestMessage");
        }
        if(s3 == null) {
            throw o.q(jsonReader0, "optInMessage");
        }
        if(s4 == null) {
            throw o.q(jsonReader0, "acceptTermsMessage");
        }
        if(s5 == null) {
            throw o.q(jsonReader0, "introAudioUrl");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "termsSummary");
        }
        return new T4(w40, currencyAmount0, currencyAmount1, v, h0, v40, s40, r40, s, s1, s2, s3, s4, s5, list0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((T4)object0), "value");
        jsonWriter0.name("termsAndConditions");
        Adapters.-obj$default(f5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).a);
        jsonWriter0.name("maxLimit");
        j.f(((T4)object0).b, "value");
        String s = ((T4)object0).b.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("usedLimit");
        j.f(((T4)object0).c, "value");
        String s1 = ((T4)object0).c.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
        jsonWriter0.name("maxDurationDays");
        o.D(((T4)object0).d, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "chargesFormula");
        j.f(((T4)object0).e, "value");
        String s2 = c.V(((T4)object0).e.Y);
        j.e(s2, "toJSONString(...)");
        jsonWriter0.value(s2);
        jsonWriter0.name("setupFee");
        Adapters.-obj$default(e5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).f);
        jsonWriter0.name("lateFee");
        Adapters.-obj$default(b5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).g);
        jsonWriter0.name("interest");
        Adapters.-obj$default(a5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).h);
        jsonWriter0.name("availableLimitMessage");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).i);
        jsonWriter0.name("feesMessage");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).j);
        jsonWriter0.name("interestMessage");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).k);
        jsonWriter0.name("optInMessage");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).l);
        jsonWriter0.name("acceptTermsMessage");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).m);
        jsonWriter0.name("introAudioUrl");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).n);
        jsonWriter0.name("termsSummary");
        Adapters.-list(Adapters.-obj$default(g5.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((T4)object0).o);
    }
}

