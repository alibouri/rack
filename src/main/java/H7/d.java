package h7;

import android.content.Context;
import v7.g;
import x7.a;

public final class d implements a {
    public final int a;
    public final Context b;
    public final String c;

    public d(int v, Context context0, String s) {
        this.a = v;
        this.b = context0;
        this.c = s;
        super();
    }

    @Override  // x7.a
    public final Object get() {
        return this.a != 0 ? new g(this.b, this.c) : this.b.getSharedPreferences(this.c, 0);
    }
}

