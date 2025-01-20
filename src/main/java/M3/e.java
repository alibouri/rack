package m3;

import Bb.q;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import i3.c;
import i3.i;
import j3.f;
import k3.a;
import k3.b;

public abstract class e {
    public static final c a;

    static {
        e.a = new c();
    }

    public static final boolean a(i i0) {
        switch(i0.f.ordinal()) {
            case 0: {
                return false;
            }
            case 1: {
                break;
            }
            case 2: {
                j3.i i1 = i0.x;
                if(i0.C.a != null || !(i1 instanceof j3.c)) {
                    b b0 = i0.c;
                    if(b0 instanceof a && i1 instanceof f) {
                        ImageView imageView0 = ((a)b0).Y;
                        return imageView0 instanceof ImageView && imageView0 == ((f)i1).X;
                    }
                    return false;
                }
                break;
            }
            default: {
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
        return true;
    }

    public static final Drawable b(i i0, Integer integer0, Drawable drawable0) {
        if(integer0 != null) {
            if(((int)integer0) == 0) {
                return null;
            }
            int v = (int)integer0;
            drawable0 = q.v(i0.a, v);
            if(drawable0 == null) {
                throw new IllegalStateException(("Invalid resource ID: " + v).toString());
            }
        }
        return drawable0;
    }
}

