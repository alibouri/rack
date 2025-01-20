package Z9;

import Ab.t;
import Bb.B;
import Bb.F;
import Nb.j;
import androidx.compose.runtime.MutableState;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import q9.l;
import q9.m;
import q9.o0;
import q9.y1;
import r9.a;

public final class c implements Function0 {
    public final int X;
    public final String Y;
    public final boolean Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;

    public c(String s, boolean z, Function1 function10, String s1, Function3 function30) {
        this.X = 1;
        super();
        this.Y = s;
        this.Z = z;
        this.b0 = function10;
        this.c0 = s1;
        this.d0 = function30;
    }

    public c(boolean z, Function1 function10, String s, Function3 function30, String s1) {
        this.X = 0;
        super();
        this.Z = z;
        this.b0 = function10;
        this.Y = s;
        this.d0 = function30;
        this.c0 = s1;
    }

    public c(boolean z, a a0, String s, Function0 function00, MutableState mutableState0) {
        this.X = 2;
        super();
        this.Z = z;
        this.b0 = a0;
        this.Y = s;
        this.c0 = function00;
        this.d0 = mutableState0;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                boolean z = this.Z;
                String s1 = this.Y;
                if(!z) {
                    ((Function1)this.b0).n(s1);
                }
                ((Function3)this.d0).h(s1, ((String)this.c0), Boolean.valueOf(z));
                return t.a;
            }
            case 1: {
                String s2 = this.Y;
                if(s2 != null) {
                    boolean z1 = this.Z;
                    String s3 = (String)this.c0;
                    if(!z1) {
                        ((Function1)this.b0).n(s3);
                    }
                    ((Function3)this.d0).h(s3, s2, Boolean.valueOf(z1));
                }
                return t.a;
            }
            default: {
                ((MutableState)this.d0).setValue(Boolean.TRUE);
                if(this.Z) {
                    String s = this.Y;
                    j.f(s, "announcementId");
                    m m0 = ((a)this.b0).a;
                    y1 y10 = a.b;
                    Set set0 = m0.n(y10);
                    if(set0 == null) {
                        set0 = B.X;
                    }
                    LinkedHashSet linkedHashSet0 = new LinkedHashSet(F.I(set0.size() + 1));
                    linkedHashSet0.addAll(set0);
                    linkedHashSet0.add(s);
                    l l0 = new l(m0);
                    o0.O(l0, y10, linkedHashSet0);
                    l0.apply();
                }
                Function0 function00 = (Function0)this.c0;
                if(function00 != null) {
                    function00.invoke();
                }
                return t.a;
            }
        }
    }
}

