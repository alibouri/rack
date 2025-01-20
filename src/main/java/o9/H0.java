package o9;

import Ab.t;
import Nb.j;
import V8.d;
import V8.e;
import Y8.K;
import android.net.Uri;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import com.sendwave.shared.PayBillDialogResult;
import d9.R0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

public final class h0 implements d, b0 {
    public final e a;

    public h0() {
        this.a = new e();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // V8.d
    public final void C(String s) {
    }

    @Override  // V8.d
    public final R0 D() {
        return this.a.D();
    }

    @Override  // V8.d
    public final void F(String s) {
        j.f(s, "number");
    }

    @Override  // o9.b0
    public final void I(i1 i10) {
        j.f(i10, "multichoice");
    }

    @Override  // V8.d
    public final void O() {
    }

    @Override  // o9.b0
    public final void T() {
    }

    @Override  // V8.d
    public final void V(Class class0, Parcelable parcelable0) {
        j.f(parcelable0, "params");
        this.a.V(class0, parcelable0);
    }

    @Override  // V8.d
    public final Object X(String s, String s1, String s2, String s3, String s4, String s5, int v, Function1 function10, g g0) {
        return this.a.X(s, s1, s2, s3, s4, s5, v, function10, g0);
    }

    @Override  // V8.d
    public final void Y(Parcelable parcelable0) {
        j.f(((PayBillDialogResult)parcelable0), "params");
    }

    @Override  // V8.d
    public final Object c0(String s, String s1, K k0) {
        return t.a;
    }

    @Override  // o9.b0
    public final Object e0(c c0, g g0) {
        throw new Ab.j();
    }

    @Override  // V8.d
    public final void g() {
    }

    @Override  // V8.d
    public final void g0() {
    }

    @Override  // V8.d
    public final Object h0(int v, ViewModel viewModel0, Object object0, Fb.c c0) {
        return null;
    }

    @Override  // V8.d
    public final Object i(boolean z) {
        throw null;
    }

    @Override  // V8.d
    public final Object j(String s, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, CharSequence charSequence3, boolean z, Integer integer0, Object object0, Object object1, g g0) {
        return null;
    }

    @Override  // V8.d
    public final Object l(Class class0, Parcelable parcelable0, Class class1, g g0) {
        this.a.l(class0, parcelable0, class1, g0);
        throw null;
    }

    @Override  // V8.d
    public final Object n(Fb.j j0) {
        return t.a;
    }

    @Override  // V8.d
    public final void o(Uri uri0) {
        j.f(uri0, "uri");
    }

    @Override  // V8.d
    public final void r() {
        throw null;
    }

    @Override  // V8.d
    public final Object y(String s, String s1, g g0) {
        throw null;
    }
}

