package l0;

import Ab.e;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class p extends Enum {
    public static final enum p X;
    public static final enum p Y;
    public static final enum p Z;
    public static final p[] b0;

    static {
        p.X = new p("Active", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p.Y = new p("ActiveParent", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p p0 = new p("Captured", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p.Z = new p("Inactive", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p.b0 = new p[]{p.X, p.Y, p0, p.Z};
    }

    public final boolean a() {
        switch(this.ordinal()) {
            case 0: 
            case 2: {
                return true;
            }
            case 1: 
            case 3: {
                return false;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static p valueOf(String s) {
        return (p)Enum.valueOf(p.class, s);
    }

    public static p[] values() {
        return (p[])p.b0.clone();
    }
}

