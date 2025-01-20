package u9;

import Ab.c;
import Nb.f;
import Nb.j;
import android.view.View;
import com.skydoves.balloon.OnBalloonClickListener;
import kotlin.jvm.functions.Function1;

public final class p implements f, OnBalloonClickListener {
    public final Function1 X;

    public p(Function1 function10) {
        j.f(function10, "function");
        super();
        this.X = function10;
    }

    @Override  // Nb.f
    public final c a() {
        return this.X;
    }

    @Override  // com.skydoves.balloon.OnBalloonClickListener
    public final void b(View view0) {
        this.X.n(view0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof OnBalloonClickListener && object0 instanceof f) {
            c c0 = ((f)object0).a();
            return j.a(this.X, c0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }
}

