package c3;

import B2.q;
import Ec.j;
import a3.f;
import a3.r;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import i3.m;
import java.nio.ByteBuffer;

public final class c implements g {
    public final int a;
    public final m b;
    public final Object c;

    public c(Object object0, m m0, int v) {
        this.a = v;
        this.c = object0;
        this.b = m0;
        super();
    }

    @Override  // c3.g
    public final Object a(kotlin.coroutines.g g0) {
        j j0;
        m m0 = this.b;
        boolean z = false;
        Object object0 = this.c;
        switch(this.a) {
            case 0: {
                return new d(new BitmapDrawable(m0.a.getResources(), ((Bitmap)object0)), false, f.Y);
            }
            case 1: {
                try {
                    j0 = new j();  // initializer: Ljava/lang/Object;-><init>()V
                    j0.write(((ByteBuffer)object0));
                }
                finally {
                    ((ByteBuffer)object0).position(0);
                }
                return new c3.m(new r(j0, new B9.g(m0.a, 3), null), null, f.Y);
            }
            default: {
                Drawable drawable0 = (Drawable)object0;
                if(drawable0 instanceof VectorDrawable || drawable0 instanceof q) {
                    z = true;
                }
                if(z) {
                    Bitmap bitmap0 = P4.c.r(drawable0, m0.b, m0.d, m0.e, m0.f);
                    drawable0 = new BitmapDrawable(m0.a.getResources(), bitmap0);
                }
                return new d(drawable0, z, f.Y);
            }
        }
    }
}

