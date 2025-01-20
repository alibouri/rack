package m7;

import m5.b;

public final class i {
    public final r a;
    public final int b;
    public final int c;

    public i(int v, int v1, Class class0) {
        this(r.a(class0), v, v1);
    }

    public i(r r0, int v, int v1) {
        Q4.i.o(r0, "Null dependency anInterface.");
        this.a = r0;
        this.b = v;
        this.c = v1;
    }

    public static i a(Class class0) {
        return new i(0, 1, class0);
    }

    public static i b(Class class0) {
        return new i(1, 0, class0);
    }

    public static i c(r r0) {
        return new i(r0, 1, 0);
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof i && this.a.equals(((i)object0).a) && this.b == ((i)object0).b && this.c == ((i)object0).c;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("Dependency{anInterface=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", type=");
        int v = this.b;
        if(v == 1) {
            s = "required";
        }
        else {
            s = v == 0 ? "optional" : "set";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", injection=");
        int v1 = this.c;
        switch(v1) {
            case 0: {
                return b.y(stringBuilder0, "direct", "}");
            }
            case 1: {
                return b.y(stringBuilder0, "provider", "}");
            }
            default: {
                if(v1 != 2) {
                    throw new AssertionError("Unsupported injection: " + v1);
                }
                return b.y(stringBuilder0, "deferred", "}");
            }
        }
    }
}

