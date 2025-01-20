package c2;

import android.app.Dialog;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

public final class m implements DialogInterface.OnDismissListener {
    public final DialogFragment X;

    public m(DialogFragment dialogFragment0) {
        this.X = dialogFragment0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        DialogFragment dialogFragment0 = this.X;
        Dialog dialog0 = dialogFragment0.i1;
        if(dialog0 != null) {
            dialogFragment0.onDismiss(dialog0);
        }
    }
}

