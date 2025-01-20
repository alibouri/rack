package v3;

import Ab.t;
import E3.d;
import Fb.j;
import W5.f;
import Xb.G;
import android.content.Context;
import android.graphics.Typeface;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import r3.a;
import x3.c;

public final class s extends j implements Function2 {
    public final a c0;
    public final Context d0;
    public final String e0;
    public final String f0;

    public s(a a0, Context context0, String s, String s1, g g0) {
        this.c0 = a0;
        this.d0 = context0;
        this.e0 = s;
        this.f0 = s1;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((s)this.t(((G)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new s(this.c0, this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Typeface typeface0;
        f.b0(object0);
        for(Object object1: this.c0.f.values()) {
            c c0 = (c)object1;
            Nb.j.c(c0);
            String s = c0.c;
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(this.e0);
            stringBuilder0.append(c0.a);
            stringBuilder0.append(this.f0);
            try {
                typeface0 = Typeface.createFromAsset(this.d0.getAssets(), stringBuilder0.toString());
            }
            catch(Exception unused_ex) {
                d.a.getClass();
                continue;
            }
            try {
                Nb.j.c(typeface0);
                Nb.j.e(s, "getStyle(...)");
                int v = 0;
                boolean z = Vb.j.R(s, "Italic", false);
                boolean z1 = Vb.j.R(s, "Bold", false);
                if(z && z1) {
                    v = 3;
                }
                else if(z) {
                    v = 2;
                }
                else if(z1) {
                    v = 1;
                }
                if(typeface0.getStyle() != v) {
                    typeface0 = Typeface.create(typeface0, v);
                }
                c0.d = typeface0;
            }
            catch(Exception unused_ex) {
                d.a.getClass();
            }
        }
        return t.a;
    }
}

