package e1;

import Ab.e;
import G0.N0;
import Nb.j;
import R2.f;
import a5.w;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import c.p;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import v.h;

public final class s extends p {
    public Function0 b0;
    public q c0;
    public final View d0;
    public final e1.p e0;
    public final int f0;

    public s(Function0 function00, q q0, View view0, LayoutDirection layoutDirection0, Density density0, UUID uUID0) {
        Context context0 = view0.getContext();
        if(Build.VERSION.SDK_INT < 0x1F) {
            q0.getClass();
        }
        super(new ContextThemeWrapper(context0, 0x7F130102), 0);  // style:DialogWindowTheme
        this.b0 = function00;
        this.c0 = q0;
        this.d0 = view0;
        Window window0 = this.getWindow();
        if(window0 == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f0 = window0.getAttributes().softInputMode & 0xF0;
        window0.requestFeature(1);
        window0.setBackgroundDrawableResource(0x106000D);
        this.c0.getClass();
        f.z(window0, true);
        e1.p p0 = new e1.p(this.getContext(), window0);
        p0.setTag(0x7F0A00DD, "Dialog:" + uUID0);  // id:compose_view_saveable_id_tag
        p0.setClipChildren(false);
        p0.setElevation(density0.w(8.0f));
        p0.setOutlineProvider(new N0(2));
        this.e0 = p0;
        View view1 = window0.getDecorView();
        ViewGroup viewGroup0 = view1 instanceof ViewGroup ? ((ViewGroup)view1) : null;
        if(viewGroup0 != null) {
            s.g(viewGroup0);
        }
        this.setContentView(p0);
        ViewTreeLifecycleOwner.b(p0, ViewTreeLifecycleOwner.a(view0));
        ViewTreeViewModelStoreOwner.b(p0, ViewTreeViewModelStoreOwner.a(view0));
        W5.f.U(p0, W5.f.C(view0));
        this.h(this.b0, this.c0, layoutDirection0);
        b b0 = new b(this, 1);
        w.l(this.Z, this, b0, 2);
    }

    @Override  // android.app.Dialog
    public final void cancel() {
    }

    public static final void g(ViewGroup viewGroup0) {
        viewGroup0.setClipChildren(false);
        if(viewGroup0 instanceof e1.p) {
            return;
        }
        int v1 = viewGroup0.getChildCount();
        for(int v = 0; v < v1; ++v) {
            View view0 = viewGroup0.getChildAt(v);
            ViewGroup viewGroup1 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
            if(viewGroup1 != null) {
                s.g(viewGroup1);
            }
        }
    }

    public final void h(Function0 function00, q q0, LayoutDirection layoutDirection0) {
        this.b0 = function00;
        this.c0 = q0;
        q0.getClass();
        boolean z = k.c(this.d0);
        int v = 1;
        switch(h.d(1)) {
            case 0: {
                break;
            }
            case 1: {
                z = true;
                break;
            }
            case 2: {
                z = false;
                break;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
        Window window0 = this.getWindow();
        j.c(window0);
        window0.setFlags((z ? 0x2000 : 0xFFFFDFFF), 0x2000);
        int v1 = layoutDirection0.ordinal();
        if(v1 == 0) {
            v = 0;
        }
        else if(v1 != 1) {
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        e1.p p0 = this.e0;
        p0.setLayoutDirection(v);
        boolean z1 = q0.c;
        if(z1 && !p0.l0) {
            Window window1 = this.getWindow();
            if(window1 != null) {
                window1.setLayout(-2, -2);
            }
        }
        p0.l0 = z1;
        if(Build.VERSION.SDK_INT < 0x1F) {
            Window window2 = this.getWindow();
            if(window2 != null) {
                window2.setSoftInputMode(this.f0);
            }
        }
    }

    @Override  // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z = super.onTouchEvent(motionEvent0);
        if(z && this.c0.b) {
            this.b0.invoke();
        }
        return z;
    }
}

