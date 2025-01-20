package W9;

import A3.e;
import Nb.j;
import kotlin.jvm.functions.Function0;

public final class d {
    public final Function0 a;
    public final String b;
    public final Integer c;

    public d(String s, Function0 function00) {
        j.f(function00, "onButtonClicked");
        j.f(s, "text");
        super();
        this.a = function00;
        this.b = s;
        this.c = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(!j.a(this.a, ((d)object0).a)) {
            return false;
        }
        return j.a(this.b, ((d)object0).b) ? j.a(this.c, ((d)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        return this.c == null ? v : v + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "BottomSheetButtonSpec(onButtonClicked=" + this.a + ", text=" + this.b + ", iconRes=" + this.c + ")";
    }
}

