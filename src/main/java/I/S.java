package i;

import J1.o;
import R2.m;
import T9.b;
import a5.w;
import ac.n0;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Bundle;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window.Callback;
import android.view.textclassifier.TextClassifier;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.AppCompatTextView.SuperCaller;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.core.view.WindowInsetsCompat;
import com.drew.metadata.avi.AviDirectory;
import com.sendwave.components.RequestListener;
import io.sentry.ILogger;
import io.sentry.N0;
import io.sentry.android.core.k;
import io.sentry.i1;
import io.sentry.protocol.y;
import io.sentry.y1;
import j4.a;
import j6.B0;
import j6.V;
import j6.a1;
import j6.d0;
import j6.q0;
import j6.s0;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import k2.J;
import k2.g0;
import m8.f;
import n.j;
import n.t;
import o.N;
import o6.c;
import o6.h;
import o6.p;
import o9.l;
import u6.d;
import u6.e;
import v.D;
import v.r;

public class s implements o, AppCompatTextView.SuperCaller, MenuItemHoverListener, RequestListener, N0, a, t, c, org.chromium.net.c, r {
    public Object X;

    public s(int v) {
        switch(v) {
            case 10: {
                super();
                m m0 = new m();  // initializer: Ljava/lang/Object;-><init>()V
                m0.X = new J();
                m0.Y = new J();
                m0.b0 = new ReentrantLock();
                this.X = m0;
                return;
            }
            case 12: {
                super();
                this.X = new g.a(16, 0);
                return;
            }
            case 16: {
                super();
                this.X = new HashSet();
                return;
            }
            case 20: {
                super();
                this.X = null;
                return;
            }
            default: {
                super();
                this.X = new io.sentry.util.c(new b(27));
            }
        }
    }

    public s(Object object0) {
        this.X = object0;
        super();
    }

