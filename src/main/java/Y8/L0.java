package Y8;

import com.apollographql.apollo.api.Query.Data;
import com.apollographql.apollo.api.b;

public final class l0 implements Data {
    public final boolean a;

    public l0(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof l0 ? this.a == ((l0)object0).a : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? 0x4CF : 0x4D5;
    }

    @Override
    public final String toString() {
        return b.r(new StringBuilder("Data(checkPin="), this.a, ")");
    }
}

