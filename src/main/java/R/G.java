package r;

import androidx.biometric.BiometricFragment;

public final class g implements Runnable {
    public final int X;
    public final BiometricFragment Y;

    public g(BiometricFragment biometricFragment0, int v) {
        this.X = v;
        this.Y = biometricFragment0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            this.Y.Y0.s0 = false;
            return;
        }
        s s0 = this.Y.Y0;
        if(s0.Z == null) {
            s0.Z = new q();  // initializer: Ljava/lang/Object;-><init>()V
        }
        s0.Z.getClass();
    }
}

