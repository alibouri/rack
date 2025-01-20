package R9;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.V;
import android.content.Intent;
import android.net.Uri;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import mb.a;

public final class t0 extends j implements Function2 {
    public Object c0;

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((t0)this.t(((Uri)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new t0(2, g0);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        Uri uri0 = (Uri)this.c0;
        String s = uri0.getQueryParameter("body");
        String s1 = "";
        if(s == null) {
            s = "";
        }
        String s2 = uri0.getQueryParameter("title");
        if(s2 != null) {
            s1 = s2;
        }
        if(Vb.j.c0(s)) {
            s0 s00 = new s0(2, null);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
            a.a(V.c, null, s00, 2);
        }
        Intent intent0 = new Intent();
        intent0.setAction("android.intent.action.SEND");
        intent0.putExtra("android.intent.extra.TEXT", s);
        intent0.setType("text/plain");
        Object object1 = Intent.createChooser(intent0, s1);
        Nb.j.e(object1, "createChooser(...)");
        return object1;
    }
}

