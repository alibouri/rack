package za;

import Nb.j;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.wave.customer.risk.ussdsecuritychallenge.UssdSecurityChallengeActivity;
import q9.C1;
import q9.j3;

public final class f extends j3 implements d {
    public final UssdSecurityChallengeActivity b;

    public f(UssdSecurityChallengeActivity ussdSecurityChallengeActivity0) {
        this.b = ussdSecurityChallengeActivity0;
        super(ussdSecurityChallengeActivity0);
    }

    @Override  // za.d
    public final void Q(String s) {
        j.f(s, "ussdCode");
        Object object0 = this.b.getSystemService("clipboard");
        j.d(object0, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager)object0).setPrimaryClip(ClipData.newPlainText("USSD code", s));
        Toast.makeText(this.b, 0x7F120478, 1).show();  // string:ussd_security_challenge_code_copied "USSD code copied"
    }

    @Override  // za.d
    public final void q(String s) {
        j.f(s, "ussdCode");
        UssdSecurityChallengeActivity ussdSecurityChallengeActivity0 = this.b;
        ussdSecurityChallengeActivity0.getClass();
        C1.Z = true;
        Intent intent0 = new Intent("android.intent.action.DIAL", Uri.parse(("tel:" + Uri.encode(s))));
        try {
            ussdSecurityChallengeActivity0.startActivity(intent0);
        }
        catch(ActivityNotFoundException unused_ex) {
            Toast.makeText(ussdSecurityChallengeActivity0, 0x7F12017A, 0).show();  // string:error_no_dialer_installed "You can’t make calls with this device."
        }
    }
}

