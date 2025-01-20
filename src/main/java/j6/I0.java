package j6;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import jeb.synthetic.TWR;

public final class i0 implements Runnable {
    public final int X;
    public h0 Y;
    public Bundle Z;
    public String b0;

    public i0(int v) {
        this.X = v;
        super();
    }

    @Override
    public final void run() {
        long v;
        if(this.X != 0) {
            k1 k10 = this.Y.d;
            Cursor cursor0 = null;
            boolean z = k10.S().B(null, s.e1);
            boolean z1 = k10.S().B(null, s.g1);
            Bundle bundle0 = this.Z;
            String s = this.b0;
            if(bundle0.isEmpty() && z && z1) {
                g g0 = k10.Z;
                k1.v(g0);
                g0.y0(s);
                return;
            }
            g g1 = k10.Z;
            k1.v(g1);
            g1.i0(s, bundle0);
            if(z1) {
                g g2 = k10.Z;
                k1.v(g2);
                boolean z2 = false;
                try {
                    cursor0 = g2.y().rawQuery("select timestamp from raw_events where app_id=? and name = \'_f\' limit 1;", new String[]{s});
                    if(!cursor0.moveToFirst()) {
                        goto label_52;
                    }
                    v = cursor0.getLong(0);
                    goto label_25;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_29;
                    try {
                    label_25:
                        ((d0)g2.Y).l0.getClass();
                        goto label_32;
                    }
                    catch(SQLiteException sQLiteException1) {
                    }
                    catch(Throwable throwable0) {
                        goto label_41;
                    }
                    sQLiteException0 = sQLiteException1;
                    try {
                    label_29:
                        boolean z3 = false;
                        g2.b().e0.b(sQLiteException0, "Error checking backfill conditions");
                        goto label_37;
                        try {
                        label_32:
                            z3 = Long.compare(System.currentTimeMillis(), v + 15000L) < 0;
                            if(g2.C("select count(*) from raw_events where app_id=? and name not like \'!_%\' escape \'!\' limit 1;", new String[]{s}, 0L) > 0L) {
                                goto label_43;
                            }
                            else {
                                goto label_46;
                            }
                            goto label_47;
                        }
                        catch(SQLiteException sQLiteException0) {
                            g2.b().e0.b(sQLiteException0, "Error checking backfill conditions");
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_41;
                    }
                label_37:
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                    goto label_47;
                }
                catch(Throwable throwable0) {
                label_41:
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            label_43:
                z2 = true;
                cursor0.close();
                goto label_47;
            label_46:
                cursor0.close();
            label_47:
                if(z3 && !z2) {
                    g g3 = k10.Z;
                    k1.v(g3);
                    g3.Q(s, bundle0);
                    return;
                label_52:
                    cursor0.close();
                    return;
                }
            }
            return;
        }
        h0 h00 = this.Y;
        h00.getClass();
        Bundle bundle1 = this.Z;
        String s1 = this.b0;
        k1 k11 = h00.d;
        if(bundle1.isEmpty()) {
            g g4 = k11.Z;
            k1.v(g4);
            g4.y0(s1);
            return;
        }
        g g5 = k11.Z;
        k1.v(g5);
        g5.i0(s1, bundle1);
        g g6 = k11.Z;
        k1.v(g6);
        g6.Q(s1, bundle1);
    }
}

