package Y8;

import Nb.j;

public final class s7 {
    public final boolean a;
    public final t7 b;

    public s7(boolean z, t7 t70) {
        this.a = z;
        this.b = t70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof s7)) {
            return false;
        }
        return this.a == ((s7)object0).a ? j.a(this.b, ((s7)object0).b) : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? this.b.hashCode() + 0x9511 : this.b.hashCode() + 0x95CB;
    }

    @Override
    public final String toString() {
        return "SaveDocumentInfo(succeeded=" + this.a + ", user=" + this.b + ")";
    }
}

