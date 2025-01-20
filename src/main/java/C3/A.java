package c3;

import Nb.j;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import i3.m;
import java.io.File;
import java.nio.ByteBuffer;

public final class a implements f {
    public final int a;

    public a(int v) {
        this.a = v;
        super();
    }

    @Override  // c3.f
    public final g a(Object object0, m m0) {
        switch(this.a) {
            case 0: {
                return !m3.g.d(((Uri)object0)) ? null : new b(((Uri)object0), m0, 0);
            }
            case 1: {
                return new c(((Bitmap)object0), m0, 0);
            }
            case 2: {
                return new c(((ByteBuffer)object0), m0, 1);
            }
            case 3: {
                return !j.a(((Uri)object0).getScheme(), "content") ? null : new b(((Uri)object0), m0, 1);
            }
            case 4: {
                return new c(((Drawable)object0), m0, 2);
            }
            case 5: {
                return new h(((File)object0));
            }
            default: {
                return !j.a(((Uri)object0).getScheme(), "android.resource") ? null : new b(((Uri)object0), m0, 2);
            }
        }
    }
}

