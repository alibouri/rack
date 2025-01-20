package u6;

import android.view.View;

public final class c extends b {
    public final e a;

    public c(e e0) {
        this.a = e0;
    }

    @Override  // u6.b
    public final void a(View view0) {
    }

    @Override  // u6.b
    public final void b(View view0, int v) {
        if(v == 5) {
            this.a.cancel();
        }
    }
}

