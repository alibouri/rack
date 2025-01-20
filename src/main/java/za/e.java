package za;

import androidx.lifecycle.ViewModelProvider;
import com.wave.customer.risk.ussdsecuritychallenge.UssdSecurityChallengeActivity;
import kotlin.jvm.functions.Function0;
import q9.r1;

public final class e implements Function0 {
    public final int X;
    public final UssdSecurityChallengeActivity Y;

    public e(UssdSecurityChallengeActivity ussdSecurityChallengeActivity0, int v) {
        this.X = v;
        this.Y = ussdSecurityChallengeActivity0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UssdSecurityChallengeActivity ussdSecurityChallengeActivity0 = this.Y;
        switch(this.X) {
            case 0: {
                return r1.b(ussdSecurityChallengeActivity0).a();
            }
            case 1: {
                return r1.b(ussdSecurityChallengeActivity0).d();
            }
            default: {
                return (z)new ViewModelProvider(ussdSecurityChallengeActivity0, new i(ussdSecurityChallengeActivity0)).a(z.class);
            }
        }
    }
}

