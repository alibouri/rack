package e1;

import Ab.e;
import G0.N0;
import Nb.j;
import U.C;
import U.Z;
import U.d;
import U.l0;
import U.p;
import U0.D;
import W5.f;
import a1.h;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.media.session.a;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import e0.s;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m0.b;

public final class u extends AbstractComposeView {
    public boolean A0;
    public final int[] B0;
    public Function0 j0;
    public x k0;
    public String l0;
    public final View m0;
    public final w n0;
    public final WindowManager o0;
    public final WindowManager.LayoutParams p0;
    public PopupPositionProvider q0;
    public LayoutDirection r0;
    public final ParcelableSnapshotMutableState s0;
    public final ParcelableSnapshotMutableState t0;
    public h u0;
    public final C v0;
    public final Rect w0;
    public final s x0;
    public Object y0;
    public final ParcelableSnapshotMutableState z0;

    public u(Function0 function00, x x0, String s, View view0, Density density0, PopupPositionProvider popupPositionProvider0, UUID uUID0) {
        w w0 = Build.VERSION.SDK_INT >= 29 ? new v() : new w();  // initializer: Ljava/lang/Object;-><init>()V / initializer: Ljava/lang/Object;-><init>()V
        super(view0.getContext());
        this.j0 = function00;
        this.k0 = x0;
        this.l0 = s;
        this.m0 = view0;
        this.n0 = w0;
        Object object0 = view0.getContext().getSystemService("window");
        j.d(object0, "null cannot be cast to non-null type android.view.WindowManager");
        this.o0 = (WindowManager)object0;
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
        windowManager$LayoutParams0.gravity = 0x800033;
        x x1 = this.k0;
        boolean z = k.c(view0);
        boolean z1 = x1.b;
        int v = x1.a;
        if(z1 && z) {
            v |= 0x2000;
        }
        else if(z1 && !z) {
            v &= 0xFFFFDFFF;
        }
        windowManager$LayoutParams0.flags = v;
        windowManager$LayoutParams0.type = 1002;
        windowManager$LayoutParams0.token = view0.getApplicationWindowToken();
        windowManager$LayoutParams0.width = -2;
        windowManager$LayoutParams0.height = -2;
        windowManager$LayoutParams0.format = -3;
        windowManager$LayoutParams0.setTitle("Pop-Up Window");
        this.p0 = windowManager$LayoutParams0;
        this.q0 = popupPositionProvider0;
        this.r0 = LayoutDirection.X;
        this.s0 = d.D(null, Z.e);
        this.t0 = d.D(null, Z.e);
        this.v0 = d.w(new D(6, this));
        this.w0 = new Rect();
        this.x0 = new s(new e1.j(this, 2));
        this.setId(0x1020002);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(view0));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(view0));
        f.U(this, f.C(view0));
        this.setTag(0x7F0A00DD, "Popup:" + uUID0);  // id:compose_view_saveable_id_tag
        this.setClipChildren(false);
        this.setElevation(density0.w(8.0f));
        this.setOutlineProvider(new N0(3));
        this.z0 = d.D(o.a, Z.e);
        this.B0 = new int[2];
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void b(int v, p p0) {
        p0.S(-857613600);
        if((((v & 6) == 0 ? (p0.h(this) ? 4 : 2) | v : v) & 3) != 2 || !p0.x()) {
            this.getContent().j(p0, 0);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new B.o(v, 8, this);
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        if(keyEvent0.getKeyCode() == 4 || !this.k0.c || this.getKeyDispatcherState() == null) {
            return super.dispatchKeyEvent(keyEvent0);
        }
        if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyEvent$DispatcherState0 = this.getKeyDispatcherState();
            if(keyEvent$DispatcherState0 != null) {
                keyEvent$DispatcherState0.startTracking(keyEvent0, this);
            }
            return true;
        }
        if(keyEvent0.getAction() == 1) {
            KeyEvent.DispatcherState keyEvent$DispatcherState1 = this.getKeyDispatcherState();
            if(keyEvent$DispatcherState1 != null && keyEvent$DispatcherState1.isTracking(keyEvent0) && !keyEvent0.isCanceled()) {
                Function0 function00 = this.j0;
                if(function00 != null) {
                    function00.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void g(boolean z, int v, int v1, int v2, int v3) {
        super.g(z, v, v1, v2, v3);
        this.k0.getClass();
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            return;
        }
        this.p0.width = view0.getMeasuredWidth();
        this.p0.height = view0.getMeasuredHeight();
        this.n0.getClass();
        this.o0.updateViewLayout(this, this.p0);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean)this.v0.getValue()).booleanValue();
    }

    private final Function2 getContent() {
        return (Function2)this.z0.getValue();
    }

    private final int getDisplayHeight() {
        float f = this.getContext().getResources().getDisplayMetrics().density;
        return Math.round(((float)this.getContext().getResources().getConfiguration().screenHeightDp) * f);
    }

    private final int getDisplayWidth() {
        float f = this.getContext().getResources().getDisplayMetrics().density;
        return Math.round(((float)this.getContext().getResources().getConfiguration().screenWidthDp) * f);
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.p0;
    }

    public static void getParams$ui_release$annotations() {
    }

    private final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates)this.t0.getValue();
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.r0;
    }

    public final IntSize getPopupContentSize-bOM6tXw() {
        return (IntSize)this.s0.getValue();
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.q0;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A0;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.l0;
    }

    public View getViewRoot() {
        return null;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void h(int v, int v1) {
        this.k0.getClass();
        super.h(View.MeasureSpec.makeMeasureSpec(this.getDisplayWidth(), 0x80000000), View.MeasureSpec.makeMeasureSpec(this.getDisplayHeight(), 0x80000000));
    }

    public final void k(CompositionContext compositionContext0, Function2 function20) {
        this.setParentCompositionContext(compositionContext0);
        this.setContent(function20);
        this.A0 = true;
    }

    public final void l(Function0 function00, x x0, String s, LayoutDirection layoutDirection0) {
        this.j0 = function00;
        this.l0 = s;
        if(!j.a(this.k0, x0)) {
            x0.getClass();
            WindowManager.LayoutParams windowManager$LayoutParams0 = this.p0;
            this.k0 = x0;
            boolean z = k.c(this.m0);
            boolean z1 = x0.b;
            int v = x0.a;
            if(z1 && z) {
                v |= 0x2000;
            }
            else if(z1 && !z) {
                v &= 0xFFFFDFFF;
            }
            windowManager$LayoutParams0.flags = v;
            this.n0.getClass();
            this.o0.updateViewLayout(this, windowManager$LayoutParams0);
        }
        int v1 = 1;
        int v2 = layoutDirection0.ordinal();
        if(v2 == 0) {
            v1 = 0;
        }
        else if(v2 != 1) {
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        super.setLayoutDirection(v1);
    }

    public final void m() {
        LayoutCoordinates layoutCoordinates0 = this.getParentLayoutCoordinates();
        if(layoutCoordinates0 != null) {
            if(!layoutCoordinates0.r()) {
                layoutCoordinates0 = null;
            }
            if(layoutCoordinates0 != null) {
                long v = layoutCoordinates0.C();
                long v1 = layoutCoordinates0.f(0L);
                long v2 = a.i(Math.round(b.d(v1)), Math.round(b.e(v1)));
                h h0 = new h(((int)(v2 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)), ((int)(v >> 0x20)) + ((int)(v2 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v2 & 0xFFFFFFFFL)));
                if(!h0.equals(this.u0)) {
                    this.u0 = h0;
                    this.o();
                }
            }
        }
    }

    public final void n(LayoutCoordinates layoutCoordinates0) {
        this.setParentLayoutCoordinates(layoutCoordinates0);
        this.m();
    }

    public final void o() {
        h h0 = this.u0;
        if(h0 == null) {
            return;
        }
        IntSize intSize0 = this.getPopupContentSize-bOM6tXw();
        if(intSize0 != null) {
            w w0 = this.n0;
            w0.getClass();
            this.m0.getWindowVisibleDisplayFrame(this.w0);
            long v = io.sentry.config.a.d(this.w0.right - this.w0.left, this.w0.bottom - this.w0.top);
            Nb.v v1 = new Nb.v();  // initializer: Ljava/lang/Object;-><init>()V
            v1.X = 0L;
            t t0 = new t(v1, this, h0, v, intSize0.a);
            this.x0.c(this, c.e0, t0);
            WindowManager.LayoutParams windowManager$LayoutParams0 = this.p0;
            windowManager$LayoutParams0.x = (int)(v1.X >> 0x20);
            windowManager$LayoutParams0.y = (int)(v1.X & 0xFFFFFFFFL);
            if(this.k0.e) {
                w0.a(this, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
            }
            this.o0.updateViewLayout(this, windowManager$LayoutParams0);
        }
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x0.d();
        if(this.k0.c && Build.VERSION.SDK_INT >= 33) {
            if(this.y0 == null) {
                this.y0 = l.a(this.j0);
            }
            l.b(this, this.y0);
        }
    }

    @Override  // android.view.ViewGroup
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s s0 = this.x0;
        E7.w w0 = s0.g;
        if(w0 != null) {
            w0.f();
        }
        s0.b();
        if(Build.VERSION.SDK_INT >= 33) {
            l.c(this, this.y0);
        }
        this.y0 = null;
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(!this.k0.d) {
            return super.onTouchEvent(motionEvent0);
        }
        if(motionEvent0 != null && motionEvent0.getAction() == 0 && (motionEvent0.getX() >= 0.0f || motionEvent0.getX() < ((float)this.getWidth()) || motionEvent0.getY() >= 0.0f || motionEvent0.getY() < ((float)this.getHeight()))) {
            Function0 function00 = this.j0;
            if(function00 != null) {
                function00.invoke();
            }
            return true;
        }
        if(motionEvent0 != null && motionEvent0.getAction() == 4) {
            Function0 function01 = this.j0;
            if(function01 != null) {
                function01.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent0);
    }

    private final void setContent(Function2 function20) {
        this.z0.setValue(function20);
    }

    @Override  // android.view.View
    public void setLayoutDirection(int v) {
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates0) {
        this.t0.setValue(layoutCoordinates0);
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection0) {
        this.r0 = layoutDirection0;
    }

    public final void setPopupContentSize-fhxjrPA(IntSize intSize0) {
        this.s0.setValue(intSize0);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider0) {
        this.q0 = popupPositionProvider0;
    }

    public final void setTestTag(String s) {
        this.l0 = s;
    }
}

