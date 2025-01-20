package K;

import U0.i;
import U0.j;

public final class u implements i {
    public final i[] a;

    public u(i[] arr_i) {
        this.a = arr_i;
    }

    @Override  // U0.i
    public final void a(j j0) {
        i[] arr_i = this.a;
        for(int v = 0; v < arr_i.length; ++v) {
            arr_i[v].a(j0);
        }
    }
}

