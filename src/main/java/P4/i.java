package P4;

import A3.e;
import M.J;
import Nb.j;

public final class i {
    public final String a;
    public final String b;
    public final String c;

    public i(String s, String s1, String s2) {
        j.f(s1, "cloudBridgeURL");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        if(!j.a(this.a, ((i)object0).a)) {
            return false;
        }
        return j.a(this.b, ((i)object0).b) ? j.a(this.c, ((i)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CloudBridgeCredentials(datasetID=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", cloudBridgeURL=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", accessKey=");
        return J.g(stringBuilder0, this.c, ')');
    }
}

