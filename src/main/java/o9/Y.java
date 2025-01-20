package o9;

import androidx.lifecycle.ViewModelProvider;
import com.sendwave.shared.ExtraSecurityChallengeActivity;
import kotlin.jvm.functions.Function0;
import q9.r1;

public final class y implements Function0 {
    public final int X;
    public final ExtraSecurityChallengeActivity Y;

    public y(ExtraSecurityChallengeActivity extraSecurityChallengeActivity0, int v) {
        this.X = v;
        this.Y = extraSecurityChallengeActivity0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ExtraSecurityChallengeActivity extraSecurityChallengeActivity0 = this.Y;
        return this.X != 0 ? ((X)new ViewModelProvider(extraSecurityChallengeActivity0, new C(extraSecurityChallengeActivity0)).a(X.class)) : r1.b(extraSecurityChallengeActivity0).a();
    }
}

