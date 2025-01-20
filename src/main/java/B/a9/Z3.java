package a9;

import Nb.j;

public final class z3 {
    public final Integer a;
    public final Integer b;
    public final y3 c;
    public final String d;

    public z3(Integer integer0, Integer integer1, y3 y30, String s) {
        this.a = integer0;
        this.b = integer1;
        this.c = y30;
        this.d = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof z3)) {
            return false;
        }
        if(!j.a(this.a, ((z3)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((z3)object0).b)) {
            return false;
        }
        return j.a(this.c, ((z3)object0).c) ? j.a(this.d, ((z3)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        y3 y30 = this.c;
        if(y30 != null) {
            v = y30.hashCode();
        }
        return this.d.hashCode() + ((v1 * 0x1F + v2) * 0x1F + v) * 0x1F;
    }

    @Override
    public final String toString() {
        return "OnLinkedAccountTextField(minLength=" + this.a + ", maxLength=" + this.b + ", formatter=" + this.c + ", inputType=" + this.d + ")";
    }
}

