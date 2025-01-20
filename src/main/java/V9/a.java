package v9;

import G0.e0;
import K6.l;
import U.Z;
import U.d;
import U.l0;
import U.n;
import U.p;
import W5.f;
import android.content.Context;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import c0.b;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.OnBalloonClickListener;
import com.skydoves.balloon.OnBalloonDismissListener;
import com.skydoves.balloon.OnBalloonInitializedListener;
import com.skydoves.balloon.OnBalloonOutsideTouchListener;
import com.skydoves.balloon.OnBalloonOverlayClickListener;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import o9.l1;
import u9.e;
import u9.h;
import u9.j;
import u9.q;
import u9.r;
import u9.s;
import u9.t;

public final class a extends AbstractComposeView implements i {
    public final e0 j0;
    public final LifecycleOwner k0;
    public final Balloon l0;
    public final ParcelableSnapshotMutableState m0;
    public MutableState n0;
    public boolean o0;

    public a(e0 e00, boolean z, j j0, UUID uUID0) {
        Nb.j.f(e00, "anchorView");
        Nb.j.f(j0, "builder");
        Context context0 = e00.getContext();
        Nb.j.e(context0, "getContext(...)");
        super(context0);
        this.j0 = e00;
        LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.a(this.getAnchorView());
        this.k0 = lifecycleOwner0;
        j0.G = lifecycleOwner0;
        if(z) {
            j0.y = this;
        }
        this.l0 = new Balloon(j0.a, j0);
        this.m0 = d.D(k.a, Z.e);
        this.n0 = d.D(null, Z.e);
        ViewTreeLifecycleOwner.b(this, lifecycleOwner0);
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(this.getAnchorView()));
        f.U(this, f.C(this.getAnchorView()));
        this.setTag(0x7F0A00DD, "BalloonComposeView:" + uUID0);  // id:compose_view_saveable_id_tag
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public final void b(int v, p p0) {
        p0.S(-441221009);
        int v1 = (v & 6) == 0 ? (p0.f(this) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !p0.x()) {
            this.getContent().h(this, p0, ((int)(v1 & 14)));
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new Aa.d(v, 15, this);
        }
    }

    @Override  // android.view.ViewGroup
    public CharSequence getAccessibilityClassName() {
        return a.class.getName();
    }

    public View getAnchorView() {
        return this.j0;
    }

    public Balloon getBalloon() {
        return this.l0;
    }

    public View getBalloonArrowView() {
        View view0 = (ImageView)this.getBalloon().Z.b0;
        Nb.j.e(view0, "balloonArrow");
        return view0;
    }

    public final MutableState getBalloonLayoutInfo$balloon_compose_release() {
        return this.n0;
    }

    private final Function3 getContent() {
        return (Function3)this.m0.getValue();
    }

    public ViewGroup getContentView() {
        return (RadiusLayout)this.getBalloon().Z.c0;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.o0;
    }

    public final void j(n n0, b b0) {
        this.setParentCompositionContext(n0);
        this.o0 = true;
        this.setContent(b0);
        if(this.isAttachedToWindow()) {
            this.d();
        }
    }

    public final void setBalloonLayoutInfo$balloon_compose_release(MutableState mutableState0) {
        Nb.j.f(mutableState0, "<set-?>");
        this.n0 = mutableState0;
    }

    private final void setContent(Function3 function30) {
        this.m0.setValue(function30);
    }

    public void setOnBalloonClickListener(OnBalloonClickListener onBalloonClickListener0) {
        this.getBalloon().m(onBalloonClickListener0);
    }

    public void setOnBalloonClickListener(Function1 function10) {
        Nb.j.f(function10, "block");
        Balloon balloon0 = this.getBalloon();
        balloon0.getClass();
        balloon0.m(new u9.p(function10));
    }

    public void setOnBalloonDismissListener(OnBalloonDismissListener onBalloonDismissListener0) {
        Balloon balloon0 = this.getBalloon();
        balloon0.getClass();
        h h0 = new h(balloon0, onBalloonDismissListener0);
        balloon0.c0.setOnDismissListener(h0);
    }

    public void setOnBalloonDismissListener(Function0 function00) {
        Nb.j.f(function00, "block");
        Balloon balloon0 = this.getBalloon();
        balloon0.getClass();
        h h0 = new h(balloon0, new q(function00));
        balloon0.c0.setOnDismissListener(h0);
    }

    public void setOnBalloonInitializedListener(OnBalloonInitializedListener onBalloonInitializedListener0) {
        this.getBalloon().g0 = onBalloonInitializedListener0;
    }

    public void setOnBalloonInitializedListener(Function1 function10) {
        Nb.j.f(function10, "block");
        Balloon balloon0 = this.getBalloon();
        balloon0.getClass();
        balloon0.g0 = new r(function10);
    }

    public void setOnBalloonOutsideTouchListener(OnBalloonOutsideTouchListener onBalloonOutsideTouchListener0) {
        Balloon balloon0 = this.getBalloon();
        balloon0.getClass();
        l l0 = new l(balloon0, onBalloonOutsideTouchListener0);
        balloon0.c0.setTouchInterceptor(l0);
    }

    public void setOnBalloonOutsideTouchListener(Function2 function20) {
        Nb.j.f(function20, "block");
        Balloon balloon0 = this.getBalloon();
        balloon0.getClass();
        l l0 = new l(balloon0, new s(function20));
        balloon0.c0.setTouchInterceptor(l0);
    }

    public void setOnBalloonOverlayClickListener(OnBalloonOverlayClickListener onBalloonOverlayClickListener0) {
        Balloon balloon0 = this.getBalloon();
        ((BalloonAnchorOverlayView)balloon0.b0.Y).setOnClickListener(new l1(onBalloonOverlayClickListener0, 2, balloon0));
    }

    public void setOnBalloonOverlayClickListener(Function0 function00) {
        Nb.j.f(function00, "block");
        Balloon balloon0 = this.getBalloon();
        balloon0.getClass();
        t t0 = new t(function00);
        ((BalloonAnchorOverlayView)balloon0.b0.Y).setOnClickListener(new l1(t0, 2, balloon0));
    }

    public void setOnBalloonOverlayTouchListener(View.OnTouchListener view$OnTouchListener0) {
        Balloon balloon0 = this.getBalloon();
        if(view$OnTouchListener0 != null) {
            balloon0.d0.setTouchInterceptor(view$OnTouchListener0);
            return;
        }
        balloon0.getClass();
    }

    public void setOnBalloonOverlayTouchListener(Function2 function20) {
        Nb.j.f(function20, "block");
        Balloon balloon0 = this.getBalloon();
        balloon0.getClass();
        e e0 = new e(function20);
        balloon0.d0.setTouchInterceptor(e0);
    }

    public void setOnBalloonTouchListener(View.OnTouchListener view$OnTouchListener0) {
        Balloon balloon0 = this.getBalloon();
        if(view$OnTouchListener0 != null) {
            balloon0.c0.setTouchInterceptor(view$OnTouchListener0);
            return;
        }
        balloon0.getClass();
    }
}

