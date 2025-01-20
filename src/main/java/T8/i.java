package T8;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;

public final class i implements DialogInterface.OnCancelListener {
    public final j X;

    public i(j j0) {
        this.X = j0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.X.a.finish();
    }
}

