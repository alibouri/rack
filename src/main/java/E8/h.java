package e8;

import com.apollographql.apollo.api.b;
import g8.i;
import g8.j;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import l8.a;

public final class h extends s {
    public final int a;

    public h(int v) {
        this.a = v;
        super();
    }

    @Override  // e8.s
    public final Object a(a a0) {
        boolean z1;
        Object object0 = null;
        switch(this.a) {
            case 0: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                return a0.nextDouble();
            }
            case 1: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                return (float)a0.nextDouble();
            }
            case 2: {
                ArrayList arrayList0 = new ArrayList();
                a0.a();
                while(a0.hasNext()) {
                    try {
                        arrayList0.add(a0.nextInt());
                    }
                    catch(NumberFormatException numberFormatException0) {
                        throw new n(numberFormatException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                    }
                }
                a0.l();
                int v = arrayList0.size();
                Object object1 = new AtomicIntegerArray(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    ((AtomicIntegerArray)object1).set(v1, ((int)(((Integer)arrayList0.get(v1)))));
                }
                return object1;
            }
            case 3: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                try {
                    return a0.nextLong();
                }
                catch(NumberFormatException numberFormatException1) {
                    throw new n(numberFormatException1);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
            }
            case 4: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                return (float)a0.nextDouble();
            }
            case 5: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                return a0.nextDouble();
            }
            case 6: {
                int v2 = a0.O();
                switch(v.h.d(v2)) {
                    case 5: 
                    case 6: {
                        return new g8.h(a0.nextString());
                    }
                    case 8: {
                        a0.G();
                        return null;
                    }
                    default: {
                        throw new n("Expecting number, got: " + b.A(v2));  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                }
            }
            case 7: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                String s = a0.nextString();
                if(s.length() != 1) {
                    throw new n("Expecting character, got: " + s);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                return Character.valueOf(s.charAt(0));
            }
            case 8: {
                int v3 = a0.O();
                if(v3 == 9) {
                    a0.G();
                    return null;
                }
                return v3 == 8 ? Boolean.toString(a0.nextBoolean()) : a0.nextString();
            }
            case 9: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                try {
                    return new BigDecimal(a0.nextString());
                }
                catch(NumberFormatException numberFormatException2) {
                    throw new n(numberFormatException2);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
            }
            case 10: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                try {
                    return new BigInteger(a0.nextString());
                }
                catch(NumberFormatException numberFormatException3) {
                    throw new n(numberFormatException3);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
            }
            case 11: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                return new StringBuilder(a0.nextString());
            }
            case 12: {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
            case 13: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                return new StringBuffer(a0.nextString());
            }
            case 14: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                String s1 = a0.nextString();
                return !"null".equals(s1) ? new URL(s1) : null;
            }
            case 15: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                try {
                    String s2 = a0.nextString();
                    return !"null".equals(s2) ? new URI(s2) : null;
                }
                catch(URISyntaxException uRISyntaxException0) {
                    throw new n(uRISyntaxException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
            }
            case 16: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                return InetAddress.getByName(a0.nextString());
            }
            case 17: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                return UUID.fromString(a0.nextString());
            }
            case 18: {
                return Currency.getInstance(a0.nextString());
            }
            case 19: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                a0.b();
                int v4 = 0;
                int v5 = 0;
                int v6 = 0;
                int v7 = 0;
                int v8 = 0;
                int v9 = 0;
                while(a0.O() != 4) {
                    String s3 = a0.nextName();
                    int v10 = a0.nextInt();
                    if("year".equals(s3)) {
                        v4 = v10;
                    }
                    else if("month".equals(s3)) {
                        v5 = v10;
                    }
                    else if("dayOfMonth".equals(s3)) {
                        v6 = v10;
                    }
                    else if("hourOfDay".equals(s3)) {
                        v7 = v10;
                    }
                    else if("minute".equals(s3)) {
                        v8 = v10;
                    }
                    else if("second".equals(s3)) {
                        v9 = v10;
                    }
                }
                a0.q();
                return new GregorianCalendar(v4, v5, v6, v7, v8, v9);
            }
            case 20: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                StringTokenizer stringTokenizer0 = new StringTokenizer(a0.nextString(), "_");
                String s4 = stringTokenizer0.hasMoreElements() ? stringTokenizer0.nextToken() : null;
                String s5 = stringTokenizer0.hasMoreElements() ? stringTokenizer0.nextToken() : null;
                if(stringTokenizer0.hasMoreElements()) {
                    object0 = stringTokenizer0.nextToken();
                }
                if(s5 == null && object0 == null) {
                    return new Locale(s4);
                }
                return object0 == null ? new Locale(s4, s5) : new Locale(s4, s5, ((String)object0));
            }
            case 21: {
                return h.c(a0);
            }
            case 22: {
                Object object2 = new BitSet();
                a0.a();
                int v11 = a0.O();
                int v12 = 0;
                while(v11 != 2) {
                    boolean z = true;
                    switch(v.h.d(v11)) {
                        case 5: {
                            String s6 = a0.nextString();
                            try {
                                if(Integer.parseInt(s6) == 0) {
                                    z = false;
                                }
                                z1 = z;
                                break;
                            }
                            catch(NumberFormatException unused_ex) {
                                throw new n("Error: Expecting: bitset number value (1, 0), Found: " + s6);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                            }
                            z = false;
                            z1 = z;
                            break;
                        }
                        case 6: {
                            if(a0.nextInt() == 0) {
                                z = false;
                            }
                            z1 = z;
                            break;
                        }
                        case 7: {
                            z1 = a0.nextBoolean();
                            break;
                        }
                        default: {
                            throw new n("Invalid bitset value type: " + b.A(v11));  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                        }
                    }
                    if(z1) {
                        ((BitSet)object2).set(v12);
                    }
                    ++v12;
                    v11 = a0.O();
                }
                a0.l();
                return object2;
            }
            case 23: {
                int v13 = a0.O();
                if(v13 == 9) {
                    a0.G();
                    return null;
                }
                return v13 == 6 ? Boolean.valueOf(Boolean.parseBoolean(a0.nextString())) : Boolean.valueOf(a0.nextBoolean());
            }
            case 24: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                return Boolean.valueOf(a0.nextString());
            }
            case 25: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                try {
                    return (byte)a0.nextInt();
                }
                catch(NumberFormatException numberFormatException4) {
                    throw new n(numberFormatException4);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
            }
            case 26: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                try {
                    return (short)a0.nextInt();
                }
                catch(NumberFormatException numberFormatException5) {
                    throw new n(numberFormatException5);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
            }
            case 27: {
                if(a0.O() == 9) {
                    a0.G();
                    return null;
                }
                try {
                    return a0.nextInt();
                }
                catch(NumberFormatException numberFormatException6) {
                    throw new n(numberFormatException6);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
            }
            case 28: {
                try {
                    return new AtomicInteger(a0.nextInt());
                }
                catch(NumberFormatException numberFormatException7) {
                    throw new n(numberFormatException7);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
            }
            default: {
                return new AtomicBoolean(a0.nextBoolean());
            }
        }
    }

    @Override  // e8.s
    public final void b(l8.b b0, Object object0) {
        switch(this.a) {
            case 0: {
                if(((Number)object0) == null) {
                    b0.z();
                    return;
                }
                k.a(((Number)object0).doubleValue());
                b0.O(((Number)object0));
                return;
            }
            case 1: {
                if(((Number)object0) == null) {
                    b0.z();
                    return;
                }
                k.a(((Number)object0).floatValue());
                b0.O(((Number)object0));
                return;
            }
            case 2: {
                b0.b();
                int v = ((AtomicIntegerArray)object0).length();
                for(int v1 = 0; v1 < v; ++v1) {
                    b0.N(((long)((AtomicIntegerArray)object0).get(v1)));
                }
                b0.l();
                return;
            }
            case 3: {
                b0.O(((Number)object0));
                return;
            }
            case 4: {
                b0.O(((Number)object0));
                return;
            }
            case 5: {
                b0.O(((Number)object0));
                return;
            }
            case 6: {
                b0.O(((Number)object0));
                return;
            }
            case 7: {
                b0.S((((Character)object0) == null ? null : String.valueOf(((Character)object0))));
                return;
            }
            case 8: {
                b0.S(((String)object0));
                return;
            }
            case 9: {
                b0.O(((BigDecimal)object0));
                return;
            }
            case 10: {
                b0.O(((BigInteger)object0));
                return;
            }
            case 11: {
                b0.S((((StringBuilder)object0) == null ? null : ((StringBuilder)object0).toString()));
                return;
            }
            case 12: {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class)object0).getName() + ". Forgot to register a type adapter?");
            }
            case 13: {
                b0.S((((StringBuffer)object0) == null ? null : ((StringBuffer)object0).toString()));
                return;
            }
            case 14: {
                b0.S((((URL)object0) == null ? null : ((URL)object0).toExternalForm()));
                return;
            }
            case 15: {
                b0.S((((URI)object0) == null ? null : ((URI)object0).toASCIIString()));
                return;
            }
            case 16: {
                b0.S((((InetAddress)object0) == null ? null : ((InetAddress)object0).getHostAddress()));
                return;
            }
            case 17: {
                b0.S((((UUID)object0) == null ? null : ((UUID)object0).toString()));
                return;
            }
            case 18: {
                b0.S(((Currency)object0).getCurrencyCode());
                return;
            }
            case 19: {
                if(((Calendar)object0) == null) {
                    b0.z();
                    return;
                }
                b0.f();
                b0.r("year");
                b0.N(((long)((Calendar)object0).get(1)));
                b0.r("month");
                b0.N(((long)((Calendar)object0).get(2)));
                b0.r("dayOfMonth");
                b0.N(((long)((Calendar)object0).get(5)));
                b0.r("hourOfDay");
                b0.N(((long)((Calendar)object0).get(11)));
                b0.r("minute");
                b0.N(((long)((Calendar)object0).get(12)));
                b0.r("second");
                b0.N(((long)((Calendar)object0).get(13)));
                b0.q();
                return;
            }
            case 20: {
                b0.S((((Locale)object0) == null ? null : ((Locale)object0).toString()));
                return;
            }
            case 21: {
                h.d(b0, ((m)object0));
                return;
            }
            case 22: {
                b0.b();
                int v2 = ((BitSet)object0).length();
                for(int v3 = 0; v3 < v2; ++v3) {
                    b0.N(((long)((BitSet)object0).get(v3)));
                }
                b0.l();
                return;
            }
            case 23: {
                if(((Boolean)object0) == null) {
                    b0.z();
                    return;
                }
                b0.V();
                b0.a();
                b0.X.write((((Boolean)object0).booleanValue() ? "true" : "false"));
                return;
            }
            case 24: {
                b0.S((((Boolean)object0) == null ? "null" : ((Boolean)object0).toString()));
                return;
            }
            case 25: {
                b0.O(((Number)object0));
                return;
            }
            case 26: {
                b0.O(((Number)object0));
                return;
            }
            case 27: {
                b0.O(((Number)object0));
                return;
            }
            case 28: {
                b0.N(((long)((AtomicInteger)object0).get()));
                return;
            }
            default: {
                b0.U(((AtomicBoolean)object0).get());
            }
        }
    }

    public static m c(a a0) {
        switch(v.h.d(a0.O())) {
            case 0: {
                m m5 = new l();
                a0.a();
                while(a0.hasNext()) {
                    m m6 = h.c(a0);
                    m5.X.add(m6);
                }
                a0.l();
                return m5;
            }
            case 2: {
                m m3 = new p();
                a0.b();
                while(a0.hasNext()) {
                    String s1 = a0.nextName();
                    m m4 = h.c(a0);
                    m3.X.put(s1, m4);
                }
                a0.q();
                return m3;
            }
            case 5: {
                String s = a0.nextString();
                m m2 = new r();  // initializer: Ljava/lang/Object;-><init>()V
                ((r)m2).e(s);
                return m2;
            }
            case 6: {
                g8.h h0 = new g8.h(a0.nextString());
                m m1 = new r();  // initializer: Ljava/lang/Object;-><init>()V
                ((r)m1).e(h0);
                return m1;
            }
            case 7: {
                Boolean boolean0 = Boolean.valueOf(a0.nextBoolean());
                m m0 = new r();  // initializer: Ljava/lang/Object;-><init>()V
                ((r)m0).e(boolean0);
                return m0;
            }
            case 8: {
                a0.G();
                return o.X;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

    public static void d(l8.b b0, m m0) {
        if(m0 != null && !(m0 instanceof o)) {
            if(m0 instanceof r) {
                Serializable serializable0 = ((r)m0).X;
                if(serializable0 instanceof Number) {
                    b0.O(((r)m0).a());
                    return;
                }
                if(serializable0 instanceof Boolean) {
                    b0.U(((Boolean)serializable0).booleanValue());
                    return;
                }
                b0.S(((r)m0).c());
                return;
            }
            if(m0 instanceof l) {
                b0.b();
                if(!(m0 instanceof l)) {
                    throw new IllegalStateException("Not a JSON Array: " + m0);
                }
                for(Object object0: ((l)m0).X) {
                    h.d(b0, ((m)object0));
                }
                b0.l();
                return;
            }
            if(!(m0 instanceof p)) {
                throw new IllegalArgumentException("Couldn\'t write " + m0.getClass());
            }
            b0.f();
            if(!(m0 instanceof p)) {
                throw new IllegalStateException("Not a JSON Object: " + m0);
            }
            Iterator iterator1 = ((j)((p)m0).X.entrySet()).iterator();
            while(((i)iterator1).hasNext()) {
                g8.k k0 = ((i)iterator1).b();
                b0.r(((String)k0.getKey()));
                h.d(b0, ((m)k0.getValue()));
            }
            b0.q();
            return;
        }
        b0.z();
    }
}

