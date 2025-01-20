package b4;

import java.util.HashMap;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class h extends Enum {
    public static final enum h X;
    public static final enum h Y;
    public static final enum h Z;
    public static final enum h b0;
    public static final HashMap c0;
    public static final h[] d0;

    static {
        h h0 = new h("target", 0);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h1 = new h("root", 1);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h.X = new h("nth_child", 2);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h2 = new h("nth_last_child", 3);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h.Y = new h("nth_of_type", 4);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h.Z = new h("nth_last_of_type", 5);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h3 = new h("first_child", 6);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h4 = new h("last_child", 7);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h5 = new h("first_of_type", 8);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h6 = new h("last_of_type", 9);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h7 = new h("only_child", 10);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h8 = new h("only_of_type", 11);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h9 = new h("empty", 12);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h10 = new h("not", 13);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h11 = new h("lang", 14);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h12 = new h("link", 15);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h13 = new h("visited", 16);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h14 = new h("hover", 17);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h15 = new h("active", 18);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h16 = new h("focus", 19);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h17 = new h("enabled", 20);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h18 = new h("disabled", 21);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h19 = new h("checked", 22);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h h20 = new h("indeterminate", 23);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h.b0 = new h("UNSUPPORTED", 24);  // initializer: Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V
        h.d0 = new h[]{h0, h1, h.X, h2, h.Y, h.Z, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12, h13, h14, h15, h16, h17, h18, h19, h20, h.b0};
        h.c0 = new HashMap();
        h[] arr_h = (h[])h.d0.clone();
        for(int v = 0; v < arr_h.length; ++v) {
            h h21 = arr_h[v];
            if(h21 != h.b0) {
                h.c0.put(h21.name().replace('_', '-'), h21);
            }
        }
    }

    public static h valueOf(String s) {
        return (h)Enum.valueOf(h.class, s);
    }

    public static h[] values() [...] // Inlined contents
}

