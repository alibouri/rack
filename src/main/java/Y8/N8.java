package Y8;

import Nb.j;

public final class n8 {
    public final String a;
    public final m8 b;
    public final l8 c;

    public n8(String s, m8 m80, l8 l80) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = m80;
        this.c = l80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n8)) {
            return false;
        }
        if(!j.a(this.a, ((n8)object0).a)) {
            return false;
        }
        return j.a(this.b, ((n8)object0).b) ? j.a(this.c, ((n8)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        l8 l80 = this.c;
        if(l80 != null) {
            v1 = l80.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "SecurityChallenge(__typename=" + this.a + ", onSecurityQuestionForm=" + this.b + ", onSMSToken=" + this.c + ")";
    }
}

