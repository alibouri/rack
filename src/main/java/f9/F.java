package f9;

import Ab.k;
import Ab.t;
import Bb.p;
import Nb.j;
import android.view.ViewGroup;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import java.util.ArrayList;
import java.util.HashMap;
import s.o;

public final class f extends Adapter {
    public final Adapter[] d;
    public final HashMap e;
    public final o f;
    public long g;

    public f(Adapter[] arr_recyclerView$Adapter) {
        this.d = arr_recyclerView$Adapter;
        this.e = new HashMap();
        ArrayList arrayList0 = new ArrayList(arr_recyclerView$Adapter.length);
        boolean z = false;
        for(int v = 0; v < arr_recyclerView$Adapter.length; ++v) {
            Adapter recyclerView$Adapter0 = arr_recyclerView$Adapter[v];
            recyclerView$Adapter0.o(new e(this, recyclerView$Adapter0));
            arrayList0.add(t.a);
        }
        Adapter[] arr_recyclerView$Adapter1 = this.d;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= arr_recyclerView$Adapter1.length) {
                z = true;
                break;
            }
            if(!arr_recyclerView$Adapter1[v1].b) {
                break;
            }
        }
        this.p(z);
        this.f = new o(null);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int a() {
        Adapter[] arr_recyclerView$Adapter = this.d;
        ArrayList arrayList0 = new ArrayList(arr_recyclerView$Adapter.length);
        for(int v = 0; v < arr_recyclerView$Adapter.length; ++v) {
            arrayList0.add(arr_recyclerView$Adapter[v].a());
        }
        return p.L0(arrayList0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final long b(int v) {
        k k0 = this.r(v);
        int v1 = ((Number)k0.Y).intValue();
        long v2 = ((Adapter)k0.X).b(v1);
        o o0 = this.f;
        Long long0 = (Long)o0.e(v2);
        if(long0 == null) {
            long v3 = this.g;
            this.g = 1L + v3;
            long0 = v3;
            o0.j(v2, long0);
        }
        return (long)long0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final int c(int v) {
        k k0 = this.r(v);
        int v1 = ((Number)k0.Y).intValue();
        int v2 = ((Adapter)k0.X).c(v1);
        this.e.put(v2, ((Adapter)k0.X));
        return v2;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void i(I i0, int v) {
        k k0 = this.r(v);
        int v1 = ((Number)k0.Y).intValue();
        ((Adapter)k0.X).i(i0, v1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final I j(ViewGroup viewGroup0, int v) {
        j.f(viewGroup0, "parent");
        Adapter recyclerView$Adapter0 = (Adapter)this.e.get(v);
        j.c(recyclerView$Adapter0);
        return recyclerView$Adapter0.j(viewGroup0, v);
    }

    public static final int q(f f0, Adapter recyclerView$Adapter0, int v) {
        Adapter[] arr_recyclerView$Adapter = f0.d;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_recyclerView$Adapter.length; ++v1) {
            Adapter recyclerView$Adapter1 = arr_recyclerView$Adapter[v1];
            if(j.a(recyclerView$Adapter1, recyclerView$Adapter0)) {
                return v2 + v;
            }
            v2 += recyclerView$Adapter1.a();
        }
        throw new IndexOutOfBoundsException(recyclerView$Adapter0.toString());
    }

    public final k r(int v) {
        Adapter[] arr_recyclerView$Adapter = this.d;
        for(int v1 = 0; v1 < arr_recyclerView$Adapter.length; ++v1) {
            Adapter recyclerView$Adapter0 = arr_recyclerView$Adapter[v1];
            if(v < recyclerView$Adapter0.a()) {
                return new k(recyclerView$Adapter0, v);
            }
            v -= recyclerView$Adapter0.a();
        }
        throw new ArrayIndexOutOfBoundsException(v);
    }
}

