package j6;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.measurement.H3;
import com.google.android.gms.internal.measurement.O3;
import com.google.android.gms.internal.measurement.R2;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.T3;
import com.google.android.gms.internal.measurement.Y2;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.w3;
import java.io.Serializable;
import m2.e;
import n.j;
import n.t;
import n2.c;

public final class v implements z, e, t, c {
    public final int X;
    public static v Y;

    public v(int v) {
        this.X = v;
        super();
    }

    @Override  // m2.e
    public CharSequence a(Preference preference0) {
        return TextUtils.isEmpty(((ListPreference)preference0).j()) ? "Not set" : ((ListPreference)preference0).j();
    }

    @Override  // n.t
    public void b(j j0, boolean z) {
    }

    @Override  // n2.c
    public void c(int v, Serializable serializable0) {
    }

    @Override  // n2.c
    public void e() {
    }

    @Override  // n.t
    public boolean j(j j0) {
        return false;
    }

    @Override  // j6.z
    public Object zza() {
        switch(this.X) {
            case 0: {
                Object object1 = (Boolean)H3.b.a();
                object1.getClass();
                return object1;
            }
            case 1: {
                return (int)(((long)(((Long)S2.V.a()))));
            }
            case 2: {
                Object object2 = (Boolean)R2.a.a();
                object2.getClass();
                return object2;
            }
            case 3: {
                Object object3 = (Boolean)Y2.a.a();
                object3.getClass();
                return object3;
            }
            case 4: {
                return (int)(((long)(((Long)S2.S.a()))));
            }
            case 5: {
                return (String)S2.l.a();
            }
            case 6: {
                Object object4 = (Long)S2.b.a();
                object4.getClass();
                return object4;
            }
            case 7: {
                Object object5 = (Long)S2.x.a();
                object5.getClass();
                return object5;
            }
            case 8: {
                Object object6 = (Long)S2.O.a();
                object6.getClass();
                return object6;
            }
            case 9: {
                Object object7 = (Long)S2.y.a();
                object7.getClass();
                return object7;
            }
            case 10: {
                return (int)(((long)(((Long)S2.r.a()))));
            }
            case 11: {
                Object object8 = (Long)T3.e.a();
                object8.getClass();
                return object8;
            }
            case 12: {
                Object object9 = (Long)S2.e.a();
                object9.getClass();
                return object9;
            }
            case 13: {
                return (int)(((long)(((Long)S2.o.a()))));
            }
            case 14: {
                Object object10 = (Boolean)v3.a.a();
                object10.getClass();
                return object10;
            }
            case 15: {
                return (String)S2.g.a();
            }
            case 16: {
                return (String)S2.A.a();
            }
            case 17: {
                return (String)S2.J.a();
            }
            case 18: {
                return (String)S2.f.a();
            }
            case 19: {
                Object object11 = (Boolean)q3.b.a();
                object11.getClass();
                return object11;
            }
            case 20: {
                Object object12 = (Boolean)O3.a.a();
                object12.getClass();
                return object12;
            }
            case 21: {
                return (int)(((long)(((Long)S2.R.a()))));
            }
            case 22: {
                Object object13 = (Boolean)g4.d.a();
                object13.getClass();
                return object13;
            }
            case 23: {
                return (String)S2.E.a();
            }
            case 24: {
                return (int)(((long)(((Long)S2.Z.a()))));
            }
            default: {
                Object object0 = (Boolean)w3.a.a();
                object0.getClass();
                return object0;
            }
        }
    }
}

