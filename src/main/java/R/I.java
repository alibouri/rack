package r;

import android.app.KeyguardManager;
import android.content.Intent;

public abstract class i {
    public static Intent a(KeyguardManager keyguardManager0, CharSequence charSequence0, CharSequence charSequence1) {
        return keyguardManager0.createConfirmDeviceCredentialIntent(charSequence0, charSequence1);
    }
}

