package Ea;

import Aa.p;
import Ab.k;
import Ab.t;
import B3.d;
import Bb.F;
import Bb.r;
import Bb.v;
import C.E;
import Fa.C;
import I2.A;
import I2.q;
import J2.I;
import Nb.j;
import Nb.w;
import O3.l;
import R2.i;
import R3.a;
import S2.o;
import T3.b;
import W5.f;
import X2.g;
import Xb.J;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PowerManager.WakeLock;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.work.impl.foreground.SystemForegroundService;
import dc.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

public final class r0 implements Function0 {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;

    public r0(Object object0, Object object1, Object object2, Object object3, int v) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        this.b0 = object2;
        this.c0 = object3;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Set set0;
        l l2;
        int v = 0;
        switch(this.X) {
            case 0: {
                x0 x00 = new x0(((f0)this.b0), ((O)this.Y), ((C)this.c0), null);
                J.q(((e)this.Z), null, null, x00, 3);
                return t.a;
            }
            case 1: {
                Iterable iterable0 = (Collection)this.Z;
                ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
                for(Object object0: iterable0) {
                    arrayList0.add(((l)object0).X);
                }
                a a0 = (a)this.Y;
                ArrayList arrayList1 = a0.e(arrayList0);
                int v4 = F.I(r.b0(arrayList1));
                if(v4 < 16) {
                    v4 = 16;
                }
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(v4);
                for(Object object1: arrayList1) {
                    linkedHashMap0.put(((l)object1).X, object1);
                }
                ArrayList arrayList2 = new ArrayList();
                for(Object object2: iterable0) {
                    l l0 = (l)object2;
                    l l1 = (l)linkedHashMap0.get(l0.X);
                    Long long0 = (Long)this.c0;
                    d d0 = (d)a0.b.Y;
                    if(l1 == null) {
                        if(long0 == null) {
                            l2 = l0;
                        }
                        else {
                            Map map0 = l0.Y;
                            LinkedHashMap linkedHashMap1 = new LinkedHashMap(F.I(map0.size()));
                            for(Object object3: map0.entrySet()) {
                                linkedHashMap1.put(((Map.Entry)object3).getKey(), long0);
                            }
                            l2 = new l(l0.X, map0, l0.Z, linkedHashMap1);
                        }
                        String s = f.T(l2);
                        j.f(l2.X, "key");
                        b b0 = new b(1, l2.X, s);
                        ((g)d0.Y).b(0x8D1E769D, "INSERT INTO records (key, record) VALUES (?,?)", b0);
                        d0.B(0x8D1E769D, new T3.d(0));
                        set0 = l0.a();
                    }
                    else {
                        k k0 = l1.b(l0, long0);
                        l l3 = (l)k0.X;
                        set0 = (Set)k0.Y;
                        if(!l3.Y.isEmpty()) {
                            String s1 = f.T(l3);
                            j.f(l3.X, "key");
                            b b1 = new b(0, s1, l3.X);
                            ((g)d0.Y).b(-1582437203, "UPDATE records SET record=? WHERE key=?", b1);
                            d0.B(-1582437203, new p(28));
                        }
                    }
                    v.f0(arrayList2, set0);
                }
                ((w)this.b0).X = Bb.p.U0(arrayList2);
                return t.a;
            }
            case 2: {
                o o0 = (o)this.Y;
                q q0 = (q)this.b0;
                Context context0 = (Context)this.c0;
                String s2 = ((UUID)this.Z).toString();
                R2.p p0 = o0.c.j(s2);
                if(p0 == null || A3.e.m(p0.b)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                J2.e e0 = o0.b;
                synchronized(e0.k) {
                    A.e().f(J2.e.l, "Moving WorkSpec (" + s2 + ") to the foreground");
                    I i0 = (I)e0.g.remove(s2);
                    if(i0 != null) {
                        if(e0.a == null) {
                            PowerManager.WakeLock powerManager$WakeLock0 = S2.k.a(e0.b, "ProcessorForegroundLck");
                            e0.a = powerManager$WakeLock0;
                            powerManager$WakeLock0.acquire();
                        }
                        e0.f.put(s2, i0);
                        i i1 = J2.w.D(i0.a);
                        Intent intent0 = Q2.a.a(e0.b, i1, q0);
                        Context context1 = e0.b;
                        if(Build.VERSION.SDK_INT >= 26) {
                            w1.b.c(context1, intent0);
                        }
                        else {
                            context1.startService(intent0);
                        }
                    }
                }
                i i2 = J2.w.D(p0);
                Intent intent1 = new Intent(context0, SystemForegroundService.class);
                intent1.setAction("ACTION_NOTIFY");
                intent1.putExtra("KEY_NOTIFICATION_ID", q0.a);
                intent1.putExtra("KEY_FOREGROUND_SERVICE_TYPE", q0.b);
                intent1.putExtra("KEY_NOTIFICATION", q0.c);
                intent1.putExtra("KEY_WORKSPEC_ID", i2.a);
                intent1.putExtra("KEY_GENERATION", i2.b);
                context0.startService(intent1);
                return null;
            }
            case 3: {
                j.f(((E9.a)this.Y), "<this>");
                j.f(((String)this.Z), "id");
                Map map1 = F.J(new k("id", ((String)this.Z)));
                ((E9.a)this.Y).d("bottom sheet announcement button clicked", map1);
                ((MutableState)this.c0).setValue(Boolean.TRUE);
                ((W9.d)this.b0).a.invoke();
                return t.a;
            }
            default: {
                C.v v1 = (C.v)Bb.p.q0(((List)((E)this.Y).g().j));
                int v2 = v1 == null ? 0 : v1.a;
                if(v1 != null) {
                    v = v1.p;
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState0 = (ParcelableSnapshotMutableIntState)this.b0;
                if(((oa.i)this.Z).a.length() == 0) {
                    if(v2 > 0) {
                        return (int)(-parcelableSnapshotMutableIntState0.k());
                    }
                    int v3 = parcelableSnapshotMutableIntState0.k();
                    return v <= v3 ? v : v3;
                }
                if(v2 > 0) {
                    v = -parcelableSnapshotMutableIntState0.k() - ((ParcelableSnapshotMutableIntState)this.c0).k();
                }
                return v;
            }
        }
    }
}

