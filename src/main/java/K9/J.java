package K9;

import com.sendwave.androidApi.Contact;

public final class j {
    public final Contact a;
    public final Integer b;
    public final boolean c;
    public final boolean d;

    static {
    }

    public j(Contact contact0, Integer integer0, boolean z, boolean z1, int v) {
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        Nb.j.f(contact0, "recipient");
        super();
        this.a = contact0;
        this.b = integer0;
        this.c = z;
        this.d = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        if(!Nb.j.a(this.a, ((j)object0).a)) {
            return false;
        }
        if(!Nb.j.a(this.b, ((j)object0).b)) {
            return false;
        }
        return this.c == ((j)object0).c ? this.d == ((j)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b == null ? 0 : this.b.hashCode();
        int v2 = 0x4D5;
        int v3 = this.c ? 0x4CF : 0x4D5;
        if(this.d) {
            v2 = 0x4CF;
        }
        return ((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v2;
    }

    @Override
    public final String toString() {
        return "RecipientItemModel(recipient=" + this.a + ", iconId=" + this.b + ", disabled=" + this.c + ", hasWaveAccount=" + this.d + ")";
    }
}

