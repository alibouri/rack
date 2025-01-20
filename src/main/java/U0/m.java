package U0;

public final class m {
    public final int a;

    public m(int v) {
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
                return "Default";
            }
            case 2: {
                return "Go";
            }
            case 3: {
                return "Search";
            }
            case 4: {
                return "Send";
            }
            case 5: {
                return "Previous";
            }
            case 6: {
                return "Next";
            }
            case 7: {
                return "Done";
            }
            default: {
                return "Invalid";
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof m && this.a == ((m)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return m.b(this.a);
    }
}

