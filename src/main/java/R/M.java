package r;

import androidx.biometric.BiometricFragment;
import java.lang.ref.WeakReference;

public final class m implements Runnable {
    public final int X;
    public final WeakReference Y;

    public m(BiometricFragment biometricFragment0) {
        this.X = 0;
        super();
        this.Y = new WeakReference(biometricFragment0);
    }

    public m(s s0, int v) {
        this.X = v;
        if(v != 2) {
            super();
            this.Y = new WeakReference(s0);
            return;
        }
        super();
        this.Y = new WeakReference(s0);
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                WeakReference weakReference1 = this.Y;
                if(weakReference1.get() != null) {
                    ((BiometricFragment)weakReference1.get()).e0();
                }
                return;
            }
            case 1: {
                WeakReference weakReference2 = this.Y;
                if(weakReference2.get() != null) {
                    ((s)weakReference2.get()).l0 = false;
                }
                return;
            }
            default: {
                WeakReference weakReference0 = this.Y;
                if(weakReference0.get() != null) {
                    ((s)weakReference0.get()).m0 = false;
                }
            }
        }
    }
}

