package N4;

import Nb.j;
import java.util.Arrays;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class p extends Enum {
    public static final enum p X;
    public static final enum p Y;
    public static final enum p Z;
    public static final enum p b0;
    public static final p[] c0;

    static {
        p.X = new p("EXPLICIT", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p.Y = new p("TIMER", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p p0 = new p("SESSION_CHANGE", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p p1 = new p("PERSISTED_EVENTS", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p.Z = new p("EVENT_THRESHOLD", 4);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p.b0 = new p("EAGER_FLUSHING_EVENT", 5);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        p.c0 = new p[]{p.X, p.Y, p0, p1, p.Z, p.b0};
    }

    public static p valueOf(String s) {
        j.f(s, "value");
        return (p)Enum.valueOf(p.class, s);
    }

    public static p[] values() {
        return (p[])Arrays.copyOf(p.c0, 6);
    }
}

