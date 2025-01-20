package c2;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

public final class n extends z {
    public final q X;
    public final DialogFragment Y;

    public n(DialogFragment dialogFragment0, q q0) {
        this.Y = dialogFragment0;
        this.X = q0;
    }

    @Override  // c2.z
    public final View k(int v) {
        q q0 = this.X;
        if(q0.l()) {
            return q0.k(v);
        }
        Dialog dialog0 = this.Y.i1;
        return dialog0 == null ? null : dialog0.findViewById(v);
    }

    // Deobfuscation rating: LOW(20)
    @Override  // c2.z
    public final boolean l() {
        return this.X.l() || this.Y.m1;
    }
}

