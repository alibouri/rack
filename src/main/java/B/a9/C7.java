package a9;

import Nb.j;
import com.sendwave.backend.type.ScratchCardBackground;
import com.sendwave.backend.type.ScratchCardIcon;
import java.util.Date;

public final class c7 {
    public final String a;
    public final Date b;
    public final M6 c;
    public final String d;
    public final ScratchCardIcon e;
    public final ScratchCardBackground f;
    public final a7 g;

    public c7(String s, Date date0, M6 m60, String s1, ScratchCardIcon scratchCardIcon0, ScratchCardBackground scratchCardBackground0, a7 a70) {
        this.a = s;
        this.b = date0;
        this.c = m60;
        this.d = s1;
        this.e = scratchCardIcon0;
        this.f = scratchCardBackground0;
        this.g = a70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c7)) {
            return false;
        }
        if(!j.a(this.a, ((c7)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((c7)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((c7)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((c7)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((c7)object0).e)) {
            return false;
        }
        return j.a(this.f, ((c7)object0).f) ? j.a(this.g, ((c7)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        a7 a70 = this.g;
        if(a70 != null) {
            v1 = a70.hashCode();
        }
        return (((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "UnlockedCard(id=" + this.a + ", whenExpires=" + this.b + ", award=" + this.c + ", unlockedDescription=" + this.d + ", icon=" + this.e + ", background=" + this.f + ", scratchCardTerms=" + this.g + ")";
    }
}

