package u9;

import Ab.c;
import Nb.f;
import Nb.j;
import com.skydoves.balloon.OnBalloonOverlayClickListener;
import kotlin.jvm.functions.Function0;

public final class t implements f, OnBalloonOverlayClickListener {
    public final Function0 X;

    public t(Function0 function00) {
        j.f(function00, "function");
        super();
        this.X = function00;
    }

    @Override  // Nb.f
    public final c a() {
        return this.X;
    }

    @Override  // com.skydoves.balloon.OnBalloonOverlayClickListener
    public final void b() {
        this.X.invoke();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof OnBalloonOverlayClickListener && object0 instanceof f) {
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

