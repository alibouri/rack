package s9;

import Nb.j;
import com.apollographql.apollo.api.b;
import java.util.List;
import t9.a;

public final class g {
    public final List a;
    public final a b;
    public final boolean c;

    public g(List list0, a a0, boolean z) {
        this.a = list0;
        this.b = a0;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        if(!j.a(this.a, ((g)object0).a)) {
            return false;
        }
        return j.a(this.b, ((g)object0).b) ? this.c == ((g)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b == null ? 0 : this.b.hashCode();
        return this.c ? (v * 0x1F + v1) * 0x1F + 0x4CF : (v * 0x1F + v1) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SupportSheetState(supportChannels=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", supportHoursDisplayInfo=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", supportNumberIsFree=");
        return b.r(stringBuilder0, this.c, ")");
    }
}

