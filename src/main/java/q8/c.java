package q8;

import Nb.j;
import android.content.Context;
import u9.u;

public final class c implements d {
    @Override  // q8.d
    public Object a(m8.d d0) {
        return (int)d0.H0;
    }

    public u b(Context context0) {
        j.f(context0, "context");
        u u0 = u.b;
        if(u0 == null) {
            synchronized(this) {
                u0 = u.b;
                if(u0 == null) {
                    u0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
                    u.b = u0;
                    u.c = context0.getSharedPreferences("com.skydoves.balloon", 0);
                }
            }
        }
        return u0;
    }
}

