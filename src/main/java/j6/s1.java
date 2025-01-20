package j6;

import M.J;
import N5.r;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.V0;
import com.google.android.gms.internal.measurement.W0;
import com.google.android.gms.internal.measurement.X0;
import com.google.android.gms.internal.measurement.Y0;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.n1;
import com.google.android.gms.internal.measurement.p1;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s.a;
import s.b;
import s.e;

public final class s1 extends g1 {
    public String c0;
    public HashSet d0;
    public e e0;
    public Long f0;
    public Long g0;

    // This method was un-flattened
    public final void A(List list0, boolean z) {
        // ERROR - The method was not decompiled
        // Self interruption (operation timed-out, maximum duration allowed was 60000 ms)
    }

    // This method was un-flattened
    public final void B(List list0) {
        Iterator iterator3;
        Integer integer1;
        Boolean boolean2;
        BigDecimal bigDecimal0;
        Boolean boolean1;
        Long long2;
        Boolean boolean0;
        e e2;
        Map map1;
        d0 d00;
        x0 x01;
        x0 x00;
        Cursor cursor0;
        if(list0.isEmpty()) {
            return;
        }
        e e0 = new e(0);  // initializer: Ls/J;-><init>(I)V
        for(Object object0: list0) {
            p1 p10 = (p1)object0;
            String s = p10.B();
            Map map0 = (Map)e0.get(s);
            if(map0 == null) {
                g g0 = this.s();
                String s1 = this.c0;
                g0.u();
                g0.q();
                r.f(s1);
                r.f(s);
                e e1 = new e(0);  // initializer: Ls/J;-><init>(I)V
                SQLiteDatabase sQLiteDatabase0 = g0.y();
                try {
                    cursor0 = null;
                    cursor0 = sQLiteDatabase0.query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{s1, s}, null, null, null);
                    goto label_24;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_44;
                }
                catch(Throwable throwable0) {
                }
                Cursor cursor1 = null;
                goto label_53;
                try {
                label_24:
                    if(cursor0.moveToFirst()) {
                        do {
                            byte[] arr_b = cursor0.getBlob(1);
                            try {
                                x00 = (x0)((w0)O.E(x0.r(), arr_b)).d();
                            }
                            catch(IOException iOException0) {
                                L l0 = g0.b();
                                M m0 = L.u(s1);
                                l0.e0.c(m0, "Failed to merge filter", iOException0);
                                continue;
                            }
                            int v = cursor0.getInt(0);
                            List list1 = (List)e1.get(v);
                            if(list1 == null) {
                                list1 = new ArrayList();
                                e1.put(v, list1);
                            }
                            list1.add(x00);
                        }
                        while(cursor0.moveToNext());
                        goto label_56;
                    }
                    else {
                        map0 = Collections.emptyMap();
                        goto label_49;
                    }
                    goto label_58;
                }
                catch(SQLiteException sQLiteException0) {
                    try {
                    label_44:
                        L l1 = g0.b();
                        M m1 = L.u(s1);
                        l1.e0.c(m1, "Database error querying filters. appId", sQLiteException0);
                        map0 = Collections.emptyMap();
                        if(cursor0 != null) {
                            goto label_49;
                        }
                        goto label_58;
                    }
                    catch(Throwable throwable0) {
                        goto label_52;
                    }
                label_49:
                    cursor0.close();
                    goto label_58;
                }
                catch(Throwable throwable0) {
                label_52:
                    cursor1 = cursor0;
                }
            label_53:
                if(cursor1 != null) {
                    cursor1.close();
                }
                throw throwable0;
            label_56:
                cursor0.close();
                map0 = e1;
            label_58:
                e0.put(s, map0);
            }
            Iterator iterator1 = map0.keySet().iterator();
        label_60:
            if(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                Integer integer0 = (Integer)object1;
                integer0.getClass();
                if(this.d0.contains(integer0)) {
                    this.b().m0.b(integer0, "Skipping failed audience ID");
                    continue;
                }
                else {
                    Iterator iterator2 = ((List)map0.get(integer0)).iterator();
                    while(true) {
                        if(iterator2.hasNext()) {
                            Object object2 = iterator2.next();
                            x01 = (x0)object2;
                            boolean z = this.b().y(2);
                            d00 = (d0)this.Y;
                            if(z) {
                                this.b().m0.e("Evaluating filter. audience, filter, property", integer0, (x01.w() ? x01.o() : null), d00.k0.g(x01.s()));
                                L l2 = this.b();
                                O o0 = this.r();
                                StringBuilder stringBuilder0 = J.i("\nproperty_filter {\n");
                                if(x01.w()) {
                                    O.W(stringBuilder0, 0, "filter_id", x01.o());
                                }
                                O.W(stringBuilder0, 0, "property_name", ((d0)o0.Y).k0.g(x01.s()));
                                String s2 = O.I(x01.t(), x01.u(), x01.v());
                                if(!s2.isEmpty()) {
                                    O.W(stringBuilder0, 0, "filter_type", s2);
                                }
                                o0.T(stringBuilder0, 1, x01.q());
                                stringBuilder0.append("}\n");
                                l2.m0.b(stringBuilder0.toString(), "Filter definition");
                            }
                            if(x01.w() && x01.o() <= 0x100) {
                                goto label_100;
                            }
                            else {
                                map1 = map0;
                                e2 = e0;
                                L l3 = this.b();
                                M m2 = L.u(this.c0);
                                l3.h0.c(m2, "Invalid property filter ID. appId, id", String.valueOf((x01.w() ? x01.o() : null)));
                                this.d0.add(integer0);
                            }
                        }
                        else {
                            map1 = map0;
                            e2 = e0;
                        }
                        map0 = map1;
                        e0 = e2;
                        goto label_60;
                    label_100:
                        String s3 = this.c0;
                        v1 v10 = new v1(1);
                        v10.f = x01;
                        Long long0 = this.f0;
                        Long long1 = this.g0;
                        t1 t10 = (t1)this.e0.get(integer0);
                        boolean z1 = t10 == null ? false : t10.d.get(x01.o());
                        boolean z2 = d00.e0.B(s3, s.n0);
                        boolean z3 = x01.v();
                        boolean z4 = x01.t() || x01.u() || z3;
                        if(!z1 || z4) {
                            t0 t00 = x01.q();
                            e2 = e0;
                            boolean z5 = t00.t();
                            G g1 = d00.k0;
                            if(p10.F()) {
                                if(t00.v()) {
                                    integer1 = integer0;
                                    iterator3 = iterator2;
                                    boolean0 = v1.b(v1.a(p10.x(), t00.q()), z5);
                                    long2 = long1;
                                    goto label_172;
                                }
                                else {
                                    this.b().h0.b(g1.g(p10.B()), "No number filter for long property. property");
                                    integer1 = integer0;
                                    iterator3 = iterator2;
                                    long2 = long1;
                                    goto label_171;
                                }
                                goto label_132;
                            }
                            else {
                            label_132:
                                integer1 = integer0;
                                iterator3 = iterator2;
                                if(p10.D()) {
                                    if(t00.v()) {
                                        try {
                                            double f = p10.o();
                                            boolean1 = null;
                                            boolean1 = v1.d(new BigDecimal(f), t00.q(), Math.ulp(f));
                                        }
                                        catch(NumberFormatException unused_ex) {
                                        }
                                        boolean0 = v1.b(boolean1, z5);
                                        long2 = long1;
                                        goto label_172;
                                    }
                                    else {
                                        this.b().h0.b(g1.g(p10.B()), "No number filter for double property. property");
                                        long2 = long1;
                                        goto label_171;
                                    }
                                    goto label_145;
                                }
                                else {
                                label_145:
                                    if(p10.H()) {
                                        if(t00.x()) {
                                        }
                                        else if(!t00.v()) {
                                            this.b().h0.b(g1.g(p10.B()), "No string or number filter defined. property");
                                            long2 = long1;
                                            goto label_171;
                                        }
                                        else if(O.c0(p10.C())) {
                                            String s4 = p10.C();
                                            v0 v00 = t00.q();
                                            if(O.c0(s4)) {
                                                try {
                                                    bigDecimal0 = new BigDecimal(s4);
                                                    long2 = long1;
                                                }
                                                catch(NumberFormatException unused_ex) {
                                                    long2 = long1;
                                                    boolean2 = null;
                                                    boolean0 = v1.b(boolean2, z5);
                                                    goto label_172;
                                                }
                                                try {
                                                    boolean2 = v1.d(bigDecimal0, v00, 0.0);
                                                    boolean0 = v1.b(boolean2, z5);
                                                    goto label_172;
                                                }
                                                catch(NumberFormatException unused_ex) {
                                                }
                                            }
                                            else {
                                                long2 = long1;
                                            }
                                            boolean2 = null;
                                            boolean0 = v1.b(boolean2, z5);
                                            goto label_172;
                                        }
                                        else {
                                            long2 = long1;
                                            this.b().h0.c(g1.g(p10.B()), "Invalid user property value for Numeric number filter. property, value", p10.C());
                                            goto label_171;
                                        }
                                        long2 = long1;
                                        boolean0 = v1.b(v1.c(p10.C(), t00.r(), this.b()), z5);
                                        goto label_172;
                                    }
                                    else {
                                        long2 = long1;
                                        this.b().h0.b(g1.g(p10.B()), "User property has no value, property");
                                    }
                                }
                            }
                        label_171:
                            boolean0 = null;
                        label_172:
                            L l4 = this.b();
                            String s5 = boolean0 == null ? "null" : boolean0;
                            l4.m0.b(s5, "Property filter result");
                            if(boolean0 == null) {
                                this.d0.add(integer1);
                                this.d0.add(integer1);
                                map0 = map0;
                                e0 = e2;
                                goto label_60;
                            }
                            else {
                                v10.a = Boolean.TRUE;
                                if(!z3 || boolean0.booleanValue()) {
                                    if(!z1 || x01.t()) {
                                        v10.b = boolean0;
                                    }
                                    if(boolean0.booleanValue() && z4 && p10.G()) {
                                        long v1 = long0 == null ? p10.z() : ((long)long0);
                                        if(z2 && x01.t() && !x01.u() && long2 != null) {
                                            v1 = (long)long2;
                                        }
                                        if(x01.u()) {
                                            v10.d = v1;
                                        }
                                        else {
                                            v10.c = v1;
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            this.b().m0.c(integer0, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", (x01.w() ? x01.o() : null));
                            e2 = e0;
                            integer1 = integer0;
                            iterator3 = iterator2;
                        }
                        integer0 = integer1;
                        this.x(integer0).a(v10);
                        map0 = map0;
                        e0 = e2;
                        iterator2 = iterator3;
                    }
                }
                break;
            }
        }
    }

    public final ArrayList C() {
        List list0;
        ArrayList arrayList3;
        ArrayList arrayList0 = new ArrayList();
        Set set0 = this.e0.keySet();
        ((b)set0).removeAll(this.d0);
        for(Object object0: ((b)set0)) {
            t1 t10 = (t1)this.e0.get(((Integer)object0));
            r.j(t10);
            V0 v00 = W0.s();
            v00.f();
            W0.p(((W0)v00.Y), ((int)(((Integer)object0))));
            v00.f();
            W0.r(((W0)v00.Y), t10.b);
            l1 l10 = t10.c;
            if(l10 != null) {
                v00.f();
                W0.t(((W0)v00.Y), l10);
            }
            k1 k10 = l1.A();
            ArrayList arrayList1 = O.J(t10.d);
            k10.f();
            l1.t(((l1)k10.Y), arrayList1);
            ArrayList arrayList2 = O.J(t10.e);
            k10.f();
            l1.z(((l1)k10.Y), arrayList2);
            e e0 = t10.f;
            if(e0 == null) {
                arrayList3 = null;
            }
            else {
                arrayList3 = new ArrayList(e0.Z);
                for(Object object1: ((b)e0.keySet())) {
                    int v = (int)(((Integer)object1));
                    Long long0 = (Long)e0.get(((Integer)object1));
                    if(long0 != null) {
                        X0 x00 = Y0.s();
                        x00.f();
                        Y0.p(((Y0)x00.Y), v);
                        x00.f();
                        Y0.q(((Y0)x00.Y), ((long)long0));
                        arrayList3.add(((Y0)x00.d()));
                    }
                }
            }
            if(arrayList3 != null) {
                k10.f();
                l1.q(((l1)k10.Y), arrayList3);
            }
            e e1 = t10.g;
            if(e1 == null) {
                list0 = Collections.emptyList();
            }
            else {
                ArrayList arrayList4 = new ArrayList(e1.Z);
                Iterator iterator2 = ((b)e1.keySet()).iterator();
                while(((a)iterator2).hasNext()) {
                    Integer integer0 = (Integer)((a)iterator2).next();
                    m1 m10 = n1.t();
                    m10.f();
                    n1.q(((n1)m10.Y), ((int)integer0));
                    List list1 = (List)e1.get(integer0);
                    if(list1 != null) {
                        Collections.sort(list1);
                        m10.f();
                        n1.r(((n1)m10.Y), list1);
                    }
                    arrayList4.add(((n1)m10.d()));
                }
                list0 = arrayList4;
            }
            k10.f();
            l1.w(((l1)k10.Y), list0);
            v00.f();
            W0.q(((W0)v00.Y), ((l1)k10.d()));
            W0 w00 = (W0)v00.d();
            arrayList0.add(w00);
            g g0 = this.s();
            String s = this.c0;
            l1 l11 = w00.u();
            g0.u();
            g0.q();
            r.f(s);
            r.j(l11);
            byte[] arr_b = l11.c();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("app_id", s);
            contentValues0.put("audience_id", ((Integer)object0));
            contentValues0.put("current_results", arr_b);
            try {
                if(g0.y().insertWithOnConflict("audience_filter_values", null, contentValues0, 5) != -1L) {
                    continue;
                }
                L l0 = g0.b();
                M m0 = L.u(s);
                l0.e0.b(m0, "Failed to insert filter results (got -1). appId");
            }
            catch(SQLiteException sQLiteException0) {
                L l1 = g0.b();
                M m1 = L.u(s);
                l1.e0.c(m1, "Error storing filter results. appId", sQLiteException0);
            }
        }
        return arrayList0;
    }

    @Override  // j6.g1
    public final boolean w() {
        return false;
    }

    public final t1 x(Integer integer0) {
        if(this.e0.containsKey(integer0)) {
            return (t1)this.e0.get(integer0);
        }
        t1 t10 = new t1(this, this.c0);
        this.e0.put(integer0, t10);
        return t10;
    }

    public final ArrayList y(String s, List list0, List list1, Long long0, Long long1) {
        return this.z(s, list0, list1, long0, long1, false);
    }

    public final ArrayList z(String s, List list0, List list1, Long long0, Long long1, boolean z) {
        d d3;
        Iterator iterator8;
        Map map7;
        Map map6;
        d d2;
        d d1;
        Iterator iterator2;
        Map map5;
        Cursor cursor4;
        Map map3;
        e e2;
        l1 l10;
        Cursor cursor2;
        r0 r00;
        Cursor cursor0;
        boolean z1 = false;
        r.f(s);
        r.j(list0);
        r.j(list1);
        this.c0 = s;
        this.d0 = new HashSet();
        this.e0 = new e(0);  // initializer: Ls/J;-><init>(I)V
        this.f0 = long0;
        this.g0 = long1;
        for(Object object0: list0) {
            if("_s".equals(((a1)object0).C())) {
                z1 = true;
                break;
            }
        }
        d0 d00 = (d0)this.Y;
        boolean z2 = d00.e0.B(this.c0, s.p0);
        d d0 = d00.e0;
        boolean z3 = d0.B(this.c0, s.o0);
        if(z1) {
            g g0 = this.s();
            String s1 = this.c0;
            g0.u();
            g0.q();
            r.f(s1);
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("current_session_count", 0);
            try {
                g0.y().update("events", contentValues0, "app_id = ?", new String[]{s1});
            }
            catch(SQLiteException sQLiteException0) {
                L l0 = g0.b();
                M m0 = L.u(s1);
                l0.e0.c(m0, "Error resetting session-scoped event counts. appId", sQLiteException0);
            }
        }
        Map map0 = Collections.emptyMap();
        if(z3 && z2) {
            g g1 = this.s();
            String s2 = this.c0;
            r.f(s2);
            e e0 = new e(0);  // initializer: Ls/J;-><init>(I)V
            SQLiteDatabase sQLiteDatabase0 = g1.y();
            try {
                cursor0 = null;
                cursor0 = sQLiteDatabase0.query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{s2}, null, null, null);
                goto label_45;
            }
            catch(SQLiteException sQLiteException1) {
                goto label_66;
            }
            catch(Throwable throwable0) {
            }
            Cursor cursor1 = null;
            goto label_75;
            try {
            label_45:
                if(cursor0.moveToFirst()) {
                    do {
                        byte[] arr_b = cursor0.getBlob(1);
                        try {
                            r00 = (r0)((q0)O.E(r0.t(), arr_b)).d();
                        }
                        catch(IOException iOException0) {
                            L l1 = g1.b();
                            M m1 = L.u(s2);
                            l1.e0.c(m1, "Failed to merge filter. appId", iOException0);
                            continue;
                        }
                        if(r00.A()) {
                            int v = cursor0.getInt(0);
                            List list2 = (List)e0.get(v);
                            if(list2 == null) {
                                list2 = new ArrayList();
                                e0.put(v, list2);
                            }
                            list2.add(r00);
                        }
                    }
                    while(cursor0.moveToNext());
                    goto label_78;
                }
                else {
                    map0 = Collections.emptyMap();
                    goto label_71;
                }
                goto label_80;
            }
            catch(SQLiteException sQLiteException1) {
                try {
                label_66:
                    L l2 = g1.b();
                    M m2 = L.u(s2);
                    l2.e0.c(m2, "Database error querying filters. appId", sQLiteException1);
                    map0 = Collections.emptyMap();
                    if(cursor0 != null) {
                        goto label_71;
                    }
                    goto label_80;
                }
                catch(Throwable throwable0) {
                    goto label_74;
                }
            label_71:
                cursor0.close();
                goto label_80;
            }
            catch(Throwable throwable0) {
            label_74:
                cursor1 = cursor0;
            }
        label_75:
            if(cursor1 != null) {
                cursor1.close();
            }
            throw throwable0;
        label_78:
            cursor0.close();
            map0 = e0;
        }
    label_80:
        Map map1 = map0;
        g g2 = this.s();
        String s3 = this.c0;
        g2.u();
        g2.q();
        r.f(s3);
        SQLiteDatabase sQLiteDatabase1 = g2.y();
        try {
            cursor2 = null;
            cursor2 = sQLiteDatabase1.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{s3}, null, null, null);
            goto label_93;
        }
        catch(SQLiteException sQLiteException2) {
            goto label_116;
        }
        catch(Throwable throwable1) {
        }
        Cursor cursor3 = null;
        goto label_124;
        try {
        label_93:
            if(cursor2.moveToFirst()) {
                e e1 = new e(0);  // initializer: Ls/J;-><init>(I)V
                while(true) {
                    int v1 = cursor2.getInt(0);
                    byte[] arr_b1 = cursor2.getBlob(1);
                    try {
                        l10 = (l1)((k1)O.E(l1.A(), arr_b1)).d();
                    }
                    catch(IOException iOException1) {
                        L l3 = g2.b();
                        e2 = e1;
                        M m3 = L.u(s3);
                        l3.e0.e("Failed to merge filter results. appId, audienceId, error", m3, v1, iOException1);
                        goto label_107;
                    }
                    e1.put(v1, l10);
                    e2 = e1;
                label_107:
                    if(!cursor2.moveToNext()) {
                        goto label_110;
                    }
                    e1 = e2;
                }
            }
            else {
                map3 = Collections.emptyMap();
                goto label_127;
            }
            goto label_129;
        }
        catch(SQLiteException sQLiteException2) {
            goto label_116;
        }
        catch(Throwable throwable1) {
            goto label_123;
        }
    label_110:
        cursor2.close();
        Map map2 = e2;
        goto label_129;
        try {
            try {
                map3 = Collections.emptyMap();
                goto label_127;
            }
            catch(SQLiteException sQLiteException2) {
            label_116:
                L l4 = g2.b();
                M m4 = L.u(s3);
                l4.e0.c(m4, "Database error querying filter results. appId", sQLiteException2);
                map3 = Collections.emptyMap();
                if(cursor2 != null) {
                    goto label_127;
                }
                goto label_128;
            }
        }
        catch(Throwable throwable1) {
        label_123:
            cursor3 = cursor2;
        }
    label_124:
        if(cursor3 != null) {
            cursor3.close();
        }
        throw throwable1;
    label_127:
        cursor2.close();
    label_128:
        map2 = map3;
    label_129:
        if(map2.isEmpty()) {
            d3 = d0;
        }
        else {
            HashSet hashSet0 = new HashSet(map2.keySet());
            if(z1) {
                String s4 = this.c0;
                g g3 = this.s();
                String s5 = this.c0;
                g3.u();
                g3.q();
                r.f(s5);
                Map map4 = new e(0);  // initializer: Ls/J;-><init>(I)V
                SQLiteDatabase sQLiteDatabase2 = g3.y();
                try {
                    cursor4 = null;
                    cursor4 = sQLiteDatabase2.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{s5, s5});
                    goto label_146;
                }
                catch(SQLiteException sQLiteException3) {
                    goto label_158;
                }
                catch(Throwable throwable2) {
                }
                Cursor cursor5 = null;
                goto label_167;
                try {
                label_146:
                    if(cursor4.moveToFirst()) {
                        while(true) {
                            int v2 = cursor4.getInt(0);
                            List list3 = (List)((s.J)map4).get(v2);
                            if(list3 == null) {
                                list3 = new ArrayList();
                                ((s.J)map4).put(v2, list3);
                            }
                            list3.add(cursor4.getInt(1));
                            if(cursor4.moveToNext()) {
                                continue;
                            }
                            goto label_170;
                        }
                    }
                    else {
                        map4 = Collections.emptyMap();
                        goto label_170;
                    }
                    goto label_171;
                }
                catch(SQLiteException sQLiteException3) {
                    goto label_158;
                }
                catch(Throwable throwable2) {
                    goto label_166;
                }
                goto label_170;
                try {
                    try {
                        map4 = Collections.emptyMap();
                        goto label_170;
                    }
                    catch(SQLiteException sQLiteException3) {
                    }
                label_158:
                    L l5 = g3.b();
                    M m5 = L.u(s5);
                    l5.e0.c(m5, "Database error querying scoped filters. appId", sQLiteException3);
                    map4 = Collections.emptyMap();
                    if(cursor4 != null) {
                        goto label_163;
                    }
                    goto label_171;
                }
                catch(Throwable throwable2) {
                    goto label_166;
                }
            label_163:
                cursor4.close();
                goto label_171;
            label_166:
                cursor5 = cursor4;
            label_167:
                if(cursor5 != null) {
                    cursor5.close();
                }
                throw throwable2;
            label_170:
                cursor4.close();
            label_171:
                r.f(s4);
                e e3 = new e(0);  // initializer: Ls/J;-><init>(I)V
                if(!map2.isEmpty()) {
                    Iterator iterator1 = map2.keySet().iterator();
                    while(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        Integer integer0 = (Integer)object1;
                        integer0.getClass();
                        l1 l11 = (l1)map2.get(integer0);
                        List list4 = (List)map4.get(integer0);
                        if(list4 != null && !list4.isEmpty()) {
                            map5 = map4;
                            List list5 = this.r().L(((h2)l11.D()), list4);
                            if(list5.isEmpty()) {
                                goto label_233;
                            }
                            else {
                                k1 k10 = (k1)l11.l();
                                k10.f();
                                iterator2 = iterator1;
                                l1.s(((l1)k10.Y));
                                k10.f();
                                l1.t(((l1)k10.Y), list5);
                                O o0 = this.r();
                                k10.f();
                                l1.y(((l1)k10.Y));
                                k10.f();
                                l1.z(((l1)k10.Y), o0.L(((h2)l11.F()), list4));
                                ArrayList arrayList0 = new ArrayList();
                                Iterator iterator3 = l11.C().iterator();
                                while(iterator3.hasNext()) {
                                    Object object2 = iterator3.next();
                                    Y0 y00 = (Y0)object2;
                                    if(!list4.contains(y00.o())) {
                                        arrayList0.add(y00);
                                    }
                                    iterator3 = iterator3;
                                    d0 = d0;
                                }
                                d1 = d0;
                                k10.f();
                                l1.p(((l1)k10.Y));
                                k10.f();
                                l1.q(((l1)k10.Y), arrayList0);
                                ArrayList arrayList1 = new ArrayList();
                                for(Object object3: l11.E()) {
                                    n1 n10 = (n1)object3;
                                    if(!list4.contains(n10.s())) {
                                        arrayList1.add(n10);
                                    }
                                }
                                k10.f();
                                l1.v(((l1)k10.Y));
                                k10.f();
                                l1.w(((l1)k10.Y), arrayList1);
                                e3.put(integer0, ((l1)k10.d()));
                            }
                        }
                        else {
                            map5 = map4;
                            iterator2 = iterator1;
                            d1 = d0;
                            e3.put(integer0, l11);
                        }
                        iterator1 = iterator2;
                        map4 = map5;
                        d0 = d1;
                        continue;
                    label_233:
                        map4 = map5;
                    }
                }
                d2 = d0;
                map6 = e3;
            }
            else {
                d2 = d0;
                map6 = map2;
            }
            for(Object object4: hashSet0) {
                Integer integer1 = (Integer)object4;
                integer1.getClass();
                l1 l12 = (l1)map6.get(integer1);
                BitSet bitSet0 = new BitSet();
                BitSet bitSet1 = new BitSet();
                e e4 = new e(0);  // initializer: Ls/J;-><init>(I)V
                if(l12 != null && l12.o() != 0) {
                    for(Object object5: l12.C()) {
                        Y0 y01 = (Y0)object5;
                        if(y01.u()) {
                            e4.put(y01.o(), (y01.t() ? y01.r() : null));
                        }
                    }
                }
                e e5 = new e(0);  // initializer: Ls/J;-><init>(I)V
                if(l12 != null && l12.u() != 0) {
                    Iterator iterator7 = l12.E().iterator();
                    while(iterator7.hasNext()) {
                        Object object6 = iterator7.next();
                        n1 n11 = (n1)object6;
                        if(!n11.v() || n11.o() <= 0) {
                            map7 = map6;
                            iterator8 = iterator7;
                        }
                        else {
                            map7 = map6;
                            iterator8 = iterator7;
                            e5.put(n11.s(), n11.p(n11.o() - 1));
                        }
                        iterator7 = iterator8;
                        map6 = map7;
                    }
                }
                if(l12 != null) {
                    for(int v3 = 0; v3 < l12.x() << 6; ++v3) {
                        if(O.Z(((h2)l12.F()), v3)) {
                            this.b().m0.c(integer1, "Filter already evaluated. audience ID, filter ID", v3);
                            bitSet1.set(v3);
                            if(O.Z(((h2)l12.D()), v3)) {
                                bitSet0.set(v3);
                            }
                        }
                        else {
                            e4.remove(v3);
                        }
                    }
                }
                l1 l13 = (l1)map2.get(integer1);
                if(z3 && z2) {
                    List list6 = (List)map1.get(integer1);
                    if(list6 != null && this.g0 != null && this.f0 != null) {
                        for(Object object7: list6) {
                            int v4 = ((r0)object7).s();
                            long v5 = ((r0)object7).y() ? ((long)this.f0) / 1000L : ((long)this.g0) / 1000L;
                            if(e4.containsKey(v4)) {
                                e4.put(v4, v5);
                            }
                            if(e5.containsKey(v4)) {
                                e5.put(v4, v5);
                            }
                        }
                    }
                }
                t1 t10 = new t1(this, this.c0, l13, bitSet0, bitSet1, e4, e5);
                this.e0.put(integer1, t10);
                map6 = map6;
                map1 = map1;
                map2 = map2;
            }
            d3 = d2;
        }
        if(d3.B(null, s.Y0)) {
            this.A(list0, z);
            if(z) {
                return new ArrayList();
            }
            this.B(list1);
            return this.C();
        }
        this.A(list0, true);
        this.B(list1);
        return this.C();
    }
}

