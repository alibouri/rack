package h0;

import android.view.ViewStructure;

public final class b {
    public static final b a;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final int a(ViewStructure viewStructure0, int v) {
        return viewStructure0.addChildCount(v);
    }

    public final ViewStructure b(ViewStructure viewStructure0, int v) {
        return viewStructure0.newChild(v);
    }

    public final void c(ViewStructure viewStructure0, int v, int v1, int v2, int v3, int v4, int v5) {
        viewStructure0.setDimens(v, v1, v2, v3, v4, v5);
    }

    public final void d(ViewStructure viewStructure0, int v, String s, String s1, String s2) {
        viewStructure0.setId(v, s, s1, s2);
    }
}

