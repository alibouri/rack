package za;

import Ab.k;
import Bb.F;
import Nb.j;
import Y8.N;
import android.telephony.TelephonyManager.UssdResponseCallback;
import android.telephony.TelephonyManager;
import com.wave.customer.risk.ussdsecuritychallenge.UssdSecurityChallengeActivity;
import q9.r1;

public final class g extends TelephonyManager.UssdResponseCallback {
    public final UssdSecurityChallengeActivity a;

    public g(UssdSecurityChallengeActivity ussdSecurityChallengeActivity0) {
        this.a = ussdSecurityChallengeActivity0;
        super();
    }

    @Override  // android.telephony.TelephonyManager$UssdResponseCallback
    public final void onReceiveUssdResponse(TelephonyManager telephonyManager0, String s, CharSequence charSequence0) {
        j.f(telephonyManager0, "telephonyManager");
        j.f(s, "request");
        j.f(charSequence0, "response");
        this.a.getClass();
        r1.b(this.a).e().d("ussd security challenge: call ussd code succeeded", F.J(new k("response", charSequence0.toString())));
        this.a.J0.l("automatic ussd call was successfull, response = " + charSequence0, new Object[0]);
        z z0 = this.a.I();
        z0.getClass();
        x x0 = new x(z0, null);
        N.k(z0, z0.d0, false, x0);
    }

    @Override  // android.telephony.TelephonyManager$UssdResponseCallback
    public final void onReceiveUssdResponseFailed(TelephonyManager telephonyManager0, String s, int v) {
        this.a.getClass();
        r1.b(this.a).e().d("ussd security challenge: call ussd code failed", F.J(new k("failureCode", v)));
        this.a.J0.l("automatic ussd call was not successfull, failure code = " + v, new Object[0]);
        z z0 = this.a.I();
        z0.getClass();
        w w0 = new w(z0, null);
        N.k(z0, z0.d0, false, w0);
    }
}

