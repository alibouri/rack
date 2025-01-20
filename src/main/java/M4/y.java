package M4;

import Nb.j;
import java.util.Arrays;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class y extends Enum {
    public static final enum y X;
    public static final enum y Y;
    public static final enum y Z;
    public static final enum y b0;
    public static final enum y c0;
    public static final enum y d0;
    public static final y[] e0;

    static {
        y.X = new y("REQUESTS", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        y.Y = new y("INCLUDE_ACCESS_TOKENS", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        y.Z = new y("INCLUDE_RAW_RESPONSES", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        y y0 = new y("CACHE", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        y.b0 = new y("APP_EVENTS", 4);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        y.c0 = new y("DEVELOPER_ERRORS", 5);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        y.d0 = new y("GRAPH_API_DEBUG_WARNING", 6);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        y.e0 = new y[]{y.X, y.Y, y.Z, y0, y.b0, y.c0, y.d0, new y("GRAPH_API_DEBUG_INFO", 7)};  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
    }

    public static y valueOf(String s) {
        j.f(s, "value");
        return (y)Enum.valueOf(y.class, s);
    }

    public static y[] values() {
        return (y[])Arrays.copyOf(y.e0, 8);
    }
}

