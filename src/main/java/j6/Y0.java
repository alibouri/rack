package j6;

import G1.n;
import N5.r;
import android.os.Bundle;
import com.apollographql.apollo.api.b;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzon;
import g.a;
import java.util.Iterator;
import java.util.TreeSet;

public final class y0 implements Runnable {
    public final int X;
    public Bundle Y;
    public w0 Z;

    public y0() {
        this.X = 0;
        super();
    }

    public y0(w0 w00, Bundle bundle0, int v) {
        this.X = v;
        this.Y = bundle0;
        this.Z = w00;
        super();
    }

    @Override
    public final void run() {
        zzbf zzbf2;
        zzbf zzbf1;
        zzbf zzbf0;
        zzbf zzbf3;
        d d0;
        a a0;
        Bundle bundle2;
        switch(this.X) {
            case 0: {
                w0 w01 = this.Z;
                w01.getClass();
                Bundle bundle1 = this.Y;
                d0 d01 = (d0)w01.Y;
                if(bundle1.isEmpty()) {
                    bundle2 = bundle1;
                }
                else {
                    bundle2 = w01.o().y0.f();
                    if(d01.e0.B(null, s.h1)) {
                        bundle2 = new Bundle(bundle2);
                    }
                    Iterator iterator0 = bundle1.keySet().iterator();
                    while(true) {
                        boolean z = iterator0.hasNext();
                        a0 = w01.u0;
                        d0 = d01.e0;
                        if(!z) {
                            break;
                        }
                        Object object0 = iterator0.next();
                        String s2 = (String)object0;
                        Object object1 = bundle1.get(s2);
                        if(object1 != null && !(object1 instanceof String) && !(object1 instanceof Long) && !(object1 instanceof Double)) {
                            w01.p();
                            if(r1.Z(object1)) {
                                w01.p();
                                r1.S(a0, null, 27, null, null, 0);
                            }
                            w01.b().j0.c(s2, "Invalid default event parameter type. Name, value", object1);
                        }
                        else if(r1.w0(s2)) {
                            w01.b().j0.b(s2, "Invalid default event parameter name. Name");
                        }
                        else if(object1 == null) {
                            bundle2.remove(s2);
                        }
                        else {
                            r1 r13 = w01.p();
                            d0.getClass();
                            if(r13.c0("param", s2, 500, object1)) {
                                w01.p().K(bundle2, s2, object1);
                            }
                        }
                    }
                    w01.p();
                    int v = d0.p().h0(201500000) ? 100 : 25;
                    if(bundle2.size() > v) {
                        int v1 = 0;
                        for(Object object2: new TreeSet(bundle2.keySet())) {
                            String s3 = (String)object2;
                            ++v1;
                            if(v1 > v) {
                                bundle2.remove(s3);
                            }
                        }
                        w01.p();
                        r1.S(a0, null, 26, null, null, 0);
                        w01.b().j0.d("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                w01.o().y0.j(bundle2);
                if(!bundle1.isEmpty() || d01.e0.B(null, s.f1)) {
                    P0 p00 = b.n(d01);
                    p00.z(new n(p00, p00.J(false), bundle2, 11));
                }
                return;
            }
            case 1: {
                w0 w02 = this.Z;
                w02.q();
                w02.u();
                Bundle bundle3 = this.Y;
                String s4 = bundle3.getString("name");
                r.f(s4);
                d0 d02 = (d0)w02.Y;
                if(!d02.i()) {
                    w02.b().m0.d("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                zzon zzon1 = new zzon(0L, null, s4, "");
                try {
                    r1 r14 = w02.p();
                    bundle3.getString("app_id");
                    zzbf3 = r14.D(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true);
                }
                catch(IllegalArgumentException unused_ex) {
                    return;
                }
                zzae zzae1 = new zzae(bundle3.getString("app_id"), "", zzon1, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), zzbf3);
                d02.q().x(zzae1);
                return;
            }
            default: {
                w0 w00 = this.Z;
                w00.q();
                w00.u();
                Bundle bundle0 = this.Y;
                String s = bundle0.getString("name");
                String s1 = bundle0.getString("origin");
                r.f(s);
                r.f(s1);
                r.j(bundle0.get("value"));
                d0 d00 = (d0)w00.Y;
                if(!d00.i()) {
                    w00.b().m0.d("Conditional property not set since app measurement is disabled");
                    return;
                }
                zzon zzon0 = new zzon(bundle0.getLong("triggered_timestamp"), bundle0.get("value"), s, s1);
                try {
                    r1 r10 = w00.p();
                    bundle0.getString("app_id");
                    zzbf0 = r10.D(bundle0.getString("triggered_event_name"), bundle0.getBundle("triggered_event_params"), s1, 0L, true);
                    r1 r11 = w00.p();
                    bundle0.getString("app_id");
                    zzbf1 = r11.D(bundle0.getString("timed_out_event_name"), bundle0.getBundle("timed_out_event_params"), s1, 0L, true);
                    r1 r12 = w00.p();
                    bundle0.getString("app_id");
                    zzbf2 = r12.D(bundle0.getString("expired_event_name"), bundle0.getBundle("expired_event_params"), s1, 0L, true);
                }
                catch(IllegalArgumentException unused_ex) {
                    return;
                }
                zzae zzae0 = new zzae(bundle0.getString("app_id"), s1, zzon0, bundle0.getLong("creation_timestamp"), false, bundle0.getString("trigger_event_name"), zzbf1, bundle0.getLong("trigger_timeout"), zzbf0, bundle0.getLong("time_to_live"), zzbf2);
                d00.q().x(zzae0);
            }
        }
    }
}

