package Aa;

import Ab.e;
import Ab.k;
import Ab.t;
import Bb.F;
import Bb.p;
import Bb.r;
import Bb.z;
import Fb.j;
import T4.l;
import W5.f;
import a9.C6;
import a9.D6;
import a9.E6;
import ac.B0;
import com.sendwave.backend.fragment.CustomerHistoryNodeFragment;
import com.sendwave.backend.fragment.SavingsFragment;
import com.sendwave.backend.fragment.SavingsWalletFragment;
import com.sendwave.backend.type.LockUnlockState.LOCKED;
import com.sendwave.backend.type.LockUnlockState;
import ha.S2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.r1;

public final class i0 extends j implements Function2 {
    public Object c0;
    public final u0 d0;

    public i0(u0 u00, g g0) {
        this.d0 = u00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((i0)this.t(((SavingsFragment)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new i0(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        z z2;
        String s4;
        String s2;
        f.b0(object0);
        SavingsWalletFragment savingsWalletFragment0 = ((SavingsFragment)this.c0).b.c.b;
        Boolean boolean0 = ((SavingsFragment)this.c0).b.d.a;
        boolean z = boolean0 == null ? false : boolean0.booleanValue();
        LockUnlockState lockUnlockState0 = savingsWalletFragment0.c;
        boolean z1 = Nb.j.a(lockUnlockState0, LOCKED.X);
        Date date0 = savingsWalletFragment0.d;
        X x0 = z1 ? new X(date0) : Y.a;
        u0 u00 = this.d0;
        if(x0 instanceof X && x0.a == null) {
            Function2 function20 = u00.g0;
            String s = savingsWalletFragment0.getId();
            String s1 = "null";
            if(s == null) {
                s = "null";
            }
            k k0 = new k("id", s);
            if(lockUnlockState0 == null) {
                s2 = "null";
            }
            else {
                s2 = lockUnlockState0.a();
                if(s2 == null) {
                    s2 = "null";
                }
            }
            k k1 = new k("state", s2);
            if(date0 != null) {
                String s3 = date0.toString();
                if(s3 != null) {
                    s1 = s3;
                }
            }
            function20.j("Locked vault with no unlock date", F.K(new k[]{k0, k1, new k("whenUnlocks", s1)}));
        }
        if(x0 instanceof X) {
            s4 = r1.d(0x7F120484, new Object[]{(x0.a == null ? "--" : l.H(x0.a, false))});  // string:vault_locked_until_x "Vault locked until %s"
        }
        else if(x0 instanceof Y) {
            s4 = null;
        }
        else {
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        List list0 = savingsWalletFragment0.h;
        if(list0 != null) {
            for(Object object1: list0) {
                u00.c0.j(((E6)object1).a);
            }
        }
        for(B0 b00 = u00.j0; true; b00 = b00) {
            Object object2 = b00.getValue();
            D6 d60 = savingsWalletFragment0.i;
            if(d60 == null) {
                z2 = z.X;
            }
            else {
                ArrayList arrayList0 = new ArrayList(r.b0(d60.a));
                for(Object object3: d60.a) {
                    arrayList0.add(((C6)object3).a.b);
                }
                Iterable iterable0 = p.K0(arrayList0, new g0());  // initializer: Ljava/lang/Object;-><init>()V
                ArrayList arrayList1 = new ArrayList(r.b0(iterable0));
                for(Object object4: iterable0) {
                    Nb.j.f(((CustomerHistoryNodeFragment)object4), "$this$historyEntryId");
                    String s5 = ((CustomerHistoryNodeFragment)object4).getId();
                    String s6 = ((CustomerHistoryNodeFragment)object4).e;
                    if(s6 == null) {
                        s6 = "";
                    }
                    Date date1 = new Date();
                    S2.K1.getClass();
                    arrayList1.add(new a0(s5, s6, ha.u0.a(((CustomerHistoryNodeFragment)object4).c, date1), ((CustomerHistoryNodeFragment)object4).d));
                }
                z2 = arrayList1;
            }
            boolean z3 = z && !Nb.j.a(lockUnlockState0, LOCKED.X);
            if(b00.j(object2, c0.a(((c0)object2), false, false, savingsWalletFragment0.b, x0, z2, null, s4, (savingsWalletFragment0.e == null ? false : savingsWalletFragment0.e.booleanValue()), z3, null, null, null, false, savingsWalletFragment0.f, savingsWalletFragment0.g, 0x1E20))) {
                break;
            }
        }
        return t.a;
    }
}

