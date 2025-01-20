package m2;

import J9.h;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import androidx.biometric.FingerprintDialogFragment;
import androidx.preference.ListPreferenceDialogFragment;
import java.lang.ref.WeakReference;
import r.s;

public final class c implements DialogInterface.OnClickListener {
    public final int X;
    public final Object Y;

    public c(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public c(s s0) {
        this.X = 2;
        super();
        this.Y = new WeakReference(s0);
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        switch(this.X) {
            case 0: {
                ((ListPreferenceDialogFragment)this.Y).g0 = v;
                ((ListPreferenceDialogFragment)this.Y).f0 = -1;
                dialogInterface0.dismiss();
                return;
            }
            case 1: {
                ((h)this.Y).onClick(dialogInterface0, v);
                dialogInterface0.dismiss();
                return;
            }
            case 2: {
                WeakReference weakReference0 = (WeakReference)this.Y;
                if(weakReference0.get() != null) {
                    ((s)weakReference0.get()).t(true);
                }
                return;
            }
            default: {
                ((FingerprintDialogFragment)this.Y).p1.t(true);
            }
        }
    }
}

