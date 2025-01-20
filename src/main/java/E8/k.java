package e8;

import h8.b;
import h8.d;
import h8.f;
import h8.j;
import h8.l;
import h8.m;
import h8.n;
import io.sentry.internal.debugmeta.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import k8.a;
import q9.D;

public final class k {
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final c c;
    public final h8.c d;
    public final List e;
    public final boolean f;

    static {
        new a(Object.class);
    }

    public k() {
        Map map0 = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        List list0 = Collections.emptyList();
        super();
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        c c0 = new c(map0);
        this.c = c0;
        this.f = true;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(n.A);
        arrayList0.add(f.b);
        arrayList0.add(g8.f.Z);
        arrayList0.addAll(list0);
        arrayList0.add(n.p);
        arrayList0.add(n.g);
        arrayList0.add(n.d);
        arrayList0.add(n.e);
        arrayList0.add(n.f);
        arrayList0.add(new m(Long.TYPE, Long.class, n.k));
        Class class0 = Double.TYPE;
        h h0 = new h(0);
        arrayList0.add(new m(class0, Double.class, h0));
        Class class1 = Float.TYPE;
        h h1 = new h(1);
        arrayList0.add(new m(class1, Float.class, h1));
        arrayList0.add(n.l);
        arrayList0.add(n.h);
        arrayList0.add(n.i);
        i i0 = new i(new i(n.k, 0), 2);
        arrayList0.add(new l(AtomicLong.class, i0, 0));
        i i1 = new i(new i(n.k, 1), 2);
        arrayList0.add(new l(AtomicLongArray.class, i1, 0));
        arrayList0.add(n.j);
        arrayList0.add(n.m);
        arrayList0.add(n.q);
        arrayList0.add(n.r);
        arrayList0.add(new l(BigDecimal.class, n.n, 0));
        arrayList0.add(new l(BigInteger.class, n.o, 0));
        arrayList0.add(n.s);
        arrayList0.add(n.t);
        arrayList0.add(n.v);
        arrayList0.add(n.w);
        arrayList0.add(n.z);
        arrayList0.add(n.u);
        arrayList0.add(n.b);
        arrayList0.add(d.c);
        arrayList0.add(n.y);
        arrayList0.add(j.d);
        arrayList0.add(j.c);
        arrayList0.add(n.x);
        arrayList0.add(b.d);
        arrayList0.add(n.a);
        arrayList0.add(new h8.c(0, c0));
        arrayList0.add(new h8.c(2, c0));
        h8.c c1 = new h8.c(1, c0);
        this.d = c1;
        arrayList0.add(c1);
        arrayList0.add(n.B);
        arrayList0.add(new h8.i(c0, g8.f.Z, c1));
        this.e = Collections.unmodifiableList(arrayList0);
    }

    public static void a(double f) {
        if(Double.isNaN(f) || Double.isInfinite(f)) {
            throw new IllegalArgumentException(f + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(String s) {
        Class class0 = D.class;
        Object object0 = null;
        if(s != null) {
            l8.a a0 = new l8.a(new StringReader(s));
            boolean z = true;
            a0.Y = true;
            try {
                a0.O();
                object0 = this.c(new a(class0)).a(a0);
                goto label_25;
            }
            catch(EOFException eOFException0) {
            }
            catch(IllegalStateException illegalStateException0) {
                throw new e8.n(illegalStateException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
            catch(IOException iOException0) {
                throw new e8.n(iOException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
            catch(AssertionError assertionError0) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + assertionError0.getMessage(), assertionError0);
            }
            catch(Throwable throwable0) {
                a0.Y = false;
                throw throwable0;
            }
            goto label_14;
            try {
                object0 = this.c(new a(class0)).a(a0);
                goto label_25;
            }
            catch(EOFException eOFException0) {
            }
            catch(IllegalStateException illegalStateException0) {
                throw new e8.n(illegalStateException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
            catch(IOException iOException0) {
                throw new e8.n(iOException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
            catch(AssertionError assertionError0) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + assertionError0.getMessage(), assertionError0);
            }
            catch(Throwable throwable0) {
                a0.Y = false;
                throw throwable0;
            }
            z = false;
        label_14:
            if(!z) {
                try {
                    throw new e8.n(eOFException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
                catch(Throwable throwable0) {
                    a0.Y = false;
                    throw throwable0;
                }
            }
        label_25:
            a0.Y = false;
            if(object0 != null) {
                try {
                    if(a0.O() != 10) {
                        throw new e8.n("JSON document was not fully consumed.");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                }
                catch(l8.c c0) {
                    throw new e8.n(c0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
                catch(IOException iOException1) {
                    throw new e8.n(iOException1);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
            }
        }
        Class class1 = (Class)g8.n.a.get(class0);
        if(class1 != null) {
            class0 = class1;
        }
        return class0.cast(object0);
    }

    public final s c(a a0) {
        boolean z;
        ConcurrentHashMap concurrentHashMap0 = this.b;
        s s0 = (s)concurrentHashMap0.get(a0);
        if(s0 != null) {
            return s0;
        }
        ThreadLocal threadLocal0 = this.a;
        Map map0 = (Map)threadLocal0.get();
        if(map0 == null) {
            map0 = new HashMap();
            threadLocal0.set(map0);
            z = true;
        }
        else {
            z = false;
        }
        s s1 = (e8.j)map0.get(a0);
        if(s1 != null) {
            return s1;
        }
        try {
            e8.j j0 = new e8.j();  // initializer: Ljava/lang/Object;-><init>()V
            map0.put(a0, j0);
            for(Object object0: this.e) {
                s s2 = ((t)object0).b(this, a0);
                if(s2 != null) {
                    if(j0.a != null) {
                        throw new AssertionError();
                    }
                    j0.a = s2;
                    concurrentHashMap0.put(a0, s2);
                    return s2;
                }
                if(false) {
                    break;
                }
            }
        }
        finally {
            map0.remove(a0);
            if(z) {
                threadLocal0.remove();
            }
        }
        throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + a0);
    }

    public final String d(D d0) {
        StringWriter stringWriter0 = new StringWriter();
        try {
            l8.b b0 = new l8.b(stringWriter0);
            b0.f0 = false;
            this.e(d0, D.class, b0);
            return stringWriter0.toString();
        }
        catch(IOException iOException0) {
            throw new e8.n(iOException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
        }
    }

    public final void e(D d0, Class class0, l8.b b0) {
        s s0 = this.c(new a(class0));
        boolean z = b0.c0;
        b0.c0 = true;
        boolean z1 = b0.d0;
        b0.d0 = this.f;
        boolean z2 = b0.f0;
        b0.f0 = false;
        try {
            try {
                s0.b(b0, d0);
                b0.c0 = z;
                b0.d0 = z1;
                b0.f0 = z2;
            }
            catch(IOException iOException0) {
                throw new e8.n(iOException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
            }
            catch(AssertionError assertionError0) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + assertionError0.getMessage(), assertionError0);
            }
        }
        catch(Throwable throwable0) {
            b0.c0 = z;
            b0.d0 = z1;
            b0.f0 = z2;
            throw throwable0;
        }
    }

    @Override
    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}

