package R2;

import Bb.F;
import Bb.p;
import D0.a0;
import E7.C;
import I2.v;
import I2.x;
import L1.h;
import L7.b;
import Ma.t;
import N5.r;
import N6.c;
import Nb.j;
import R1.g;
import R1.k;
import R9.v2;
import R9.w2;
import R9.x1;
import S0.a;
import T0.B;
import T0.i;
import U.N0;
import V0.d;
import W4.f;
import X1.n;
import X1.u;
import Xb.I0;
import Xb.J;
import Xb.Q;
import Y8.G6;
import Y8.L9;
import Y8.O;
import Y8.R6;
import Y8.S6;
import Y8.W;
import Y8.k5;
import Y8.l5;
import Y8.m5;
import Y8.n5;
import Y8.p5;
import Y8.q5;
import Y8.y6;
import Y8.y7;
import a9.f9;
import ac.B0;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.impl.WorkDatabase_Impl;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.apollographql.apollo.api.Optional;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.sendwave.backend.type.WalletType.PAYMENT_CARD;
import com.sendwave.util.Country;
import com.wave.customer.transactions.persistence.TransactionHistoryDatabase;
import io.sentry.g1;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.json.JSONArray;
import org.json.JSONException;
import q9.m;
import r8.e;
import v1.o;
import v1.q;

public class w implements h, c, d, InstallReferrerStateListener, o6.c {
    public final int X;
    public Object Y;
    public Object Z;
    public Object b0;

    public w(char c, int v) {
        this.X = v;
        super();
    }

    public w(int v) {
        this.X = 16;
        super();
        this.Y = new String[v][];
        this.Z = new int[v][];
        this.b0 = new int[v][];
    }

    public w(int v, byte b) {
        this.X = v;
        switch(v) {
            case 20: {
                super();
                this.Y = new AtomicReference(c0.c.b);
                this.Z = new Object();
                return;
            }
            case 22: {
                super();
                this.b0 = new b(12);
                return;
            }
            case 25: {
                super();
                this.Y = new WeakHashMap();
                this.Z = new WeakHashMap();
                this.b0 = new WeakHashMap();
                return;
            }
            default: {
                super();
                this.Y = new S0.b();
                S0.c c0 = new S0.c();  // initializer: Ljava/lang/Object;-><init>()V
                c0.a = a.a;
                c0.b = a.b;
                c0.c = 0;
                this.Z = c0;
                this.b0 = new b(12);
            }
        }
    }

    public w(G3.b b0, C c0) {
        this.X = 9;
        super();
        this.Y = b0.a;
        this.Z = b0.b;
        this.b0 = b0.c;
    }

    public w(g g0, int v, ReferenceQueue referenceQueue0) {
        this.X = 17;
        j.f(referenceQueue0, "referenceQueue");
        super();
        this.b0 = new k(g0, v, this, referenceQueue0);
    }

    public w(R2.h h0, v7.d d0, X1.d d1, Set set0) {
        this.X = 27;
        super();
        this.Y = d0;
        this.Z = h0;
        this.b0 = d1;
        if(!set0.isEmpty()) {
            for(Object object0: set0) {
                String s = new String(((int[])object0), 0, ((int[])object0).length);
                this.A(s, 0, s.length(), 1, true, new N6.k(s, 1));
            }
        }
    }

    public w(x1 x10, B0 b00) {
        this.X = 29;
        super();
        this.Y = x10;
        this.Z = b00;
        this.b0 = new I2.k(2);
    }

    public w(N0 n00, w w0) {
        this.X = 24;
        super();
        this.Y = n00;
        this.Z = w0;
        this.b0 = n00.getValue();
    }

    public w(R6 r60, TransactionHistoryDatabase transactionHistoryDatabase0, Country country0, m m0) {
        this.X = 15;
        j.f(r60, "repo");
        super();
        this.Y = r60;
        this.Z = transactionHistoryDatabase0;
        this.b0 = country0;
    }

    public w(View view0) {
        this.X = 21;
        super();
        this.Y = view0;
        this.Z = f.z(new a0(29, this));
        this.b0 = new I5.h(view0);
    }

    public w(LayoutNode layoutNode0) {
        this.X = 7;
        super();
        this.Y = layoutNode0;
        this.Z = new ArrayList();
        this.b0 = layoutNode0;
    }

    public w(WorkDatabase_Impl workDatabase_Impl0) {
        this.X = 0;
        super();
        this.Y = workDatabase_Impl0;
        this.Z = new R2.b(workDatabase_Impl0, 6);
        this.b0 = new Ma.m(workDatabase_Impl0, 22);
    }

    public w(zzbu zzbu0) {
        this.X = 5;
        E5.k k0 = zzbu0.zzd();
        S5.a a0 = zzbu0.zzr();
        super();
        r.j(k0);
        this.Z = new ArrayList();
        this.Y = new g1(this, a0);
        this.b0 = zzbu0;
    }

    public w(FirebaseMessagingService firebaseMessagingService0, B3.c c0, ExecutorService executorService0) {
        this.X = 6;
        super();
        this.Y = executorService0;
        this.Z = firebaseMessagingService0;
        this.b0 = c0;
    }

