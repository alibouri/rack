package a9;

import Nb.j;

public final class k0 {
    public final Integer a;
    public final Integer b;
    public final f0 c;
    public final String d;

    public k0(Integer integer0, Integer integer1, f0 f00, String s) {
        this.a = integer0;
        this.b = integer1;
        this.c = f00;
        this.d = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k0)) {
            return false;
        }
        if(!j.a(this.a, ((k0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((k0)object0).b)) {
            return false;
        }
        return j.a(this.c, ((k0)object0).c) ? j.a(this.d, ((k0)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        f0 f00 = this.c;
        if(f00 != null) {
            v = f00.hashCode();
        }
        return this.d.hashCode() + ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F;
    }

    @Override
    public final String toString() {
        return "OnTextField(minLength=" + this.a + ", maxLength=" + this.b + ", formatter=" + this.c + ", inputType=" + this.d + ")";
    }
}

