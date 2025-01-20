package q9;

import Ab.k;
import Ab.t;
import Eb.a;
import J9.l;
import Nb.j;
import V8.d;
import W5.f;
import Y8.K;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Parcelable;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.widget.Toast;
import androidx.lifecycle.ViewModel;
import com.apollographql.apollo.api.b;
import com.sendwave.util.UNIT;
import com.wave.customer.CustomerApp;
import com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeActivity;
import com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeContext.Authenticated;
import com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeParams;
import com.wave.customer.risk.ussdsecuritychallenge.UssdSecurityChallengeActivity;
import d9.R0;
import hb.h;
import hb.n;
import io.sentry.i1;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import w1.c;

public class j3 implements d {
    public final k3 a;

    public j3(k3 k30) {
        this.a = k30;
    }

    @Override  // V8.d
    public final void C(String s) {
        Toast toast0 = Toast.makeText(this.a.getApplicationContext(), s, 1);
        toast0.setGravity(17, 0, 0);
        toast0.show();
    }

    @Override  // V8.d
    public final R0 D() {
        String s4;
        k3 k30 = this.a;
        String s = o0.u(k30);
        String s1 = null;
        if(Build.VERSION.SDK_INT < 0x1F || c.a(k30, "android.permission.BLUETOOTH_CONNECT") == 0) {
            BluetoothAdapter bluetoothAdapter0 = BluetoothAdapter.getDefaultAdapter();
            if(bluetoothAdapter0 != null) {
                try {
                    s1 = bluetoothAdapter0.getName();
                }
                catch(NullPointerException unused_ex) {
                }
            }
        }
        if(s1 == null) {
            ContentResolver contentResolver0 = k30.getContentResolver();
            s1 = Settings.Global.getString(contentResolver0, "device_name");
            if(Build.VERSION.SDK_INT <= 0x1F && s1 == null) {
                s1 = Settings.Secure.getString(contentResolver0, "bluetooth_name");
            }
            if(s1 == null) {
                s1 = Settings.Secure.getString(contentResolver0, "lock_screen_owner_info");
            }
            if(s1 == null) {
                s1 = Settings.System.getString(contentResolver0, "bluetooth_name");
            }
            if(s1 == null) {
                s1 = Settings.System.getString(contentResolver0, "device_name");
            }
        }
        if(s1 == null) {
            s1 = "Android device";
        }
        String s2 = Build.MANUFACTURER;
        String s3 = Build.MODEL;
        if(s3.startsWith(s2)) {
            s4 = h.D(s3);
            return new R0(s, s1, h.Q(Build.DEVICE, s3, s4));
        }
        s4 = h.D(s2) + " " + s3;
        return new R0(s, s1, h.Q(Build.DEVICE, s3, s4));
    }

    @Override  // V8.d
    public final void F(String s) {
        j.f(s, "number");
        this.a.D(s);
    }

    @Override  // V8.d
    public final void O() {
        k3 k30 = this.a;
        k30.getClass();
        String s = ((CustomerApp)r1.b(k30)).d().h();
        if(s != null) {
            MagicLinkSecurityChallengeParams magicLinkSecurityChallengeParams0 = new MagicLinkSecurityChallengeParams(new Authenticated(s));
            o0.F(k30, MagicLinkSecurityChallengeActivity.class, magicLinkSecurityChallengeParams0);
            return;
        }
        Map map0 = b.t("team", "risk");
        n.d("Tried to launch MagicLinkSecurityChallengeActivity but the user is not logged in", i1.WARNING, map0, false, 8);
    }

    @Override  // V8.d
    public final void V(Class class0, Parcelable parcelable0) {
        j.f(class0, "activityClass");
        j.f(parcelable0, "params");
        o0.F(this.a, class0, parcelable0);
    }

    @Override  // V8.d
    public final Object X(String s, String s1, String s2, String s3, String s4, String s5, int v, Function1 function10, g g0) {
        return this.a.G("", s, s1, s2, s3, s4, s5, v, function10, ((Fb.c)g0));
    }

    @Override  // V8.d
    public final void Y(Parcelable parcelable0) {
        j.f(parcelable0, "params");
        o0.T(this.a, parcelable0, true);
    }

    @Override  // V8.d
    public final Object c0(String s, String s1, K k0) {
        return j3.j0(this, s, s1, k0);
    }

    @Override  // V8.d
    public final void g() {
        this.a.getClass();
        r1.b(this.a);
        o0.F(this.a, UssdSecurityChallengeActivity.class, UNIT.X);
    }

    @Override  // V8.d
    public final void g0() {
        this.a.finish();
    }

