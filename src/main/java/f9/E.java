package f9;

import Nb.j;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import p2.C;

public final class e extends C {
    public final Adapter a;
    public final f b;

    public e(f f0, Adapter recyclerView$Adapter0) {
        j.f(recyclerView$Adapter0, "subAdapter");
        this.b = f0;
        this.a = recyclerView$Adapter0;
    }

    @Override  // p2.C
    public final void b(int v, int v1, Object object0) {
        int v2 = f.q(this.b, this.a, v);
        this.b.e(v2, v1, object0);
    }

    @Override  // p2.C
    public final void c(int v, int v1) {
        int v2 = f.q(this.b, this.a, v);
        this.b.f(v2, v1);
    }

    @Override  // p2.C
    public final void d(int v, int v1) {
        f f0 = this.b;
        int v2 = f.q(f0, this.a, v);
        int v3 = f.q(f0, this.a, v1);
        for(int v4 = 0; true; ++v4) {
            f0.d(v2 + v4, v3 + v4);
            if(v4 == 1) {
                break;
            }
        }
    }

    @Override  // p2.C
    public final void e(int v, int v1) {
        int v2 = f.q(this.b, this.a, v);
        this.b.g(v2, v1);
    }
}

