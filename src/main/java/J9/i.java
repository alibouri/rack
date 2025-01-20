package J9;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import hd.c;

public final class i implements DialogInterface.OnClickListener {
    public final int X;

    public i(int v) {
        this.X = v;
        super();
    }

    private final void a(DialogInterface dialogInterface0, int v) {
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        if(this.X != 0) {
            return;
        }
        c.a.n("PlayStoreUpdater");
        c.a.a("user declined update-ready prompt", new Object[0]);
    }
}

