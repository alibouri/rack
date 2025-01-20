package com.google.firebase.perf.network;

import M7.e;
import O7.g;
import O7.h;
import a3.p;
import androidx.annotation.Keep;
import b4.A0;
import com.google.firebase.perf.util.Timer;
import io.sentry.config.a;
import java.io.IOException;
import pc.f;
import pc.r;
import pc.t;
import pc.y;

public class FirebasePerfOkHttpClient {
    public static void a(y y0, e e0, long v, long v1) {
        A0 a00 = y0.X;
        if(a00 == null) {
            return;
        }
        e0.o(((r)a00.b).i().toString());
        e0.g(((String)a00.c));
        a a0 = (a)a00.e;
        if(a0 != null) {
            long v2 = a0.B();
            if(v2 != -1L) {
                e0.j(v2);
            }
        }
        p p0 = y0.e0;
        if(p0 != null) {
            long v3 = p0.a();
            if(v3 != -1L) {
                e0.m(v3);
            }
            t t0 = p0.b();
            if(t0 != null) {
                e0.l(t0.a);
            }
        }
        e0.h(y0.b0);
        e0.k(v);
        e0.n(v1);
        e0.c();
    }

    @Keep
    public static void enqueue(pc.e e0, f f0) {
        Timer timer0 = new Timer();
        e0.l(new g(f0, R7.f.q0, timer0, timer0.X));
    }

    @Keep
    public static y execute(pc.e e0) {
        e e1 = new e(R7.f.q0);
        Timer timer0 = new Timer();
        long v = timer0.X;
        try {
            y y0 = e0.a();
            FirebasePerfOkHttpClient.a(y0, e1, v, timer0.b());
            return y0;
        }
        catch(IOException iOException0) {
            A0 a00 = e0.r();
            if(a00 != null) {
                r r0 = (r)a00.b;
                if(r0 != null) {
                    e1.o(r0.i().toString());
                }
                String s = (String)a00.c;
                if(s != null) {
                    e1.g(s);
                }
            }
            e1.k(v);
            e1.n(timer0.b());
            h.c(e1);
            throw iOException0;
        }
    }
}

