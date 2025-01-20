package Y8;

import Nb.j;
import m5.b;

public final class j2 {
    public final String a;

    public j2(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j2 ? j.a(this.a, ((j2)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("AppProps(magicLinkDescriptionAudioUrl="), this.a, ")");
    }
}

