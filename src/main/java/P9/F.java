package p9;

import Ab.t;
import Fb.c;
import Nb.j;
import Y8.K;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.sendwave.shared.paybill.AddFavoriteActivity;
import com.sendwave.shared.paybill.AddFavoriteResult;
import d9.R0;
import java.util.ArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import q9.j3;
import q9.o0;

public final class f implements P {
    public final int a;
    public final P b;

    public f() {
        this.a = 1;
        super();
        this.b = new Q();
    }

    public f(AddFavoriteActivity addFavoriteActivity0) {
        this.a = 0;
        super();
        addFavoriteActivity0.getClass();
        this.b = new d(addFavoriteActivity0);
    }

    @Override  // V8.d
    public final void C(String s) {
        if(this.a != 0) {
            ((Q)this.b).getClass();
            return;
        }
        ((d)this.b).C(s);
    }

    @Override  // V8.d
    public final R0 D() {
        return this.a == 0 ? ((d)this.b).D() : ((Q)this.b).a.D();
    }

    @Override  // V8.d
    public final void F(String s) {
        if(this.a != 0) {
            j.f(s, "number");
            ((Q)this.b).getClass();
            return;
        }
        j.f(s, "number");
        ((d)this.b).F(s);
    }

    @Override  // p9.P
    public final Object G(g g0) {
        return this.a == 0 ? ((d)this.b).G(g0) : ((Q)this.b).G(g0);
    }

    @Override  // V8.d
    public final void O() {
        if(this.a != 0) {
            ((Q)this.b).getClass();
            return;
        }
        ((d)this.b).O();
    }

    @Override  // V8.d
    public final void V(Class class0, Parcelable parcelable0) {
        if(this.a != 0) {
            j.f(parcelable0, "params");
            ((Q)this.b).V(class0, parcelable0);
            return;
        }
        j.f(parcelable0, "params");
        ((d)this.b).V(class0, parcelable0);
    }

    @Override  // V8.d
    public final Object X(String s, String s1, String s2, String s3, String s4, String s5, int v, Function1 function10, g g0) {
        return this.a != 0 ? ((Q)this.b).a.X(s, s1, s2, s3, s4, s5, v, function10, g0) : ((d)this.b).a.G("", s, s1, s2, s3, s4, s5, v, function10, ((c)g0));
    }

    @Override  // V8.d
    public final void Y(Parcelable parcelable0) {
        if(this.a != 0) {
            j.f(((AddFavoriteResult)parcelable0), "params");
            ((Q)this.b).getClass();
            return;
        }
        j.f(((AddFavoriteResult)parcelable0), "params");
        ((d)this.b).Y(((AddFavoriteResult)parcelable0));
    }

    @Override  // V8.d
    public final Object c0(String s, String s1, K k0) {
        if(this.a != 0) {
            ((Q)this.b).getClass();
            return t.a;
        }
        return j3.j0(((d)this.b), s, s1, k0);
    }

    @Override  // V8.d
    public final void g() {
        if(this.a != 0) {
            ((Q)this.b).getClass();
            return;
        }
        ((d)this.b).g();
    }

    @Override  // V8.d
    public final void g0() {
        if(this.a != 0) {
            ((Q)this.b).getClass();
            return;
        }
        ((d)this.b).g0();
    }

    @Override  // V8.d
    public final Object h0(int v, ViewModel viewModel0, Object object0, c c0) {
        if(this.a != 0) {
            ((Q)this.b).getClass();
            return null;
        }
        return j3.k0(((d)this.b), v, viewModel0, object0, c0);
    }

    @Override  // V8.d
    public final Object i(boolean z) {
        throw null;
    }

    @Override  // V8.d
    public final Object j(String s, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, CharSequence charSequence3, boolean z, Integer integer0, Object object0, Object object1, g g0) {
        if(this.a != 0) {
            ((Q)this.b).getClass();
            return null;
        }
        return ((d)this.b).a.F(s, charSequence0, charSequence1, charSequence2, charSequence3, z, integer0, object0, object1, g0);
    }

    @Override  // V8.d
    public final Object l(Class class0, Parcelable parcelable0, Class class1, g g0) {
        if(this.a != 0) {
            ((Q)this.b).l(class0, parcelable0, class1, g0);
            throw null;
        }
        return o0.d(((d)this.b).a, class0, parcelable0, class1, g0);
    }

    @Override  // V8.d
    public final Object n(Fb.j j0) {
        if(this.a != 0) {
            ((Q)this.b).getClass();
            return t.a;
        }
        return ((d)this.b).n(j0);
    }

    @Override  // V8.d
    public final void o(Uri uri0) {
        if(this.a != 0) {
            j.f(uri0, "uri");
            ((Q)this.b).getClass();
            return;
        }
        j.f(uri0, "uri");
        ((d)this.b).o(uri0);
    }

    @Override  // V8.d
    public final void r() {
        throw null;
    }

    @Override  // V8.d
    public final Object y(String s, String s1, g g0) {
        throw null;
    }

    @Override  // p9.P
    public final Object z(View view0, ArrayList arrayList0, g g0) {
        if(this.a != 0) {
            ((Q)this.b).getClass();
            return null;
        }
        return ((d)this.b).z(view0, arrayList0, g0);
    }
}

