package U0;

public final class o {
    public final int a;

    public o(int v) {
        this.a = v;
    }

    public static final boolean a(int v, int v1) [...] // Inlined contents

    public static String b(int v) {
        switch(v) {
            case -1: {
                return "Unspecified";
            }
            case 0: {
                return "None";
            }
            case 1: {
                return "Characters";
            }
            case 2: {
                return "Words";
            }
            case 3: {
                return "Sentences";
            }
            default: {
                return "Invalid";
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof o && this.a == ((o)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return o.b(this.a);
    }
}

