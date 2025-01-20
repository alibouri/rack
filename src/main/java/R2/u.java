package R2;

import M.J;
import Ma.m;
import N4.o;
import Nb.j;
import P4.c;
import Pb.a;
import Q4.i;
import S2.e;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import q2.C;
import x2.g;
import yc.d;

public final class u {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public Object n;
    public final Object o;

    public u(int v) {
        this.a = new boolean[0x100];
        this.b = new byte[0x100];
        this.c = new byte[18002];
        this.d = new byte[18002];
        this.e = new int[0x100];
        Class class0 = Integer.TYPE;
        this.f = (int[][])Array.newInstance(class0, new int[]{6, 0x102});
        this.g = (int[][])Array.newInstance(class0, new int[]{6, 0x102});
        this.h = (int[][])Array.newInstance(class0, new int[]{6, 0x102});
        this.i = new int[6];
        this.j = new int[0x101];
        this.k = new char[0x100];
        this.l = new char[6][0x102];
        this.m = new byte[6];
        this.o = new byte[v * 100000];
    }

    public u(WorkDatabase_Impl workDatabase_Impl0) {
        this.a = workDatabase_Impl0;
        this.b = new b(workDatabase_Impl0, 5);
        this.c = new m(workDatabase_Impl0, 14);
        this.d = new m(workDatabase_Impl0, 15);
        this.e = new m(workDatabase_Impl0, 16);
        this.f = new m(workDatabase_Impl0, 17);
        this.g = new m(workDatabase_Impl0, 18);
        this.h = new m(workDatabase_Impl0, 19);
        this.i = new m(workDatabase_Impl0, 20);
        this.j = new m(workDatabase_Impl0, 21);
        this.k = new m(workDatabase_Impl0, 6);
        new m(workDatabase_Impl0, 7);
        this.l = new m(workDatabase_Impl0, 8);
        this.m = new m(workDatabase_Impl0, 9);
        this.n = new m(workDatabase_Impl0, 10);
        new m(workDatabase_Impl0, 11);
        new m(workDatabase_Impl0, 12);
        this.o = new m(workDatabase_Impl0, 13);
    }

