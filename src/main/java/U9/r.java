package u9;

import Ab.c;
import Nb.f;
import Nb.j;
import com.skydoves.balloon.OnBalloonInitializedListener;
import com.skydoves.balloon.radius.RadiusLayout;
import kotlin.jvm.functions.Function1;

public final class r implements f, OnBalloonInitializedListener {
    public final Function1 X;

    public r(Function1 function10) {
        j.f(function10, "function");
        super();
        this.X = function10;
    }

    @Override  // Nb.f
    public final c a() {
        return this.X;
    }

    @Override  // com.skydoves.balloon.OnBalloonInitializedListener
    public final void b(RadiusLayout radiusLayout0) {
        this.X.n(radiusLayout0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof OnBalloonInitializedListener && object0 instanceof f) {
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

