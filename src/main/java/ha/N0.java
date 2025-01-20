package ha;

import Ab.c;
import Ab.t;
import B9.b;
import Nb.a;
import Nb.f;
import Xb.I0;
import Xb.J;
import Y8.N;
import a5.w;
import a9.H1;
import a9.k6;
import ac.i;
import androidx.lifecycle.ViewModelKt;
import com.sendwave.backend.type.PartnerOrg;
import kotlin.coroutines.g;
import q9.s1;
import q9.u1;
import q9.x1;
import q9.z1;

public final class n0 implements f, i {
    public final int X;
    public final S2 Y;

    public n0(S2 s20, int v) {
        this.X = v;
        this.Y = s20;
        super();
    }

    @Override  // Nb.f
    public final c a() {
        switch(this.X) {
            case 0: {
                return new a(2, 4, S2.class, this.Y, "restrictScreenshotsObserver", "restrictScreenshotsObserver(Z)V");
            }
            case 1: {
                return new a(2, 4, S2.class, this.Y, "walletObserver", "walletObserver(Lcom/sendwave/backend/fragment/CustomerHomeFragment$Wallet;)V");
            }
            case 2: {
                return new a(2, 4, S2.class, this.Y, "pendingDeviceApprovalRequestObserver", "pendingDeviceApprovalRequestObserver(Lcom/sendwave/backend/fragment/PendingDeviceApprovalFragment$PendingDeviceApproval;)V");
            }
            default: {
                return new a(2, 4, S2.class, this.Y, "deviceApprovalRecentAutofillObserver", "deviceApprovalRecentAutofillObserver(Z)V");
            }
        }
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        Object object1 = t.a;
        S2 s20 = this.Y;
        switch(this.X) {
            case 0: {
                s20.getClass();
                N.k(s20, s20.r0, false, new T1(s20, ((Boolean)object0).booleanValue(), null));
                return object1;
            }
            case 1: {
                b b0 = s20.p0.c();
                if(b0 != null) {
                    Ja.g g1 = w.X(b0);
                    PartnerOrg partnerOrg0 = ((H1)object0).e;
                    s1 s10 = g1.a.d();
                    x1 x10 = Ja.g.b;
                    if(partnerOrg0 == null) {
                        s10.a(x10);
                    }
                    else {
                        s10.b(x10, partnerOrg0.a());
                    }
                    s10.apply();
                    if(((H1)object0).g) {
                        g1.b(((H1)object0).f);
                        g1.a(null);
                    }
                }
                return object1;
            }
            case 2: {
                I0 i00 = s20.X0;
                if(i00 != null) {
                    i00.f(null);
                }
                s20.X0 = J.q(ViewModelKt.a(s20), null, null, new r1(((k6)object0), s20, null), 3);
                return object1;
            }
            default: {
                if(((Boolean)object0).booleanValue()) {
                    z1 z10 = s20.g0;
                    u1 u10 = S2.M1;
                    if(!z10.k(u10)) {
                        Boolean boolean0 = Boolean.TRUE;
                        s20.Z0.getClass();
                        s20.Z0.l(null, boolean0);
                        z10.d().b(u10, boolean0).apply();
                        return object1;
                    }
                }
                else {
                    s20.getClass();
                }
                return object1;
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        switch(this.X) {
            case 0: {
                return !(object0 instanceof i) || !(object0 instanceof f) ? false : this.a().equals(((f)object0).a());
            }
            case 1: {
                return !(object0 instanceof i) || !(object0 instanceof f) ? false : this.a().equals(((f)object0).a());
            }
            case 2: {
                return !(object0 instanceof i) || !(object0 instanceof f) ? false : this.a().equals(((f)object0).a());
            }
            default: {
                return !(object0 instanceof i) || !(object0 instanceof f) ? false : this.a().equals(((f)object0).a());
            }
        }
    }

    @Override
    public final int hashCode() {
        switch(this.X) {
            case 0: {
                return this.a().hashCode();
            }
            case 1: {
                return this.a().hashCode();
            }
            case 2: {
                return this.a().hashCode();
            }
            default: {
                return this.a().hashCode();
            }
        }
    }
}

