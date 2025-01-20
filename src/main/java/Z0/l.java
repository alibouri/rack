package z0;

import android.view.MotionEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import com.google.android.gms.internal.measurement.E1;
import kotlin.jvm.functions.Function1;
import m0.b;
import m0.e;

public abstract class l {
    public static final a a;
    public static final a b;
    public static final StackTraceElement[] c;

    static {
        l.a = new a(1000);
        new a(1007);
        new a(0x3F0);
        l.b = new a(1002);
        l.c = new StackTraceElement[0];
    }

    // Deobfuscation rating: LOW(20)
    public static final boolean a(n n0) {
        return !n0.h && n0.d;
    }

    // Deobfuscation rating: LOW(30)
    public static final boolean b(n n0) {
        return !n0.b() && n0.h && !n0.d;
    }

    // Deobfuscation rating: LOW(20)
    public static final boolean c(n n0) {
        return n0.h && !n0.d;
    }

    public static final boolean d(int v, int v1) [...] // Inlined contents

    public static final boolean e(int v, int v1) [...] // Inlined contents

    public static final boolean f(n n0, long v) {
        float f = b.d(n0.c);
        float f1 = b.e(n0.c);
        return f < 0.0f || f > ((float)(((int)(v >> 0x20)))) || f1 < 0.0f || f1 > ((float)(((int)(v & 0xFFFFFFFFL))));
    }

    public static final boolean g(n n0, long v, long v1) {
        if(n0.i != 1) {
            return l.f(n0, v);
        }
        float f = b.d(n0.c);
        float f1 = b.e(n0.c);
        return f < -e.d(v1) || f > e.d(v1) + ((float)(((int)(v >> 0x20)))) || f1 < -e.b(v1) || f1 > e.b(v1) + ((float)(((int)(v & 0xFFFFFFFFL))));
    }

    public static Modifier h(Modifier modifier0, a a0) {
        return modifier0.d(new PointerHoverIconModifierElement(a0, false));
    }

    // Deobfuscation rating: LOW(20)
    public static final long i(n n0, boolean z) {
        return z || !n0.b() ? b.h(n0.c, n0.g) : 0L;
    }

    public static final void j(f f0, long v, Function1 function10, boolean z) {
        MotionEvent motionEvent0 = f0.b == null ? null : ((MotionEvent)((E1)f0.b.Z).Z);
        if(motionEvent0 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int v1 = motionEvent0.getAction();
        if(z) {
            motionEvent0.setAction(3);
        }
        motionEvent0.offsetLocation(-b.d(v), -b.e(v));
        function10.n(motionEvent0);
        motionEvent0.offsetLocation(b.d(v), b.e(v));
        motionEvent0.setAction(v1);
    }
}

