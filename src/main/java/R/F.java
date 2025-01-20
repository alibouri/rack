package r;

import androidx.biometric.BiometricFragment;

public final class f implements Runnable {
    public final int X;
    public final int Y;
    public final CharSequence Z;
    public final BiometricFragment b0;

    public f(BiometricFragment biometricFragment0, int v, CharSequence charSequence0, int v1) {
        this.X = v1;
        this.b0 = biometricFragment0;
        this.Y = v;
        this.Z = charSequence0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            this.b0.a0(this.Y, this.Z);
            return;
        }
        s s0 = this.b0.Y0;
        if(s0.Z == null) {
            s0.Z = new q();  // initializer: Ljava/lang/Object;-><init>()V
        }
        s0.Z.E(this.Y, this.Z);
    }
}

