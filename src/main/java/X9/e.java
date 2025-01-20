package X9;

import Ab.k;
import Ab.t;
import J2.w;
import M6.b;
import N.b1;
import Nb.j;
import U.p;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import n0.M;
import n0.n;
import u.g;

public final class e implements Mb.e {
    public final long X;
    public final float Y;
    public final long Z;

    public e(float f, long v, long v1) {
        this.X = v;
        this.Y = f;
        this.Z = v1;
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        ((Number)object3).intValue();
        j.f(((g)object0), "$this$AnimatedContent");
        j.f(((k)object1), "$destruct$");
        boolean z = ((Boolean)((k)object1).Y).booleanValue();
        if(((Boolean)((k)object1).X).booleanValue()) {
            ((p)object2).Q(807228907);
            b1.b(null, this.X, this.Y, 0L, 0, ((p)object2), 0x180, 25);
            ((p)object2).p(false);
            return t.a;
        }
        ((p)object2).Q(0x30205B58);
        t0.e e0 = b.W((z ? 0x7F0801D4 : 0x7F0801D6), ((p)object2));  // drawable:ic_audio_pause
        String s = w.S((z ? 0x7F12048F : 0x7F120490), ((p)object2));  // string:voice_announcement_pause_caption "Pause announcement"
        long v = this.Z;
        BlendModeColorFilter blendModeColorFilter0 = Build.VERSION.SDK_INT >= 29 ? n0.p.a.a(v, 5) : new PorterDuffColorFilter(M.G(v), M.J(5));
        b.e(e0, s, null, null, new n(v, 5, blendModeColorFilter0), ((p)object2), 0, 60);
        ((p)object2).p(false);
        return t.a;
    }
}

