package a5;

import Nb.j;
import java.util.Arrays;
import java.util.EnumSet;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class u extends Enum {
    public final long X;
    public static final EnumSet Y;
    public static final u[] Z;

    static {
        u.Z = new u[]{new u(0, 0L, "None"), new u(1, 1L, "Enabled"), new u(2, 2L, "RequireConfirm")};
        EnumSet enumSet0 = EnumSet.allOf(u.class);
        if(enumSet0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("allOf(SmartLoginOption::class.java) must not be null");
            String s = j.class.getName();
            StackTraceElement[] arr_stackTraceElement = nullPointerException0.getStackTrace();
            int v = -1;
            for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
                if(s.equals(arr_stackTraceElement[v1].getClassName())) {
                    v = v1;
                }
            }
            nullPointerException0.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement, v + 1, arr_stackTraceElement.length)));
            throw nullPointerException0;
        }
        u.Y = enumSet0;
    }

    public u(int v, long v1, String s) {
        super(s, v);
        this.X = v1;
    }

    public static u valueOf(String s) {
        j.f(s, "value");
        return (u)Enum.valueOf(u.class, s);
    }

    public static u[] values() {
        return (u[])Arrays.copyOf(u.Z, 3);
    }
}