    public w(Object object0, Object object1, Object object2, int v) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        this.b0 = object2;
        super();
    }

    public w(String s) {
        this.X = 26;
        super();
        io.sentry.internal.debugmeta.c c0 = new io.sentry.internal.debugmeta.c(7, false);
        this.Z = c0;
        this.b0 = c0;
        this.Y = s;
    }

    public w(Signature signature0) {
        this.X = 2;
        super();
        this.Y = signature0;
        this.Z = null;
        this.b0 = null;
    }

    public w(Cipher cipher0) {
        this.X = 2;
        super();
        this.Z = cipher0;
        this.Y = null;
        this.b0 = null;
    }

    public w(Mac mac0) {
        this.X = 2;
        super();
        this.b0 = mac0;
        this.Z = null;
        this.Y = null;
    }

    public w(x8.a a0) {
        this.X = 11;
        super();
        B8.c c0 = new B8.c(2);
        c0.b = 0;
        c0.c = 1;
        this.Z = c0;
        this.b0 = new StringBuilder();
        this.Y = a0;
    }

    public w(x8.b b0) {
        this.X = 3;
        super();
        int v = b0.Y;
        if(v < 8 || v > 0x90 || (v & 1) != 0) {
            throw e.a();
        }
        int v1 = b0.X;
        if((v1 & 1) != 0) {
            throw e.a();
        }
        B8.d[] arr_d = B8.d.h;
        for(int v2 = 0; v2 < 30; ++v2) {
            B8.d d0 = arr_d[v2];
            int v3 = d0.b;
            if(v3 == v) {
                int v4 = d0.c;
                if(v4 == v1) {
                    this.b0 = d0;
                    if(v != v3) {
                        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                    }
                    int v5 = d0.d;
                    int v6 = v3 / v5;
                    int v7 = d0.e;
                    int v8 = v4 / v7;
                    x8.b b1 = new x8.b(v8 * v7, v6 * v5);
                    for(int v9 = 0; v9 < v6; ++v9) {
                        for(int v10 = 0; v10 < v8; ++v10) {
                            for(int v11 = 0; v11 < v5; ++v11) {
                                for(int v12 = 0; v12 < v7; ++v12) {
                                    if(b0.c((v7 + 2) * v10 + 1 + v12, (v5 + 2) * v9 + 1 + v11)) {
                                        b1.g(v10 * v7 + v12, v9 * v5 + v11);
                                    }
                                }
                            }
                        }
                    }
                    this.Y = b1;
                    this.Z = new x8.b(b1.X, b1.Y);
                    return;
                }
            }
        }
        throw e.a();
    }

    // This method was un-flattened
    public Object A(CharSequence charSequence0, int v, int v1, int v2, boolean z, n n0) {
        int v6;
        S0.b b0 = new S0.b(((X1.r)((R2.h)this.Z).c));
        int v3 = Character.codePointAt(charSequence0, v);
        boolean z1 = true;
        int v4 = 0;
        int v5 = v;
        while(true) {
            v6 = v5;
        label_6:
            if(v5 >= v1 || v4 >= v2 || !z1) {
                break;
            }
            SparseArray sparseArray0 = ((X1.r)b0.f).a;
            X1.r r0 = sparseArray0 == null ? null : ((X1.r)sparseArray0.get(v3));
            if(b0.b == 2) {
            label_17:
                if(r0 != null) {
                    b0.f = r0;
                    ++b0.d;
                    goto label_49;
                }
                else if(v3 == 0xFE0E) {
                    b0.d();
                }
                else if(v3 == 0xFE0F) {
                    goto label_49;
                }
                else {
                    X1.r r1 = (X1.r)b0.f;
                    if(r1.b == null) {
                    label_43:
                        b0.d();
                    }
                    else {
                        if(b0.d == 1) {
                            if(b0.e()) {
                                b0.g = (X1.r)b0.f;
                                b0.d();
                                goto label_36;
                            }
                            else {
                                b0.d();
                                goto label_44;
                            }
                            goto label_34;
                        }
                        else {
                        label_34:
                            b0.g = r1;
                            b0.d();
                        }
                    label_36:
                        b0.c = v3;
                        if(!z && this.v(charSequence0, v6, v5, ((X1.r)b0.g).b)) {
                            v6 = v5;
                            goto label_6;
                        }
                        else {
                            z1 = n0.d(charSequence0, v6, v5, ((X1.r)b0.g).b);
                            ++v4;
                            continue;
                        }
                        goto label_43;
                    }
                }
            }
            else {
                if(r0 == null) {
                    b0.d();
                    goto label_44;
                }
                else {
                    b0.b = 2;
                    b0.f = r0;
                    b0.d = 1;
                    goto label_49;
                }
                goto label_17;
            }
        label_44:
            b0.c = v3;
            v5 = Character.charCount(Character.codePointAt(charSequence0, v6)) + v6;
            if(v5 >= v1) {
                continue;
            }
            v3 = Character.codePointAt(charSequence0, v5);
            continue;
        label_49:
            b0.c = v3;
            int v7 = Character.charCount(v3) + v5;
            if(v7 < v1) {
                v3 = Character.codePointAt(charSequence0, v7);
            }
            v5 = v7;
            goto label_6;
        }
        if(b0.b == 2 && ((X1.r)b0.f).b != null && (b0.d > 1 || b0.e()) && v4 < v2 && z1 && (z || !this.v(charSequence0, v6, v5, ((X1.r)b0.f).b))) {
            n0.d(charSequence0, v6, v5, ((X1.r)b0.f).b);
        }
        return n0.a();
    }

    public static void B(w w0, B b0, T0.b b1, Object object0) {
        w0.getClass();
        b1.getClass();
        i i0 = new i(b0);
        synchronized(((b)w0.b0)) {
            if(object0 == null) {
                T0.h h0 = (T0.h)((S0.c)w0.Z).d(i0, new T0.h(null));
            }
            else {
                T0.h h1 = (T0.h)((S0.b)w0.Y).b(i0, new T0.h(object0));
            }
        }
    }

    public boolean C(int v, int v1, int v2, int v3) {
        if(v < 0) {
            v += v2;
            v1 += 4 - (v2 + 4 & 7);
        }
        if(v1 < 0) {
            v1 += v3;
            v += 4 - (v3 + 4 & 7);
        }
        ((x8.b)this.Z).g(v1, v);
        return ((x8.b)this.Y).c(v1, v);
    }

    public int D(int v, int v1, int v2, int v3) {
        int v4 = this.C(v - 2, v1 - 2, v2, v3) << 1;
        if(this.C(v - 2, v1 - 1, v2, v3)) {
            v4 |= 1;
        }
        int v5 = this.C(v - 1, v1 - 2, v2, v3) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.C(v - 1, v1 - 1, v2, v3) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.C(v - 1, v1, v2, v3) ? v6 << 1 | 1 : v6 << 1;
        int v8 = this.C(v, v1 - 2, v2, v3) ? v7 << 1 | 1 : v7 << 1;
        int v9 = this.C(v, v1 - 1, v2, v3) ? v8 << 1 | 1 : v8 << 1;
        return this.C(v, v1, v2, v3) ? v9 << 1 | 1 : v9 << 1;
    }

    public Object E(B b0, T0.b b1, t t0, Fb.c c0) {
        i i1;
        w w0;
        T0.h h0;
        T0.j j0;
        if(c0 instanceof T0.j) {
            j0 = (T0.j)c0;
            int v = j0.f0;
            if((v & 0x80000000) == 0) {
                j0 = new T0.j(this, c0);
            }
            else {
                j0.f0 = v ^ 0x80000000;
            }
        }
        else {
            j0 = new T0.j(this, c0);
        }
        Object object0 = j0.d0;
        Object object1 = Eb.a.X;
        switch(j0.f0) {
            case 0: {
                W5.f.b0(object0);
                b1.getClass();
                i i0 = new i(b0);
                synchronized(((b)this.b0)) {
                    h0 = (T0.h)((S0.b)this.Y).a(i0);
                    if(h0 == null) {
                        h0 = (T0.h)((S0.c)this.Z).a(i0);
                    }
                }
                if(h0 != null) {
                    return h0.a;
                }
                j0.b0 = this;
                j0.c0 = i0;
                j0.f0 = 1;
                Object object2 = t0.n(j0);
                if(object2 == object1) {
                    return object1;
                }
                w0 = this;
                object0 = object2;
                i1 = i0;
                break;
            }
            case 1: {
                i1 = j0.c0;
                w0 = j0.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        synchronized(((b)w0.b0)) {
            if(object0 == null) {
                ((S0.c)w0.Z).d(i1, new T0.h(null));
            }
            else {
                ((S0.b)w0.Y).b(i1, new T0.h(object0));
            }
            return object0;
        }
    }

    public void F(Object object0) {
        long v = Thread.currentThread().getId();
        if(v == U.b.a) {
            this.b0 = object0;
            return;
        }
        synchronized(this.Z) {
            c0.g g0 = (c0.g)((AtomicReference)this.Y).get();
            int v2 = g0.a(v);
            if(v2 < 0) {
                ((AtomicReference)this.Y).set(g0.b(v, object0));
                return;
            }
            g0.c[v2] = object0;
        }
    }

    public void G(int v, int[] arr_v, String[] arr_s, int[] arr_v1) {
        ((String[][])this.Y)[v] = arr_s;
        ((int[][])this.Z)[v] = arr_v;
        ((int[][])this.b0)[v] = arr_v1;
    }

    public void H(LifecycleOwner lifecycleOwner0) {
        WeakReference weakReference0 = (WeakReference)this.Y;
        if((weakReference0 == null ? null : ((LifecycleOwner)weakReference0.get())) == lifecycleOwner0) {
            return;
        }
        I0 i00 = (I0)this.Z;
        if(i00 != null) {
            i00.f(null);
        }
        if(lifecycleOwner0 == null) {
            this.Y = null;
            return;
        }
        this.Y = new WeakReference(lifecycleOwner0);
        ac.h h0 = ((k)this.b0).c;
        if(h0 != null) {
            I0 i01 = (I0)this.Z;
            if(i01 != null) {
                i01.f(null);
            }
            this.Z = J.q(LifecycleOwnerKt.a(lifecycleOwner0), null, null, new R1.i(lifecycleOwner0, h0, this, null), 3);
        }
    }

    // This method was un-flattened
    public Object I(Fb.c c0) {
        y6 y60;
        String s4;
        f9 f91;
        List list0;
        f9 f90;
        String s2;
        w w2;
        String s1;
        String s;
        w w0;
        Pa.e e0;
        if(c0 instanceof Pa.e) {
            e0 = (Pa.e)c0;
            int v = e0.g0;
            if((v & 0x80000000) == 0) {
                e0 = new Pa.e(this, c0);
            }
            else {
                e0.g0 = v ^ 0x80000000;
            }
        }
        else {
            e0 = new Pa.e(this, c0);
        }
        Object object0 = e0.e0;
        Object object1 = Eb.a.X;
        switch(e0.g0) {
            case 0: {
                W5.f.b0(object0);
                try {
                    e0.b0 = this;
                    e0.g0 = 1;
                    object0 = J2.w.z(((R6)this.Y), e0);
                    if(object0 == object1) {
                        return object1;
                    }
                    w0 = this;
                    s = ((L9)object0) == null ? null : ((L9)object0).b.getId();
                    goto label_32;
                label_21:
                    w0 = e0.b0;
                    W5.f.b0(object0);
                    s = ((L9)object0) == null ? null : ((L9)object0).b.getId();
                    goto label_32;
                }
                catch(O o0) {
                    return o0 instanceof W ? new v(M6.b.C(o0)) : new I2.w();  // initializer: Ljava/lang/Object;-><init>()V
                }
            }
            case 1: {
                goto label_21;
            label_32:
                if(s == null) {
                    return new x();
                }
                Ma.w w1 = ((TransactionHistoryDatabase)w0.Z).s();
                e0.b0 = w0;
                e0.g0 = 2;
                object0 = w1.f(s, false, e0);
                if(object0 == object1) {
                    return object1;
                }
                s1 = (String)object0;
                goto label_45;
            }
            case 2: {
                w0 = e0.b0;
                W5.f.b0(object0);
                s1 = (String)object0;
                try {
                label_45:
                    e0.b0 = w0;
                    e0.c0 = s1;
                    e0.g0 = 3;
                    Object object2 = J2.w.B(((R6)w0.Y), e0);
                    if(object2 == object1) {
                        return object1;
                    }
                    w2 = w0;
                    s2 = s1;
                    f90 = (f9)object2;
                    goto label_64;
                }
                catch(O o1) {
                    return new v(M6.b.C(o1));
                }
            }
            case 3: {
                String s3 = (String)e0.c0;
                w w3 = e0.b0;
                try {
                    W5.f.b0(object0);
                    w2 = w3;
                    s2 = s3;
                    f90 = (f9)object0;
                }
                catch(O o1) {
                    return new v(M6.b.C(o1));
                }
            label_64:
                e0.b0 = w2;
                e0.c0 = s2;
                e0.d0 = f90;
                e0.g0 = 4;
                if(Q.b(100L, e0) != object1) {
                    goto label_93;
                }
                return object1;
            }
            case 4: {
                f90 = (f9)e0.d0;
                s2 = (String)e0.c0;
                w2 = e0.b0;
                W5.f.b0(object0);
                goto label_93;
            }
            case 5: {
                f90 = (f9)e0.c0;
                w w4 = e0.b0;
                try {
                    W5.f.b0(object0);
                    w2 = w4;
                    goto label_102;
                }
                catch(O o2) {
                    return new v(M6.b.C(o2));
                }
            }
            case 6: {
                list0 = (List)e0.d0;
                f91 = (f9)e0.c0;
                w2 = e0.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(list0 == null) {
                s4 = null;
            }
            else {
                l5 l50 = (l5)p.x0(list0);
                if(l50 != null) {
                    s4 = l50.a;
                }
            }
            if(list0 == null || list0.isEmpty()) {
                break;
            }
            s2 = s4;
            f90 = f91;
        label_93:
            Optional optional0 = Optional.Companion.presentIfNotNull(s2);
            q5 q50 = new q5(S6.a(new Integer(f90.b)), optional0);
            try {
                e0.b0 = w2;
                e0.c0 = f90;
                e0.d0 = null;
                e0.g0 = 5;
                object0 = R6.d(((R6)w2.Y), q50, null, G6.Z, e0, 2);
                if(object0 == object1) {
                    return object1;
                }
            label_102:
                f91 = f90;
                y60 = (y6)object0;
            }
            catch(O o2) {
                return new v(M6.b.C(o2));
            }
            n5 n50 = ((k5)y60.b).a;
            if(n50 == null) {
                list0 = null;
            }
            else {
                p5 p50 = n50.b;
                if(p50 != null) {
                    m5 m50 = p50.c;
                    if(m50 != null) {
                        list0 = m50.a;
                    }
                }
            }
            if(list0 == null) {
                continue;
            }
            Country country0 = (Country)w2.b0;
            ArrayList arrayList0 = new ArrayList(Bb.r.b0(list0));
            for(Object object3: list0) {
                arrayList0.add(Ma.d.b(((l5)object3).b.b, ((l5)object3).a, country0, PAYMENT_CARD.X));
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object4: list0) {
                ArrayList arrayList2 = Ma.d.c(((l5)object4).b.b.getId(), ((l5)object4).b.b.m);
                if(arrayList2 != null) {
                    arrayList1.add(arrayList2);
                }
            }
            ArrayList arrayList3 = Bb.r.c0(arrayList1);
            Ma.w w5 = ((TransactionHistoryDatabase)w2.Z).s();
            e0.b0 = w2;
            e0.c0 = f91;
            e0.d0 = list0;
            e0.g0 = 6;
            if(w5.g(arrayList0, arrayList3, e0) != object1) {
                continue;
            }
            return object1;
        }
        return new x();
    }

    public void J() {
        ArrayList arrayList0 = (ArrayList)this.Z;
        if(!arrayList0.isEmpty()) {
            this.b0 = arrayList0.remove(arrayList0.size() - 1);
            return;
        }
        U.d.N("empty stack");
        throw null;
    }

    public void K(LinkedHashMap linkedHashMap0) {
        LinkedHashMap linkedHashMap1 = F.a0(((Map)this.b0));
        for(Object object0: linkedHashMap0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Map map0 = (Map)((Map.Entry)object0).getValue();
            switch(s) {
                case "$clearAll": {
                    linkedHashMap1.clear();
                    continue;
                }
                case "$set": {
                    linkedHashMap1.putAll(map0);
                    continue;
                }
                case "$unset": {
                    for(Object object1: map0.entrySet()) {
                        linkedHashMap1.remove(((Map.Entry)object1).getKey());
                    }
                }
            }
        }
        this.b0 = linkedHashMap1;
    }

    @Override  // L1.h
    public ClipDescription a() {
        return (ClipDescription)this.Z;
    }

    @Override  // com.android.installreferrer.api.InstallReferrerStateListener
    public void b(int v) {
        ReferrerDetails referrerDetails0;
        if(v == 0) {
            try {
                referrerDetails0 = ((K3.b)this.Y).b();
            }
            catch(RemoteException unused_ex) {
                return;
            }
            Context context0 = (Context)this.Z;
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("Sent", 0);
            j.e(sharedPreferences0, "getSharedPreferences(...)");
            j.f(w2.a, "key");
            if(!sharedPreferences0.getBoolean(w2.a.a, w2.a.b)) {
                String s = referrerDetails0.a.getString("install_referrer");
                j.e(s, "getInstallReferrer(...)");
                Date date0 = new Date(referrerDetails0.a.getLong("install_begin_timestamp_seconds") * 1000L);
                y7 y70 = new y7(s, new Date(referrerDetails0.a.getLong("install_begin_timestamp_seconds") * 1000L), date0);
                mb.a.a(null, null, new v2(((R6)this.b0), y70, context0, null), 3);
                String s1 = referrerDetails0.a.getString("install_referrer");
                j.e(s1, "getInstallReferrer(...)");
                Intent intent0 = new Intent("com.android.vending.INSTALL_REFERRER");
                intent0.putExtra("referrer", s1);
                new CampaignTrackingReceiver().onReceive(context0, intent0);
            }
        }
        else {
            hd.c.a.n("InstallReferrerClient");
            hd.c.a.d("Referrer setup failed with responseCode=" + v, new Object[0]);
        }
    }

    @Override  // V0.d
    public V0.c c() {
        V0.c c1;
        V0.c c0;
        LocaleList localeList0 = LocaleList.getDefault();
        b b0 = (b)this.b0;
        __monitor_enter(b0);
        try {
            c0 = (V0.c)this.Z;
            if(c0 == null || localeList0 != ((LocaleList)this.Y)) {
                int v = localeList0.size();
                ArrayList arrayList0 = new ArrayList(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    arrayList0.add(new V0.b(localeList0.get(v1)));
                }
                c1 = new V0.c(arrayList0);
                this.Y = localeList0;
                this.Z = c1;
                goto label_19;
            }
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(b0);
        throw throwable0;
    label_19:
        __monitor_exit(b0);
        return c1;
    label_21:
        __monitor_exit(b0);
        return c0;
    }

    @Override  // L1.h
    public Object d() {
        return null;
    }

    @Override  // L1.h
    public Uri e() {
        return (Uri)this.Y;
    }

    @Override  // com.android.installreferrer.api.InstallReferrerStateListener
    public void f() {
        hd.c.a.n("InstallReferrerClient");
        hd.c.a.d("Referrer service disconnected", new Object[0]);
    }

    @Override  // L1.h
    public void g() {
    }

    @Override  // L1.h
    public Uri h() {
        return (Uri)this.b0;
    }

    @Override  // V0.d
    public Locale i(String s) {
        Locale locale0 = Locale.forLanguageTag(s);
        if(j.a(locale0.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + s + " is not well-formed. Locale is resolved to Undetermined. Note that underscore \'_\' is not a valid subtag delimiter and must be replaced with \'-\'.");
        }
        return locale0;
    }

    public void j() {
        ((ArrayList)this.Z).clear();
        this.b0 = (LayoutNode)this.Y;
        ((LayoutNode)this.Y).N();
    }

    public String k(int v, StringBuilder stringBuilder0) {
        for(String s = null; true; s = s2) {
            J8.h h0 = this.l(v, s);
            String s1 = J8.k.a(h0.b);
            if(s1 != null) {
                stringBuilder0.append(s1);
            }
            String s2 = h0.d ? String.valueOf(h0.c) : null;
            int v1 = h0.a;
            if(v == v1) {
                break;
            }
            v = v1;
        }
        return stringBuilder0.toString();
    }

    public J8.h l(int v, String s) {
        int v43;
        F1.c c4;
        J8.i i0;
        boolean z1;
        F1.c c3;
        J8.g g3;
        int v23;
        J8.g g2;
        F1.c c2;
        boolean z;
        F1.c c1;
        J8.g g1;
        int v9;
        J8.g g0;
        StringBuilder stringBuilder0 = (StringBuilder)this.b0;
        stringBuilder0.setLength(0);
        if(s != null) {
            stringBuilder0.append(s);
        }
        B8.c c0 = (B8.c)this.Z;
        c0.b = v;
        do {
            int v1 = c0.b;
            int v2 = c0.c;
            x8.a a0 = (x8.a)this.Y;
            if(v2 == 2) {
                while(true) {
                    int v3 = c0.b;
                    if(v3 + 5 <= a0.Y) {
                        int v4 = w.o(v3, 5, a0);
                        if(v4 >= 5 && v4 < 16) {
                        label_17:
                            int v6 = c0.b;
                            int v7 = w.o(v6, 5, a0);
                            if(v7 == 15) {
                                g0 = new J8.g('$', v6 + 5);
                            }
                            else {
                                if(v7 < 5 || v7 >= 15) {
                                    int v8 = w.o(v6, 6, a0);
                                    if(v8 < 0x20 || v8 >= 58) {
                                        switch(v8) {
                                            case 58: {
                                                v9 = 42;
                                                break;
                                            }
                                            case 59: {
                                                v9 = 44;
                                                break;
                                            }
                                            case 60: {
                                                v9 = 45;
                                                break;
                                            }
                                            case 61: {
                                                v9 = 46;
                                                break;
                                            }
                                            case 62: {
                                                v9 = 0x2F;
                                                break;
                                            }
                                            default: {
                                                throw new IllegalStateException("Decoding invalid alphanumeric value: " + v8);
                                            }
                                        }
                                        g1 = new J8.g(((char)v9), v6 + 6);
                                    }
                                    else {
                                        g1 = new J8.g(((char)(v8 + 33)), v6 + 6);
                                    }
                                }
                                else {
                                    g1 = new J8.g(((char)(v7 + 43)), v6 + 5);
                                }
                                g0 = g1;
                            }
                            int v10 = g0.a;
                            c0.b = v10;
                            int v11 = g0.b;
                            if(v11 == 36) {
                                c1 = new F1.c(true, new J8.h(v10, stringBuilder0.toString()));
                                break;
                            }
                            else {
                                stringBuilder0.append(((char)v11));
                                continue;
                            }
                        }
                        else if(v3 + 6 <= a0.Y) {
                            int v5 = w.o(v3, 6, a0);
                            if(v5 >= 16 && v5 < 0x3F) {
                                goto label_17;
                            }
                        }
                    }
                    int v12 = c0.b;
                    int v13 = v12 + 3;
                    if(v13 <= a0.Y) {
                        while(v12 < v13) {
                            if(a0.e(v12)) {
                                goto label_60;
                            }
                            ++v12;
                        }
                        c0.b += 3;
                        c0.c = 1;
                    }
                    else {
                    label_60:
                        if(this.x(c0.b)) {
                            int v14 = c0.b;
                            int v15 = a0.Y;
                            c0.b = v14 + 5 < v15 ? v14 + 5 : v15;
                            c0.c = 3;
                        }
                    }
                    c1 = new F1.c(false, null);
                    break;
                }
                z = c1.X;
                c2 = c1;
            }
            else if(v2 == 3) {
                while(true) {
                    int v16 = c0.b;
                    if(v16 + 5 <= a0.Y) {
                        int v17 = w.o(v16, 5, a0);
                        if(v17 >= 5 && v17 < 16) {
                        label_84:
                            int v20 = c0.b;
                            int v21 = w.o(v20, 5, a0);
                            if(v21 == 15) {
                                g2 = new J8.g('$', v20 + 5);
                            }
                            else {
                                if(v21 < 5 || v21 >= 15) {
                                    int v22 = w.o(v20, 7, a0);
                                    if(v22 >= 0x40 && v22 < 90) {
                                        g3 = new J8.g(((char)(v22 + 1)), v20 + 7);
                                    }
                                    else if(v22 < 90 || v22 >= 0x74) {
                                        switch(w.o(v20, 8, a0)) {
                                            case 0xE8: {
                                                v23 = 33;
                                                break;
                                            }
                                            case 0xE9: {
                                                v23 = 34;
                                                break;
                                            }
                                            case 0xEA: {
                                                v23 = 37;
                                                break;
                                            }
                                            case 0xEB: {
                                                v23 = 38;
                                                break;
                                            }
                                            case 0xEC: {
                                                v23 = 39;
                                                break;
                                            }
                                            case 0xED: {
                                                v23 = 40;
                                                break;
                                            }
                                            case 0xEE: {
                                                v23 = 41;
                                                break;
                                            }
                                            case 0xEF: {
                                                v23 = 42;
                                                break;
                                            }
                                            case 0xF0: {
                                                v23 = 43;
                                                break;
                                            }
                                            case 0xF1: {
                                                v23 = 44;
                                                break;
                                            }
                                            case 0xF2: {
                                                v23 = 45;
                                                break;
                                            }
                                            case 0xF3: {
                                                v23 = 46;
                                                break;
                                            }
                                            case 0xF4: {
                                                v23 = 0x2F;
                                                break;
                                            }
                                            case 0xF5: {
                                                v23 = 58;
                                                break;
                                            }
                                            case 0xF6: {
                                                v23 = 59;
                                                break;
                                            }
                                            case 0xF7: {
                                                v23 = 60;
                                                break;
                                            }
                                            case 0xF8: {
                                                v23 = 61;
                                                break;
                                            }
                                            case 0xF9: {
                                                v23 = 62;
                                                break;
                                            }
                                            case 0xFA: {
                                                v23 = 0x3F;
                                                break;
                                            }
                                            case 0xFB: {
                                                v23 = 0x5F;
                                                break;
                                            }
                                            case 0xFC: {
                                                v23 = 0x20;
                                                break;
                                            }
                                            default: {
                                                throw e.a();
                                            }
                                        }
                                        g3 = new J8.g(((char)v23), v20 + 8);
                                    }
                                    else {
                                        g3 = new J8.g(((char)(v22 + 7)), v20 + 7);
                                    }
                                }
                                else {
                                    g3 = new J8.g(((char)(v21 + 43)), v20 + 5);
                                }
                                g2 = g3;
                            }
                            int v24 = g2.a;
                            c0.b = v24;
                            int v25 = g2.b;
                            if(v25 == 36) {
                                c3 = new F1.c(true, new J8.h(v24, stringBuilder0.toString()));
                                break;
                            }
                            else {
                                stringBuilder0.append(((char)v25));
                                continue;
                            }
                        }
                        else if(v16 + 7 <= a0.Y) {
                            int v18 = w.o(v16, 7, a0);
                            if(v18 >= 0x40 && v18 < 0x74) {
                                goto label_84;
                            }
                            else if(v16 + 8 <= a0.Y) {
                                int v19 = w.o(v16, 8, a0);
                                if(v19 >= 0xE8 && v19 < 0xFD) {
                                    goto label_84;
                                }
                            }
                        }
                    }
                    int v26 = c0.b;
                    int v27 = v26 + 3;
                    if(v27 <= a0.Y) {
                        while(v26 < v27) {
                            if(a0.e(v26)) {
                                goto label_162;
                            }
                            ++v26;
                        }
                        c0.b += 3;
                        c0.c = 1;
                    }
                    else {
                    label_162:
                        if(this.x(c0.b)) {
                            int v28 = c0.b;
                            int v29 = a0.Y;
                            c0.b = v28 + 5 < v29 ? v28 + 5 : v29;
                            c0.c = 2;
                        }
                    }
                    c3 = new F1.c(false, null);
                    break;
                }
                z = c3.X;
                c2 = c3;
            }
            else {
                while(true) {
                    int v30 = c0.b;
                    int v31 = a0.Y;
                    if(v30 + 7 <= v31) {
                        int v32 = v30;
                        while(true) {
                            if(v32 >= v30 + 3) {
                                goto label_188;
                            }
                            if(a0.e(v32)) {
                                break;
                            }
                            ++v32;
                        }
                    }
                    else if(v30 + 4 > v31) {
                        z1 = false;
                        goto label_190;
                    }
                    z1 = true;
                    goto label_190;
                label_188:
                    z1 = a0.e(v30 + 3);
                label_190:
                    if(z1) {
                        int v33 = c0.b;
                        int v34 = v33 + 7;
                        if(v34 > a0.Y) {
                            int v35 = w.o(v33, 4, a0);
                            i0 = v35 == 0 ? new J8.i(a0.Y, 10, 10) : new J8.i(a0.Y, v35 - 1, 10);
                        }
                        else {
                            int v36 = w.o(v33, 7, a0);
                            i0 = new J8.i(v34, (v36 - 8) / 11, (v36 - 8) % 11);
                        }
                        int v37 = i0.a;
                        c0.b = v37;
                        int v38 = i0.b;
                        int v39 = i0.c;
                        if(v38 == 10) {
                            c4 = new F1.c(true, (v39 == 10 ? new J8.h(v37, stringBuilder0.toString()) : new J8.h(v37, v39, stringBuilder0.toString())));
                            c2 = c4;
                            z = c4.X;
                            break;
                        }
                        else {
                            stringBuilder0.append(v38);
                            if(v39 == 10) {
                                c4 = new F1.c(true, new J8.h(c0.b, stringBuilder0.toString()));
                                c2 = c4;
                                z = c4.X;
                                break;
                            }
                            else {
                                stringBuilder0.append(v39);
                                continue;
                            }
                        }
                        goto label_219;
                    }
                    else {
                    label_219:
                        int v40 = c0.b;
                        if(v40 + 1 <= a0.Y) {
                            int v41 = 0;
                            while(true) {
                                if(v41 < 4) {
                                    int v42 = v41 + v40;
                                    if(v42 < a0.Y) {
                                        if(a0.e(v42)) {
                                            break;
                                        }
                                        else {
                                            ++v41;
                                            continue;
                                        }
                                    }
                                }
                                c0.c = 2;
                                c0.b += 4;
                                break;
                            }
                        }
                        F1.c c5 = new F1.c(false, null);
                        c2 = c5;
                        z = c5.X;
                    }
                    break;
                }
            }
            v43 = c0.b;
        }
        while((v1 != v43 || z) && !z);
        J8.h h0 = (J8.h)c2.Y;
        return h0 == null || !h0.d ? new J8.h(v43, stringBuilder0.toString()) : new J8.h(v43, h0.c, stringBuilder0.toString());
    }

    public static boolean m(Editable editable0, KeyEvent keyEvent0, boolean z) {
        if(!KeyEvent.metaStateHasNoModifiers(keyEvent0.getMetaState())) {
            return false;
        }
        int v = Selection.getSelectionStart(editable0);
        int v1 = Selection.getSelectionEnd(editable0);
        if(v != -1 && v1 != -1 && v == v1) {
            X1.v[] arr_v = (X1.v[])editable0.getSpans(v, v1, X1.v.class);
            if(arr_v != null && arr_v.length > 0) {
                for(int v2 = 0; v2 < arr_v.length; ++v2) {
                    X1.v v3 = arr_v[v2];
                    int v4 = editable0.getSpanStart(v3);
                    int v5 = editable0.getSpanEnd(v3);
                    if(z && v4 != v || !z && v5 != v || v > v4 && v < v5) {
                        editable0.delete(v4, v5);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void n(Object object0) {
        ((ArrayList)this.Z).add(this.b0);
        this.b0 = object0;
    }

    public static int o(int v, int v1, x8.a a0) {
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(a0.e(v + v2)) {
                v3 |= 1 << v1 - v2 - 1;
            }
        }
        return v3;
    }

    public Object p() {
        long v = Thread.currentThread().getId();
        if(v == U.b.a) {
            return this.b0;
        }
        c0.g g0 = (c0.g)((AtomicReference)this.Y).get();
        int v1 = g0.a(v);
        return v1 < 0 ? null : g0.c[v1];
    }

    public T0.h q(B b0, T0.b b1) {
        b1.getClass();
        i i0 = new i(b0);
        synchronized(((b)this.b0)) {
            T0.h h0 = (T0.h)((S0.b)this.Y).a(i0);
            if(h0 == null) {
                h0 = (T0.h)((S0.c)this.Z).a(i0);
            }
            return h0;
        }
    }

    public Object r() {
        return this.b0;
    }

    @Override  // o6.c
    public void s(o6.h h0) {
        J5.a a0 = (J5.a)this.Y;
        String s = (String)this.Z;
        ScheduledFuture scheduledFuture0 = (ScheduledFuture)this.b0;
        synchronized(a0.a) {
            a0.a.remove(s);
        }
        scheduledFuture0.cancel(false);
    }

    public ArrayList t(String s) {
        q2.C c0 = M6.b.o(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        c0.c(1, s);
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.Y;
        workDatabase_Impl0.b();
        Cursor cursor0 = P4.c.O(workDatabase_Impl0, c0, false);
        try {
            ArrayList arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                arrayList0.add(cursor0.getString(0));
            }
            return arrayList0;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    @Override
    public String toString() {
        if(this.X != 26) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder(0x20);
        stringBuilder0.append(((String)this.Y));
        stringBuilder0.append('{');
        io.sentry.internal.debugmeta.c c0 = (io.sentry.internal.debugmeta.c)((io.sentry.internal.debugmeta.c)this.Z).Z;
        for(String s = ""; c0 != null; s = ", ") {
            Object object0 = c0.Y;
            stringBuilder0.append(s);
            if(object0 == null || !object0.getClass().isArray()) {
                stringBuilder0.append(object0);
            }
            else {
                String s1 = Arrays.deepToString(new Object[]{object0});
                stringBuilder0.append(s1, 1, s1.length() - 1);
            }
            c0 = (io.sentry.internal.debugmeta.c)c0.Z;
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }

    public boolean u() {
        IconCompat iconCompat0;
        int[] arr_v1;
        long[] arr_v;
        Long long0;
        Integer integer0;
        PendingIntent pendingIntent1;
        PendingIntent pendingIntent0;
        Intent intent0;
        Uri uri0;
        int v2;
        String s2;
        Bundle bundle0;
        ApplicationInfo applicationInfo0;
        E7.x x0;
        if(((B3.c)this.b0).n("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService0 = (FirebaseMessagingService)this.Z;
        if(!((KeyguardManager)firebaseMessagingService0.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int v = Process.myPid();
            List list0 = ((ActivityManager)firebaseMessagingService0.getSystemService("activity")).getRunningAppProcesses();
            if(list0 != null) {
                for(Object object0: list0) {
                    ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                    if(activityManager$RunningAppProcessInfo0.pid == v) {
                        if(activityManager$RunningAppProcessInfo0.importance != 100) {
                            break;
                        }
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        String s = ((B3.c)this.b0).v("gcm.n.image");
        if(TextUtils.isEmpty(s)) {
            x0 = null;
        }
        else {
            try {
                x0 = new E7.x(new URL(s));
            }
            catch(MalformedURLException unused_ex) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + s);
                x0 = null;
            }
        }
        if(x0 != null) {
            ExecutorService executorService0 = (ExecutorService)this.Y;
            o6.i i0 = new o6.i();
            x0.Y = executorService0.submit(new E7.n(x0, 1, i0));
            x0.Z = i0.a;
        }
        FirebaseMessagingService firebaseMessagingService1 = (FirebaseMessagingService)this.Z;
        B3.c c0 = (B3.c)this.b0;
        PackageManager packageManager0 = firebaseMessagingService1.getPackageManager();
        try {
            applicationInfo0 = packageManager0.getApplicationInfo("com.wave.personal", 0x80);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.w("FirebaseMessaging", "Couldn\'t get own application info: " + packageManager$NameNotFoundException0);
            bundle0 = Bundle.EMPTY;
            goto label_43;
        }
        if(applicationInfo0 == null) {
            bundle0 = Bundle.EMPTY;
        }
        else {
            bundle0 = applicationInfo0.metaData;
            if(bundle0 == null) {
                bundle0 = Bundle.EMPTY;
            }
        }
    label_43:
        String s1 = c0.v("gcm.n.android_channel_id");
        if(Build.VERSION.SDK_INT >= 26) {
            try {
                firebaseMessagingService1.getPackageManager().getApplicationInfo("com.wave.personal", 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                goto label_66;
            }
            NotificationManager notificationManager0 = (NotificationManager)firebaseMessagingService1.getSystemService(NotificationManager.class);
            if(TextUtils.isEmpty(s1)) {
            label_50:
                s1 = bundle0.getString("com.google.firebase.messaging.default_notification_channel_id");
                if(TextUtils.isEmpty(s1)) {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                label_56:
                    if(E3.a.b(notificationManager0) == null) {
                        int v1 = firebaseMessagingService1.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", "com.wave.personal");
                        if(v1 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            s2 = "Misc";
                        }
                        else {
                            s2 = firebaseMessagingService1.getString(v1);
                        }
                        notificationManager0.createNotificationChannel(E3.a.d(s2));
                    }
                    s1 = "fcm_fallback_notification_channel";
                }
                else if(notificationManager0.getNotificationChannel(s1) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    goto label_56;
                }
            }
            else if(notificationManager0.getNotificationChannel(s1) == null) {
                Log.w("FirebaseMessaging", "Notification Channel requested (" + s1 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                goto label_50;
            }
        }
        else {
        label_66:
            s1 = null;
        }
        Resources resources0 = firebaseMessagingService1.getResources();
        PackageManager packageManager1 = firebaseMessagingService1.getPackageManager();
        q q0 = new q(firebaseMessagingService1, s1);
        String s3 = c0.u(resources0, "com.wave.personal", "gcm.n.title");
        if(!TextUtils.isEmpty(s3)) {
            q0.e = q.b(s3);
        }
        String s4 = c0.u(resources0, "com.wave.personal", "gcm.n.body");
        if(!TextUtils.isEmpty(s4)) {
            q0.f = q.b(s4);
            o o0 = new o(3);  // initializer: LO3/j;-><init>(I)V
            o0.Z = q.b(s4);
            q0.e(o0);
        }
        String s5 = c0.v("gcm.n.icon");
        if(TextUtils.isEmpty(s5)) {
        label_86:
            v2 = bundle0.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if(v2 == 0 || !E7.e.a(resources0, v2)) {
                try {
                    v2 = packageManager1.getApplicationInfo("com.wave.personal", 0).icon;
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
                    Log.w("FirebaseMessaging", "Couldn\'t get own application info: " + packageManager$NameNotFoundException1);
                }
            }
            if(v2 == 0 || !E7.e.a(resources0, v2)) {
                v2 = 0x1080093;
            }
        }
        else {
            v2 = resources0.getIdentifier(s5, "drawable", "com.wave.personal");
            if(v2 == 0 || !E7.e.a(resources0, v2)) {
                v2 = resources0.getIdentifier(s5, "mipmap", "com.wave.personal");
                if(v2 == 0 || !E7.e.a(resources0, v2)) {
                    Log.w("FirebaseMessaging", "Icon resource " + s5 + " not found. Notification will use default icon.");
                    goto label_86;
                }
            }
        }
        q0.w.icon = v2;
        String s6 = c0.v("gcm.n.sound2");
        if(TextUtils.isEmpty(s6)) {
            s6 = c0.v("gcm.n.sound");
        }
        if(TextUtils.isEmpty(s6)) {
            uri0 = null;
        }
        else {
            uri0 = "default".equals(s6) || resources0.getIdentifier(s6, "raw", "com.wave.personal") == 0 ? RingtoneManager.getDefaultUri(2) : Uri.parse(("android.resource://com.wave.personal/raw/" + s6));
        }
        if(uri0 != null) {
            q0.w.sound = uri0;
            q0.w.audioStreamType = -1;
            q0.w.audioAttributes = v1.p.a(v1.p.d(v1.p.c(v1.p.b(), 4), 5));
        }
        String s7 = c0.v("gcm.n.click_action");
        if(TextUtils.isEmpty(s7)) {
            String s8 = c0.v("gcm.n.link_android");
            if(TextUtils.isEmpty(s8)) {
                s8 = c0.v("gcm.n.link");
            }
            Uri uri1 = TextUtils.isEmpty(s8) ? null : Uri.parse(s8);
            if(uri1 == null) {
                intent0 = packageManager1.getLaunchIntentForPackage("com.wave.personal");
                if(intent0 == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
            else {
                intent0 = new Intent("android.intent.action.VIEW");
                intent0.setPackage("com.wave.personal");
                intent0.setData(uri1);
            }
        }
        else {
            intent0 = new Intent(s7);
            intent0.setPackage("com.wave.personal");
            intent0.setFlags(0x10000000);
        }
        AtomicInteger atomicInteger0 = E7.e.a;
        if(intent0 == null) {
            pendingIntent0 = null;
        }
        else {
            intent0.addFlags(0x4000000);
            Bundle bundle1 = (Bundle)c0.Y;
            Bundle bundle2 = new Bundle(bundle1);
            for(Object object1: bundle1.keySet()) {
                String s9 = (String)object1;
                if(s9.startsWith("google.c.") || s9.startsWith("gcm.n.") || s9.startsWith("gcm.notification.")) {
                    bundle2.remove(s9);
                }
            }
            intent0.putExtras(bundle2);
            if(c0.n("google.c.a.e")) {
                intent0.putExtra("gcm.n.analytics_data", c0.y());
            }
            pendingIntent0 = PendingIntent.getActivity(firebaseMessagingService1, atomicInteger0.incrementAndGet(), intent0, 0x44000000);
        }
        q0.g = pendingIntent0;
        if(c0.n("google.c.a.e")) {
            Intent intent1 = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c0.y());
            pendingIntent1 = PendingIntent.getBroadcast(firebaseMessagingService1, atomicInteger0.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage("com.wave.personal").putExtra("wrapped_intent", intent1), 0x44000000);
        }
        else {
            pendingIntent1 = null;
        }
        if(pendingIntent1 != null) {
            q0.w.deleteIntent = pendingIntent1;
        }
        String s10 = c0.v("gcm.n.color");
        if(TextUtils.isEmpty(s10)) {
        label_155:
            int v3 = bundle0.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if(v3 == 0) {
                integer0 = null;
            }
            else {
                try {
                    integer0 = firebaseMessagingService1.getColor(v3);
                }
                catch(Resources.NotFoundException unused_ex) {
                    Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                    integer0 = null;
                }
            }
        }
        else {
            try {
                integer0 = Color.parseColor(s10);
            }
            catch(IllegalArgumentException unused_ex) {
                Log.w("FirebaseMessaging", "Color is invalid: " + s10 + ". Notification will use default color.");
                goto label_155;
            }
        }
        if(integer0 != null) {
            q0.s = (int)integer0;
        }
        q0.c(16, !c0.n("gcm.n.sticky"));
        q0.p = c0.n("gcm.n.local_only");
        String s11 = c0.v("gcm.n.ticker");
        if(s11 != null) {
            q0.w.tickerText = q.b(s11);
        }
        Integer integer1 = c0.q("gcm.n.notification_priority");
        if(integer1 == null) {
            integer1 = null;
        }
        else if(((int)integer1) < -2 || ((int)integer1) > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + integer1 + ". Skipping setting notificationPriority.");
            integer1 = null;
        }
        if(integer1 != null) {
            q0.j = (int)integer1;
        }
        Integer integer2 = c0.q("gcm.n.visibility");
        if(integer2 == null) {
            integer2 = null;
        }
        else if(((int)integer2) < -1 || ((int)integer2) > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + integer2 + ". Skipping setting visibility.");
            integer2 = null;
        }
        if(integer2 != null) {
            q0.t = (int)integer2;
        }
        Integer integer3 = c0.q("gcm.n.notification_count");
        if(integer3 == null) {
            integer3 = null;
        }
        else if(((int)integer3) < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + integer3 + ". Skipping setting notificationCount.");
            integer3 = null;
        }
        if(integer3 != null) {
            q0.i = (int)integer3;
        }
        String s12 = c0.v("gcm.n.event_time");
        if(TextUtils.isEmpty(s12)) {
            long0 = null;
        }
        else {
            try {
                long0 = Long.parseLong(s12);
            }
            catch(NumberFormatException unused_ex) {
                Log.w("NotificationParams", "Couldn\'t parse value of " + B3.c.B("gcm.n.event_time") + "(" + s12 + ") into a long");
                long0 = null;
            }
        }
        if(long0 != null) {
            q0.k = true;
            q0.w.when = (long)long0;
        }
        JSONArray jSONArray0 = c0.s("gcm.n.vibrate_timings");
        if(jSONArray0 == null) {
            arr_v = null;
        }
        else {
            try {
                if(jSONArray0.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int v4 = jSONArray0.length();
                arr_v = new long[v4];
                for(int v5 = 0; v5 < v4; ++v5) {
                    arr_v[v5] = jSONArray0.optLong(v5);
                }
            }
            catch(JSONException | NumberFormatException unused_ex) {
                Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArray0 + ". Skipping setting vibrateTimings.");
                arr_v = null;
            }
        }
        if(arr_v != null) {
            q0.w.vibrate = arr_v;
        }
        JSONArray jSONArray1 = c0.s("gcm.n.light_settings");
        if(jSONArray1 == null) {
        label_242:
            arr_v1 = null;
        }
        else {
            try {
                arr_v1 = new int[3];
                if(jSONArray1.length() != 3) {
                    throw new JSONException("lightSettings don\'t have all three fields");
                }
                int v6 = Color.parseColor(jSONArray1.optString(0));
                if(v6 == 0xFF000000) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                arr_v1[0] = v6;
                arr_v1[1] = jSONArray1.optInt(1);
                arr_v1[2] = jSONArray1.optInt(2);
                goto label_243;
            }
            catch(JSONException unused_ex) {
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray1 + ". " + illegalArgumentException0.getMessage() + ". Skipping setting LightSettings");
                goto label_242;
            }
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArray1 + ". Skipping setting LightSettings");
            goto label_242;
        }
    label_243:
        if(arr_v1 != null) {
            int v7 = arr_v1[0];
            int v8 = arr_v1[1];
            q0.w.ledARGB = v7;
            q0.w.ledOnMS = v8;
            q0.w.ledOffMS = arr_v1[2];
            q0.w.flags = (v8 == 0 || arr_v1[2] == 0 ? 0 : 1) | -2 & q0.w.flags;
        }
        boolean z = c0.n("gcm.n.default_sound");
        if(c0.n("gcm.n.default_vibrate_timings")) {
            z |= 2;
        }
        if(c0.n("gcm.n.default_light_settings")) {
            z |= 4;
        }
        Notification notification0 = q0.w;
        notification0.defaults = z;
        if((z & 4) != 0) {
            notification0.flags |= 1;
        }
        String s13 = c0.v("gcm.n.tag");
        if(TextUtils.isEmpty(s13)) {
            s13 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        if(x0 != null) {
            try {
                o6.p p0 = x0.Z;
                r.j(p0);
                Bitmap bitmap0 = (Bitmap)o6.k.b(p0, 5L, TimeUnit.SECONDS);
                q0.d(bitmap0);
                v1.n n0 = new v1.n(3);  // initializer: LO3/j;-><init>(I)V
                if(bitmap0 == null) {
                    iconCompat0 = null;
                }
                else {
                    iconCompat0 = new IconCompat(1);
                    iconCompat0.b = bitmap0;
                }
                n0.Z = iconCompat0;
                n0.b0 = null;
                n0.c0 = true;
                q0.e(n0);
            }
            catch(ExecutionException executionException0) {
                Log.w("FirebaseMessaging", "Failed to download image: " + executionException0.getCause());
            }
            catch(InterruptedException unused_ex) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                x0.close();
                Thread.currentThread().interrupt();
            }
            catch(TimeoutException unused_ex) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                x0.close();
            }
        }
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager)((FirebaseMessagingService)this.Z).getSystemService("notification")).notify(s13, 0, q0.a());
        return true;
    }

    public boolean v(CharSequence charSequence0, int v, int v1, u u0) {
        if((u0.c & 3) == 0) {
            X1.d d0 = (X1.d)this.b0;
            Y1.a a0 = u0.c();
            int v2 = a0.a(8);
            if(v2 != 0) {
                ((ByteBuffer)a0.b0).getShort(v2 + a0.X);
            }
            d0.getClass();
            ThreadLocal threadLocal0 = X1.d.b;
            if(threadLocal0.get() == null) {
                threadLocal0.set(new StringBuilder());
            }
            StringBuilder stringBuilder0 = (StringBuilder)threadLocal0.get();
            stringBuilder0.setLength(0);
            while(v < v1) {
                stringBuilder0.append(charSequence0.charAt(v));
                ++v;
            }
            int v3 = u0.c & 4;
            u0.c = d0.a.hasGlyph(stringBuilder0.toString()) ? v3 | 2 : v3 | 1;
        }
        return (u0.c & 3) == 2;
    }

    public void w(String s, Set set0) {
        j.f(s, "id");
        j.f(set0, "tags");
        for(Object object0: set0) {
            R2.v v0 = new R2.v(((String)object0), s);
            WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)this.Y;
            workDatabase_Impl0.b();
            workDatabase_Impl0.c();
            try {
                ((R2.b)this.Z).f(v0);
                workDatabase_Impl0.q();
            }
            finally {
                workDatabase_Impl0.k();
            }
        }
    }

    public boolean x(int v) {
        x8.a a0 = (x8.a)this.Y;
        if(v + 1 > a0.Y) {
            return false;
        }
        for(int v1 = 0; v1 < 5; ++v1) {
            int v2 = v1 + v;
            if(v2 >= a0.Y) {
                break;
            }
            if(v1 == 2) {
                if(!a0.e(v + 2)) {
                    return false;
                }
            }
            else if(a0.e(v2)) {
                return false;
            }
        }
        return true;
    }

    public boolean y() {
        if(((N0)this.Y).getValue() == this.b0) {
            w w0 = (w)this.Z;
            return w0 != null && w0.y();
        }
        return true;
    }

    public void z() {
        AndroidComposeView androidComposeView0 = ((LayoutNode)this.Y).g0;
        if(androidComposeView0 != null) {
            androidComposeView0.x();
        }
    }

    @Override  // N6.c
    public Object zza() {
        return new M6.e(((M6.j)((c)this.Y).zza()), ((M6.c)((c)this.Z).zza()), ((B1.b)((U7.c)this.b0).Y).a);
    }
}

