package k5;

import Bb.n;
import N4.h;
import Nb.j;
import T0.B;
import T0.l;
import T0.o;
import T0.w;
import T0.y;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import java.util.ArrayList;
import jeb.synthetic.TWR;
import n0.M;
import n0.v;
import y1.b;
import y1.e;
import y1.f;

public abstract class d {
    public static final ThreadLocal a;

    static {
        d.a = new ThreadLocal();
    }

    public static final w a(int v) {
        if(v >= 0 && v < 150) {
            return w.Y;
        }
        if(150 <= v && v < 0xFA) {
            return w.Z;
        }
        if(0xFA <= v && v < 350) {
            return w.b0;
        }
        if(350 <= v && v < 450) {
            return w.c0;
        }
        if(450 <= v && v < 550) {
            return w.d0;
        }
        if(550 <= v && v < 650) {
            return w.e0;
        }
        if(650 <= v && v < 750) {
            return w.f0;
        }
        if(750 <= v && v < 850) {
            return w.g0;
        }
        return 850 > v || v >= 1000 ? w.c0 : w.h0;
    }

    public static long b(TypedArray typedArray0, int v) {
        long v1 = v.i;
        if(typedArray0.hasValue(v)) {
            if(!typedArray0.hasValue(v)) {
                throw new IllegalArgumentException("Attribute not defined in set.");
            }
            return M.c(typedArray0.getColor(v, 0));
        }
        return v1;
    }

    public static final a c(TypedArray typedArray0, int v) {
        o o0;
        ThreadLocal threadLocal0 = d.a;
        Object object0 = threadLocal0.get();
        if(object0 == null) {
            object0 = new TypedValue();
            threadLocal0.set(object0);
        }
        if(typedArray0.getValue(v, ((TypedValue)object0)) && ((TypedValue)object0).type == 3) {
            CharSequence charSequence0 = ((TypedValue)object0).string;
            boolean z = j.a(charSequence0, "sans-serif");
            y y0 = l.Y;
            if(z) {
                return new a(y0);
            }
            if(j.a(charSequence0, "sans-serif-thin")) {
                return new a(y0, w.i0);
            }
            if(j.a(charSequence0, "sans-serif-light")) {
                return new a(y0, w.j0);
            }
            if(j.a(charSequence0, "sans-serif-medium")) {
                return new a(y0, w.l0);
            }
            if(j.a(charSequence0, "sans-serif-black")) {
                return new a(y0, w.p0);
            }
            if(j.a(charSequence0, "serif")) {
                return new a(l.Z);
            }
            if(j.a(charSequence0, "cursive")) {
                return new a(l.c0);
            }
            if(j.a(charSequence0, "monospace")) {
                return new a(l.b0);
            }
            if(((TypedValue)object0).resourceId != 0) {
                CharSequence charSequence1 = ((TypedValue)object0).string;
                j.e(charSequence1, "string");
                if(Vb.j.r0(charSequence1, "res/font")) {
                    CharSequence charSequence2 = ((TypedValue)object0).string;
                    j.e(charSequence2, "string");
                    if(Vb.j.U(charSequence2, ".xml")) {
                        Resources resources0 = typedArray0.getResources();
                        j.e(resources0, "getResources(...)");
                        XmlResourceParser xmlResourceParser0 = resources0.getXml(((TypedValue)object0).resourceId);
                        j.e(xmlResourceParser0, "getXml(...)");
                        try {
                            y1.d d0 = b.l(xmlResourceParser0, resources0);
                            if(d0 instanceof e) {
                                f[] arr_f = ((e)d0).a;
                                j.e(arr_f, "getEntries(...)");
                                ArrayList arrayList0 = new ArrayList(arr_f.length);
                                for(int v1 = 0; v1 < arr_f.length; ++v1) {
                                    f f0 = arr_f[v1];
                                    w w0 = d.a(f0.b);
                                    arrayList0.add(h.e(f0.f, w0, ((int)f0.c), 8));
                                }
                                o0 = new o(arrayList0);
                                goto label_53;
                            }
                            goto label_55;
                        }
                        catch(Throwable throwable0) {
                            TWR.safeClose$NT(xmlResourceParser0, throwable0);
                            throw throwable0;
                        }
                    label_53:
                        xmlResourceParser0.close();
                        return o0 == null ? null : new a(o0);
                    label_55:
                        xmlResourceParser0.close();
                        return null;
                    }
                    return new a(new o(n.d0(new B[]{h.e(((TypedValue)object0).resourceId, null, 0, 14)})));
                }
            }
        }
        return null;
    }
}

