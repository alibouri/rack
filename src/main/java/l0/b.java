package l0;

public final class b {
    public final int a;

    public b(int v) {
        this.a = v;
    }

    public static final boolean a(int v, int v1) [...] // Inlined contents

    public static String b(int v) {
        switch(v) {
            case 1: {
                return "Next";
            }
            case 2: {
                return "Previous";
            }
            case 3: {
                return "Left";
            }
            case 4: {
                return "Right";
            }
            case 5: {
                return "Up";
            }
            case 6: {
                return "Down";
            }
            case 7: {
                return "Enter";
            }
            case 8: {
                return "Exit";
            }
            default: {
                return "Invalid FocusDirection";
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b && this.a == ((b)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return b.b(this.a);
    }
}

