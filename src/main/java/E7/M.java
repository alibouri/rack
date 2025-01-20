package E7;

import S5.c;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import n2.b;
import o6.k;
import o6.p;
import s.e;

public final class m {
    public final Object a;
    public final Object b;
    public static final Object c;
    public static Q d;

    static {
        m.c = new Object();
    }

    public m(Context context0) {
        this.a = context0;
        this.b = new b(0);
    }

    public m(ExecutorService executorService0) {
        this.b = new e(0);  // initializer: Ls/J;-><init>(I)V
        this.a = executorService0;
    }

    public static p a(Context context0, Intent intent0, boolean z) {
        Q q0;
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized(m.c) {
            if(m.d == null) {
                m.d = new Q(context0);
            }
            q0 = m.d;
        }
        if(z) {
            if(C.D().F(context0)) {
                N.b(context0, q0, intent0);
                return k.e(-1);
            }
            q0.b(intent0);
            return k.e(-1);
        }
        return q0.b(intent0).l(new b(0), new l(1));
    }

    public p b(Intent intent0) {
        String s = intent0.getStringExtra("gcm.rawData64");
        boolean z = false;
        if(s != null) {
            intent0.putExtra("rawData", Base64.decode(s, 0));
            intent0.removeExtra("gcm.rawData64");
        }
        Context context0 = (Context)this.a;
        boolean z1 = c.d();
        if((intent0.getFlags() & 0x10000000) != 0) {
            z = true;
        }
        if(z1 && !z) {
            return m.a(context0, intent0, z);
        }
        j j0 = new j(context0, 0, intent0);
        p p0 = k.c(((b)this.b), j0);
        E7.k k0 = new E7.k(context0, intent0, z);
        return p0.d(((b)this.b), k0);
    }
}

