package K9;

import N4.o;
import Nb.j;
import ac.d0;
import ac.e0;
import ac.o0;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import f9.G;
import f9.I;
import f9.J;
import f9.f;
import ma.N;
import q9.r1;
import q9.s;

public final class q {
    public final p a;
    public final LifecycleOwner b;
    public final f c;

    public q(p p0, LifecycleOwner lifecycleOwner0) {
        j.f(p0, "recipientPicker");
        j.f(lifecycleOwner0, "lifecycleOwner");
        super();
        this.a = p0;
        this.b = lifecycleOwner0;
        N n0 = new N(4, null, 3);
        d0 d00 = o0.j(p0.h0, p0.i0, p0.j0, n0);
        I i0 = o.t(lifecycleOwner0);
        J j0 = new J(0x7F0D00D0, p0, q9.o0.K(p0.h0), lifecycleOwner0);  // layout:please_enable_contacts_button
        J j1 = new J(0x7F0D00F2, p0, p0.h0, lifecycleOwner0);  // layout:send_to_a_new_number_item
        J j2 = new J(0x7F0D00E8, p0, p0.e0, lifecycleOwner0);  // layout:scan_to_send_button
        e0 e00 = q9.o0.c(p0.i0, p0.h0);
        G g0 = new G(lifecycleOwner0, p0.n0, p0, e00);
        J j3 = new J(0x7F0D006F, r1.d(0x7F12018E, new Object[0]), q9.o0.c(q9.o0.c(q9.o0.K(p0.i0), p0.h0), d00), lifecycleOwner0);  // layout:list_header
        s s0 = q9.o0.K(p0.i0);
        e0 e01 = q9.o0.c(p0.h0, s0);
        G g1 = new G(lifecycleOwner0, p0.j0, p0, e01);
        J j4 = new J(0x7F0D006F, r1.d(0x7F1200FA, new Object[0]), q9.o0.c(q9.o0.K(p0.i0), p0.h0), lifecycleOwner0);  // layout:list_header
        s s1 = q9.o0.K(p0.i0);
        e0 e02 = q9.o0.c(p0.h0, s1);
        this.c = new f(new Adapter[]{i0, j0, j1, j2, g0, j3, g1, j4, new G(lifecycleOwner0, p0.k0, p0, e02)});
    }
}

