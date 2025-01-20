package M0;

public final class g {
    public final int a;

    public g(int v) {
        this.a = v;
    }

    public static final boolean a(int v, int v1) [...] // Inlined contents

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof g && this.a == ((g)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        switch(this.a) {
            case 0: {
                return "Button";
            }
            case 1: {
                return "Checkbox";
            }
            case 2: {
                return "Switch";
            }
            case 3: {
                return "RadioButton";
            }
            case 4: {
                return "Tab";
            }
            case 5: {
                return "Image";
            }
            case 6: {
                return "DropdownList";
            }
            default: {
                return "Unknown";
            }
        }
    }
}