    // Deobfuscation rating: LOW(30)
    @Override  // j4.a
    public boolean A(String s) {
        return s.equals("hdrl") || s.equals("strl") || s.equals("AVI ");
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public void B(int v, float f) {
    }

    public ArrayList C(StackTraceElement[] arr_stackTraceElement, boolean z) {
        if(arr_stackTraceElement != null && arr_stackTraceElement.length > 0) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                if(stackTraceElement0 != null) {
                    String s = stackTraceElement0.getClassName();
                    if(z || !s.startsWith("io.sentry.") || s.startsWith("io.sentry.samples.") || s.startsWith("io.sentry.mobile.")) {
                        y y0 = new y();  // initializer: Ljava/lang/Object;-><init>()V
                        y0.f0 = this.E(s);
                        y0.Z = s;
                        y0.Y = stackTraceElement0.getMethodName();
                        y0.X = stackTraceElement0.getFileName();
                        if(stackTraceElement0.getLineNumber() >= 0) {
                            y0.b0 = stackTraceElement0.getLineNumber();
                        }
                        y0.h0 = Boolean.valueOf(stackTraceElement0.isNativeMethod());
                        arrayList0.add(y0);
                        if(arrayList0.size() < 100) {
                            continue;
                        }
                        break;
                    }
                }
            }
            Collections.reverse(arrayList0);
            return arrayList0;
        }
        return null;
    }

    public n0 D(g0 g00) {
        m m0 = (m)this.X;
        switch(g00.ordinal()) {
            case 1: {
                return ((J)m0.X).b;
            }
            case 2: {
                return ((J)m0.Y).b;
            }
            default: {
                throw new IllegalArgumentException("invalid load type for hints");
            }
        }
    }

    public Boolean E(String s) {
        if(s != null && !s.isEmpty()) {
            y1 y10 = (y1)this.X;
            for(Object object0: y10.getInAppIncludes()) {
                if(s.startsWith(((String)object0))) {
                    return Boolean.TRUE;
                }
                if(false) {
                    break;
                }
            }
            for(Object object1: y10.getInAppExcludes()) {
                if(s.startsWith(((String)object1))) {
                    return Boolean.FALSE;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
        return Boolean.TRUE;
    }

    public boolean F(CharSequence charSequence0, f f0) {
        String s = f0.Y;
        if(s.length() == 0) {
            return false;
        }
        Matcher matcher0 = ((g.a)this.X).v(s).matcher(charSequence0);
        return matcher0.lookingAt() ? matcher0.matches() : false;
    }

    public static s G(String s) {
        return TextUtils.isEmpty(s) || s.length() > 1 ? new s(s0.Y) : new s(q0.e(s.charAt(0)));
    }

    public void H() {
        a1 a10 = (a1)this.X;
        a10.q();
        V v0 = a10.o();
        d0 d00 = (d0)a10.Y;
        d00.l0.getClass();
        if(v0.v(System.currentTimeMillis())) {
            a10.o().l0.a(true);
            ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
            if(activityManager$RunningAppProcessInfo0.importance == 100) {
                a10.b().m0.d("Detected application was in foreground");
                d00.l0.getClass();
                this.J(System.currentTimeMillis());
            }
        }
    }

    public void I(long v, boolean z) {
        a1 a10 = (a1)this.X;
        a10.q();
        a10.x();
        if(a10.o().v(v)) {
            a10.o().l0.a(true);
            ((d0)a10.Y).n().z();
        }
        a10.o().p0.b(v);
        if(a10.o().l0.b()) {
            this.J(v);
        }
    }

    public void J(long v) {
        a1 a10 = (a1)this.X;
        a10.q();
        d0 d00 = (d0)a10.Y;
        if(!d00.i()) {
            return;
        }
        a10.o().p0.b(v);
        d00.l0.getClass();
        long v1 = SystemClock.elapsedRealtime();
        a10.b().m0.b(v1, "Session started, time");
        a10.r().x(v, ((long)(v / 1000L)), "auto", "_sid");
        a10.o().q0.b(v / 1000L);
        a10.o().l0.a(false);
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_sid", v / 1000L);
        a10.r().G("auto", "_s", v, bundle0);
        String s = a10.o().v0.x();
        if(!TextUtils.isEmpty(s)) {
            Bundle bundle1 = new Bundle();
            bundle1.putString("_ffr", s);
            a10.r().G("auto", "_ssr", v, bundle1);
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public void a(int[] arr_v, int v) {
        ((N)this.X).setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
    }

    @Override  // n.t
    public void b(j j0, boolean z) {
        ((B)this.X).r(j0);
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public void c(TextClassifier textClassifier0) {
        ((N)this.X).setTextClassifier(textClassifier0);
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public int[] d() {
        return ((N)this.X).getAutoSizeTextAvailableSizes();
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public void e(int v) {
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public TextClassifier f() {
        return ((N)this.X).getTextClassifier();
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public int g() {
        return ((N)this.X).getAutoSizeMaxTextSize();
    }

    @Override  // v.r
    public v.B get(int v) {
        return (D)this.X;
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public void h(int v, int v1, int v2, int v3) {
        ((N)this.X).setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
    }

    @Override  // j4.a
    public void i(String s) {
        ((AviDirectory)this.X).addError(s);
    }

    @Override  // n.t
    public boolean j(j j0) {
        Window.Callback window$Callback0 = ((B)this.X).j0.getCallback();
        if(window$Callback0 != null) {
            window$Callback0.onMenuOpened(108, j0);
        }
        return true;
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public int k() {
        return ((N)this.X).getAutoSizeTextType();
    }

    @Override  // J1.o
    public WindowInsetsCompat l(View view0, WindowInsetsCompat windowInsetsCompat0) {
        e e0 = (e)this.X;
        d d0 = e0.k0;
        if(d0 != null) {
            e0.d0.P.remove(d0);
        }
        d d1 = new d(e0.g0, windowInsetsCompat0);
        e0.k0 = d1;
        ArrayList arrayList0 = e0.d0.P;
        if(!arrayList0.contains(d1)) {
            arrayList0.add(d1);
        }
        return windowInsetsCompat0;
    }

    @Override  // j4.a
    public void m(String s, byte[] arr_b) {
        AviDirectory aviDirectory0 = (AviDirectory)this.X;
        try {
            if(s.equals("strh")) {
                l4.b b0 = new l4.b(0, arr_b);
                b0.a = false;
                String s1 = new String(b0.d(0, 4));
                String s2 = new String(b0.d(4, 4));
                float f = b0.e(20);
                float f1 = b0.e(24);
                int v = b0.j(0x20);
                if(s1.equals("vids")) {
                    if(!aviDirectory0.containsTag(1)) {
                        float f2 = f1 / f;
                        aviDirectory0.setDouble(1, ((double)f2));
                        double f3 = (double)(((float)v) / f2);
                        int v1 = ((int)f3) / ((int)Math.pow(60.0, 2.0));
                        int v2 = ((int)f3) / ((int)Math.pow(60.0, 1.0)) - v1 * 60;
                        aviDirectory0.setString(3, String.format("%1$02d:%2$02d:%3$02d", v1, v2, ((int)Math.round(f3 / Math.pow(60.0, 0.0) - ((double)(v2 * 60))))));
                        aviDirectory0.setString(4, s2);
                    }
                }
                else if(s1.equals("auds") && !aviDirectory0.containsTag(2)) {
                    aviDirectory0.setDouble(2, ((double)(f1 / f)));
                }
            }
            else {
                if(s.equals("avih")) {
                    l4.b b1 = new l4.b(0, arr_b);
                    b1.a = false;
                    int v3 = b1.j(24);
                    int v4 = b1.j(0x20);
                    int v5 = b1.j(36);
                    aviDirectory0.setInt(6, v4);
                    aviDirectory0.setInt(7, v5);
                    aviDirectory0.setInt(8, v3);
                    return;
                }
                if(s.equals("IDIT")) {
                    String s3 = new l4.b(0, arr_b).t(0, arr_b.length, "ASCII");
                    if(s3.length() == 26 && s3.endsWith(String.valueOf(new char[]{'\n', '\u0000'}))) {
                        s3 = s3.substring(0, 24);
                    }
                    aviDirectory0.setString(320, s3);
                }
            }
        }
        catch(IOException iOException0) {
            aviDirectory0.addError(iOException0.getMessage());
        }
    }

    @Override  // io.sentry.N0
    public g7.a n(io.sentry.B b0, y1 y10) {
        w.e0(b0, "Hub is required");
        w.e0(y10, "SentryOptions is required");
        String s = ((k)this.X).X.getCacheDirPath();
        if(s != null && com.apollographql.apollo.api.b.b(s, y10.getLogger())) {
            return new g7.a(y10.getLogger(), s, new io.sentry.s(b0, y10.getSerializer(), y10.getLogger(), y10.getFlushTimeoutMillis(), y10.getMaxQueueSize()), new File(s));
        }
        y10.getLogger().h(i1.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    }

    @Override  // androidx.appcompat.widget.MenuItemHoverListener
    public void o(j j0, MenuItemImpl menuItemImpl0) {
        ((n.e)this.X).d0.removeCallbacksAndMessages(j0);
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public int p() {
        return ((N)this.X).getAutoSizeMinTextSize();
    }

    // Deobfuscation rating: LOW(30)
    @Override  // j4.a
    public boolean q(String s) {
        return s.equals("strh") || s.equals("avih") || s.equals("IDIT");
    }

    @Override  // j4.a
    public boolean r(String s) {
        return s.equals("AVI ");
    }

    @Override  // o6.c
    public void s(h h0) {
        Exception exception0 = h0.e();
        if(exception0 == null) {
            if(((p)h0).d) {
                ((Xb.k)this.X).o(null);
                return;
            }
            ((Xb.k)this.X).i(h0.f());
            return;
        }
        ((Xb.k)this.X).i(W5.f.v(exception0));
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public void t(int v) {
    }

    @Override  // io.sentry.N0
    public boolean u(String s, ILogger iLogger0) {
        return com.apollographql.apollo.api.b.b(s, iLogger0);
    }

    @Override  // androidx.appcompat.widget.MenuItemHoverListener
    public void v(j j0, MenuItemImpl menuItemImpl0) {
        n.e e0 = (n.e)this.X;
        n.d d0 = null;
        e0.d0.removeCallbacksAndMessages(null);
        ArrayList arrayList0 = e0.f0;
        int v = arrayList0.size();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(j0 == ((n.d)arrayList0.get(v1)).b) {
                break;
            }
        }
        if(v1 == -1) {
            return;
        }
        if(v1 + 1 < arrayList0.size()) {
            d0 = (n.d)arrayList0.get(v1 + 1);
        }
        B0 b00 = new B0(this, d0, menuItemImpl0, j0, 6);
        long v2 = SystemClock.uptimeMillis();
        e0.d0.postAtTime(b00, j0, v2 + 200L);
    }

    @Override  // com.sendwave.components.RequestListener
    public void w(int v, int v1, String s, String s1) {
        l l0 = (l)this.X;
        l0.getClass();
        Nb.j.f(s, "newText");
        Nb.j.f(s1, "oldText");
        l0.f0.e(v, v1, s, s1);
        ((ac.B0)l0.e0).k(l0.f0.c0.toString());
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public int x() {
        return ((N)this.X).getAutoSizeStepGranularity();
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public void y(int v) {
        ((N)this.X).setAutoSizeTextTypeWithDefaults(v);
    }

    @Override  // org.chromium.net.c
    public FileChannel z() {
        ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)this.X;
        if(parcelFileDescriptor0.getStatSize() != -1L) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0).getChannel();
        }
        parcelFileDescriptor0.close();
        throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor0);
    }
}

