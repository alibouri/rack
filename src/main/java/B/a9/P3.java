package a9;

import Nb.j;
import com.sendwave.backend.type.KycFineGrainTier;
import java.util.List;
import m5.b;

public final class p3 {
    public final KycFineGrainTier a;
    public final List b;
    public final o3 c;

    public p3(KycFineGrainTier kycFineGrainTier0, List list0, o3 o30) {
        this.a = kycFineGrainTier0;
        this.b = list0;
        this.c = o30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p3)) {
            return false;
        }
        if(!j.a(this.a, ((p3)object0).a)) {
            return false;
        }
        return j.a(this.b, ((p3)object0).b) ? j.a(this.c, ((p3)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + b.q(this.b, this.a.hashCode() * 0x1F, 0x1F);
    }

    @Override
    public final String toString() {
        return "KycInfo(kycTier=" + this.a + ", limits=" + this.b + ", idStatus=" + this.c + ")";
    }
}

