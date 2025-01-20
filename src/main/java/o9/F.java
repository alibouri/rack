package o9;

import Nb.j;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import i.g;

public final class f implements DialogInterface.OnShowListener {
    public final h a;

    public f(h h0) {
        this.a = h0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        j.d(dialogInterface0, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        this.a.k(((g)dialogInterface0));
    }
}

