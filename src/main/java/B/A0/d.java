package A0;

import Z3.r;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.Z0;
import com.google.android.gms.internal.measurement.a1;
import j6.L;
import j6.M;
import j6.O;
import j6.g;
import j6.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jeb.synthetic.TWR;

public final class d {
    public long a;
    public final Object b;
    public final Object c;

    public d(int v) {
        if(v != 1) {
            super();
            this.b = new c();
            this.c = new c();
            return;
        }
        Z3.c c0 = new Z3.c(1, null, 0);
        super();
        this.a = 10000L;
        this.b = c0;
        this.c = r.X;
    }

    public d(g g0, String s) {
        this.c = g0;
        this.a = -1L;
        N5.r.f(s);
        this.b = s;
    }

    public List a() {
        List list1;
        Z0 z00;
        g g0 = (g)this.c;
        List list0 = new ArrayList();
        String s = String.valueOf(this.a);
        String s1 = (String)this.b;
        Cursor cursor0 = null;
        try {
            cursor0 = g0.y().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{s1, s}, null, null, "rowid", "1000");
            if(cursor0.moveToFirst()) {
                while(true) {
                    boolean z = false;
                    long v = cursor0.getLong(0);
                    long v1 = cursor0.getLong(3);
                    if(Long.compare(cursor0.getLong(5), 1L) == 0) {
                        z = true;
                    }
                    byte[] arr_b = cursor0.getBlob(4);
                    if(v > this.a) {
                        this.a = v;
                    }
                    try {
                        z00 = (Z0)O.E(a1.B(), arr_b);
                    }
                    catch(IOException iOException0) {
                        L l0 = g0.b();
                        M m0 = L.u(s1);
                        l0.e0.c(m0, "Data loss. Failed to merge raw event. appId", iOException0);
                        goto label_31;
                    }
                    String s2 = cursor0.getString(1);
                    if(s2 == null) {
                        s2 = "";
                    }
                    z00.f();
                    a1.w(((a1)z00.Y), s2);
                    long v2 = cursor0.getLong(2);
                    z00.f();
                    a1.y(v2, ((a1)z00.Y));
                    ((ArrayList)list0).add(new h(v, v1, z, ((a1)z00.d())));
                label_31:
                    if(cursor0.moveToNext()) {
                        continue;
                    }
                    goto label_32;
                }
            }
            goto label_34;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_37;
        }
        catch(Throwable throwable0) {
            goto label_44;
        }
    label_32:
        cursor0.close();
        return list0;
        try {
            try {
            label_34:
                list1 = Collections.emptyList();
                goto label_46;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_37:
            L l1 = g0.b();
            M m1 = L.u(s1);
            l1.e0.c(m1, "Data loss. Error querying raw events batch. appId", sQLiteException0);
            if(cursor0 != null) {
                goto label_41;
            }
            return list0;
        }
        catch(Throwable throwable0) {
            goto label_44;
        }
    label_41:
        cursor0.close();
        return list0;
    label_44:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_46:
        cursor0.close();
        return list1;
    }
}

