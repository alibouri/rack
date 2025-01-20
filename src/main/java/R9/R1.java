package R9;

import Na.f;
import Nb.j;
import a9.i5;
import com.sendwave.backend.fragment.PayableWalletFragment;
import q9.n;

public final class r1 implements s1 {
    public final PayableWalletFragment a;
    public final v1 b;

    public r1(PayableWalletFragment payableWalletFragment0, v1 v10) {
        this.a = payableWalletFragment0;
        this.b = v10;
    }

    @Override  // R9.s1
    public final void a() {
        this.b.invoke();
    }

    @Override  // R9.s1
    public final f b(n n0) {
        j.f(n0, "assetLoader");
        return n0.g(0x7F0802C4, n0.c(this.a));  // drawable:logo_blank
    }

    @Override  // R9.s1
    public final boolean c() {
        String s = this.d();
        return s == null || Vb.j.c0(s) ? 0 : 1;
    }

    @Override  // R9.s1
    public final String d() {
        i5 i50 = this.a.m;
        return i50 == null ? null : i50.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r1)) {
            return false;
        }
        return this.a.equals(((r1)object0).a) ? this.b.equals(((r1)object0).b) : false;
    }

    @Override  // R9.s1
    public final String getName() {
        return this.a.b;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 0x1F + 0x4D5) * 0x1F;
    }

    @Override
    public final String toString() {
        return "PayableWallet(fragment=" + this.a + ", isRecent=false, onClickDelegate=" + this.b + ")";
    }
}

