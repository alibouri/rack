package j6;

import android.text.TextUtils;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.gms.internal.measurement.I3;
import com.google.android.gms.internal.measurement.M2;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.T3;
import com.google.android.gms.internal.measurement.Y2;
import com.google.android.gms.internal.measurement.d3;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.k3;
import com.google.android.gms.internal.measurement.l4;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.q4;
import k2.U1;
import m2.e;
import n0.I;
import n0.K;
import n0.S;
import yc.l;

public final class u implements z, U1, e, S {
    public final int X;
    public static u Y;

    public u(int v) {
        this.X = v;
        super();
    }

    // Deobfuscation rating: LOW(20)
    @Override  // m2.e
    public CharSequence a(Preference preference0) {
        return TextUtils.isEmpty(((EditTextPreference)preference0).k0) ? "Not set" : ((EditTextPreference)preference0).k0;
    }

    @Override  // n0.S
    public K d(long v, LayoutDirection layoutDirection0, Density density0) {
        return new I(l.g(0L, v));
    }

    @Override
    public String toString() {
        return this.X == 28 ? "RectangleShape" : super.toString();
    }

    @Override  // j6.z
    public Object zza() {
        switch(this.X) {
            case 0: {
                Object object1 = (Boolean)j3.a.a();
                object1.getClass();
                return object1;
            }
            case 1: {
                Object object2 = (Boolean)p3.b.a();
                object2.getClass();
                return object2;
            }
            case 2: {
                Object object3 = (Boolean)d3.a.a();
                object3.getClass();
                return object3;
            }
            case 3: {
                Object object4 = (Boolean)M2.a.a();
                object4.getClass();
                return object4;
            }
            case 4: {
                Object object5 = (Boolean)q4.a.a();
                object5.getClass();
                return object5;
            }
            case 5: {
                return (int)(((long)(((Long)S2.Y.a()))));
            }
            case 6: {
                Object object6 = (Long)S2.N.a();
                object6.getClass();
                return object6;
            }
            case 7: {
                Object object7 = (Long)S2.P.a();
                object7.getClass();
                return object7;
            }
            case 8: {
                Object object8 = (Long)S2.w.a();
                object8.getClass();
                return object8;
            }
            case 9: {
                Object object9 = (Long)S2.b0.a();
                object9.getClass();
                return object9;
            }
            case 10: {
                Object object10 = (Long)S2.X.a();
                object10.getClass();
                return object10;
            }
            case 11: {
                Object object11 = (Long)S2.D.a();
                object11.getClass();
                return object11;
            }
            case 12: {
                Object object12 = (Boolean)Y2.d.a();
                object12.getClass();
                return object12;
            }
            case 13: {
                Object object13 = (Double)T3.c.a();
                object13.getClass();
                return object13;
            }
            case 14: {
                return (int)(((long)(((Long)S2.d.a()))));
            }
            case 15: {
                return (int)(((long)(((Long)S2.v.a()))));
            }
            case 16: {
                return (String)S2.G.a();
            }
            case 17: {
                return (String)S2.e0.a();
            }
            case 18: {
                Object object14 = (Long)S2.H.a();
                object14.getClass();
                return object14;
            }
            case 19: {
                Object object15 = (Boolean)S2.c.a();
                object15.getClass();
                return object15;
            }
            case 20: {
                Object object16 = (Boolean)q3.a.a();
                object16.getClass();
                return object16;
            }
            case 21: {
                Object object17 = (Boolean)l4.a.a();
                object17.getClass();
                return object17;
            }
            case 22: {
                Object object18 = (Boolean)k3.a.a();
                object18.getClass();
                return object18;
            }
            case 23: {
                Object object19 = (Boolean)e3.b.a();
                object19.getClass();
                return object19;
            }
            case 24: {
                Object object20 = (Boolean)g4.e.a();
                object20.getClass();
                return object20;
            }
            default: {
                Object object0 = (Boolean)I3.b.a();
                object0.getClass();
                return object0;
            }
        }
    }
}

