package c2;

import android.app.Dialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

public final class l implements DialogInterface.OnCancelListener {
    public final DialogFragment X;

    public l(DialogFragment dialogFragment0) {
        this.X = dialogFragment0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        DialogFragment dialogFragment0 = this.X;
        Dialog dialog0 = dialogFragment0.i1;
        if(dialog0 != null) {
            dialogFragment0.onCancel(dialog0);
        }
    }
}

