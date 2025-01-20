package o9;

import Nb.j;
import a9.d0;
import a9.h0;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.DialogInterface;
import i.g;
import java.util.ArrayList;

public final class d implements DialogInterface.OnMultiChoiceClickListener {
    public final h a;

    public d(h h0) {
        this.a = h0;
    }

    @Override  // android.content.DialogInterface$OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface0, int v, boolean z) {
        j.d(dialogInterface0, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        h h0 = this.a;
        String s = ((d0)((h0)h0.b0).a.get(v)).a;
        ArrayList arrayList0 = h0.h0;
        if(arrayList0.contains(s)) {
            arrayList0.remove(s);
        }
        else {
            arrayList0.add(s);
        }
        arrayList0.removeAll(h0.g(s));
        h0.l();
        h0.k(((g)dialogInterface0));
    }
}

