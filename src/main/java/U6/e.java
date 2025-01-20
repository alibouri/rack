package u6;

import B6.a;
import J1.E;
import J1.N;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i.D;
import i.s;
import java.util.ArrayList;

public final class e extends D {
    public BottomSheetBehavior d0;
    public FrameLayout e0;
    public CoordinatorLayout f0;
    public FrameLayout g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public d k0;
    public final boolean l0;
    public final c m0;
    public static final int n0;

    public e(Context context0, int v) {
        if(v == 0) {
            TypedValue typedValue0 = new TypedValue();
            v = context0.getTheme().resolveAttribute(0x7F04007A, typedValue0, true) ? typedValue0.resourceId : 0x7F130205;  // attr:bottomSheetDialogTheme
        }
        super(context0, v);
        this.h0 = true;
        this.i0 = true;
        this.m0 = new c(this);
        this.g().h(1);
        this.l0 = this.getContext().getTheme().obtainStyledAttributes(new int[]{0x7F040176}).getBoolean(0, false);  // attr:enableEdgeToEdge
    }

    @Override  // android.app.Dialog
    public final void cancel() {
        if(this.d0 == null) {
            this.j();
        }
        super.cancel();
    }

    public final void j() {
        if(this.e0 == null) {
            FrameLayout frameLayout0 = (FrameLayout)View.inflate(this.getContext(), 0x7F0D0040, null);  // layout:design_bottom_sheet_dialog
            this.e0 = frameLayout0;
            this.f0 = (CoordinatorLayout)frameLayout0.findViewById(0x7F0A00FA);  // id:coordinator
            FrameLayout frameLayout1 = (FrameLayout)this.e0.findViewById(0x7F0A010F);  // id:design_bottom_sheet
            this.g0 = frameLayout1;
            BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x(frameLayout1);
            this.d0 = bottomSheetBehavior0;
            c c0 = this.m0;
            ArrayList arrayList0 = bottomSheetBehavior0.P;
            if(!arrayList0.contains(c0)) {
                arrayList0.add(c0);
            }
            this.d0.z(this.h0);
        }
    }

    public final FrameLayout k(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.j();
        CoordinatorLayout coordinatorLayout0 = (CoordinatorLayout)this.e0.findViewById(0x7F0A00FA);  // id:coordinator
        if(v != 0 && view0 == null) {
            view0 = this.getLayoutInflater().inflate(v, coordinatorLayout0, false);
        }
        if(this.l0) {
            E.k(this.g0, new s(this));
        }
        this.g0.removeAllViews();
        if(viewGroup$LayoutParams0 == null) {
            this.g0.addView(view0);
        }
        else {
            this.g0.addView(view0, viewGroup$LayoutParams0);
        }
        coordinatorLayout0.findViewById(0x7F0A030C).setOnClickListener(new K6.e(12, this));  // id:touch_outside
        N.k(this.g0, new a(3, this));
        this.g0.setOnTouchListener(new I6.a(1));
        return this.e0;
    }

    @Override  // android.app.Dialog
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window0 = this.getWindow();
        if(window0 != null) {
            int v = !this.l0 || Color.alpha(window0.getNavigationBarColor()) >= 0xFF ? 0 : 1;
            FrameLayout frameLayout0 = this.e0;
            if(frameLayout0 != null) {
                frameLayout0.setFitsSystemWindows(((boolean)(v ^ 1)));
            }
            CoordinatorLayout coordinatorLayout0 = this.f0;
            if(coordinatorLayout0 != null) {
                coordinatorLayout0.setFitsSystemWindows(((boolean)(v ^ 1)));
            }
            if(v != 0) {
                window0.getDecorView().setSystemUiVisibility(0x300);
            }
        }
    }

    @Override  // i.D
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Window window0 = this.getWindow();
        if(window0 != null) {
            window0.setStatusBarColor(0);
            window0.addFlags(0x80000000);
            window0.setLayout(-1, -1);
        }
    }

    @Override  // c.p
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior0 = this.d0;
        if(bottomSheetBehavior0 != null && bottomSheetBehavior0.F == 5) {
            bottomSheetBehavior0.B(4);
        }
    }

    @Override  // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if(this.h0 != z) {
            this.h0 = z;
            BottomSheetBehavior bottomSheetBehavior0 = this.d0;
            if(bottomSheetBehavior0 != null) {
                bottomSheetBehavior0.z(z);
            }
        }
    }

    @Override  // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if(z && !this.h0) {
            this.h0 = true;
        }
        this.i0 = z;
        this.j0 = true;
    }

    @Override  // i.D
    public final void setContentView(int v) {
        super.setContentView(this.k(null, v, null));
    }

    @Override  // i.D
    public final void setContentView(View view0) {
        super.setContentView(this.k(view0, 0, null));
    }

    @Override  // i.D
    public final void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(this.k(view0, 0, viewGroup$LayoutParams0));
    }
}

