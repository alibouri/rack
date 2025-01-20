package u9;

import Ab.c;
import Nb.f;
import Nb.j;
import android.view.MotionEvent;
import android.view.View;
import com.skydoves.balloon.OnBalloonOutsideTouchListener;
import kotlin.jvm.functions.Function2;

public final class s implements f, OnBalloonOutsideTouchListener {
    public final Function2 X;

    public s(Function2 function20) {
        j.f(function20, "function");
        super();
        this.X = function20;
    }

    @Override  // Nb.f
    public final c a() {
        return this.X;
    }

    @Override  // com.skydoves.balloon.OnBalloonOutsideTouchListener
    public final void b(View view0, MotionEvent motionEvent0) {
        this.X.j(view0, motionEvent0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof OnBalloonOutsideTouchListener && object0 instanceof f) {
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

