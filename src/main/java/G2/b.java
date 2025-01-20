package g2;

import U7.c;
import androidx.lifecycle.Observer;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

public final class b implements Observer {
    public final c X;
    public boolean Y;

    public b(I5.c c0, c c1) {
        this.Y = false;
        this.X = c1;
    }

    @Override  // androidx.lifecycle.Observer
    public final void b(Object object0) {
        this.Y = true;
        this.X.getClass();
        Void void0 = (Void)object0;
        SignInHubActivity signInHubActivity0 = (SignInHubActivity)this.X.Y;
        signInHubActivity0.setResult(signInHubActivity0.B0, signInHubActivity0.C0);
        signInHubActivity0.finish();
    }

    @Override
    public final String toString() {
        return this.X.toString();
    }
}

