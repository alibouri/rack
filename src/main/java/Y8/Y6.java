package Y8;

import Nb.j;
import com.apollographql.apollo.api.Executable.Data;
import com.apollographql.apollo.api.Executable.Variables;

public final class y6 extends z6 {
    public final Data b;
    public final boolean c;
    public final boolean d;
    public final Variables e;

    public y6(Data executable$Data0, boolean z, boolean z1, Variables executable$Variables0) {
        j.f(executable$Data0, "data");
        j.f(executable$Variables0, "variables");
        super(executable$Variables0);
        this.b = executable$Data0;
        this.c = z;
        this.d = z1;
        this.e = executable$Variables0;
    }

    @Override  // Y8.z6
    public final boolean c() {
        return this.c;
    }

    @Override  // Y8.z6
    public final boolean d() {
        return this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y6)) {
            return false;
        }
        if(!j.a(this.b, ((y6)object0).b)) {
            return false;
        }
        if(this.c != ((y6)object0).c) {
            return false;
        }
        return this.d == ((y6)object0).d ? j.a(this.e, ((y6)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode();
        int v1 = 0x4D5;
        int v2 = this.c ? 0x4CF : 0x4D5;
        if(this.d) {
            v1 = 0x4CF;
        }
        return this.e.hashCode() + ((v * 0x1F + v2) * 0x1F + v1) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Success(data=" + this.b + ", isFromCache=" + this.c + ", isLast=" + this.d + ", variables=" + this.e + ")";
    }
}

