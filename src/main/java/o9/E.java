package o9;

import Nb.j;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import com.wave.customer.nearbyagents.NearbyAgentsActivity;
import i.g;
import java.util.ArrayList;

public final class e implements DialogInterface.OnClickListener {
    public final int X;
    public final Object Y;
    public final Cloneable Z;

    public e(Object object0, Cloneable cloneable0, int v) {
        this.X = v;
        this.Y = object0;
        this.Z = cloneable0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        if(this.X != 0) {
            ((NearbyAgentsActivity)this.Y).I0.a(((Intent)this.Z));
            return;
        }
        ((h)this.Y).h0.clear();
        ((h)this.Y).h0.addAll(((ArrayList)this.Z));
        j.d(dialogInterface0, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        ((h)this.Y).k(((g)dialogInterface0));
        ((h)this.Y).l();
    }
}

