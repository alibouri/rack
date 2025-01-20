package a9;

import Nb.j;
import com.sendwave.backend.type.KycFineGrainTier;

public final class u8 {
    public final KycFineGrainTier a;

    public u8(KycFineGrainTier kycFineGrainTier0) {
        this.a = kycFineGrainTier0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof u8 ? j.a(this.a, ((u8)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "KycInfo(kycTier=" + this.a + ")";
    }
}

