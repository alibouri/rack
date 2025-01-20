package m3;

import android.os.SystemClock;
import b3.h;
import j3.a;
import yc.l;

public final class k implements i {
    public static final k a;
    public static h b;

    static {
        k.a = new k();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // m3.i
    public boolean a() {
        synchronized(m3.h.a) {
            int v1 = m3.h.c;
            m3.h.c = v1 + 1;
            if(v1 >= 30 || SystemClock.uptimeMillis() > m3.h.d + 30000L) {
                boolean z = false;
                m3.h.c = 0;
                m3.h.d = SystemClock.uptimeMillis();
                String[] arr_s = m3.h.b.list();
                if(arr_s == null) {
                    arr_s = new String[0];
                }
                if(arr_s.length < 800) {
                    z = true;
                }
                m3.h.e = z;
            }
            return m3.h.e;
        }
    }

    @Override  // m3.i
    public boolean b(j3.h h0) {
        int v = 0x7FFFFFFF;
        if((h0.a instanceof a ? ((a)h0.a).b : 0x7FFFFFFF) > 100) {
            l l0 = h0.b;
            if(l0 instanceof a) {
                v = ((a)l0).b;
            }
            return v > 100;
        }
        return false;
    }
}

