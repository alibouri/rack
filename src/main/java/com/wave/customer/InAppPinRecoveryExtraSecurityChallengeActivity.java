package com.wave.customer;

import android.os.Bundle;
import com.sendwave.shared.ExtraSecurityChallengeActivity;

public final class InAppPinRecoveryExtraSecurityChallengeActivity extends ExtraSecurityChallengeActivity {
    public InAppPinRecoveryExtraSecurityChallengeActivity() {
        this.H0 = true;
    }

    @Override  // com.sendwave.shared.ExtraSecurityChallengeActivity
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.A0 = false;
    }
}

