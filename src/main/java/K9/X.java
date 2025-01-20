package K9;

import Nb.j;
import O0.q;
import Y8.N;
import android.text.style.ClickableSpan;
import android.view.View;
import com.sendwave.backend.type.PartnerOrg;
import com.wave.components.sendmoney.SendMoneyDialogActivity;
import com.wave.components.sendmoney.d;

public final class x extends ClickableSpan {
    public final int X;
    public final Object Y;

    public x(q q0) {
        this.X = 1;
        super();
        this.Y = q0;
    }

    public x(SendMoneyDialogActivity sendMoneyDialogActivity0) {
        this.X = 0;
        this.Y = sendMoneyDialogActivity0;
        super();
    }

    @Override  // android.text.style.ClickableSpan
    public final void onClick(View view0) {
        if(this.X != 0) {
            ((q)this.Y).getClass();
            return;
        }
        j.f(view0, "widget");
        d d0 = ((SendMoneyDialogActivity)this.Y).I();
        d0.c0.d("User tapped new Terms & Conditions from SendMoney screen", null);
        d0.c0.f();
        d d1 = ((SendMoneyDialogActivity)this.Y).I();
        d1.getClass();
        PartnerOrg partnerOrg0 = (PartnerOrg)d1.w0.a(d.F0[4], d1);
        if(partnerOrg0 != null) {
            L l0 = new L(d1, partnerOrg0, null);
            N.k(d1, d1.i0, true, l0);
        }
    }
}

