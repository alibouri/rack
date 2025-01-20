package E;

import B.P;
import D0.c0;
import D0.e0;
import Nb.j;
import R2.w;
import android.os.Trace;
import com.apollographql.apollo.api.b;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s.A;

public final class g0 implements T {
    public final int a;
    public final long b;
    public final h0 c;
    public c0 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public f0 h;
    public boolean i;
    public final w j;

    public g0(w w0, int v, long v1, h0 h00) {
        this.j = w0;
        this.a = v;
        this.b = v1;
        this.c = h00;
    }

    @Override  // E.T
    public final void a() {
        this.i = true;
    }

    public final boolean b(a a0) {
        if(!this.c()) {
            return false;
        }
        Object object0 = ((G)((D)this.j.Y).b.invoke()).d(this.a);
        long v = 0L;
        h0 h00 = this.c;
        if(this.d == null) {
            long v1 = object0 == null || ((A)h00.Z).b(object0) < 0 ? h00.X : ((A)h00.Z).c(object0);
            long v2 = a0.a();
            if(this.i && v2 <= 0L || v1 < v2) {
                long v3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    this.d();
                }
                catch(Throwable throwable0) {
                    Trace.endSection();
                    throw throwable0;
                }
                Trace.endSection();
                long v4 = System.nanoTime() - v3;
                if(object0 != null) {
                    int v5 = ((A)h00.Z).b(object0);
                    long v6 = h0.a(h00, v4, (v5 < 0 ? 0L : ((A)h00.Z).c[v5]));
                    ((A)h00.Z).e(v6, object0);
                }
                h00.X = h0.a(h00, v4, h00.X);
                goto label_25;
            }
            return true;
        }
    label_25:
        if(!this.i) {
            if(!this.g) {
                if(a0.a() > 0L) {
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        c0 c00 = this.d;
                        if(c00 == null) {
                            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                        }
                        Nb.w w0 = new Nb.w();  // initializer: Ljava/lang/Object;-><init>()V
                        c00.c(new P(w0, 2));
                        List list0 = (List)w0.X;
                        this.h = list0 == null ? null : new f0(this, list0);
                        this.g = true;
                    }
                    catch(Throwable throwable1) {
                        Trace.endSection();
                        throw throwable1;
                    }
                    Trace.endSection();
                    goto label_44;
                }
                return true;
            }
        label_44:
            f0 f00 = this.h;
            if(f00 != null) {
                List[] arr_list = (List[])f00.e;
                int v7 = f00.b;
                List list1 = (List)f00.d;
                if(v7 < list1.size()) {
                    if(((g0)f00.f).f) {
                        throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while(f00.b < list1.size()) {
                        try {
                            if(arr_list[f00.b] == null) {
                                if(a0.a() <= 0L) {
                                    goto label_72;
                                }
                                int v8 = f00.b;
                                U u0 = (U)list1.get(v8);
                                S s0 = new S(u0);
                                ((Function1)u0.a).n(s0);
                                arr_list[v8] = s0.a;
                            }
                            List list2 = arr_list[f00.b];
                            j.c(list2);
                        label_62:
                            if(f00.c >= list2.size()) {
                                f00.c = 0;
                                ++f00.b;
                                continue;
                            }
                            if(!((g0)list2.get(f00.c)).b(a0)) {
                                ++f00.c;
                                goto label_62;
                            }
                        }
                        catch(Throwable throwable2) {
                            Trace.endSection();
                            throw throwable2;
                        }
                    label_72:
                        Trace.endSection();
                        return true;
                    }
                    Trace.endSection();
                }
            }
        }
        if(!this.e) {
            long v9 = this.b;
            if(!a1.a.k(v9)) {
                long v10 = object0 == null || ((A)h00.b0).b(object0) < 0 ? h00.Y : ((A)h00.b0).c(object0);
                long v11 = a0.a();
                if(this.i && v11 <= 0L || v10 < v11) {
                    long v12 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        this.e(v9);
                    }
                    catch(Throwable throwable3) {
                        Trace.endSection();
                        throw throwable3;
                    }
                    Trace.endSection();
                    long v13 = System.nanoTime() - v12;
                    if(object0 != null) {
                        A a1 = (A)h00.b0;
                        int v14 = a1.b(object0);
                        if(v14 >= 0) {
                            v = a1.c[v14];
                        }
                        long v15 = h0.a(h00, v13, v);
                        ((A)h00.b0).e(v15, object0);
                    }
                    h00.Y = h0.a(h00, v13, h00.Y);
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        if(!this.f) {
            int v = ((G)((D)this.j.Y).b.invoke()).b();
            return this.a >= 0 && this.a < v;
        }
        return false;
    }

    @Override  // E.T
    public final void cancel() {
        if(!this.f) {
            this.f = true;
            c0 c00 = this.d;
            if(c00 != null) {
                c00.a();
            }
            this.d = null;
        }
    }

    public final void d() {
        if(!this.c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if(this.d != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        G g0 = (G)((D)this.j.Y).b.invoke();
        Object object0 = g0.c(this.a);
        Object object1 = g0.d(this.a);
        Function2 function20 = ((D)this.j.Y).a(object0, this.a, object1);
        this.d = ((e0)this.j.Z).a().g(object0, function20);
    }

    public final void e(long v) {
        if(this.f) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if(this.e) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.e = true;
        c0 c00 = this.d;
        if(c00 == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int v1 = c00.b();
        for(int v2 = 0; v2 < v1; ++v2) {
            c00.d(v2, v);
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("HandleAndRequestImpl { index = ");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", constraints = ");
        stringBuilder0.append(a1.a.l(this.b));
        stringBuilder0.append(", isComposed = ");
        stringBuilder0.append(this.d != null);
        stringBuilder0.append(", isMeasured = ");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", isCanceled = ");
        return b.r(stringBuilder0, this.f, " }");
    }
}

