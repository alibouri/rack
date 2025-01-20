package U0;

public final class p {
    public final int a;

    public p(int v) {
        this.a = v;
    }

    public static final boolean a(int v, int v1) [...] // Inlined contents

    public static String b(int v) {
        switch(v) {
            case 0: {
                return "Unspecified";
            }
            case 1: {
                return "Text";
            }
            case 2: {
                return "Ascii";
            }
            case 3: {
                return "Number";
            }
            case 4: {
                return "Phone";
            }
            case 5: {
                return "Uri";
            }
            case 6: {
                return "Email";
            }
            case 7: {
                return "Password";
            }
            case 8: {
                return "NumberPassword";
            }
            case 9: {
                return "Decimal";
            }
            default: {
                return "Invalid";
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof p && this.a == ((p)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return p.b(this.a);
    }
}

