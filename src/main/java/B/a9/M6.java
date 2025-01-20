package a9;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.PayBillDialogFragment;
import com.sendwave.backend.fragment.PayMerchantFragment;
import com.sendwave.backend.fragment.SendMoneySelectFragment;

public final class m6 {
    public final String a;
    public final String b;
    public final SendMoneySelectFragment c;
    public final PayMerchantFragment d;
    public final PayBillDialogFragment e;

    public m6(String s, String s1, SendMoneySelectFragment sendMoneySelectFragment0, PayMerchantFragment payMerchantFragment0, PayBillDialogFragment payBillDialogFragment0) {
        this.a = s;
        this.b = s1;
        this.c = sendMoneySelectFragment0;
        this.d = payMerchantFragment0;
        this.e = payBillDialogFragment0;
    }

    public final PayBillDialogFragment a() {
        return this.e;
    }

    public final SendMoneySelectFragment b() {
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m6)) {
            return false;
        }
        if(!j.a(this.a, ((m6)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((m6)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((m6)object0).c)) {
            return false;
        }
        return j.a(this.d, ((m6)object0).d) ? j.a(this.e, ((m6)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Wallet(__typename=" + this.a + ", country=" + this.b + ", sendMoneySelectFragment=" + this.c + ", payMerchantFragment=" + this.d + ", payBillDialogFragment=" + this.e + ")";
    }
}

