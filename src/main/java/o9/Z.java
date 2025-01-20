package o9;

import android.content.Intent;
import c2.N;
import c2.a;
import com.sendwave.shared.ExtraSecurityChallengeActivity;
import com.sendwave.shared.IncorrectAnswerCallSupportFragment;
import com.sendwave.shared.VerifyAuthCodeActivity;
import com.sendwave.shared.VerifyAuthCodeParams;
import com.wave.customer.CustomerApp;
import q9.j3;
import q9.r1;

public final class z extends j3 implements x {
    public final ExtraSecurityChallengeActivity b;

    public z(ExtraSecurityChallengeActivity extraSecurityChallengeActivity0) {
        this.b = extraSecurityChallengeActivity0;
        super(extraSecurityChallengeActivity0);
    }

    @Override  // o9.x
    public final void P() {
        this.b.getClass();
        Intent intent0 = new Intent(r1.b(this.b), ((CustomerApp)r1.b(this.b)).w0);
        intent0.addFlags(0x4000000);
        intent0.addFlags(0x10000000);
        r1.b(this.b).startActivity(intent0);
    }

    @Override  // o9.x
    public final void i0(VerifyAuthCodeParams verifyAuthCodeParams0) {
        Intent intent0 = new Intent(this.b, VerifyAuthCodeActivity.class);
        intent0.putExtra("com.wave.typeSafeExtras", verifyAuthCodeParams0);
        this.b.I0.a(intent0);
    }

    @Override  // o9.x
    public final void u() {
        N n0 = this.b.w();
        n0.getClass();
        a a0 = new a(n0);
        a0.h(0x7F0A015B, new IncorrectAnswerCallSupportFragment(), null, 1);  // id:fragment_container
        a0.e();
    }
}

