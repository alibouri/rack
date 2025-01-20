package j6;

import N5.r;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import jeb.synthetic.TWR;

public final class m0 implements Callable {
    public final zzo a;
    public final Bundle b;
    public final h0 c;

    public m0(h0 h00, zzo zzo0, Bundle bundle0) {
        this.a = zzo0;
        this.b = bundle0;
        this.c = h00;
    }

    @Override
    public final Object call() {
        this.c.d.d0();
        k1 k10 = this.c.d;
        k10.c().q();
        d d0 = k10.S();
        zzo zzo0 = this.a;
        if(d0.B(zzo0.X, s.H0)) {
            String s = zzo0.X;
            if(s != null) {
                Bundle bundle0 = this.b;
                if(bundle0 != null) {
                    int[] arr_v = bundle0.getIntArray("uriSources");
                    long[] arr_v1 = bundle0.getLongArray("uriTimestamps");
                    if(arr_v != null) {
                        if(arr_v1 == null || arr_v1.length != arr_v.length) {
                            k10.b().e0.d("Uri sources and timestamps do not match");
                        }
                        else {
                            for(int v = 0; v < arr_v.length; ++v) {
                                g g0 = k10.Z;
                                k1.v(g0);
                                int v1 = arr_v[v];
                                long v2 = arr_v1[v];
                                r.f(s);
                                g0.q();
                                g0.u();
                                try {
                                    SQLiteDatabase sQLiteDatabase0 = g0.y();
                                    g0.b().m0.e("Pruned " + sQLiteDatabase0.delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{s, String.valueOf(v1), String.valueOf(v2)}) + " trigger URIs. appId, source, timestamp", s, v1, v2);
                                }
                                catch(SQLiteException sQLiteException0) {
                                    L l0 = g0.b();
                                    M m0 = L.u(s);
                                    l0.e0.c(m0, "Error pruning trigger URIs. appId", sQLiteException0);
                                }
                            }
                        }
                    }
                }
                g g1 = k10.Z;
                k1.v(g1);
                r.f(s);
                g1.q();
                g1.u();
                Object object0 = new ArrayList();
                Cursor cursor0 = null;
                try {
                    cursor0 = g1.y().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{s}, null, null, "rowid", null);
                    if(cursor0.moveToFirst()) {
                        do {
                            String s1 = cursor0.getString(0);
                            if(s1 == null) {
                                s1 = "";
                            }
                            long v3 = cursor0.getLong(1);
                            ((ArrayList)object0).add(new zzno(cursor0.getInt(2), v3, s1));
                        }
                        while(cursor0.moveToNext());
                        goto label_61;
                    }
                    goto label_63;
                }
                catch(SQLiteException sQLiteException1) {
                    try {
                        try {
                        }
                        catch(SQLiteException sQLiteException1) {
                        }
                        L l1 = g1.b();
                        M m1 = L.u(s);
                        l1.e0.c(m1, "Error querying trigger uris. appId", sQLiteException1);
                        object0 = Collections.emptyList();
                        if(cursor0 != null) {
                            goto label_56;
                        }
                        return object0;
                    }
                    catch(Throwable throwable0) {
                        goto label_59;
                    }
                label_56:
                    cursor0.close();
                    return object0;
                }
                catch(Throwable throwable0) {
                label_59:
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            label_61:
                cursor0.close();
                return object0;
            label_63:
                cursor0.close();
                return object0;
            }
        }
        return new ArrayList();
    }
}

