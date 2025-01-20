package com.google.firebase.analytics.connector.internal;

import N5.r;
import Z6.g;
import a5.w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.e0;
import com.google.firebase.components.ComponentRegistrar;
import d6.d;
import java.util.Arrays;
import java.util.List;
import m7.a;
import m7.b;
import m7.i;
import m7.k;
import u7.c;

@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    @SuppressLint({"MissingPermission"})
    @Keep
    public List getComponents() {
        a a0 = b.a(d7.b.class);
        a0.a(i.b(g.class));
        a0.a(i.b(Context.class));
        a0.a(i.b(c.class));
        a0.g = new L7.b(19);
        a0.c(2);
        return Arrays.asList(new b[]{a0.b(), w.x("fire-analytics", "22.1.2")});
    }

    public static d7.b lambda$getComponents$0(m7.c c0) {
        g g0 = (g)c0.a(g.class);
        Context context0 = (Context)c0.a(Context.class);
        c c1 = (c)c0.a(c.class);
        r.j(g0);
        r.j(context0);
        r.j(c1);
        r.j(context0.getApplicationContext());
        if(d7.c.b == null) {
            synchronized(d7.c.class) {
                if(d7.c.b == null) {
                    Bundle bundle0 = new Bundle(1);
                    g0.a();
                    if("[DEFAULT]".equals(g0.b)) {
                        ((k)c1).a(new d(1), new io.sentry.hints.i(18));
                        bundle0.putBoolean("dataCollectionDefaultEnabled", g0.h());
                    }
                    d7.c.b = new d7.c(e0.b(context0, bundle0).d);
                }
            }
        }
        return d7.c.b;
    }
}

