package o1;

import java.util.ArrayList;
import java.util.Arrays;
import p1.h;
import p1.n;

public abstract class i extends d {
    public d[] r0;
    public int s0;

    public i() {
        this.r0 = new d[4];
        this.s0 = 0;
    }

    public final void V(d d0) {
        if(d0 != this && d0 != null) {
            d[] arr_d = this.r0;
            if(this.s0 + 1 > arr_d.length) {
                this.r0 = (d[])Arrays.copyOf(arr_d, arr_d.length * 2);
            }
            int v = this.s0;
            this.r0[v] = d0;
            this.s0 = v + 1;
        }
    }

    public final void W(int v, ArrayList arrayList0, n n0) {
        for(int v2 = 0; v2 < this.s0; ++v2) {
            d d0 = this.r0[v2];
            ArrayList arrayList1 = n0.a;
            if(!arrayList1.contains(d0)) {
                arrayList1.add(d0);
            }
        }
        for(int v1 = 0; v1 < this.s0; ++v1) {
            h.b(this.r0[v1], v, arrayList0, n0);
        }
    }
}

