package o9;

import Nb.j;
import P4.c;
import a9.k0;
import ac.B0;
import ac.h0;
import ac.h;
import ac.j0;
import androidx.lifecycle.ViewModel;
import com.apollographql.apollo.api.b;
import com.sendwave.backend.fragment.BillFavoriteFragment;
import com.sendwave.backend.fragment.BillFieldsFragment;
import f9.L;
import ha.a0;
import java.util.NoSuchElementException;
import q9.o0;

public final class m extends n {
    public final BillFavoriteFragment e0;
    public final boolean f0;
    public final a0 g0;
    public final L h0;
    public final String i0;
    public final j0 j0;

    public m(ViewModel viewModel0, BillFieldsFragment billFieldsFragment0, k0 k00, h0 h00, BillFavoriteFragment billFavoriteFragment0, boolean z, a0 a00) {
        j.f(viewModel0, "parent");
        j.f(k00, "field");
        j.f(billFavoriteFragment0, "favorite");
        super(viewModel0, 0x7F0D00C7, billFieldsFragment0, k00);  // layout:personal_bill_favorite_text_field
        this.e0 = billFavoriteFragment0;
        this.f0 = z;
        this.g0 = a00;
        this.h0 = c.u(k00);
        for(Object object0: billFavoriteFragment0.c) {
            a9.a0 a01 = (a9.a0)object0;
            if(a01.a.equals(billFieldsFragment0.b)) {
                String s = a01.b;
                this.i0 = s;
                if(s == null) {
                    s = "";
                }
                ((B0)h00).l(null, s);
                this.j0 = o0.a(Boolean.TRUE);
                return;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override  // o9.n
    public final String c() {
        String s = "";
        String s1 = this.i0 == null ? "" : this.i0;
        if(this.f0) {
            s = this.e0.b + "   ";
        }
        return b.p(s, this.h0.b(s1));
    }

    @Override  // o9.n
    public final h d() {
        return this.j0;
    }
}

