package Y8;

import Nb.j;
import com.apollographql.apollo.api.Executable.Variables;

public final class x6 extends z6 {
    public final O b;
    public final boolean c;
    public final boolean d;
    public final Variables e;

    public x6(O o0, boolean z, boolean z1, Variables executable$Variables0) {
        j.f(o0, "error");
        j.f(executable$Variables0, "variables");
        super(executable$Variables0);
        this.b = o0;
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
        if(!(object0 instanceof x6)) {
            return false;
        }
        if(!j.a(this.b, ((x6)object0).b)) {
            return false;
        }
        if(this.c != ((x6)object0).c) {
            return false;
        }
        return this.d == ((x6)object0).d ? j.a(this.e, ((x6)object0).e) : false;
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
        return "Error(error=" + this.b + ", isFromCache=" + this.c + ", isLast=" + this.d + ", variables=" + this.e + ")";
    }
}

