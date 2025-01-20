package pa;

import Ab.n;
import Fb.c;
import K5.b;
import Nb.j;
import U5.a;
import Xb.J;
import Xb.q;
import ac.h;
import ac.o0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.location.LocationManager;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.FlowLiveDataConversions;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import f9.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import o6.p;
import o9.e;
import q9.j3;

public final class k extends j3 implements f {
    public final LocationRequest b;
    public final h c;
    public final NearbyAgentsActivity d;

    public k(NearbyAgentsActivity nearbyAgentsActivity0) {
        this.d = nearbyAgentsActivity0;
        super(nearbyAgentsActivity0);
        LocationRequest locationRequest0 = LocationRequest.g();
        a.Y(102);
        locationRequest0.X = 102;
        this.b = locationRequest0;
        this.c = FlowLiveDataConversions.a(new t(nearbyAgentsActivity0));
    }

    @Override  // pa.f
    public final Object L(boolean z, g g0) {
        pa.h h0;
        if(g0 instanceof pa.h) {
            h0 = (pa.h)g0;
            int v = h0.d0;
            if((v & 0x80000000) == 0) {
                h0 = new pa.h(this, ((c)g0));
            }
            else {
                h0.d0 = v ^ 0x80000000;
            }
        }
        else {
            h0 = new pa.h(this, ((c)g0));
        }
        Object object0 = h0.b0;
        Object object1 = Eb.a.X;
        boolean z1 = false;
        switch(h0.d0) {
            case 0: {
                W5.f.b0(object0);
                NearbyAgentsActivity nearbyAgentsActivity0 = this.d;
                Context context0 = nearbyAgentsActivity0.getApplicationContext();
                if(b.d.b(context0, K5.c.a) == 0) {
                    h0.d0 = 1;
                    Object object2 = this.l0(h0);
                    return object2 == object1 ? object1 : object2;
                }
                Object object3 = nearbyAgentsActivity0.getApplicationContext().getSystemService("location");
                LocationManager locationManager0 = object3 instanceof LocationManager ? ((LocationManager)object3) : null;
                if((locationManager0 == null ? false : locationManager0.isProviderEnabled("gps"))) {
                    return Boolean.valueOf(true);
                }
                h0.d0 = 2;
                nearbyAgentsActivity0.J0 = J.a();
                Intent intent0 = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                if(z) {
                    nearbyAgentsActivity0.I0.a(intent0);
                }
                else {
                    i.f f0 = new i.f(nearbyAgentsActivity0);
                    f0.a.f = f0.a.a.getText(0x7F120141);  // string:enable_your_device_location "Enable your device location"
                    e e0 = new e(nearbyAgentsActivity0, intent0, 1);
                    f0.a.g = f0.a.a.getText(0x7F1202DC);  // string:ok "OK"
                    f0.a.h = e0;
                    J9.h h1 = new J9.h(3, nearbyAgentsActivity0);
                    f0.a.i = f0.a.a.getText(0x7F120091);  // string:cancel "Cancel"
                    f0.a.j = h1;
                    f0.a().show();
                }
                q q0 = nearbyAgentsActivity0.J0;
                if(q0 == null) {
                    j.p("locationCompletable");
                    throw null;
                }
                object0 = q0.A(h0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                W5.f.b0(object0);
                return ((n)object0).X;
            }
            case 2: {
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue()) {
            z1 = true;
        }
        return Boolean.valueOf(z1);
    }

    @Override  // pa.f
    public final Object h(A a0) {
        return o0.s(new Na.f(9, this.c), a0);
    }

    public final Serializable l0(c c0) {
        Serializable serializable1;
        k k0;
        i i0;
        if(c0 instanceof i) {
            i0 = (i)c0;
            int v = i0.e0;
            if((v & 0x80000000) == 0) {
                i0 = new i(this, c0);
            }
            else {
                i0.e0 = v ^ 0x80000000;
            }
        }
        else {
            i0 = new i(this, c0);
        }
        Object object0 = i0.c0;
        Serializable serializable0 = Eb.a.X;
        switch(i0.e0) {
            case 0: {
                W5.f.b0(object0);
                ArrayList arrayList0 = new ArrayList();
                LocationRequest locationRequest0 = this.b;
                if(locationRequest0 != null) {
                    arrayList0.add(locationRequest0);
                }
                try {
                    d6.b b0 = new d6.b(this.d, this.d, d6.b.k, L5.b.b, L5.e.c);  // initializer: LL5/f;-><init>(Landroid/content/Context;Landroid/app/Activity;LR2/k;LL5/b;LL5/e;)V
                    LocationSettingsRequest locationSettingsRequest0 = new LocationSettingsRequest(arrayList0, false, false);
                    J9.f f0 = J9.f.c();
                    f0.c = new B3.c(25, locationSettingsRequest0);
                    f0.b = 0x97A;
                    p p0 = b0.c(0, f0.b());
                    j.e(p0, "checkLocationSettings(...)");
                    i0.b0 = this;
                    i0.e0 = 1;
                    if(N4.h.k(p0, i0) == serializable0) {
                        return serializable0;
                    }
                    k0 = this;
                    serializable1 = Boolean.TRUE;
                    goto label_43;
                }
                catch(CancellationException cancellationException0) {
                    throw cancellationException0;
                }
                catch(Throwable throwable0) {
                }
                k0 = this;
                goto label_42;
            }
            case 1: {
                try {
                    k0 = i0.b0;
                    W5.f.b0(object0);
                    serializable1 = Boolean.TRUE;
                    goto label_43;
                }
                catch(CancellationException cancellationException0) {
                    throw cancellationException0;
                }
                catch(Throwable throwable0) {
                }
            label_42:
                serializable1 = W5.f.v(throwable0);
            label_43:
                Throwable throwable1 = n.a(serializable1);
                if(throwable1 == null) {
                    return serializable1;
                }
                try {
                    if(!(throwable1 instanceof L5.k)) {
                        throw throwable1;
                    }
                    i0.b0 = null;
                    i0.e0 = 2;
                    object0 = k0.m0(((L5.k)throwable1), i0);
                    if(object0 == serializable0) {
                        return serializable0;
                    label_53:
                        W5.f.b0(object0);
                    }
                    ((Boolean)object0).getClass();
                    return (Boolean)object0;
                }
                catch(Throwable throwable2) {
                    break;
                }
            }
            case 2: {
                goto label_53;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return W5.f.v(throwable2);
    }

    public final Object m0(L5.k k0, i i0) {
        j.e(k0.X.Z, "getResolution(...)");
        IntentSender intentSender0 = k0.X.Z.getIntentSender();
        j.e(intentSender0, "pendingIntent.intentSender");
        IntentSenderRequest intentSenderRequest0 = new IntentSenderRequest(intentSender0, null, 0, 0);
        this.d.J0 = J.a();
        this.d.H0.a(intentSenderRequest0);
        q q0 = this.d.J0;
        if(q0 != null) {
            return q0.A(i0);
        }
        j.p("locationCompletable");
        throw null;
    }

    @Override  // pa.f
    public final Object p(C c0) {
        NearbyAgentsActivity nearbyAgentsActivity0 = this.d;
        nearbyAgentsActivity0.getClass();
        if(w1.c.a(nearbyAgentsActivity0, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return pa.a.X;
        }
        nearbyAgentsActivity0.G0 = J.a();
        nearbyAgentsActivity0.F0.a(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
        q q0 = nearbyAgentsActivity0.G0;
        if(q0 != null) {
            return q0.A(c0);
        }
        j.p("permissionCompletable");
        throw null;
    }
}

