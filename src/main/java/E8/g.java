package e8;

import java.lang.reflect.Field;
import java.util.Locale;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public abstract class g extends Enum {
    public static final enum e8.g.a X;
    public static final g[] Y;

    static {
        e8.g.a a0 = new g() {
            @Override  // e8.g
            public final String b(Field field0) {
                return field0.getName();
            }
        };
        g.X = a0;
        g.Y = new g[]{a0, new g() {
            @Override  // e8.g
            public final String b(Field field0) {
                return g.c(field0.getName());
            }
        }, new g() {
            @Override  // e8.g
            public final String b(Field field0) {
                return g.c(g.a(field0.getName(), " "));
            }
        }, new g() {
            @Override  // e8.g
            public final String b(Field field0) {
                return g.a(field0.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        }, new g() {
            @Override  // e8.g
            public final String b(Field field0) {
                return g.a(field0.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        }, new g() {
            @Override  // e8.g
            public final String b(Field field0) {
                return g.a(field0.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String s, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(Character.isUpperCase(((char)v2)) && stringBuilder0.length() != 0) {
                stringBuilder0.append(s1);
            }
            stringBuilder0.append(((char)v2));
        }
        return stringBuilder0.toString();
    }

    public abstract String b(Field arg1);

    public static String c(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = 0;
        int v1 = s.charAt(0);
        int v2 = s.length();
        while(v < v2 - 1 && !Character.isLetter(((char)v1))) {
            stringBuilder0.append(((char)v1));
            ++v;
            v1 = s.charAt(v);
        }
        if(!Character.isUpperCase(((char)v1))) {
            int v3 = Character.toUpperCase(((char)v1));
            stringBuilder0.append((v + 1 >= s.length() ? String.valueOf(((char)v3)) : ((char)v3) + s.substring(v + 1)));
            return stringBuilder0.toString();
        }
        return s;
    }

    public static g valueOf(String s) {
        return (g)Enum.valueOf(g.class, s);
    }

    public static g[] values() {
        return (g[])g.Y.clone();
    }
}

