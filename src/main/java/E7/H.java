package E7;

import I2.A;
import J1.E;
import J2.I;
import J2.w;
import K.v;
import Nb.k;
import R2.c;
import R2.f;
import R2.u;
import T7.r;
import T7.s;
import T7.t;
import W7.e;
import X1.j;
import X1.p;
import X1.q;
import a8.Q;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c2.X;
import c2.d;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.OnBalloonInitializedListener;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import d7.b;
import f1.i;
import f1.l;
import io.sentry.I1;
import io.sentry.K1;
import io.sentry.L0;
import io.sentry.android.core.y;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import m7.o;
import o.N0;
import org.json.JSONObject;
import q2.C;
import u9.g;
import w5.a;

public final class h implements Runnable {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;

    public h(Object object0, Object object1, Object object2, int v) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        this.b0 = object2;
        super();
    }

    public h(AtomicBoolean atomicBoolean0, i i0, Function0 function00) {
        this.X = 2;
        super();
        this.Y = atomicBoolean0;
        this.Z = i0;
        this.b0 = (k)function00;
    }

    public h(a a0, r5.i i0, o o0, r5.h h0) {
        this.X = 16;
        super();
        this.Y = a0;
        this.Z = i0;
        this.b0 = h0;
    }

    private final void a() {
        String s = (String)this.Z;
        e e0 = (e)this.b0;
        c c0 = ((V7.h)this.Y).a;
        b b0 = (b)((x7.a)c0.Y).get();
        if(b0 != null) {
            JSONObject jSONObject0 = e0.e;
            if(jSONObject0.length() >= 1) {
                JSONObject jSONObject1 = e0.b;
                if(jSONObject1.length() >= 1) {
                    JSONObject jSONObject2 = jSONObject0.optJSONObject(s);
                    if(jSONObject2 != null) {
                        String s1 = jSONObject2.optString("choiceId");
                        if(!s1.isEmpty()) {
                            synchronized(((Map)c0.Z)) {
                                if(s1.equals(((Map)c0.Z).get(s))) {
                                    return;
                                }
                                ((Map)c0.Z).put(s, s1);
                            }
                            Bundle bundle0 = new Bundle();
                            bundle0.putString("arm_key", s);
                            bundle0.putString("arm_value", jSONObject1.optString(s));
                            bundle0.putString("personalization_id", jSONObject2.optString("personalizationId"));
                            bundle0.putInt("arm_index", jSONObject2.optInt("armIndex", -1));
                            bundle0.putString("group", jSONObject2.optString("group"));
                            ((d7.c)b0).a("fp", "personalization_assignment", bundle0);
                            Bundle bundle1 = new Bundle();
                            bundle1.putString("_fpid", s1);
                            ((d7.c)b0).a("fp", "_fpc", bundle1);
                        }
                    }
                }
            }
        }
    }

    private final void b() {
        X1.k k0 = (X1.k)this.Y;
        f f0 = (f)this.Z;
        ThreadPoolExecutor threadPoolExecutor0 = (ThreadPoolExecutor)this.b0;
        k0.getClass();
        try {
            q q0 = Q4.i.r(k0.a);
            if(q0 == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            synchronized(((p)q0.a).d) {
                ((p)q0.a).f = threadPoolExecutor0;
            }
            j j0 = new j(f0, threadPoolExecutor0);
            q0.a.a(j0);
        }
        catch(Throwable throwable0) {
            f0.v(throwable0);
            threadPoolExecutor0.shutdown();
        }
    }

    @Override
    public final void run() {
        Ab.k k1;
        int v = 8;
        boolean z = true;
        switch(this.X) {
            case 0: {
                ((E7.i)this.Y).getClass();
                try {
                    ((E7.i)this.Y).b(((Intent)this.Z));
                }
                finally {
                    ((o6.i)this.b0).b(null);
                }
                return;
            }
            case 1: {
                i i1 = (i)this.Z;
                Function0 function00 = (Function0)this.b0;
                if(!((AtomicBoolean)this.Y).get()) {
                    try {
                        i1.a(function00.invoke());
                        return;
                    }
                    catch(Throwable throwable0) {
                        i1.b(throwable0);
                    }
                }
                return;
            }
            case 2: {
                i i2 = (i)this.Z;
                k k0 = (k)this.b0;
                if(!((AtomicBoolean)this.Y).get()) {
                    try {
                        i2.a(((Function0)k0).invoke());
                        return;
                    }
                    catch(Throwable throwable1) {
                        i2.b(throwable1);
                    }
                }
                return;
            }
            case 3: {
                J2.e e0 = (J2.e)this.Y;
                l l0 = (l)this.Z;
                I i3 = (I)this.b0;
                e0.getClass();
                try {
                    z = ((Boolean)l0.Y.get()).booleanValue();
                }
                catch(InterruptedException | ExecutionException unused_ex) {
                }
                synchronized(e0.k) {
                    R2.i i4 = w.D(i3.a);
                    String s3 = i4.a;
                    if(e0.d(s3) == i3) {
                        e0.b(s3);
                    }
                    A.e().a(J2.e.l, J2.e.class.getSimpleName() + " " + s3 + " executed; reschedule = " + z);
                    for(Object object1: e0.j) {
                        ((J2.b)object1).d(i4, z);
                    }
                }
                return;
            }
            case 4: {
                ((J2.e)((v)this.Y).Y).h(((J2.k)this.Z), ((I2.o)this.b0));
                return;
            }
            case 5: {
                ((SessionManager)this.Y).lambda$setApplicationContext$0(((Context)this.Z), ((PerfSession)this.b0));
                return;
            }
            case 6: {
                ((R7.f)this.Y).getClass();
                s s4 = t.A();
                s4.j();
                t.v(((t)s4.Y), ((T7.o)this.Z));
                ((R7.f)this.Y).d(s4, ((T7.i)this.b0));
                return;
            }
            case 7: {
                ((R7.f)this.Y).getClass();
                s s5 = t.A();
                s5.j();
                t.w(((t)s5.Y), ((T7.A)this.Z));
                ((R7.f)this.Y).d(s5, ((T7.i)this.b0));
                return;
            }
            case 8: {
                ((R7.f)this.Y).getClass();
                s s6 = t.A();
                s6.j();
                t.x(((t)s6.Y), ((r)this.Z));
                ((R7.f)this.Y).d(s6, ((T7.i)this.b0));
                return;
            }
            case 9: {
                u u0 = ((WorkDatabase)this.Y).x();
                u0.getClass();
                C c0 = M6.b.o(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                c0.c(1, ((String)this.Z));
                ((WorkDatabase_Impl)u0.a).b();
                Cursor cursor0 = P4.c.O(((WorkDatabase_Impl)u0.a), c0, false);
                try {
                    ArrayList arrayList0 = new ArrayList(cursor0.getCount());
                    while(cursor0.moveToNext()) {
                        arrayList0.add(cursor0.getString(0));
                    }
                }
                finally {
                    cursor0.close();
                    c0.f();
                }
                for(Object object2: arrayList0) {
                    W5.f.n(((J2.u)this.b0), ((String)object2));
                }
                return;
            }
            case 10: {
                this.a();
                return;
            }
            case 11: {
                this.b();
                return;
            }
            case 12: {
                Nb.j.f(((ViewGroup)this.Y), "$container");
                Nb.j.f(((d)this.b0), "this$0");
                ((ViewGroup)this.Y).endViewTransition(((View)this.Z));
                ((X)((d)this.b0).c.Y).c(((d)this.b0));
                return;
            }
            case 13: {
                io.sentry.cache.f f0 = (io.sentry.cache.f)this.Y;
                I1 i10 = (I1)this.Z;
                if(i10 == null) {
                    f0.getClass();
                    Q q0 = ((L0)this.b0).q;
                    I1 i11 = new I1(((io.sentry.protocol.u)q0.Y), ((K1)q0.Z), "default", null, null);
                    i11.g0 = "auto";
                    f0.c(i11, "trace.json");
                    return;
                }
                f0.c(i10, "trace.json");
                return;
            }
            case 14: {
                Balloon balloon0 = (Balloon)this.Y;
                OnBalloonInitializedListener onBalloonInitializedListener0 = balloon0.g0;
                N0 n00 = balloon0.Z;
                if(onBalloonInitializedListener0 != null) {
                    onBalloonInitializedListener0.b(((RadiusLayout)n00.c0));
                }
                u9.j j0 = balloon0.Y;
                View view0 = (View)this.Z;
                if(j0.m != u9.b.Y) {
                    Rect rect0 = new Rect();
                    view0.getGlobalVisibleRect(rect0);
                    int[] arr_v = {0, 0};
                    balloon0.c0.getContentView().getLocationOnScreen(arr_v);
                    u9.a a1 = j0.n;
                    u9.a a2 = u9.a.Z;
                    if(a1 == a2 && arr_v[1] < rect0.bottom) {
                        j0.n = u9.a.Y;
                    }
                    else if(a1 == u9.a.Y && arr_v[1] > rect0.top) {
                        j0.n = a2;
                    }
                    u9.a a3 = j0.n;
                    u9.a a4 = u9.a.b0;
                    if(a3 == a4 && arr_v[0] < rect0.right) {
                        j0.n = u9.a.c0;
                    }
                    else if(a3 == u9.a.c0 && arr_v[0] > rect0.left) {
                        j0.n = a4;
                    }
                    balloon0.k();
                }
                ImageView imageView0 = (ImageView)n00.b0;
                u9.a a5 = j0.n;
                u9.a.X.getClass();
                Nb.j.f(a5, "<this>");
                if(j0.Q) {
                    switch(a5.ordinal()) {
                        case 2: {
                            a5 = u9.a.c0;
                            break;
                        }
                        case 3: {
                            a5 = u9.a.b0;
                        }
                    }
                }
                int v4 = a5.ordinal();
                RadiusLayout radiusLayout0 = (RadiusLayout)n00.c0;
                if(v4 == 0) {
                    imageView0.setRotation(180.0f);
                    imageView0.setX(balloon0.e(view0));
                    imageView0.setY(radiusLayout0.getY() + ((float)radiusLayout0.getHeight()) - 1.0f);
                    E.j(imageView0, 0.0f);
                    imageView0.getX();
                    radiusLayout0.getHeight();
                    j0.getClass();
                    imageView0.setForeground(null);
                }
                else {
                    int v5 = j0.j;
                    switch(v4) {
                        case 1: {
                            imageView0.setRotation(0.0f);
                            imageView0.setX(balloon0.e(view0));
                            imageView0.setY(radiusLayout0.getY() - ((float)v5) + 1.0f);
                            imageView0.getX();
                            j0.getClass();
                            imageView0.setForeground(null);
                            break;
                        }
                        case 2: {
                            imageView0.setRotation(-90.0f);
                            imageView0.setX(radiusLayout0.getX() - ((float)v5) + 1.0f);
                            imageView0.setY(balloon0.g(view0));
                            imageView0.getY();
                            j0.getClass();
                            imageView0.setForeground(null);
                            break;
                        }
                        default: {
                            if(v4 != 3) {
                                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                            imageView0.setRotation(90.0f);
                            imageView0.setX(radiusLayout0.getX() + ((float)radiusLayout0.getWidth()) - 1.0f);
                            imageView0.setY(balloon0.g(view0));
                            radiusLayout0.getWidth();
                            imageView0.getY();
                            j0.getClass();
                            imageView0.setForeground(null);
                            break;
                        }
                    }
                }
                ImageView imageView1 = (ImageView)this.b0;
                if(j0.h) {
                    v = 0;
                }
                imageView1.setVisibility(v);
                return;
            }
            case 15: {
                Balloon balloon1 = (Balloon)this.Y;
                View view1 = (View)this.Z;
                boolean z1 = balloon1.c(view1);
                if((z1 ? Boolean.valueOf(z1) : null) != null) {
                    u9.j j1 = balloon1.Y;
                    String s7 = j1.O;
                    if(s7 == null) {
                    label_227:
                        balloon1.e0 = true;
                        u9.v v7 = (u9.v)this.b0;
                        long v8 = j1.F;
                        if(v8 != -1L) {
                            ((Handler)((Ab.h)balloon1.h0).getValue()).postDelayed(((u9.d)((Ab.h)balloon1.i0).getValue()), v8);
                        }
                        j1.getClass();
                        N0 n01 = balloon1.Z;
                        if(j1.y == null) {
                            balloon1.l(((VectorTextView)n01.e0), ((RadiusLayout)n01.c0));
                        }
                        else {
                            balloon1.n(((RadiusLayout)n01.c0));
                        }
                        ((FrameLayout)n01.Y).measure(0, 0);
                        PopupWindow popupWindow0 = balloon1.c0;
                        popupWindow0.setWidth(balloon1.j());
                        popupWindow0.setHeight(balloon1.i());
                        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
                        ((VectorTextView)n01.e0).setLayoutParams(frameLayout$LayoutParams0);
                        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(j1.j, j1.j);
                        ImageView imageView2 = (ImageView)n01.b0;
                        imageView2.setLayoutParams(frameLayout$LayoutParams1);
                        imageView2.setAlpha(j1.w);
                        imageView2.setPadding(0, 0, 0, 0);
                        int v9 = j1.i;
                        if(v9 == 0x80000000) {
                            imageView2.setImageTintList(ColorStateList.valueOf(j1.p));
                        }
                        else {
                            imageView2.setImageTintList(ColorStateList.valueOf(v9));
                        }
                        imageView2.setOutlineProvider(ViewOutlineProvider.BOUNDS);
                        h h1 = new h(balloon1, view1, imageView2, 14);
                        ((RadiusLayout)n01.c0).post(h1);
                        balloon1.k();
                        PopupWindow popupWindow1 = balloon1.d0;
                        int v10 = j1.H;
                        if(j1.I != 0x80000000) {
                            popupWindow1.setAnimationStyle(v10);
                        }
                        else if(u9.k.a[j1.K.ordinal()] == 1) {
                            popupWindow1.setAnimationStyle(0x7F13000E);  // style:Balloon_Fade_Anim
                        }
                        else {
                            popupWindow1.setAnimationStyle(0x7F130010);  // style:Balloon_Normal_Anim
                        }
                        if(j1.E) {
                            popupWindow1.setTouchInterceptor(new u9.e(new Ya.d(view1, 2, balloon1)));
                        }
                        if(v10 == 0x80000000) {
                            switch(j1.J.ordinal()) {
                                case 0: {
                                    popupWindow0.setAnimationStyle(0x7F13000F);  // style:Balloon_None_Anim
                                    break;
                                }
                                case 1: {
                                    popupWindow0.setAnimationStyle(0x7F13000D);  // style:Balloon_Elastic_Anim
                                    break;
                                }
                                case 2: {
                                    popupWindow0.setAnimationStyle(0x7F13000E);  // style:Balloon_Fade_Anim
                                    break;
                                }
                                case 3: {
                                    View view2 = popupWindow0.getContentView();
                                    Nb.j.e(view2, "getContentView(...)");
                                    view2.setVisibility(4);
                                    view2.post(new y(1, j1.L, view2));
                                    popupWindow0.setAnimationStyle(0x7F130011);  // style:Balloon_Normal_Dispose_Anim
                                    break;
                                }
                                case 4: {
                                    popupWindow0.setAnimationStyle(0x7F130012);  // style:Balloon_Overshoot_Anim
                                    break;
                                }
                                default: {
                                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                }
                            }
                        }
                        else {
                            popupWindow0.setAnimationStyle(v10);
                        }
                        g g1 = new g(balloon1, 0);
                        ((FrameLayout)n01.Z).post(g1);
                        int v11 = j1.R;
                        u9.l l1 = v7.c;
                        View view3 = v7.a;
                        int v12 = v7.e;
                        int v13 = v7.d;
                    alab1:
                        switch(v7.f.ordinal()) {
                            case 0: {
                                int v14 = Pb.a.H(((float)view3.getMeasuredWidth()) * 0.5f);
                                int v15 = Pb.a.H(((float)view3.getMeasuredHeight()) * 0.5f);
                                int v16 = Pb.a.H(((float)balloon1.j()) * 0.5f);
                                int v17 = Pb.a.H(((float)balloon1.i()) * 0.5f);
                                int v18 = l1.ordinal();
                                switch(v18) {
                                    case 0: {
                                        k1 = new Ab.k(((int)((-balloon1.j() + v13) * v11)), ((int)(-(v17 + v15) + v12)));
                                        break alab1;
                                    }
                                    case 1: {
                                        k1 = new Ab.k(((int)((view3.getMeasuredWidth() + v13) * v11)), ((int)(-(v17 + v15) + v12)));
                                        break alab1;
                                    }
                                    case 2: {
                                        int v19 = balloon1.i();
                                        k1 = new Ab.k(((int)((v14 - v16 + v13) * v11)), ((int)(-(view3.getMeasuredHeight() + v19) + v12)));
                                        break alab1;
                                    }
                                    default: {
                                        if(v18 != 3) {
                                            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                        }
                                        k1 = new Ab.k(((int)((v14 - v16 + v13) * v11)), v12);
                                        break alab1;
                                    }
                                }
                            }
                            case 1: {
                                k1 = new Ab.k(v13, v12);
                                break;
                            }
                            case 2: {
                                int v20 = Pb.a.H(((float)view3.getMeasuredWidth()) * 0.5f);
                                int v21 = Pb.a.H(((float)view3.getMeasuredHeight()) * 0.5f);
                                int v22 = Pb.a.H(((float)balloon1.j()) * 0.5f);
                                int v23 = Pb.a.H(((float)balloon1.i()) * 0.5f);
                                switch(l1.ordinal()) {
                                    case 0: {
                                        k1 = new Ab.k(((int)((v20 - balloon1.j() + v13) * v11)), ((int)(-v23 - v21 + v12)));
                                        break alab1;
                                    }
                                    case 1: {
                                        k1 = new Ab.k(((int)((v20 + v13) * v11)), ((int)(-v23 - v21 + v12)));
                                        break alab1;
                                    }
                                    case 2: {
                                        k1 = new Ab.k(((int)((v20 - v22 + v13) * v11)), ((int)(-(balloon1.i() + v21) + v12)));
                                        break alab1;
                                    }
                                    case 3: {
                                        k1 = new Ab.k(((int)((v20 - v22 + v13) * v11)), ((int)(-v21 + v12)));
                                        break alab1;
                                    }
                                    default: {
                                        throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                    }
                                }
                            }
                            default: {
                                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                        }
                        popupWindow0.showAsDropDown(view1, ((Number)k1.X).intValue(), ((Number)k1.Y).intValue());
                    }
                    else {
                        Object object3 = balloon1.j0;
                        u9.u u1 = (u9.u)((Ab.h)object3).getValue();
                        int v6 = j1.P;
                        u1.getClass();
                        SharedPreferences sharedPreferences0 = u9.u.c;
                        if(sharedPreferences0 == null) {
                            Nb.j.p("sharedPreferenceManager");
                            throw null;
                        }
                        else if(sharedPreferences0.getInt("SHOWED_UP" + s7, 0) < v6) {
                            ((u9.u)((Ab.h)object3).getValue()).getClass();
                            u9.u.a(s7);
                            goto label_227;
                        }
                    }
                }
                return;
            }
            default: {
                r5.i i0 = (r5.i)this.Z;
                String s = i0.a;
                r5.h h0 = (r5.h)this.b0;
                a a0 = (a)this.Y;
                a0.getClass();
                Logger logger0 = a.f;
                try {
                    s5.g g0 = a0.c.a(s);
                    if(g0 == null) {
                        String s1 = "Transport backend \'" + s + "\' is not registered";
                        logger0.warning(s1);
                        new IllegalArgumentException(s1);
                        return;
                    }
                    E7.s s2 = new E7.s(a0, i0, ((p5.d)g0).a(h0), 8);
                    ((y5.h)a0.e).q(s2);
                    return;
                }
                catch(Exception exception0) {
                }
                logger0.warning("Error scheduling event " + exception0.getMessage());
            }
        }
    }
}