    @Override  // V8.d
    public final Object h0(int v, ViewModel viewModel0, Object object0, Fb.c c0) {
        return j3.k0(this, v, viewModel0, object0, c0);
    }

    @Override  // V8.d
    public final Object i(boolean z) {
        k3 k30 = this.a;
        if(z) {
            k30.getWindow().addFlags(0x2000);
            return t.a;
        }
        k30.getWindow().clearFlags(0x2000);
        return t.a;
    }

    @Override  // V8.d
    public final Object j(String s, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, CharSequence charSequence3, boolean z, Integer integer0, Object object0, Object object1, g g0) {
        return this.a.F(s, charSequence0, charSequence1, charSequence2, charSequence3, z, integer0, object0, object1, g0);
    }

    public static Object j0(j3 j30, String s, String s1, Fb.c c0) {
        h3 h30;
        if(c0 instanceof h3) {
            h30 = (h3)c0;
            int v = h30.e0;
            if((v & 0x80000000) == 0) {
                h30 = new h3(j30, c0);
            }
            else {
                h30.e0 = v ^ 0x80000000;
            }
        }
        else {
            h30 = new h3(j30, c0);
        }
        Object object0 = h30.c0;
        Object object1 = a.X;
        switch(h30.e0) {
            case 0: {
                f.b0(object0);
                j30.a.getClass();
                r1.b(j30.a);
                String s2 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
                j30.a.getClass();
                r1.b(j30.a);
                h30.b0 = j30;
                h30.e0 = 1;
                object0 = j30.a.F(s, s1, s2, null, null, true, null, null, null, h30);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                j30 = h30.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Integer)object0) != null && ((int)(((Integer)object0))) == -1) {
            j30.a.getClass();
            r1.b(j30.a);
        }
        return t.a;
    }

    public static Object k0(j3 j30, int v, ViewModel viewModel0, Object object0, Fb.c c0) {
        i3 i30;
        if(c0 instanceof i3) {
            i30 = (i3)c0;
            int v1 = i30.d0;
            if((v1 & 0x80000000) == 0) {
                i30 = new i3(j30, c0);
            }
            else {
                i30.d0 = v1 ^ 0x80000000;
            }
        }
        else {
            i30 = new i3(j30, c0);
        }
        Object object1 = i30.b0;
        Object object2 = a.X;
        switch(i30.d0) {
            case 0: {
                f.b0(object1);
                e3 e30 = new e3(j30.a, v, viewModel0, object0);
                i30.d0 = 1;
                object1 = o0.Z(j30.a, e30, i30);
                return object1 == object2 ? object2 : ((k)object1).Y;
            }
            case 1: {
                f.b0(object1);
                return ((k)object1).Y;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // V8.d
    public final Object l(Class class0, Parcelable parcelable0, Class class1, g g0) {
        return o0.d(this.a, class0, parcelable0, class1, g0);
    }

    @Override  // V8.d
    public final Object n(Fb.j j0) {
        kotlin.coroutines.k k0 = new kotlin.coroutines.k(N4.j.w(j0));
        g3 g30 = new g3();  // initializer: Ljava/lang/Object;-><init>()V
        this.a.findViewById(0x7F0A0246).animate().xBy(-100.0f).setInterpolator(g30).setDuration(500L).withEndAction(new f3(0, k0)).start();  // id:pin_dots
        Object object0 = k0.c();
        return object0 != a.X ? t.a : object0;
    }

    @Override  // V8.d
    public final void o(Uri uri0) {
        j.f(uri0, "uri");
        k3 k30 = this.a;
        j.f(k30, "<this>");
        C3 c30 = r1.b(k30);
        if(!(c30 instanceof q3)) {
            throw new Exception("This app can\'t launch URIs");
        }
        Intent intent0 = ((l)(((q3)c30))).v(uri0, c30);
        List list0 = k30.getPackageManager().queryIntentActivities(intent0, 0x20000);
        j.e(list0, "queryIntentActivities(...)");
        if(!list0.isEmpty()) {
            k30.startActivity(intent0);
            return;
        }
        n.d(("URI translated to an invalid intent that could not be launched: " + uri0), i1.WARNING, null, false, 12);
    }

    @Override  // V8.d
    public final void r() {
        this.a.getClass();
        B9.f.e(r1.b(this.a).d(), "too_many_screen_unlocking_attempts", null, 6);
    }

    @Override  // V8.d
    public final Object y(String s, String s1, g g0) {
        String s2 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
        String s3 = r1.d(0x7F120091, new Object[0]);  // string:cancel "Cancel"
        return this.a.H(s, s1, s2, s3, ((Fb.c)g0));
    }
}

