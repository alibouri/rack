package a9;

import Nb.j;
import m5.b;

public final class n2 {
    public final String a;

    public n2(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n2 ? j.a(this.a, ((n2)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("OnDocumentTextField(inputType="), this.a, ")");
    }
}

