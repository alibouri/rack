package W8;

import Ab.k;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.view.View;
import q9.V0;

public final class b implements DialogInterface.OnClickListener {
    public final int X;
    public final Object Y;
    public final Object Z;

    public b(e e0, View view0) {
        this.X = 0;
        super();
        this.Z = e0;
        this.Y = view0;
    }

    public b(V0 v00, u6.e e0) {
        this.X = 1;
        super();
        this.Y = v00;
        this.Z = e0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        if(this.X != 0) {
            ((V0)this.Y).i(new k(((u6.e)this.Z), v));
            ((u6.e)this.Z).dismiss();
            return;
        }
        ((e)this.Z).onContinue(((View)this.Y));
    }
}

