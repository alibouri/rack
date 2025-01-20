package L;

import Nb.j;
import O0.f;

public final class k {
    public final f a;
    public f b;
    public boolean c;
    public d d;

    public k(f f0, f f1) {
        this.a = f0;
        this.b = f1;
        this.c = false;
        this.d = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k)) {
            return false;
        }
        if(!j.a(this.a, ((k)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((k)object0).b)) {
            return false;
        }
        return this.c == ((k)object0).c ? j.a(this.d, ((k)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = this.c ? 0x4CF : 0x4D5;
        return this.d == null ? ((v1 + v * 0x1F) * 0x1F + v2) * 0x1F : ((v1 + v * 0x1F) * 0x1F + v2) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "TextSubstitutionValue(original=" + this.a + ", substitution=" + this.b + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
    }
}

