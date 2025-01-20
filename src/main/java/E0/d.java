package e0;

import Nb.j;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import s.E;

public final class d extends c {
    public final c o;
    public boolean p;

    public d(int v, k k0, Function1 function10, Function1 function11, c c0) {
        super(v, k0, function10, function11);
        this.o = c0;
        c0.k();
    }

    @Override  // e0.c
    public final void c() {
        if(!this.c) {
            super.c();
            if(!this.p) {
                this.p = true;
                this.o.l();
            }
        }
    }

    @Override  // e0.c
    public final q v() {
        q q0;
        c c0 = this.o;
        if(!c0.m && !c0.c) {
            E e0 = this.h;
            int v = this.b;
            HashMap hashMap0 = e0 == null ? null : m.c(c0, this, c0.e());
            Object object0 = m.b;
            __monitor_enter(object0);
            try {
                m.d(this);
                if(e0 == null || e0.d == 0) {
                    this.a();
                    goto label_19;
                }
                q0 = this.y(this.o.d(), hashMap0, this.o.e());
                if(q0.equals(i.b)) {
                    E e1 = this.o.w();
                    if(e1 == null) {
                        this.o.B(e0);
                        this.h = null;
                    }
                    else {
                        e1.i(e0);
                    }
                label_19:
                    if(this.o.d() < v) {
                        this.o.u();
                    }
                    k k0 = this.o.e().c(v).a(this.j);
                    this.o.r(k0);
                    this.o.z(v);
                    c c1 = this.o;
                    int v1 = this.d;
                    this.d = -1;
                    if(v1 >= 0) {
                        int[] arr_v = c1.k;
                        j.f(arr_v, "<this>");
                        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
                        arr_v1[arr_v.length] = v1;
                        c1.k = arr_v1;
                    }
                    else {
                        c1.getClass();
                    }
                    this.o.A(this.j);
                    c c2 = this.o;
                    int[] arr_v2 = this.k;
                    c2.getClass();
                    if(arr_v2.length != 0) {
                        int[] arr_v3 = c2.k;
                        if(arr_v3.length != 0) {
                            int[] arr_v4 = Arrays.copyOf(arr_v3, arr_v3.length + arr_v2.length);
                            System.arraycopy(arr_v2, 0, arr_v4, arr_v3.length, arr_v2.length);
                            j.c(arr_v4);
                            arr_v2 = arr_v4;
                        }
                        c2.k = arr_v2;
                    }
                    goto label_51;
                }
                goto label_57;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(object0);
            throw throwable0;
        label_51:
            __monitor_exit(object0);
            this.m = true;
            if(!this.p) {
                this.p = true;
                this.o.l();
            }
            return i.b;
        label_57:
            __monitor_exit(object0);
            return q0;
        }
        return new h();  // initializer: Ljava/lang/Object;-><init>()V
    }
}

