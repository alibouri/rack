package R2;

import I2.g;
import I2.m;
import M6.b;
import P4.c;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import q2.C;

public final class t implements Callable {
    public final int a;
    public final C b;
    public final u c;

    public t(u u0, C c0, int v) {
        this.a = v;
        this.c = u0;
        this.b = c0;
        super();
    }

    @Override
    public final Object call() {
        switch(this.a) {
            case 0: {
                u u0 = this.c;
                WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)u0.a;
                workDatabase_Impl0.c();
                try {
                    Cursor cursor1 = c.O(workDatabase_Impl0, this.b, true);
                    try {
                        HashMap hashMap0 = new HashMap();
                        HashMap hashMap1 = new HashMap();
                        while(cursor1.moveToNext()) {
                            String s = cursor1.getString(0);
                            if(!hashMap0.containsKey(s)) {
                                hashMap0.put(s, new ArrayList());
                            }
                            String s1 = cursor1.getString(0);
                            if(hashMap1.containsKey(s1)) {
                                continue;
                            }
                            hashMap1.put(s1, new ArrayList());
                        }
                        cursor1.moveToPosition(-1);
                        u0.b(hashMap0);
                        u0.a(hashMap1);
                        Object object0 = new ArrayList(cursor1.getCount());
                        while(cursor1.moveToNext()) {
                            String s2 = cursor1.getString(0);
                            int v2 = b.K(cursor1.getInt(1));
                            m m0 = m.a(cursor1.getBlob(2));
                            int v3 = cursor1.getInt(3);
                            int v4 = cursor1.getInt(4);
                            long v5 = cursor1.getLong(14);
                            long v6 = cursor1.getLong(15);
                            long v7 = cursor1.getLong(16);
                            int v8 = b.H(cursor1.getInt(17));
                            long v9 = cursor1.getLong(18);
                            long v10 = cursor1.getLong(19);
                            int v11 = cursor1.getInt(20);
                            long v12 = cursor1.getLong(21);
                            int v13 = cursor1.getInt(22);
                            int v14 = b.I(cursor1.getInt(5));
                            ((ArrayList)object0).add(new o(s2, v2, m0, v5, v6, v7, new g(b.V(cursor1.getBlob(6)), v14, cursor1.getInt(7) != 0, cursor1.getInt(8) != 0, cursor1.getInt(9) != 0, cursor1.getInt(10) != 0, cursor1.getLong(11), cursor1.getLong(12), b.q(cursor1.getBlob(13))), v3, v8, v9, v10, v11, v4, v12, v13, ((ArrayList)hashMap0.get(cursor1.getString(0))), ((ArrayList)hashMap1.get(cursor1.getString(0)))));
                        }
                        workDatabase_Impl0.q();
                        return object0;
                    }
                    finally {
                        cursor1.close();
                    }
                }
                finally {
                    workDatabase_Impl0.k();
                }
            }
            case 1: {
                u u1 = this.c;
                WorkDatabase_Impl workDatabase_Impl1 = (WorkDatabase_Impl)u1.a;
                workDatabase_Impl1.c();
                try {
                    Cursor cursor2 = c.O(workDatabase_Impl1, this.b, true);
                    try {
                        HashMap hashMap2 = new HashMap();
                        HashMap hashMap3 = new HashMap();
                        while(cursor2.moveToNext()) {
                            String s3 = cursor2.getString(0);
                            if(!hashMap2.containsKey(s3)) {
                                hashMap2.put(s3, new ArrayList());
                            }
                            String s4 = cursor2.getString(0);
                            if(hashMap3.containsKey(s4)) {
                                continue;
                            }
                            hashMap3.put(s4, new ArrayList());
                        }
                        cursor2.moveToPosition(-1);
                        u1.b(hashMap2);
                        u1.a(hashMap3);
                        Object object1 = new ArrayList(cursor2.getCount());
                        while(cursor2.moveToNext()) {
                            String s5 = cursor2.getString(0);
                            int v17 = b.K(cursor2.getInt(1));
                            m m1 = m.a(cursor2.getBlob(2));
                            int v18 = cursor2.getInt(3);
                            int v19 = cursor2.getInt(4);
                            long v20 = cursor2.getLong(14);
                            long v21 = cursor2.getLong(15);
                            long v22 = cursor2.getLong(16);
                            int v23 = b.H(cursor2.getInt(17));
                            long v24 = cursor2.getLong(18);
                            long v25 = cursor2.getLong(19);
                            int v26 = cursor2.getInt(20);
                            long v27 = cursor2.getLong(21);
                            int v28 = cursor2.getInt(22);
                            int v29 = b.I(cursor2.getInt(5));
                            ((ArrayList)object1).add(new o(s5, v17, m1, v20, v21, v22, new g(b.V(cursor2.getBlob(6)), v29, cursor2.getInt(7) != 0, cursor2.getInt(8) != 0, cursor2.getInt(9) != 0, cursor2.getInt(10) != 0, cursor2.getLong(11), cursor2.getLong(12), b.q(cursor2.getBlob(13))), v18, v23, v24, v25, v26, v19, v27, v28, ((ArrayList)hashMap2.get(cursor2.getString(0))), ((ArrayList)hashMap3.get(cursor2.getString(0)))));
                        }
                        workDatabase_Impl1.q();
                        return object1;
                    }
                    finally {
                        cursor2.close();
                    }
                }
                finally {
                    workDatabase_Impl1.k();
                }
            }
            default: {
                try {
                    boolean z = false;
                    try(Cursor cursor0 = c.O(((WorkDatabase_Impl)this.c.a), this.b, false)) {
                        if(cursor0.moveToFirst()) {
                            if(cursor0.getInt(0) != 0) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                        return Boolean.FALSE;
                    }
                }
                catch(Throwable throwable0) {
                    throw throwable0;
                }
            }
        }
    }

    @Override
    public final void finalize() {
        switch(this.a) {
            case 0: {
                this.b.f();
                return;
            }
            case 1: {
                this.b.f();
                return;
            }
            default: {
                this.b.f();
            }
        }
    }
}

