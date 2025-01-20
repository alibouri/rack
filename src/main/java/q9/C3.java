package q9;

import Ab.k;
import Bb.F;
import E7.s;
import Nb.j;
import R2.m;
import Y8.N;
import ac.B0;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import androidx.activity.result.ActivityResult;
import com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeActivity;
import com.wave.customer.risk.ussdsecuritychallenge.UssdSecurityChallengeActivity;
import f.a;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import m7.o;
import o6.d;
import o6.e;
import o9.m0;
import x5.i;
import y5.c;
import y5.h;
import z5.b;
import za.g;
import za.p;
import za.q;
import za.w;
import za.z;

public final class c3 implements a, d, e, b {
    public final int X;
    public final Object Y;

    public c3(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // z5.b
    public Object a() {
        Object object0 = this.Y;
        switch(this.X) {
            case 2: {
                ((h)(((c)object0))).getClass();
                m m0 = new m();  // initializer: Ljava/lang/Object;-><init>()V
                m0.X = null;
                m0.Y = new ArrayList();
                m0.Z = null;
                m0.b0 = "";
                HashMap hashMap0 = new HashMap();
                SQLiteDatabase sQLiteDatabase0 = ((h)(((c)object0))).a();
                sQLiteDatabase0.beginTransaction();
                try {
                    Object object2 = (u5.a)h.v(sQLiteDatabase0.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new s(((h)(((c)object0))), hashMap0, m0, 11));
                    sQLiteDatabase0.setTransactionSuccessful();
                    return object2;
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
            }
            case 3: {
                h h0 = (h)(((y5.d)object0));
                long v1 = h0.Y.j();
                SQLiteDatabase sQLiteDatabase1 = h0.a();
                sQLiteDatabase1.beginTransaction();
                try {
                    String[] arr_s = {String.valueOf(v1 - h0.b0.d)};
                    Cursor cursor0 = sQLiteDatabase1.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", arr_s);
                    while(true) {
                        try {
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                            int v3 = cursor0.getInt(0);
                            String s = cursor0.getString(1);
                            h0.l(((long)v3), u5.c.Z, s);
                        }
                        catch(Throwable throwable0) {
                            cursor0.close();
                            throw throwable0;
                        }
                    }
                    cursor0.close();
                    int v4 = sQLiteDatabase1.delete("events", "timestamp_ms < ?", arr_s);
                    sQLiteDatabase1.setTransactionSuccessful();
                    return v4;
                }
                finally {
                    sQLiteDatabase1.endTransaction();
                }
            }
            case 4: {
                SQLiteDatabase sQLiteDatabase2 = ((h)((x5.h)object0).i).a();
                sQLiteDatabase2.beginTransaction();
                try {
                    sQLiteDatabase2.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabase2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ((h)((x5.h)object0).i).Y.j()).execute();
                    sQLiteDatabase2.setTransactionSuccessful();
                    return null;
                }
                finally {
                    sQLiteDatabase2.endTransaction();
                }
            }
            default: {
                o o0 = new o(22);
                for(Object object1: ((Iterable)((h)((i)object0).b).f(o0))) {
                    ((i)object0).c.a(((r5.i)object1), 1, false);
                }
                return null;
            }
        }
    }

    @Override  // f.a
    public void b(Object object0) {
        Object object1 = this.Y;
        if(this.X != 0) {
            boolean z = ((Boolean)object0).booleanValue();
            ((UssdSecurityChallengeActivity)object1).J0.a((z ? "phone permission was granted" : "phone permission was not granted"), new Object[0]);
            if(!z || Build.VERSION.SDK_INT < 26) {
                z z1 = ((UssdSecurityChallengeActivity)object1).I();
                z1.getClass();
                w w0 = new w(z1, null);
                N.k(z1, z1.d0, false, w0);
            }
            else {
                r1.b(((UssdSecurityChallengeActivity)object1)).e().d("ussd security challenge: call ussd code automatically", null);
                hd.a a0 = ((UssdSecurityChallengeActivity)object1).J0;
                a0.a("trying to make ussd call from code", new Object[0]);
                q q0 = (q)((B0)((UssdSecurityChallengeActivity)object1).I().g0.X).getValue();
                if(!(q0 instanceof p)) {
                    r1.b(((UssdSecurityChallengeActivity)object1)).e().d("ussd security challenge: attemted automatic ussd call without code", null);
                    a0.l("tried to make an automatic USSD call but from the wrong state", new Object[0]);
                    return;
                }
                String s = ((p)q0).b;
                Object object2 = ((UssdSecurityChallengeActivity)object1).getSystemService("phone");
                j.d(object2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                if(w1.c.a(((UssdSecurityChallengeActivity)object1), "android.permission.CALL_PHONE") == 0) {
                    ((TelephonyManager)object2).sendUssdRequest(s, new g(((UssdSecurityChallengeActivity)object1)), new Handler(Looper.getMainLooper()));
                    return;
                }
            }
            return;
        }
        j.f(((ActivityResult)object0), "activityResult");
        if(((ActivityResult)object0).X == -1) {
            Intent intent0 = ((ActivityResult)object0).Y;
            if(intent0 != null) {
                Parcelable parcelable0 = intent0.getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable0 != null) {
                    ((Function2)object1).j(parcelable0, intent0.getParcelableExtra("com.wave.workflowState"));
                }
            }
        }
    }

    @Override  // o6.e
    public void k(Object object0) {
        Object object1 = this.Y;
        if(this.X != 1) {
            ((m0)object1).n(object0);
            return;
        }
        ((m0)object1).n(object0);
    }

    @Override  // o6.d
    public void u(Exception exception0) {
        ((MagicLinkSecurityChallengeActivity)this.Y).getClass();
        r1.b(((MagicLinkSecurityChallengeActivity)this.Y)).e().d("magic link security challenge: failed to start sms retriever", F.J(new k("errorMsg", exception0.getMessage())));
    }
}