    public void a(HashMap hashMap0) {
        Set set0 = hashMap0.keySet();
        if(set0.isEmpty()) {
            return;
        }
        if(hashMap0.size() > 999) {
            a.D(hashMap0, new s(this, 1));
            return;
        }
        StringBuilder stringBuilder0 = J.i("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int v = set0.size();
        i.n(v, stringBuilder0);
        stringBuilder0.append(")");
        C c0 = M6.b.o(v, stringBuilder0.toString());
        int v1 = 1;
        for(Object object0: set0) {
            c0.c(v1, ((String)object0));
            ++v1;
        }
        try(Cursor cursor0 = c.O(((WorkDatabase_Impl)this.a), c0, false)) {
            int v2 = o.D(cursor0, "work_spec_id");
            if(v2 != -1) {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(v2));
                    if(arrayList0 != null) {
                        arrayList0.add(I2.m.a(cursor0.getBlob(0)));
                    }
                }
            }
        }
    }

    public void b(HashMap hashMap0) {
        Set set0 = hashMap0.keySet();
        if(set0.isEmpty()) {
            return;
        }
        if(hashMap0.size() > 999) {
            a.D(hashMap0, new s(this, 0));
            return;
        }
        StringBuilder stringBuilder0 = J.i("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int v = set0.size();
        i.n(v, stringBuilder0);
        stringBuilder0.append(")");
        C c0 = M6.b.o(v, stringBuilder0.toString());
        int v1 = 1;
        for(Object object0: set0) {
            c0.c(v1, ((String)object0));
            ++v1;
        }
        try(Cursor cursor0 = c.O(((WorkDatabase_Impl)this.a), c0, false)) {
            int v2 = o.D(cursor0, "work_spec_id");
            if(v2 != -1) {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(v2));
                    if(arrayList0 != null) {
                        arrayList0.add(cursor0.getString(0));
                    }
                }
            }
        }
    }

    public void c(String s) {
        ((WorkDatabase_Impl)this.a).b();
        g g0 = ((m)this.d).a();
        g0.c(1, s);
        try {
            ((WorkDatabase_Impl)this.a).c();
            try {
                g0.b();
                ((WorkDatabase_Impl)this.a).q();
            }
            finally {
                ((WorkDatabase_Impl)this.a).k();
            }
        }
        finally {
            ((m)this.d).c(g0);
        }
    }

    public ArrayList d() {
        boolean z4;
        int v55;
        boolean z3;
        int v54;
        boolean z2;
        int v53;
        boolean z1;
        int v52;
        boolean z;
        int v44;
        C c0 = M6.b.o(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        c0.H(1, 200L);
        ((WorkDatabase_Impl)this.a).b();
        Cursor cursor0 = c.O(((WorkDatabase_Impl)this.a), c0, false);
        try {
            int v1 = o.E(cursor0, "id");
            int v2 = o.E(cursor0, "state");
            int v3 = o.E(cursor0, "worker_class_name");
            int v4 = o.E(cursor0, "input_merger_class_name");
            int v5 = o.E(cursor0, "input");
            int v6 = o.E(cursor0, "output");
            int v7 = o.E(cursor0, "initial_delay");
            int v8 = o.E(cursor0, "interval_duration");
            int v9 = o.E(cursor0, "flex_duration");
            int v10 = o.E(cursor0, "run_attempt_count");
            int v11 = o.E(cursor0, "backoff_policy");
            int v12 = o.E(cursor0, "backoff_delay_duration");
            int v13 = o.E(cursor0, "last_enqueue_time");
            int v14 = o.E(cursor0, "minimum_retention_duration");
            int v15 = o.E(cursor0, "schedule_requested_at");
            int v16 = o.E(cursor0, "run_in_foreground");
            int v17 = o.E(cursor0, "out_of_quota_policy");
            int v18 = o.E(cursor0, "period_count");
            int v19 = o.E(cursor0, "generation");
            int v20 = o.E(cursor0, "next_schedule_time_override");
            int v21 = o.E(cursor0, "next_schedule_time_override_generation");
            int v22 = o.E(cursor0, "stop_reason");
            int v23 = o.E(cursor0, "trace_tag");
            int v24 = o.E(cursor0, "required_network_type");
            int v25 = o.E(cursor0, "required_network_request");
            int v26 = o.E(cursor0, "requires_charging");
            int v27 = o.E(cursor0, "requires_device_idle");
            int v28 = o.E(cursor0, "requires_battery_not_low");
            int v29 = o.E(cursor0, "requires_storage_not_low");
            int v30 = o.E(cursor0, "trigger_content_update_delay");
            int v31 = o.E(cursor0, "trigger_max_content_delay");
            int v32 = o.E(cursor0, "content_uri_triggers");
            int v33 = v14;
            ArrayList arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v1);
                int v34 = M6.b.K(cursor0.getInt(v2));
                String s1 = cursor0.getString(v3);
                String s2 = cursor0.getString(v4);
                I2.m m0 = I2.m.a(cursor0.getBlob(v5));
                I2.m m1 = I2.m.a(cursor0.getBlob(v6));
                long v35 = cursor0.getLong(v7);
                long v36 = cursor0.getLong(v8);
                long v37 = cursor0.getLong(v9);
                int v38 = cursor0.getInt(v10);
                int v39 = M6.b.H(cursor0.getInt(v11));
                long v40 = cursor0.getLong(v12);
                long v41 = cursor0.getLong(v13);
                long v42 = cursor0.getLong(v33);
                long v43 = cursor0.getLong(v15);
                v15 = v15;
                if(cursor0.getInt(v16) == 0) {
                    v16 = v16;
                    v44 = v17;
                    z = false;
                }
                else {
                    v16 = v16;
                    v44 = v17;
                    z = true;
                }
                int v45 = M6.b.J(cursor0.getInt(v44));
                v17 = v44;
                int v46 = cursor0.getInt(v18);
                v18 = v18;
                int v47 = cursor0.getInt(v19);
                v19 = v19;
                long v48 = cursor0.getLong(v20);
                v20 = v20;
                int v49 = cursor0.getInt(v21);
                v21 = v21;
                int v50 = cursor0.getInt(v22);
                v22 = v22;
                String s3 = cursor0.isNull(v23) ? null : cursor0.getString(v23);
                v23 = v23;
                int v51 = M6.b.I(cursor0.getInt(v24));
                v24 = v24;
                e e0 = M6.b.V(cursor0.getBlob(v25));
                v25 = v25;
                if(cursor0.getInt(v26) == 0) {
                    v26 = v26;
                    v52 = v27;
                    z1 = false;
                }
                else {
                    v26 = v26;
                    v52 = v27;
                    z1 = true;
                }
                if(cursor0.getInt(v52) == 0) {
                    v27 = v52;
                    v53 = v28;
                    z2 = false;
                }
                else {
                    v27 = v52;
                    v53 = v28;
                    z2 = true;
                }
                if(cursor0.getInt(v53) == 0) {
                    v28 = v53;
                    v54 = v29;
                    z3 = false;
                }
                else {
                    v28 = v53;
                    v54 = v29;
                    z3 = true;
                }
                if(cursor0.getInt(v54) == 0) {
                    v29 = v54;
                    v55 = v30;
                    z4 = false;
                }
                else {
                    v29 = v54;
                    v55 = v30;
                    z4 = true;
                }
                long v56 = cursor0.getLong(v55);
                v30 = v55;
                long v57 = cursor0.getLong(v31);
                v31 = v31;
                I2.g g0 = new I2.g(e0, v51, z1, z2, z3, z4, v56, v57, M6.b.q(cursor0.getBlob(v32)));
                v32 = v32;
                arrayList0.add(new p(s, v34, s1, s2, m0, m1, v35, v36, v37, g0, v38, v39, v40, v41, v42, v43, z, v45, v46, v47, v48, v49, v50, s3));
                v1 = v1;
                v33 = v33;
            }
            return arrayList0;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public ArrayList e(int v) {
        boolean z4;
        int v56;
        boolean z3;
        int v55;
        boolean z2;
        int v54;
        boolean z1;
        int v53;
        boolean z;
        int v45;
        C c0 = M6.b.o(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        c0.H(1, ((long)v));
        ((WorkDatabase_Impl)this.a).b();
        Cursor cursor0 = c.O(((WorkDatabase_Impl)this.a), c0, false);
        try {
            int v2 = o.E(cursor0, "id");
            int v3 = o.E(cursor0, "state");
            int v4 = o.E(cursor0, "worker_class_name");
            int v5 = o.E(cursor0, "input_merger_class_name");
            int v6 = o.E(cursor0, "input");
            int v7 = o.E(cursor0, "output");
            int v8 = o.E(cursor0, "initial_delay");
            int v9 = o.E(cursor0, "interval_duration");
            int v10 = o.E(cursor0, "flex_duration");
            int v11 = o.E(cursor0, "run_attempt_count");
            int v12 = o.E(cursor0, "backoff_policy");
            int v13 = o.E(cursor0, "backoff_delay_duration");
            int v14 = o.E(cursor0, "last_enqueue_time");
            int v15 = o.E(cursor0, "minimum_retention_duration");
            int v16 = o.E(cursor0, "schedule_requested_at");
            int v17 = o.E(cursor0, "run_in_foreground");
            int v18 = o.E(cursor0, "out_of_quota_policy");
            int v19 = o.E(cursor0, "period_count");
            int v20 = o.E(cursor0, "generation");
            int v21 = o.E(cursor0, "next_schedule_time_override");
            int v22 = o.E(cursor0, "next_schedule_time_override_generation");
            int v23 = o.E(cursor0, "stop_reason");
            int v24 = o.E(cursor0, "trace_tag");
            int v25 = o.E(cursor0, "required_network_type");
            int v26 = o.E(cursor0, "required_network_request");
            int v27 = o.E(cursor0, "requires_charging");
            int v28 = o.E(cursor0, "requires_device_idle");
            int v29 = o.E(cursor0, "requires_battery_not_low");
            int v30 = o.E(cursor0, "requires_storage_not_low");
            int v31 = o.E(cursor0, "trigger_content_update_delay");
            int v32 = o.E(cursor0, "trigger_max_content_delay");
            int v33 = o.E(cursor0, "content_uri_triggers");
            int v34 = v15;
            ArrayList arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v2);
                int v35 = M6.b.K(cursor0.getInt(v3));
                String s1 = cursor0.getString(v4);
                String s2 = cursor0.getString(v5);
                I2.m m0 = I2.m.a(cursor0.getBlob(v6));
                I2.m m1 = I2.m.a(cursor0.getBlob(v7));
                long v36 = cursor0.getLong(v8);
                long v37 = cursor0.getLong(v9);
                long v38 = cursor0.getLong(v10);
                int v39 = cursor0.getInt(v11);
                int v40 = M6.b.H(cursor0.getInt(v12));
                long v41 = cursor0.getLong(v13);
                long v42 = cursor0.getLong(v14);
                long v43 = cursor0.getLong(v34);
                long v44 = cursor0.getLong(v16);
                v16 = v16;
                if(cursor0.getInt(v17) == 0) {
                    v17 = v17;
                    v45 = v18;
                    z = false;
                }
                else {
                    v17 = v17;
                    v45 = v18;
                    z = true;
                }
                int v46 = M6.b.J(cursor0.getInt(v45));
                v18 = v45;
                int v47 = cursor0.getInt(v19);
                v19 = v19;
                int v48 = cursor0.getInt(v20);
                v20 = v20;
                long v49 = cursor0.getLong(v21);
                v21 = v21;
                int v50 = cursor0.getInt(v22);
                v22 = v22;
                int v51 = cursor0.getInt(v23);
                v23 = v23;
                String s3 = cursor0.isNull(v24) ? null : cursor0.getString(v24);
                v24 = v24;
                int v52 = M6.b.I(cursor0.getInt(v25));
                v25 = v25;
                e e0 = M6.b.V(cursor0.getBlob(v26));
                v26 = v26;
                if(cursor0.getInt(v27) == 0) {
                    v27 = v27;
                    v53 = v28;
                    z1 = false;
                }
                else {
                    v27 = v27;
                    v53 = v28;
                    z1 = true;
                }
                if(cursor0.getInt(v53) == 0) {
                    v28 = v53;
                    v54 = v29;
                    z2 = false;
                }
                else {
                    v28 = v53;
                    v54 = v29;
                    z2 = true;
                }
                if(cursor0.getInt(v54) == 0) {
                    v29 = v54;
                    v55 = v30;
                    z3 = false;
                }
                else {
                    v29 = v54;
                    v55 = v30;
                    z3 = true;
                }
                if(cursor0.getInt(v55) == 0) {
                    v30 = v55;
                    v56 = v31;
                    z4 = false;
                }
                else {
                    v30 = v55;
                    v56 = v31;
                    z4 = true;
                }
                long v57 = cursor0.getLong(v56);
                v31 = v56;
                long v58 = cursor0.getLong(v32);
                v32 = v32;
                I2.g g0 = new I2.g(e0, v52, z1, z2, z3, z4, v57, v58, M6.b.q(cursor0.getBlob(v33)));
                v33 = v33;
                arrayList0.add(new p(s, v35, s1, s2, m0, m1, v36, v37, v38, g0, v39, v40, v41, v42, v43, v44, z, v46, v47, v48, v49, v50, v51, s3));
                v2 = v2;
                v34 = v34;
            }
            return arrayList0;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public ArrayList f() {
        boolean z4;
        int v55;
        boolean z3;
        int v54;
        boolean z2;
        int v53;
        boolean z1;
        int v52;
        boolean z;
        int v44;
        C c0 = M6.b.o(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        ((WorkDatabase_Impl)this.a).b();
        Cursor cursor0 = c.O(((WorkDatabase_Impl)this.a), c0, false);
        try {
            int v1 = o.E(cursor0, "id");
            int v2 = o.E(cursor0, "state");
            int v3 = o.E(cursor0, "worker_class_name");
            int v4 = o.E(cursor0, "input_merger_class_name");
            int v5 = o.E(cursor0, "input");
            int v6 = o.E(cursor0, "output");
            int v7 = o.E(cursor0, "initial_delay");
            int v8 = o.E(cursor0, "interval_duration");
            int v9 = o.E(cursor0, "flex_duration");
            int v10 = o.E(cursor0, "run_attempt_count");
            int v11 = o.E(cursor0, "backoff_policy");
            int v12 = o.E(cursor0, "backoff_delay_duration");
            int v13 = o.E(cursor0, "last_enqueue_time");
            int v14 = o.E(cursor0, "minimum_retention_duration");
            int v15 = o.E(cursor0, "schedule_requested_at");
            int v16 = o.E(cursor0, "run_in_foreground");
            int v17 = o.E(cursor0, "out_of_quota_policy");
            int v18 = o.E(cursor0, "period_count");
            int v19 = o.E(cursor0, "generation");
            int v20 = o.E(cursor0, "next_schedule_time_override");
            int v21 = o.E(cursor0, "next_schedule_time_override_generation");
            int v22 = o.E(cursor0, "stop_reason");
            int v23 = o.E(cursor0, "trace_tag");
            int v24 = o.E(cursor0, "required_network_type");
            int v25 = o.E(cursor0, "required_network_request");
            int v26 = o.E(cursor0, "requires_charging");
            int v27 = o.E(cursor0, "requires_device_idle");
            int v28 = o.E(cursor0, "requires_battery_not_low");
            int v29 = o.E(cursor0, "requires_storage_not_low");
            int v30 = o.E(cursor0, "trigger_content_update_delay");
            int v31 = o.E(cursor0, "trigger_max_content_delay");
            int v32 = o.E(cursor0, "content_uri_triggers");
            int v33 = v14;
            ArrayList arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v1);
                int v34 = M6.b.K(cursor0.getInt(v2));
                String s1 = cursor0.getString(v3);
                String s2 = cursor0.getString(v4);
                I2.m m0 = I2.m.a(cursor0.getBlob(v5));
                I2.m m1 = I2.m.a(cursor0.getBlob(v6));
                long v35 = cursor0.getLong(v7);
                long v36 = cursor0.getLong(v8);
                long v37 = cursor0.getLong(v9);
                int v38 = cursor0.getInt(v10);
                int v39 = M6.b.H(cursor0.getInt(v11));
                long v40 = cursor0.getLong(v12);
                long v41 = cursor0.getLong(v13);
                long v42 = cursor0.getLong(v33);
                long v43 = cursor0.getLong(v15);
                v15 = v15;
                if(cursor0.getInt(v16) == 0) {
                    v16 = v16;
                    v44 = v17;
                    z = false;
                }
                else {
                    v16 = v16;
                    v44 = v17;
                    z = true;
                }
                int v45 = M6.b.J(cursor0.getInt(v44));
                v17 = v44;
                int v46 = cursor0.getInt(v18);
                v18 = v18;
                int v47 = cursor0.getInt(v19);
                v19 = v19;
                long v48 = cursor0.getLong(v20);
                v20 = v20;
                int v49 = cursor0.getInt(v21);
                v21 = v21;
                int v50 = cursor0.getInt(v22);
                v22 = v22;
                String s3 = cursor0.isNull(v23) ? null : cursor0.getString(v23);
                v23 = v23;
                int v51 = M6.b.I(cursor0.getInt(v24));
                v24 = v24;
                e e0 = M6.b.V(cursor0.getBlob(v25));
                v25 = v25;
                if(cursor0.getInt(v26) == 0) {
                    v26 = v26;
                    v52 = v27;
                    z1 = false;
                }
                else {
                    v26 = v26;
                    v52 = v27;
                    z1 = true;
                }
                if(cursor0.getInt(v52) == 0) {
                    v27 = v52;
                    v53 = v28;
                    z2 = false;
                }
                else {
                    v27 = v52;
                    v53 = v28;
                    z2 = true;
                }
                if(cursor0.getInt(v53) == 0) {
                    v28 = v53;
                    v54 = v29;
                    z3 = false;
                }
                else {
                    v28 = v53;
                    v54 = v29;
                    z3 = true;
                }
                if(cursor0.getInt(v54) == 0) {
                    v29 = v54;
                    v55 = v30;
                    z4 = false;
                }
                else {
                    v29 = v54;
                    v55 = v30;
                    z4 = true;
                }
                long v56 = cursor0.getLong(v55);
                v30 = v55;
                long v57 = cursor0.getLong(v31);
                v31 = v31;
                I2.g g0 = new I2.g(e0, v51, z1, z2, z3, z4, v56, v57, M6.b.q(cursor0.getBlob(v32)));
                v32 = v32;
                arrayList0.add(new p(s, v34, s1, s2, m0, m1, v35, v36, v37, g0, v38, v39, v40, v41, v42, v43, z, v45, v46, v47, v48, v49, v50, s3));
                v1 = v1;
                v33 = v33;
            }
            return arrayList0;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public ArrayList g() {
        boolean z4;
        int v55;
        boolean z3;
        int v54;
        boolean z2;
        int v53;
        boolean z1;
        int v52;
        boolean z;
        int v44;
        C c0 = M6.b.o(0, "SELECT * FROM workspec WHERE state=1");
        ((WorkDatabase_Impl)this.a).b();
        Cursor cursor0 = c.O(((WorkDatabase_Impl)this.a), c0, false);
        try {
            int v1 = o.E(cursor0, "id");
            int v2 = o.E(cursor0, "state");
            int v3 = o.E(cursor0, "worker_class_name");
            int v4 = o.E(cursor0, "input_merger_class_name");
            int v5 = o.E(cursor0, "input");
            int v6 = o.E(cursor0, "output");
            int v7 = o.E(cursor0, "initial_delay");
            int v8 = o.E(cursor0, "interval_duration");
            int v9 = o.E(cursor0, "flex_duration");
            int v10 = o.E(cursor0, "run_attempt_count");
            int v11 = o.E(cursor0, "backoff_policy");
            int v12 = o.E(cursor0, "backoff_delay_duration");
            int v13 = o.E(cursor0, "last_enqueue_time");
            int v14 = o.E(cursor0, "minimum_retention_duration");
            int v15 = o.E(cursor0, "schedule_requested_at");
            int v16 = o.E(cursor0, "run_in_foreground");
            int v17 = o.E(cursor0, "out_of_quota_policy");
            int v18 = o.E(cursor0, "period_count");
            int v19 = o.E(cursor0, "generation");
            int v20 = o.E(cursor0, "next_schedule_time_override");
            int v21 = o.E(cursor0, "next_schedule_time_override_generation");
            int v22 = o.E(cursor0, "stop_reason");
            int v23 = o.E(cursor0, "trace_tag");
            int v24 = o.E(cursor0, "required_network_type");
            int v25 = o.E(cursor0, "required_network_request");
            int v26 = o.E(cursor0, "requires_charging");
            int v27 = o.E(cursor0, "requires_device_idle");
            int v28 = o.E(cursor0, "requires_battery_not_low");
            int v29 = o.E(cursor0, "requires_storage_not_low");
            int v30 = o.E(cursor0, "trigger_content_update_delay");
            int v31 = o.E(cursor0, "trigger_max_content_delay");
            int v32 = o.E(cursor0, "content_uri_triggers");
            int v33 = v14;
            ArrayList arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v1);
                int v34 = M6.b.K(cursor0.getInt(v2));
                String s1 = cursor0.getString(v3);
                String s2 = cursor0.getString(v4);
                I2.m m0 = I2.m.a(cursor0.getBlob(v5));
                I2.m m1 = I2.m.a(cursor0.getBlob(v6));
                long v35 = cursor0.getLong(v7);
                long v36 = cursor0.getLong(v8);
                long v37 = cursor0.getLong(v9);
                int v38 = cursor0.getInt(v10);
                int v39 = M6.b.H(cursor0.getInt(v11));
                long v40 = cursor0.getLong(v12);
                long v41 = cursor0.getLong(v13);
                long v42 = cursor0.getLong(v33);
                long v43 = cursor0.getLong(v15);
                v15 = v15;
                if(cursor0.getInt(v16) == 0) {
                    v16 = v16;
                    v44 = v17;
                    z = false;
                }
                else {
                    v16 = v16;
                    v44 = v17;
                    z = true;
                }
                int v45 = M6.b.J(cursor0.getInt(v44));
                v17 = v44;
                int v46 = cursor0.getInt(v18);
                v18 = v18;
                int v47 = cursor0.getInt(v19);
                v19 = v19;
                long v48 = cursor0.getLong(v20);
                v20 = v20;
                int v49 = cursor0.getInt(v21);
                v21 = v21;
                int v50 = cursor0.getInt(v22);
                v22 = v22;
                String s3 = cursor0.isNull(v23) ? null : cursor0.getString(v23);
                v23 = v23;
                int v51 = M6.b.I(cursor0.getInt(v24));
                v24 = v24;
                e e0 = M6.b.V(cursor0.getBlob(v25));
                v25 = v25;
                if(cursor0.getInt(v26) == 0) {
                    v26 = v26;
                    v52 = v27;
                    z1 = false;
                }
                else {
                    v26 = v26;
                    v52 = v27;
                    z1 = true;
                }
                if(cursor0.getInt(v52) == 0) {
                    v27 = v52;
                    v53 = v28;
                    z2 = false;
                }
                else {
                    v27 = v52;
                    v53 = v28;
                    z2 = true;
                }
                if(cursor0.getInt(v53) == 0) {
                    v28 = v53;
                    v54 = v29;
                    z3 = false;
                }
                else {
                    v28 = v53;
                    v54 = v29;
                    z3 = true;
                }
                if(cursor0.getInt(v54) == 0) {
                    v29 = v54;
                    v55 = v30;
                    z4 = false;
                }
                else {
                    v29 = v54;
                    v55 = v30;
                    z4 = true;
                }
                long v56 = cursor0.getLong(v55);
                v30 = v55;
                long v57 = cursor0.getLong(v31);
                v31 = v31;
                I2.g g0 = new I2.g(e0, v51, z1, z2, z3, z4, v56, v57, M6.b.q(cursor0.getBlob(v32)));
                v32 = v32;
                arrayList0.add(new p(s, v34, s1, s2, m0, m1, v35, v36, v37, g0, v38, v39, v40, v41, v42, v43, z, v45, v46, v47, v48, v49, v50, s3));
                v1 = v1;
                v33 = v33;
            }
            return arrayList0;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public ArrayList h() {
        boolean z4;
        int v55;
        boolean z3;
        int v54;
        boolean z2;
        int v53;
        boolean z1;
        int v52;
        boolean z;
        int v44;
        C c0 = M6.b.o(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        ((WorkDatabase_Impl)this.a).b();
        Cursor cursor0 = c.O(((WorkDatabase_Impl)this.a), c0, false);
        try {
            int v1 = o.E(cursor0, "id");
            int v2 = o.E(cursor0, "state");
            int v3 = o.E(cursor0, "worker_class_name");
            int v4 = o.E(cursor0, "input_merger_class_name");
            int v5 = o.E(cursor0, "input");
            int v6 = o.E(cursor0, "output");
            int v7 = o.E(cursor0, "initial_delay");
            int v8 = o.E(cursor0, "interval_duration");
            int v9 = o.E(cursor0, "flex_duration");
            int v10 = o.E(cursor0, "run_attempt_count");
            int v11 = o.E(cursor0, "backoff_policy");
            int v12 = o.E(cursor0, "backoff_delay_duration");
            int v13 = o.E(cursor0, "last_enqueue_time");
            int v14 = o.E(cursor0, "minimum_retention_duration");
            int v15 = o.E(cursor0, "schedule_requested_at");
            int v16 = o.E(cursor0, "run_in_foreground");
            int v17 = o.E(cursor0, "out_of_quota_policy");
            int v18 = o.E(cursor0, "period_count");
            int v19 = o.E(cursor0, "generation");
            int v20 = o.E(cursor0, "next_schedule_time_override");
            int v21 = o.E(cursor0, "next_schedule_time_override_generation");
            int v22 = o.E(cursor0, "stop_reason");
            int v23 = o.E(cursor0, "trace_tag");
            int v24 = o.E(cursor0, "required_network_type");
            int v25 = o.E(cursor0, "required_network_request");
            int v26 = o.E(cursor0, "requires_charging");
            int v27 = o.E(cursor0, "requires_device_idle");
            int v28 = o.E(cursor0, "requires_battery_not_low");
            int v29 = o.E(cursor0, "requires_storage_not_low");
            int v30 = o.E(cursor0, "trigger_content_update_delay");
            int v31 = o.E(cursor0, "trigger_max_content_delay");
            int v32 = o.E(cursor0, "content_uri_triggers");
            int v33 = v14;
            ArrayList arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v1);
                int v34 = M6.b.K(cursor0.getInt(v2));
                String s1 = cursor0.getString(v3);
                String s2 = cursor0.getString(v4);
                I2.m m0 = I2.m.a(cursor0.getBlob(v5));
                I2.m m1 = I2.m.a(cursor0.getBlob(v6));
                long v35 = cursor0.getLong(v7);
                long v36 = cursor0.getLong(v8);
                long v37 = cursor0.getLong(v9);
                int v38 = cursor0.getInt(v10);
                int v39 = M6.b.H(cursor0.getInt(v11));
                long v40 = cursor0.getLong(v12);
                long v41 = cursor0.getLong(v13);
                long v42 = cursor0.getLong(v33);
                long v43 = cursor0.getLong(v15);
                v15 = v15;
                if(cursor0.getInt(v16) == 0) {
                    v16 = v16;
                    v44 = v17;
                    z = false;
                }
                else {
                    v16 = v16;
                    v44 = v17;
                    z = true;
                }
                int v45 = M6.b.J(cursor0.getInt(v44));
                v17 = v44;
                int v46 = cursor0.getInt(v18);
                v18 = v18;
                int v47 = cursor0.getInt(v19);
                v19 = v19;
                long v48 = cursor0.getLong(v20);
                v20 = v20;
                int v49 = cursor0.getInt(v21);
                v21 = v21;
                int v50 = cursor0.getInt(v22);
                v22 = v22;
                String s3 = cursor0.isNull(v23) ? null : cursor0.getString(v23);
                v23 = v23;
                int v51 = M6.b.I(cursor0.getInt(v24));
                v24 = v24;
                e e0 = M6.b.V(cursor0.getBlob(v25));
                v25 = v25;
                if(cursor0.getInt(v26) == 0) {
                    v26 = v26;
                    v52 = v27;
                    z1 = false;
                }
                else {
                    v26 = v26;
                    v52 = v27;
                    z1 = true;
                }
                if(cursor0.getInt(v52) == 0) {
                    v27 = v52;
                    v53 = v28;
                    z2 = false;
                }
                else {
                    v27 = v52;
                    v53 = v28;
                    z2 = true;
                }
                if(cursor0.getInt(v53) == 0) {
                    v28 = v53;
                    v54 = v29;
                    z3 = false;
                }
                else {
                    v28 = v53;
                    v54 = v29;
                    z3 = true;
                }
                if(cursor0.getInt(v54) == 0) {
                    v29 = v54;
                    v55 = v30;
                    z4 = false;
                }
                else {
                    v29 = v54;
                    v55 = v30;
                    z4 = true;
                }
                long v56 = cursor0.getLong(v55);
                v30 = v55;
                long v57 = cursor0.getLong(v31);
                v31 = v31;
                I2.g g0 = new I2.g(e0, v51, z1, z2, z3, z4, v56, v57, M6.b.q(cursor0.getBlob(v32)));
                v32 = v32;
                arrayList0.add(new p(s, v34, s1, s2, m0, m1, v35, v36, v37, g0, v38, v39, v40, v41, v42, v43, z, v45, v46, v47, v48, v49, v50, s3));
                v1 = v1;
                v33 = v33;
            }
            return arrayList0;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public int i(String s) {
        C c0 = M6.b.o(1, "SELECT state FROM workspec WHERE id=?");
        c0.c(1, s);
        ((WorkDatabase_Impl)this.a).b();
        int v = 0;
        Cursor cursor0 = c.O(((WorkDatabase_Impl)this.a), c0, false);
        try {
            if(cursor0.moveToFirst()) {
                Integer integer0 = cursor0.isNull(0) ? null : cursor0.getInt(0);
                if(integer0 != null) {
                    v = M6.b.K(((int)integer0));
                }
            }
            return v;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public p j(String s) {
        boolean z4;
        int v54;
        boolean z3;
        int v53;
        boolean z2;
        int v52;
        boolean z1;
        int v51;
        boolean z;
        int v43;
        C c0 = M6.b.o(1, "SELECT * FROM workspec WHERE id=?");
        c0.c(1, s);
        ((WorkDatabase_Impl)this.a).b();
        Cursor cursor0 = c.O(((WorkDatabase_Impl)this.a), c0, false);
        try {
            int v1 = o.E(cursor0, "id");
            int v2 = o.E(cursor0, "state");
            int v3 = o.E(cursor0, "worker_class_name");
            int v4 = o.E(cursor0, "input_merger_class_name");
            int v5 = o.E(cursor0, "input");
            int v6 = o.E(cursor0, "output");
            int v7 = o.E(cursor0, "initial_delay");
            int v8 = o.E(cursor0, "interval_duration");
            int v9 = o.E(cursor0, "flex_duration");
            int v10 = o.E(cursor0, "run_attempt_count");
            int v11 = o.E(cursor0, "backoff_policy");
            int v12 = o.E(cursor0, "backoff_delay_duration");
            int v13 = o.E(cursor0, "last_enqueue_time");
            int v14 = o.E(cursor0, "minimum_retention_duration");
            int v15 = o.E(cursor0, "schedule_requested_at");
            int v16 = o.E(cursor0, "run_in_foreground");
            int v17 = o.E(cursor0, "out_of_quota_policy");
            int v18 = o.E(cursor0, "period_count");
            int v19 = o.E(cursor0, "generation");
            int v20 = o.E(cursor0, "next_schedule_time_override");
            int v21 = o.E(cursor0, "next_schedule_time_override_generation");
            int v22 = o.E(cursor0, "stop_reason");
            int v23 = o.E(cursor0, "trace_tag");
            int v24 = o.E(cursor0, "required_network_type");
            int v25 = o.E(cursor0, "required_network_request");
            int v26 = o.E(cursor0, "requires_charging");
            int v27 = o.E(cursor0, "requires_device_idle");
            int v28 = o.E(cursor0, "requires_battery_not_low");
            int v29 = o.E(cursor0, "requires_storage_not_low");
            int v30 = o.E(cursor0, "trigger_content_update_delay");
            int v31 = o.E(cursor0, "trigger_max_content_delay");
            int v32 = o.E(cursor0, "content_uri_triggers");
            p p0 = null;
            if(cursor0.moveToFirst()) {
                String s1 = cursor0.getString(v1);
                int v33 = M6.b.K(cursor0.getInt(v2));
                String s2 = cursor0.getString(v3);
                String s3 = cursor0.getString(v4);
                I2.m m0 = I2.m.a(cursor0.getBlob(v5));
                I2.m m1 = I2.m.a(cursor0.getBlob(v6));
                long v34 = cursor0.getLong(v7);
                long v35 = cursor0.getLong(v8);
                long v36 = cursor0.getLong(v9);
                int v37 = cursor0.getInt(v10);
                int v38 = M6.b.H(cursor0.getInt(v11));
                long v39 = cursor0.getLong(v12);
                long v40 = cursor0.getLong(v13);
                long v41 = cursor0.getLong(v14);
                long v42 = cursor0.getLong(v15);
                if(cursor0.getInt(v16) == 0) {
                    v43 = v17;
                    z = false;
                }
                else {
                    v43 = v17;
                    z = true;
                }
                int v44 = M6.b.J(cursor0.getInt(v43));
                int v45 = cursor0.getInt(v18);
                int v46 = cursor0.getInt(v19);
                long v47 = cursor0.getLong(v20);
                int v48 = cursor0.getInt(v21);
                int v49 = cursor0.getInt(v22);
                if(!cursor0.isNull(v23)) {
                    p0 = cursor0.getString(v23);
                }
                int v50 = M6.b.I(cursor0.getInt(v24));
                e e0 = M6.b.V(cursor0.getBlob(v25));
                if(cursor0.getInt(v26) == 0) {
                    v51 = v27;
                    z1 = false;
                }
                else {
                    v51 = v27;
                    z1 = true;
                }
                if(cursor0.getInt(v51) == 0) {
                    v52 = v28;
                    z2 = false;
                }
                else {
                    v52 = v28;
                    z2 = true;
                }
                if(cursor0.getInt(v52) == 0) {
                    v53 = v29;
                    z3 = false;
                }
                else {
                    v53 = v29;
                    z3 = true;
                }
                if(cursor0.getInt(v53) == 0) {
                    v54 = v30;
                    z4 = false;
                }
                else {
                    v54 = v30;
                    z4 = true;
                }
                p0 = new p(s1, v33, s2, s3, m0, m1, v34, v35, v36, new I2.g(e0, v50, z1, z2, z3, z4, cursor0.getLong(v54), cursor0.getLong(v31), M6.b.q(cursor0.getBlob(v32))), v37, v38, v39, v40, v41, v42, z, v44, v45, v46, v47, v48, v49, ((String)p0));
            }
            return p0;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public ArrayList k(String s) {
        C c0 = M6.b.o(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c0.c(1, s);
        ((WorkDatabase_Impl)this.a).b();
        Cursor cursor0 = c.O(((WorkDatabase_Impl)this.a), c0, false);
        try {
            ArrayList arrayList0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s1 = cursor0.getString(0);
                int v1 = M6.b.K(cursor0.getInt(1));
                j.f(s1, "id");
                n n0 = new n();  // initializer: Ljava/lang/Object;-><init>()V
                n0.a = s1;
                n0.b = v1;
                arrayList0.add(n0);
            }
            return arrayList0;
        }
        finally {
            cursor0.close();
            c0.f();
        }
    }

    public void l(long v, String s) {
        ((WorkDatabase_Impl)this.a).b();
        g g0 = ((m)this.m).a();
        g0.H(1, v);
        g0.c(2, s);
        try {
            ((WorkDatabase_Impl)this.a).c();
            try {
                g0.b();
                ((WorkDatabase_Impl)this.a).q();
            }
            finally {
                ((WorkDatabase_Impl)this.a).k();
            }
        }
        finally {
            ((m)this.m).c(g0);
        }
    }

    public void m(int v, String s) {
        ((WorkDatabase_Impl)this.a).b();
        g g0 = ((m)this.l).a();
        g0.c(1, s);
        g0.H(2, ((long)v));
        try {
            ((WorkDatabase_Impl)this.a).c();
            try {
                g0.b();
                ((WorkDatabase_Impl)this.a).q();
            }
            finally {
                ((WorkDatabase_Impl)this.a).k();
            }
        }
        finally {
            ((m)this.l).c(g0);
        }
    }

    public void n(long v, String s) {
        ((WorkDatabase_Impl)this.a).b();
        g g0 = ((m)this.i).a();
        g0.H(1, v);
        g0.c(2, s);
        try {
            ((WorkDatabase_Impl)this.a).c();
            try {
                g0.b();
                ((WorkDatabase_Impl)this.a).q();
            }
            finally {
                ((WorkDatabase_Impl)this.a).k();
            }
        }
        finally {
            ((m)this.i).c(g0);
        }
    }

    public void o(String s, I2.m m0) {
        ((WorkDatabase_Impl)this.a).b();
        g g0 = ((m)this.h).a();
        g0.P(1, d.H(m0));
        g0.c(2, s);
        try {
            ((WorkDatabase_Impl)this.a).c();
            try {
                g0.b();
                ((WorkDatabase_Impl)this.a).q();
            }
            finally {
                ((WorkDatabase_Impl)this.a).k();
            }
        }
        finally {
            ((m)this.h).c(g0);
        }
    }

    public void p(int v, String s) {
        ((WorkDatabase_Impl)this.a).b();
        g g0 = ((m)this.e).a();
        g0.H(1, ((long)M6.b.R(v)));
        g0.c(2, s);
        try {
            ((WorkDatabase_Impl)this.a).c();
            try {
                g0.b();
                ((WorkDatabase_Impl)this.a).q();
            }
            finally {
                ((WorkDatabase_Impl)this.a).k();
            }
        }
        finally {
            ((m)this.e).c(g0);
        }
    }

    public void q(int v, String s) {
        ((WorkDatabase_Impl)this.a).b();
        g g0 = ((m)this.o).a();
        g0.H(1, ((long)v));
        g0.c(2, s);
        try {
            ((WorkDatabase_Impl)this.a).c();
            try {
                g0.b();
                ((WorkDatabase_Impl)this.a).q();
            }
            finally {
                ((WorkDatabase_Impl)this.a).k();
            }
        }
        finally {
            ((m)this.o).c(g0);
        }
    }
}

