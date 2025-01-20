package b4;

import java.util.ArrayList;

public final class n {
    public ArrayList a;
    public int b;

    public n() {
        this.a = null;
        this.b = 0;
    }

    public final void a() {
        this.b += 1000;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: this.a) {
            stringBuilder0.append(((o)object0));
            stringBuilder0.append(' ');
        }
        stringBuilder0.append('[');
        return Y8.o.z(stringBuilder0, this.b, ']');
    }
}

