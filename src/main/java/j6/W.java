package j6;

import android.util.Log;
import android.view.ContextThemeWrapper;
import com.google.android.gms.internal.measurement.B3;
import com.google.android.gms.internal.measurement.H3;
import com.google.android.gms.internal.measurement.I3;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.T3;
import com.google.android.gms.internal.measurement.U3;
import com.google.android.gms.internal.measurement.X2;
import com.google.android.gms.internal.measurement.Y2;
import com.google.android.gms.internal.measurement.Z3;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.q3;
import java.io.Serializable;
import k2.U1;
import n2.c;

public final class w implements z, U1, c {
    public final int X;

    public w(int v) {
        this.X = v;
        super();
    }

    public w(ContextThemeWrapper contextThemeWrapper0) {
        this.X = 27;
        super();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("com.wave.personal");
        stringBuilder0.append("_preferences");
    }

    @Override  // n2.c
    public void c(int v, Serializable serializable0) {
        String s;
        switch(v) {
            case 1: {
                s = "RESULT_INSTALL_SUCCESS";
                break;
            }
            case 2: {
                s = "RESULT_ALREADY_INSTALLED";
                break;
            }
            case 3: {
                s = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            }
            case 4: {
                s = "RESULT_NOT_WRITABLE";
                break;
            }
            case 5: {
                s = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            }
            case 6: {
                s = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            }
            case 7: {
                s = "RESULT_IO_EXCEPTION";
                break;
            }
            case 8: {
                s = "RESULT_PARSE_EXCEPTION";
                break;
            }
            case 10: {
                s = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            }
            case 11: {
                s = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            }
            default: {
                s = "";
            }
        }
        if(v != 6 && v != 7 && v != 8) {
            Log.d("ProfileInstaller", s);
            return;
        }
        Log.e("ProfileInstaller", s, ((Throwable)serializable0));
    }

    @Override  // n2.c
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override  // j6.z
    public Object zza() {
        switch(this.X) {
            case 0: {
                Object object1 = (Boolean)H3.a.a();
                object1.getClass();
                return object1;
            }
            case 1: {
                return (int)(((long)(((Long)S2.U.a()))));
            }
            case 2: {
                Object object2 = (Boolean)B3.a.a();
                object2.getClass();
                return object2;
            }
            case 3: {
                Object object3 = (Boolean)Z3.f.a();
                object3.getClass();
                return object3;
            }
            case 4: {
                return (int)(((long)(((Long)S2.W.a()))));
            }
            case 5: {
                return (String)S2.c0.a();
            }
            case 6: {
                Object object4 = (Boolean)Y2.b.a();
                object4.getClass();
                return object4;
            }
            case 7: {
                Object object5 = (Long)S2.h.a();
                object5.getClass();
                return object5;
            }
            case 8: {
                Object object6 = (Long)S2.C.a();
                object6.getClass();
                return object6;
            }
            case 9: {
                return (int)(((long)(((Long)S2.a0.a()))));
            }
            case 10: {
                return (int)(((long)(((Long)S2.m.a()))));
            }
            case 11: {
                return (String)T3.f.a();
            }
            case 12: {
                return (int)(((long)(((Long)T3.d.a()))));
            }
            case 13: {
                return (int)(((long)(((Long)S2.s.a()))));
            }
            case 14: {
                Object object7 = (Long)S2.M.a();
                object7.getClass();
                return object7;
            }
            case 15: {
                return (String)S2.K.a();
            }
            case 16: {
                Object object8 = (Long)S2.i.a();
                object8.getClass();
                return object8;
            }
            case 17: {
                Object object9 = (Boolean)Z3.c.a();
                object9.getClass();
                return object9;
            }
            case 18: {
                return (int)(((long)(((Long)S2.t.a()))));
            }
            case 19: {
                Object object10 = (Boolean)U3.a.a();
                object10.getClass();
                return object10;
            }
            case 20: {
                Object object11 = (Boolean)q3.c.a();
                object11.getClass();
                return object11;
            }
            case 21: {
                return (int)(((long)(((Long)X2.a.a()))));
            }
            case 22: {
                Object object12 = (Boolean)a4.a.a();
                object12.getClass();
                return object12;
            }
            case 23: {
                Object object13 = (Boolean)g4.c.a();
                object13.getClass();
                return object13;
            }
            default: {
                Object object0 = (Boolean)I3.a.a();
                object0.getClass();
                return object0;
            }
        }
    }
}

