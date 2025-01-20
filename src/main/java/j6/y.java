package j6;

import N5.r;
import Q4.j;
import a8.Q;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.A0;
import com.google.android.gms.internal.measurement.D0;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.F0;
import com.google.android.gms.internal.measurement.G0;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.I0;
import com.google.android.gms.internal.measurement.M0;
import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.k2;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.q2;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.r1;
import com.google.android.gms.internal.measurement.s1;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.x0;
import i.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;
import v.h;

public final class Y extends g1 implements e {
    public final s.e c0;
    public final s.e d0;
    public final s.e e0;
    public final s.e f0;
    public final s.e g0;
    public final s.e h0;
    public final g3.e i0;
    public final J j0;
    public final s.e k0;
    public final s.e l0;
    public final s.e m0;

    public Y(k1 k10) {
        super(k10);
        this.c0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        this.d0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        this.e0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        this.f0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        this.g0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        this.k0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        this.l0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        this.m0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        this.h0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        this.i0 = new g3.e(this);
        this.j0 = new J(8, this);
    }

    public final s0 A(String s, p0 p00) {
        this.q();
        this.O(s);
        D0 d00 = this.G(s);
        s0 s00 = s0.Y;
        if(d00 == null) {
            return s00;
        }
        for(Object object0: d00.s()) {
            A0 a00 = (A0)object0;
            if(Y.z(a00.p()) == p00) {
                switch(Z.c[h.d(a00.o())]) {
                    case 1: {
                        return s0.b0;
                    }
                    case 2: {
                        return s0.c0;
                    }
                    default: {
                        return s00;
                    }
                }
            }
            if(false) {
                break;
            }
        }
        return s00;
    }

    public static s.e B(I0 i00) {
        s.e e0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        for(Object object0: i00.D()) {
            e0.put(((M0)object0).o(), ((M0)object0).p());
        }
        return e0;
    }

    public final void C(String s, H0 h00) {
        HashSet hashSet0 = new HashSet();
        s.e e0 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        s.e e1 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        s.e e2 = new s.e(0);  // initializer: Ls/J;-><init>(I)V
        for(Object object0: Collections.unmodifiableList(((I0)h00.Y).B())) {
            hashSet0.add(((E0)object0).o());
        }
        for(int v = 0; v < ((I0)h00.Y).s(); ++v) {
            F0 f00 = (F0)((I0)h00.Y).p(v).l();
            if(f00.h().isEmpty()) {
                this.b().h0.d("EventConfig contained null event name");
            }
            else {
                String s1 = f00.h();
                String s2 = t0.c(f00.h(), t0.a, t0.c);
                if(!TextUtils.isEmpty(s2)) {
                    f00.f();
                    G0.p(((G0)f00.Y), s2);
                    h00.f();
                    I0.r(((I0)h00.Y), v, ((G0)f00.d()));
                }
                if(((G0)f00.Y).t() && ((G0)f00.Y).r()) {
                    e0.put(s1, Boolean.TRUE);
                }
                if(((G0)f00.Y).u() && ((G0)f00.Y).s()) {
                    e1.put(f00.h(), Boolean.TRUE);
                }
                if(((G0)f00.Y).v()) {
                    if(((G0)f00.Y).o() < 2 || ((G0)f00.Y).o() > 0xFFFF) {
                        L l0 = this.b();
                        String s3 = f00.h();
                        Integer integer0 = ((G0)f00.Y).o();
                        l0.h0.c(s3, "Invalid sampling rate. Event name, sample rate", integer0);
                    }
                    else {
                        e2.put(f00.h(), ((G0)f00.Y).o());
                    }
                }
            }
        }
        this.d0.put(s, hashSet0);
        this.e0.put(s, e0);
        this.f0.put(s, e1);
        this.h0.put(s, e2);
    }

