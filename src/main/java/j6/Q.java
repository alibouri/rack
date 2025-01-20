package j6;

import N5.r;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

public final class q {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzbe f;

    public q(d0 d00, String s, String s1, String s2, long v, long v1, Bundle bundle0) {
        r.f(s1);
        zzbe zzbe0;
        r.f(s2);
        this.a = s1;
        this.b = s2;
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.c = s;
        this.d = v;
        this.e = v1;
        if(v1 != 0L && v1 > v) {
            d0.h(d00.g0);
            M m0 = L.u(s1);
            d00.g0.h0.b(m0, "Event created with reverse previous/current timestamps. appId");
        }
        if(bundle0 == null || bundle0.isEmpty()) {
            zzbe0 = new zzbe(new Bundle());
        }
        else {
            Bundle bundle1 = new Bundle(bundle0);
            Iterator iterator0 = bundle1.keySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s3 = (String)object0;
                if(s3 == null) {
                    d0.h(d00.g0);
                    d00.g0.e0.d("Param name can\'t be null");
                    iterator0.remove();
                }
                else {
                    d0.e(d00.j0);
                    Object object1 = bundle1.get(s3);
                    Object object2 = d00.j0.k0(object1, s3);
                    if(object2 == null) {
                        d0.h(d00.g0);
                        String s4 = d00.k0.f(s3);
                        d00.g0.h0.b(s4, "Param value can\'t be null");
                        iterator0.remove();
                    }
                    else {
                        d0.e(d00.j0);
                        d00.j0.K(bundle1, s3, object2);
                    }
                }
            }
            zzbe0 = new zzbe(bundle1);
        }
        this.f = zzbe0;
    }

    public q(d0 d00, String s, String s1, String s2, long v, long v1, zzbe zzbe0) {
        r.f(s1);
        r.f(s2);
        r.j(zzbe0);
        this.a = s1;
        this.b = s2;
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.c = s;
        this.d = v;
        this.e = v1;
        if(v1 != 0L && v1 > v) {
            d0.h(d00.g0);
            M m0 = L.u(s1);
            M m1 = L.u(s2);
            d00.g0.h0.c(m0, "Event created with reverse previous/current timestamps. appId, name", m1);
        }
        this.f = zzbe0;
    }

    public final q a(d0 d00, long v) {
        return new q(d00, this.c, this.a, this.b, this.d, v, this.f);
    }

    @Override
    public final String toString() {
        return "Event{appId=\'" + this.a + "\', name=\'" + this.b + "\', params=" + this.f + "}";
    }
}

