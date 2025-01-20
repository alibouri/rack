package Y8;

import A7.b;
import Nb.j;
import P4.c;
import W4.f;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import dd.a;
import g9.g;
import g9.h;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import n0.M;
import n0.v;

public final class t0 implements Adapter {
    public final int a;
    public static final t0 b;
    public static final t0 c;
    public static final t0 d;
    public static final t0 e;

    static {
        t0.b = new t0(0);
        t0.c = new t0(1);
        t0.d = new t0(2);
        t0.e = new t0(3);
    }

    public t0(int v) {
        this.a = v;
        super();
    }

    public static h a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        Object object0;
        String s = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
        try {
            b b0 = new b(6, false);
            dd.b b1 = new dd.b();  // initializer: Ljava/lang/Object;-><init>()V
            b1.c = 0;
            b1.d = new char[0x4000];
            b1.k = new StringBuffer();
            b1.a = null;
            b0.Z = b1;
            b0.b0 = null;
            b0.Y = 0;
            StringReader stringReader0 = new StringReader(s);
            try {
                object0 = b0.o(stringReader0);
            }
            catch(IOException iOException0) {
                throw new a(-1, 2, iOException0);
            }
            f f0 = h.S(object0);
            h h0 = new h();  // initializer: Ljava/lang/Object;-><init>()V
            h0.X = f0;
            h0.Y = object0;
            return h0;
        }
        catch(a a0) {
            throw new g(a0.getMessage());  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, CurrencyAmount currencyAmount0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(currencyAmount0, "value");
        String s = currencyAmount0.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
    }

    public static void c(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, h h0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(h0, "value");
        String s = c.V(h0.Y);
        j.e(s, "toJSONString(...)");
        jsonWriter0.value(s);
    }

    public static void d(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, long v) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        int v1 = M.G(v);
        W5.f.o(16);
        jsonWriter0.value("#" + Vb.j.g0(a.a.D(16, ((long)v1) & 0xFFFFFFFFL), 8, '0'));
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        switch(this.a) {
            case 0: {
                j.f(jsonReader0, "reader");
                j.f(customScalarAdapters0, "customScalarAdapters");
                String s = jsonReader0.nextString();
                return new v(o.p(2, s, s));
            }
            case 1: {
                j.f(jsonReader0, "reader");
                j.f(customScalarAdapters0, "customScalarAdapters");
                String s1 = jsonReader0.nextString();
                j.c(s1);
                return CurrencyAmount.c(s1);
            }
            case 2: {
                j.f(jsonReader0, "reader");
                j.f(customScalarAdapters0, "customScalarAdapters");
                String s2 = jsonReader0.nextString();
                j.c(s2);
                return new BigDecimal(s2);
            }
            default: {
                return t0.a(jsonReader0, customScalarAdapters0);
            }
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        switch(this.a) {
            case 0: {
                t0.d(jsonWriter0, customScalarAdapters0, ((v)object0).a);
                return;
            }
            case 1: {
                t0.b(jsonWriter0, customScalarAdapters0, ((CurrencyAmount)object0));
                return;
            }
            case 2: {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(((BigDecimal)object0), "value");
                String s = ((BigDecimal)object0).toString();
                j.e(s, "toString(...)");
                jsonWriter0.value(s);
                return;
            }
            default: {
                t0.c(jsonWriter0, customScalarAdapters0, ((h)object0));
            }
        }
    }
}

