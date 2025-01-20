package S2;

import A3.e;
import E7.l;
import F0.p0;
import I2.g;
import I2.m;
import M6.b;
import Nb.j;
import Nb.k;
import P4.c;
import R2.o;
import R2.p;
import R2.u;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import q2.C;

public final class i extends k implements Function1 {
    public final int X;

    public i(int v) {
        this.X = 0;
        super(v);
    }

    public i(int v, Object object0) {
        this.X = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        ArrayList arrayList0;
        switch(this.X) {
            case 0: {
                j.f(((WorkDatabase)object0), "db");
                l l0 = p.z;
                u u0 = ((WorkDatabase)object0).x();
                u0.getClass();
                C c0 = b.o(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                c0.c(1, "UpdatesSyncWorkName");
                WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)u0.a;
                workDatabase_Impl0.b();
                workDatabase_Impl0.c();
                try {
                    Cursor cursor0 = c.O(workDatabase_Impl0, c0, true);
                    try {
                        HashMap hashMap0 = new HashMap();
                        HashMap hashMap1 = new HashMap();
                        while(cursor0.moveToNext()) {
                            String s = cursor0.getString(0);
                            if(!hashMap0.containsKey(s)) {
                                hashMap0.put(s, new ArrayList());
                            }
                            String s1 = cursor0.getString(0);
                            if(!hashMap1.containsKey(s1)) {
                                hashMap1.put(s1, new ArrayList());
                            }
                        }
                        cursor0.moveToPosition(-1);
                        u0.b(hashMap0);
                        u0.a(hashMap1);
                        arrayList0 = new ArrayList(cursor0.getCount());
                        while(cursor0.moveToNext()) {
                            String s2 = cursor0.getString(0);
                            int v2 = b.K(cursor0.getInt(1));
                            m m0 = m.a(cursor0.getBlob(2));
                            int v3 = cursor0.getInt(3);
                            int v4 = cursor0.getInt(4);
                            long v5 = cursor0.getLong(14);
                            long v6 = cursor0.getLong(15);
                            long v7 = cursor0.getLong(16);
                            int v8 = b.H(cursor0.getInt(17));
                            long v9 = cursor0.getLong(18);
                            long v10 = cursor0.getLong(19);
                            int v11 = cursor0.getInt(20);
                            long v12 = cursor0.getLong(21);
                            int v13 = cursor0.getInt(22);
                            int v14 = b.I(cursor0.getInt(5));
                            arrayList0.add(new o(s2, v2, m0, v5, v6, v7, new g(b.V(cursor0.getBlob(6)), v14, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), b.q(cursor0.getBlob(13))), v3, v8, v9, v10, v11, v4, v12, v13, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0)))));
                        }
                        workDatabase_Impl0.q();
                    }
                    finally {
                        cursor0.close();
                        c0.f();
                    }
                }
                finally {
                    workDatabase_Impl0.k();
                }
                Object object1 = l0.apply(arrayList0);
                j.e(object1, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
                return (List)object1;
            }
            case 1: {
                e.x(object0);
                throw null;
            }
            default: {
                if(!((j0.c)object0).X.k0) {
                    return p0.Y;
                }
                ((j0.c)object0).l0 = null;
                return p0.X;
            }
        }
    }
}

