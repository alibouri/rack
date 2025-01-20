package z3;

import E3.d;
import java.util.HashSet;
import r3.a;
import r3.j;
import r3.k;
import t3.c;

public final class g implements b {
    public final int a;
    public final boolean b;

    public g(String s, boolean z, int v) {
        this.a = v;
        this.b = z;
    }

    @Override  // z3.b
    public final c a(j j0, a a0, A3.b b0) {
        if(!((HashSet)j0.g0.X).contains(k.X)) {
            d.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new t3.k(this);
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("MergePaths{mode=");
        switch(this.a) {
            case 1: {
                s = "MERGE";
                break;
            }
            case 2: {
                s = "ADD";
                break;
            }
            case 3: {
                s = "SUBTRACT";
                break;
            }
            case 4: {
                s = "INTERSECT";
                break;
            }
            case 5: {
                s = "EXCLUDE_INTERSECTIONS";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

