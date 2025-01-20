package v3;

import E3.d;
import Fb.j;
import Vb.q;
import W5.f;
import Xb.G;
import android.content.Context;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import r3.a;
import r3.l;

public final class t extends j implements Function2 {
    public final a c0;
    public final Context d0;
    public final String e0;

    public t(a a0, Context context0, String s, g g0) {
        this.c0 = a0;
        this.d0 = context0;
        this.e0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((t)this.t(((G)object0), ((g)object1))).v(Ab.t.a);
        return Ab.t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new t(this.c0, this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        InputStream inputStream0;
        f.b0(object0);
        for(Object object1: ((HashMap)this.c0.c()).values()) {
            l l0 = (l)object1;
            Nb.j.c(l0);
            String s = l0.d;
            if(l0.f == null && q.O(s, "data:", false) && Vb.j.a0(s, "base64,", 0, false, 6) > 0) {
                try {
                    String s1 = s.substring(Vb.j.Z(s, ',', 0, false, 6) + 1);
                    Nb.j.e(s1, "substring(...)");
                    byte[] arr_b = Base64.decode(s1, 0);
                    BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                    bitmapFactory$Options0.inScaled = true;
                    bitmapFactory$Options0.inDensity = 0xA0;
                    l0.f = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    d.c("data URL did not have correct base64 format.", illegalArgumentException0);
                }
            }
            Context context0 = this.d0;
            if(l0.f == null) {
                String s2 = this.e0;
                if(s2 != null) {
                    try {
                        inputStream0 = context0.getAssets().open(s2 + s);
                    }
                    catch(IOException iOException0) {
                        d.c("Unable to open asset.", iOException0);
                        continue;
                    }
                    Nb.j.c(inputStream0);
                    try {
                        BitmapFactory.Options bitmapFactory$Options1 = new BitmapFactory.Options();
                        bitmapFactory$Options1.inScaled = true;
                        bitmapFactory$Options1.inDensity = 0xA0;
                        l0.f = E3.l.d(BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options1), l0.a, l0.b);
                    }
                    catch(IllegalArgumentException illegalArgumentException1) {
                        d.c("Unable to decode image.", illegalArgumentException1);
                    }
                }
            }
        }
        return Ab.t.a;
    }
}

