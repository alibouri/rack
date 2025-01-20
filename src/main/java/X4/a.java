package X4;

import Bb.n;
import M4.l;
import a5.w;
import java.util.Set;

public final class a {
    public static final a a;
    public static final Set b;

    static {
        a.a = new a();  // initializer: Ljava/lang/Object;-><init>()V
        a.b = n.z0(new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});
    }

    public static final boolean a() {
        Class class1;
        f f0 = f.a;
        Class class0 = a.class;
        if(f5.a.b(class0)) {
            return false;
        }
        try {
            if(l.e(l.a()) || w.N()) {
                return false;
            }
            class1 = f.class;
            if(!f5.a.b(class1)) {
                goto label_8;
            }
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
        }
        return false;
        try {
        label_8:
            if(f.b == null) {
                f.b = Boolean.valueOf(f0.a(l.a()) != null);
            }
            return f.b == null ? false : f.b.booleanValue();
        }
        catch(Throwable throwable1) {
        }
        try {
            f5.a.a(throwable1, class1);
        }
        catch(Throwable throwable0) {
            f5.a.a(throwable0, class0);
        }
        return false;
    }
}