    public final void D(String s, I0 i00) {
        g3.e e0 = this.i0;
        if(i00.o() == 0) {
            e0.m(s);
            return;
        }
        this.b().m0.b(i00.o(), "EES programs found");
        s1 s10 = (s1)i00.C().get(0);
        try {
            w w0 = new w();
            X x0 = new X(2);
            x0.b = this;
            x0.c = s;
            ((HashMap)((q2)w0.a.b0).X).put("internal.remoteConfig", x0);
            X x1 = new X(1);
            x1.b = this;
            x1.c = s;
            ((HashMap)((q2)w0.a.b0).X).put("internal.appMetadata", x1);
            j j0 = new j();
            j0.b = this;
            ((HashMap)((q2)w0.a.b0).X).put("internal.logger", j0);
            w0.a(s10);
            e0.l(s, w0);
            this.b().m0.c(s, "EES program loaded for appId, activities", s10.o().o());
            for(Object object0: s10.o().q()) {
                L l0 = this.b();
                String s1 = ((r1)object0).o();
                l0.m0.b(s1, "EES program activity");
            }
        }
        catch(com.google.android.gms.internal.measurement.J unused_ex) {
            this.b().e0.b(s, "Failed to load EES program. appId");
        }
    }

    public final void E(String s, byte[] arr_b, String s1, String s2) {
        byte[] arr_b1;
        H0 h01;
        boolean z;
        this.u();
        this.q();
        r.f(s);
        H0 h00 = (H0)this.y(s, arr_b).l();
        this.C(s, h00);
        this.D(s, ((I0)h00.d()));
        I0 i00 = (I0)h00.d();
        s.e e0 = this.g0;
        e0.put(s, i00);
        String s3 = ((I0)h00.Y).z();
        this.k0.put(s, s3);
        this.l0.put(s, s1);
        this.m0.put(s, s2);
        s.e e1 = Y.B(((I0)h00.d()));
        this.c0.put(s, e1);
        g g0 = this.s();
        ArrayList arrayList0 = new ArrayList(Collections.unmodifiableList(((I0)h00.Y).A()));
        int v = 0;
        while(v < arrayList0.size()) {
            o0 o00 = (o0)((com.google.android.gms.internal.measurement.p0)arrayList0.get(v)).l();
            if(((com.google.android.gms.internal.measurement.p0)o00.Y).s() != 0) {
                int v1 = 0;
                while(v1 < ((com.google.android.gms.internal.measurement.p0)o00.Y).s()) {
                    q0 q00 = (q0)((com.google.android.gms.internal.measurement.p0)o00.Y).p(v1).l();
                    q0 q01 = (q0)(((b2)q00.clone()));
                    String s4 = t0.c(((r0)q00.Y).v(), t0.a, t0.c);
                    if(s4 == null) {
                        z = false;
                    }
                    else {
                        q01.f();
                        r0.r(((r0)q01.Y), s4);
                        z = true;
                    }
                    int v2 = 0;
                    while(v2 < ((r0)q00.Y).o()) {
                        com.google.android.gms.internal.measurement.t0 t00 = ((r0)q00.Y).p(v2);
                        String s5 = t0.c(t00.s(), t0.g, t0.h);
                        if(s5 != null) {
                            com.google.android.gms.internal.measurement.s0 s00 = (com.google.android.gms.internal.measurement.s0)t00.l();
                            s00.f();
                            com.google.android.gms.internal.measurement.t0.o(((com.google.android.gms.internal.measurement.t0)s00.Y), s5);
                            com.google.android.gms.internal.measurement.t0 t01 = (com.google.android.gms.internal.measurement.t0)s00.d();
                            q01.f();
                            r0.q(((r0)q01.Y), v2, t01);
                            z = true;
                        }
                        ++v2;
                        q00 = q00;
                        h00 = h00;
                    }
                    if(z) {
                        o00.f();
                        com.google.android.gms.internal.measurement.p0.q(((com.google.android.gms.internal.measurement.p0)o00.Y), v1, ((r0)q01.d()));
                        arrayList0.set(v, ((com.google.android.gms.internal.measurement.p0)o00.d()));
                    }
                    ++v1;
                    e0 = e0;
                    h00 = h00;
                }
            }
            if(((com.google.android.gms.internal.measurement.p0)o00.Y).u() != 0) {
                for(int v3 = 0; v3 < ((com.google.android.gms.internal.measurement.p0)o00.Y).u(); ++v3) {
                    x0 x00 = ((com.google.android.gms.internal.measurement.p0)o00.Y).t(v3);
                    String s6 = t0.c(x00.s(), t0.e, t0.f);
                    if(s6 != null) {
                        w0 w00 = (w0)x00.l();
                        w00.f();
                        x0.p(((x0)w00.Y), s6);
                        o00.f();
                        com.google.android.gms.internal.measurement.p0.r(((com.google.android.gms.internal.measurement.p0)o00.Y), v3, ((x0)w00.d()));
                        arrayList0.set(v, ((com.google.android.gms.internal.measurement.p0)o00.d()));
                    }
                }
            }
            ++v;
            e0 = e0;
            h00 = h00;
        }
        g0.u();
        g0.q();
        r.f(s);
        SQLiteDatabase sQLiteDatabase0 = g0.y();
        sQLiteDatabase0.beginTransaction();
        try {
            g0.u();
            g0.q();
            r.f(s);
            SQLiteDatabase sQLiteDatabase1 = g0.y();
            sQLiteDatabase1.delete("property_filters", "app_id=?", new String[]{s});
            sQLiteDatabase1.delete("event_filters", "app_id=?", new String[]{s});
            Iterator iterator0 = arrayList0.iterator();
        label_87:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                com.google.android.gms.internal.measurement.p0 p00 = (com.google.android.gms.internal.measurement.p0)object0;
                g0.u();
                g0.q();
                r.f(s);
                r.j(p00);
                if(p00.x()) {
                    int v5 = p00.o();
                    for(Object object1: p00.v()) {
                        if(!((r0)object1).B()) {
                            L l1 = g0.b();
                            M m1 = L.u(s);
                            l1.h0.c(m1, "Event filter with no ID. Audience definition ignored. appId, audienceId", v5);
                            continue label_87;
                        }
                        if(false) {
                            break;
                        }
                    }
                    for(Object object2: p00.w()) {
                        if(!((x0)object2).w()) {
                            L l2 = g0.b();
                            M m2 = L.u(s);
                            l2.h0.c(m2, "Property filter with no ID. Audience definition ignored. appId, audienceId", v5);
                            continue label_87;
                        }
                        if(false) {
                            break;
                        }
                    }
                    boolean z1 = true;
                    for(Object object3: p00.v()) {
                        if(!g0.b0(s, v5, ((r0)object3))) {
                            z1 = false;
                            break;
                        }
                    }
                    if(z1) {
                        for(Object object4: p00.w()) {
                            if(!g0.c0(s, v5, ((x0)object4))) {
                                z1 = false;
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    if(!z1) {
                        g0.u();
                        g0.q();
                        r.f(s);
                        SQLiteDatabase sQLiteDatabase2 = g0.y();
                        sQLiteDatabase2.delete("property_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v5)});
                        sQLiteDatabase2.delete("event_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v5)});
                    }
                }
                else {
                    L l0 = g0.b();
                    M m0 = L.u(s);
                    l0.h0.b(m0, "Audience with no ID. appId");
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object5: arrayList0) {
                com.google.android.gms.internal.measurement.p0 p01 = (com.google.android.gms.internal.measurement.p0)object5;
                arrayList1.add((p01.x() ? p01.o() : null));
            }
            g0.k0(s, arrayList1);
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        try {
            h01 = h00;
            h00.f();
            h01 = h00;
            I0.q(((I0)h01.Y));
            arr_b1 = ((I0)h01.d()).c();
        }
        catch(RuntimeException runtimeException0) {
            L l3 = this.b();
            M m3 = L.u(s);
            l3.h0.c(m3, "Unable to serialize reduced-size config. Storing full config instead. appId", runtimeException0);
            arr_b1 = arr_b;
        }
        g g1 = this.s();
        r.f(s);
        g1.q();
        g1.u();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("remote_config", arr_b1);
        contentValues0.put("config_last_modified_time", s1);
        contentValues0.put("e_tag", s2);
        try {
            if(((long)g1.y().update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L) {
                L l4 = g1.b();
                M m4 = L.u(s);
                l4.e0.b(m4, "Failed to update remote config (got 0). appId");
            }
        }
        catch(SQLiteException sQLiteException0) {
            L l5 = g1.b();
            M m5 = L.u(s);
            l5.e0.c(m5, "Error storing remote config. appId", sQLiteException0);
        }
        e0.put(s, ((I0)h01.d()));
    }

    public final int F(String s, String s1) {
        this.q();
        this.O(s);
        Map map0 = (Map)this.h0.get(s);
        if(map0 != null) {
            Integer integer0 = (Integer)map0.get(s1);
            return integer0 == null ? 1 : ((int)integer0);
        }
        return 1;
    }

    public final D0 G(String s) {
        this.q();
        this.O(s);
        I0 i00 = this.H(s);
        return i00 == null || !i00.E() ? null : i00.u();
    }

    public final I0 H(String s) {
        this.u();
        this.q();
        r.f(s);
        this.O(s);
        return (I0)this.g0.get(s);
    }

    public final boolean I(String s, p0 p00) {
        this.q();
        this.O(s);
        D0 d00 = this.G(s);
        if(d00 == null) {
            return false;
        }
        for(Object object0: d00.q()) {
            A0 a00 = (A0)object0;
            if(p00 == Y.z(a00.p())) {
                return a00.o() == 2;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final boolean J(String s, String s1) {
        this.q();
        this.O(s);
        if("ecommerce_purchase".equals(s1)) {
            return true;
        }
        if(!"purchase".equals(s1) && !"refund".equals(s1)) {
            Map map0 = (Map)this.f0.get(s);
            if(map0 != null) {
                Boolean boolean0 = (Boolean)map0.get(s1);
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean K(String s, String s1) {
        this.q();
        this.O(s);
        if("1".equals(this.d(s, "measurement.upload.blacklist_internal")) && j6.r1.w0(s1)) {
            return true;
        }
        if("1".equals(this.d(s, "measurement.upload.blacklist_public")) && j6.r1.x0(s1)) {
            return true;
        }
        Map map0 = (Map)this.e0.get(s);
        if(map0 != null) {
            Boolean boolean0 = (Boolean)map0.get(s1);
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        return false;
    }

    public final String L(String s) {
        this.q();
        this.O(s);
        return (String)this.k0.get(s);
    }

    public final boolean M(String s) {
        this.q();
        this.O(s);
        return this.d0.get(s) != null && ((Set)this.d0.get(s)).contains("app_instance_id");
    }

    public final boolean N(String s) {
        this.q();
        this.O(s);
        return this.d0.get(s) != null && (((Set)this.d0.get(s)).contains("os_version") || ((Set)this.d0.get(s)).contains("device_info"));
    }

    public final void O(String s) {
        Q q0;
        String s2;
        String s1;
        byte[] arr_b;
        Cursor cursor0;
        this.u();
        this.q();
        r.f(s);
        s.e e0 = this.g0;
        if(e0.get(s) == null) {
            g g0 = this.s();
            r.f(s);
            g0.q();
            g0.u();
            try {
                cursor0 = null;
                cursor0 = g0.y().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{s}, null, null, null);
                goto label_15;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_29;
            }
            catch(Throwable throwable0) {
            }
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
            try {
            label_15:
                if(cursor0.moveToFirst()) {
                    arr_b = cursor0.getBlob(0);
                    s1 = cursor0.getString(1);
                    s2 = cursor0.getString(2);
                    if(cursor0.moveToNext()) {
                        L l0 = g0.b();
                        M m0 = L.u(s);
                        l0.e0.b(m0, "Got multiple records for app config, expected one. appId");
                    }
                    goto label_23;
                }
                else {
                    goto label_41;
                }
                goto label_43;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_29;
            }
            catch(Throwable throwable0) {
                goto label_37;
            }
        label_23:
            if(arr_b == null) {
                cursor0.close();
                goto label_34;
            }
            else {
                try {
                    try {
                        q0 = new Q(arr_b, s1, s2, 14);
                        goto label_39;
                    }
                    catch(SQLiteException sQLiteException0) {
                    }
                label_29:
                    L l1 = g0.b();
                    M m1 = L.u(s);
                    l1.e0.c(m1, "Error querying remote config. appId", sQLiteException0);
                    if(cursor0 != null) {
                        goto label_33;
                    }
                    goto label_34;
                }
                catch(Throwable throwable0) {
                    goto label_37;
                }
            label_33:
                cursor0.close();
            label_34:
                q0 = null;
                goto label_43;
            label_37:
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            label_39:
                cursor0.close();
                goto label_43;
            label_41:
                cursor0.close();
                q0 = null;
            }
        label_43:
            s.e e1 = this.m0;
            s.e e2 = this.l0;
            s.e e3 = this.k0;
            s.e e4 = this.c0;
            if(q0 == null) {
                e4.put(s, null);
                this.e0.put(s, null);
                this.d0.put(s, null);
                this.f0.put(s, null);
                e0.put(s, null);
                e3.put(s, null);
                e2.put(s, null);
                e1.put(s, null);
                this.h0.put(s, null);
                return;
            }
            H0 h00 = (H0)this.y(s, ((byte[])q0.Y)).l();
            this.C(s, h00);
            e4.put(s, Y.B(((I0)h00.d())));
            e0.put(s, ((I0)h00.d()));
            this.D(s, ((I0)h00.d()));
            e3.put(s, ((I0)h00.Y).z());
            e2.put(s, ((String)q0.Z));
            e1.put(s, ((String)q0.b0));
        }
    }

    @Override  // j6.e
    public final String d(String s, String s1) {
        this.q();
        this.O(s);
        Map map0 = (Map)this.c0.get(s);
        return map0 == null ? null : ((String)map0.get(s1));
    }

    @Override  // j6.g1
    public final boolean w() {
        return false;
    }

    public final long x(String s) {
        String s1 = this.d(s, "measurement.account.time_zone_offset_minutes");
        if(!TextUtils.isEmpty(s1)) {
            try {
                return Long.parseLong(s1);
            }
            catch(NumberFormatException numberFormatException0) {
                L l0 = this.b();
                M m0 = L.u(s);
                l0.h0.c(m0, "Unable to parse timezone offset. appId", numberFormatException0);
            }
        }
        return 0L;
    }

    public final I0 y(String s, byte[] arr_b) {
        if(arr_b == null) {
            return I0.w();
        }
        try {
            I0 i00 = (I0)((H0)O.E(I0.v(), arr_b)).d();
            N n0 = this.b().m0;
            String s1 = null;
            Long long0 = i00.H() ? i00.t() : null;
            if(i00.F()) {
                s1 = i00.y();
            }
            n0.c(long0, "Parsed config. version, gmp_app_id", s1);
            return i00;
        }
        catch(k2 k20) {
        }
        catch(RuntimeException runtimeException0) {
            goto label_17;
        }
        L l0 = this.b();
        M m0 = L.u(s);
        l0.h0.c(m0, "Unable to merge remote config. appId", k20);
        return I0.w();
    label_17:
        L l1 = this.b();
        M m1 = L.u(s);
        l1.h0.c(m1, "Unable to merge remote config. appId", runtimeException0);
        return I0.w();
    }

    public static p0 z(int v) {
        switch(Z.b[h.d(v)]) {
            case 1: {
                return p0.Y;
            }
            case 2: {
                return p0.Z;
            }
            case 3: {
                return p0.b0;
            }
            case 4: {
                return p0.c0;
            }
            default: {
                return null;
            }
        }
    }
}

