package X9;

import Aa.s;
import Ab.t;
import B.y;
import Bb.q;
import C.c;
import C3.i;
import Mb.e;
import U.p;
import a.a;
import androidx.compose.ui.Modifier;
import com.sendwave.backend.fragment.AnnouncementFragment;
import f9.b;
import g0.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

public final class h implements e {
    public final j X;
    public final i Y;
    public final y Z;

    public h(j j0, i i0, y y0) {
        this.X = j0;
        this.Y = i0;
        this.Z = y0;
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        float f;
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        Nb.j.f(((c)object0), "$this$items");
        int v2 = (v1 & 6) == 0 ? (((p)object2).f(((c)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((p)object2).d(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && ((p)object2).x()) {
            ((p)object2).K();
            return t.a;
        }
        j j0 = this.X;
        boolean z = v == q.y(j0.a);
        if(v == 0 && z) {
            f = 16.0f;
        }
        else if(v == 0) {
            f = 32.0f;
        }
        else if(!z) {
            f = 48.0f;
        }
        else {
            f = 32.0f;
        }
        AnnouncementFragment announcementFragment0 = (AnnouncementFragment)j0.a.get(v);
        b b0 = j0.b;
        Integer integer0 = (int)b0.c;
        String s = b0.e;
        Integer integer1 = null;
        if(!Nb.j.a(s, announcementFragment0.getId())) {
            integer0 = null;
        }
        int v3 = integer0 == null ? 0 : ((int)integer0);
        boolean z1 = b0.a && Nb.j.a(s, announcementFragment0.getId());
        boolean z2 = b0.b && Nb.j.a(s, announcementFragment0.getId());
        Integer integer2 = (int)b0.d;
        if(Nb.j.a(s, announcementFragment0.getId())) {
            integer1 = integer2;
        }
        int v4 = integer1 == null ? 0 : ((int)integer1);
        i i0 = this.Y;
        s s1 = (s)i0.c0;
        s s2 = (s)i0.Z;
        Function3 function30 = i0.c();
        float f1 = this.Z.b();
        Modifier modifier0 = A3.e.n(((c)object0), androidx.compose.foundation.layout.c.n(l.X, f1 - f));
        ((p)object2).Q(1764997690);
        boolean z3 = ((p)object2).h(i0);
        boolean z4 = ((p)object2).f(announcementFragment0);
        Object object4 = ((p)object2).G();
        if((z3 | z4) != 0 || object4 == U.l.a) {
            object4 = new Ca.j(i0, 9, announcementFragment0);
            ((p)object2).a0(object4);
        }
        ((p)object2).p(false);
        a.b(announcementFragment0, z1, z2, v3, v4, s1, ((Function0)object4), function30, s2, modifier0, ((p)object2), 0);
        return t.a;
    }
}

