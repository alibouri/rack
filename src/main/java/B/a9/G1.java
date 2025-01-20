package a9;

import com.apollographql.apollo.api.b;

public final class g1 {
    public final boolean a;

    public g1(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g1 ? this.a == ((g1)object0).a : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? 0x4CF : 0x4D5;
    }

    @Override
    public final String toString() {
        return b.r(new StringBuilder("OnReversalDisputeEntry(isFreezingFunds="), this.a, ")");
    }
}

