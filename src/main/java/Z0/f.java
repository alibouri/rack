package z0;

import android.view.MotionEvent;
import com.google.android.gms.internal.measurement.E1;
import d6.a;
import java.util.List;

public final class f {
    public final Object a;
    public final a b;
    public final int c;
    public int d;

    public f(List list0, a a0) {
        this.a = list0;
        this.b = a0;
        MotionEvent motionEvent0 = null;
        MotionEvent motionEvent1 = a0 == null ? null : ((MotionEvent)((E1)a0.Z).Z);
        int v = 0;
        this.c = motionEvent1 == null ? 0 : motionEvent1.getButtonState();
        MotionEvent motionEvent2 = a0 == null ? null : ((MotionEvent)((E1)a0.Z).Z);
        if(motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        if(a0 != null) {
            motionEvent0 = (MotionEvent)((E1)a0.Z).Z;
        }
        int v1 = 1;
        if(motionEvent0 == null) {
            int v2 = list0.size();
            while(true) {
                if(v >= v2) {
                    v1 = 3;
                    break;
                }
                n n0 = (n)list0.get(v);
                if(l.c(n0)) {
                    v1 = 2;
                    break;
                }
                if(l.a(n0)) {
                    break;
                }
                ++v;
            }
        }
        else {
            switch(motionEvent0.getActionMasked()) {
                case 0: 
                case 5: {
                    v = 1;
                    break;
                }
                case 1: 
                case 6: {
                    v = 2;
                    break;
                }
                case 2: 
                case 7: {
                    v = 3;
                    break;
                }
                case 8: {
                    v = 6;
                    break;
                }
                case 9: {
                    v = 4;
                    break;
                }
                case 10: {
                    v = 5;
                }
            }
            v1 = v;
        }
        this.d = v1;
    }
}

