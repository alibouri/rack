package X9;

import Ab.t;
import U.p;
import a.a;
import androidx.compose.ui.Modifier;
import com.sendwave.backend.fragment.AnnouncementFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class d implements Function2 {
    public final AnnouncementFragment X;
    public final boolean Y;
    public final boolean Z;
    public final int b0;
    public final int c0;
    public final Function1 d0;
    public final Function0 e0;
    public final Function3 f0;
    public final Function1 g0;
    public final Modifier h0;
    public final int i0;

    public d(AnnouncementFragment announcementFragment0, boolean z, boolean z1, int v, int v1, Function1 function10, Function0 function00, Function3 function30, Function1 function11, Modifier modifier0, int v2) {
        this.X = announcementFragment0;
        this.Y = z;
        this.Z = z1;
        this.b0 = v;
        this.c0 = v1;
        this.d0 = function10;
        this.e0 = function00;
        this.f0 = function30;
        this.g0 = function11;
        this.h0 = modifier0;
        this.i0 = v2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        a.b(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, ((p)object0), U.d.O(this.i0 | 1));
        return t.a;
    }
}

