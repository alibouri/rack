package V6;

import android.content.Context;

public final class f implements e {
    public final Context X;

    public f(Context context0, int v) {
        if(v != 1) {
            super();
            this.X = context0;
            return;
        }
        super();
        this.X = context0.getApplicationContext();
    }

    @Override  // V6.g
    public Object e() {
        return this.X;
    }
}

