package com.skydoves.balloon;

import Ab.e;
import Ab.k;
import Bb.r;
import Ea.e0;
import J1.E;
import K6.l;
import Sb.c;
import Sb.d;
import W4.f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import com.skydoves.balloon.vectortext.VectorTextViewParams;
import i.J;
import io.sentry.android.core.v;
import java.util.ArrayList;
import o.N0;
import o9.l1;
import u9.h;
import u9.i;
import u9.j;
import u9.m;
import v9.a;

public final class Balloon implements DefaultLifecycleObserver {
    public final Context X;
    public final j Y;
    public final N0 Z;
    public final J b0;
    public final PopupWindow c0;
    public final PopupWindow d0;
    public boolean e0;
    public boolean f0;
    public OnBalloonInitializedListener g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public k k0;
    public static final int l0;

    static {
        f.A(new e0(28));
        f.A(new e0(29));
    }

    public Balloon(Context context0, j j0) {
        this.X = context0;
        this.Y = j0;
        View view0 = LayoutInflater.from(context0).inflate(0x7F0D0028, null, false);  // layout:balloon_layout_body
        int v = 0x7F0A0083;  // id:balloon_arrow
        View view1 = f.x(view0, 0x7F0A0083);  // id:balloon_arrow
        if(((ImageView)view1) != null) {
            v = 0x7F0A0084;  // id:balloon_card
            View view2 = f.x(view0, 0x7F0A0084);  // id:balloon_card
            if(((RadiusLayout)view2) != null) {
                v = 0x7F0A0085;  // id:balloon_content
                View view3 = f.x(view0, 0x7F0A0085);  // id:balloon_content
                if(((FrameLayout)view3) != null) {
                    v = 0x7F0A0086;  // id:balloon_text
                    View view4 = f.x(view0, 0x7F0A0086);  // id:balloon_text
                    if(((VectorTextView)view4) != null) {
                        v = 0x7F0A0087;  // id:balloon_wrapper
                        View view5 = f.x(view0, 0x7F0A0087);  // id:balloon_wrapper
                        if(((FrameLayout)view5) != null) {
                            this.Z = new N0(((FrameLayout)view0), ((FrameLayout)view0), ((ImageView)view1), ((RadiusLayout)view2), ((FrameLayout)view3), ((VectorTextView)view4), ((FrameLayout)view5), 5);
                            View view6 = LayoutInflater.from(context0).inflate(0x7F0D0029, null, false);  // layout:balloon_layout_overlay
                            if(view6 == null) {
                                throw new NullPointerException("rootView");
                            }
                            this.b0 = new J(((BalloonAnchorOverlayView)view6), ((BalloonAnchorOverlayView)view6));
                            PopupWindow popupWindow0 = new PopupWindow(((FrameLayout)view0), -2, -2);
                            this.c0 = popupWindow0;
                            this.d0 = new PopupWindow(((BalloonAnchorOverlayView)view6), -1, -1);
                            j0.getClass();
                            this.g0 = null;
                            this.h0 = f.z(new i(0));
                            this.i0 = f.z(new u9.f(this, 2));
                            this.j0 = f.z(new u9.f(this, 0));
                            ((RadiusLayout)view2).setAlpha(j0.w);
                            ((RadiusLayout)view2).setRadius(j0.q);
                            E.j(((RadiusLayout)view2), j0.x);
                            GradientDrawable gradientDrawable0 = new GradientDrawable();
                            gradientDrawable0.setColor(j0.p);
                            gradientDrawable0.setCornerRadius(j0.q);
                            ((RadiusLayout)view2).setBackground(gradientDrawable0);
                            ((RadiusLayout)view2).setPadding(j0.d, j0.e, j0.f, j0.g);
                            ViewGroup.LayoutParams viewGroup$LayoutParams0 = ((FrameLayout)view5).getLayoutParams();
                            Nb.j.d(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMargins(0, 0, 0, 0);
                            popupWindow0.setOutsideTouchable(true);
                            popupWindow0.setFocusable(j0.S);
                            popupWindow0.setBackgroundDrawable(new ColorDrawable(0));
                            popupWindow0.setElevation(j0.x);
                            popupWindow0.setAttachedInDecor(j0.U);
                            j0.getClass();
                            a a0 = j0.y;
                            if(a0 == null) {
                                Nb.j.e(((VectorTextView)view4).getContext(), "getContext(...)");
                                Pb.a.H(TypedValue.applyDimension(1, 28.0f, Resources.getSystem().getDisplayMetrics()));
                                Pb.a.H(TypedValue.applyDimension(1, 28.0f, Resources.getSystem().getDisplayMetrics()));
                                Pb.a.H(TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics()));
                                Nb.j.f(j0.v, "value");
                                VectorTextViewParams vectorTextViewParams0 = ((VectorTextView)view4).i0;
                                if(vectorTextViewParams0 != null) {
                                    vectorTextViewParams0.i = j0.Q;
                                    android.support.v4.media.session.a.r(((VectorTextView)view4), vectorTextViewParams0);
                                }
                                Nb.j.e(((VectorTextView)view4).getContext(), "getContext(...)");
                                Nb.j.f(j0.r, "value");
                                ((VectorTextView)view4).setMovementMethod(null);
                                ((VectorTextView)view4).setText(j0.r);
                                ((VectorTextView)view4).setTextSize(j0.t);
                                ((VectorTextView)view4).setGravity(j0.u);
                                ((VectorTextView)view4).setTextColor(j0.s);
                                ((VectorTextView)view4).setIncludeFontPadding(true);
                                ((VectorTextView)view4).setTypeface(((VectorTextView)view4).getTypeface(), 0);
                                this.l(((VectorTextView)view4), ((RadiusLayout)view2));
                            }
                            else {
                                ViewParent viewParent0 = a0.getParent();
                                ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
                                if(viewGroup0 != null) {
                                    viewGroup0.removeView(a0);
                                }
                                ((RadiusLayout)view2).removeAllViews();
                                ((RadiusLayout)view2).addView(a0);
                                this.n(((RadiusLayout)view2));
                            }
                            this.k();
                            this.m(j0.z);
                            popupWindow0.setOnDismissListener(new h(this, j0.A));
                            popupWindow0.setTouchInterceptor(new l(this, null));
                            ((BalloonAnchorOverlayView)view6).setOnClickListener(new l1(null, 2, this));
                            Nb.j.e(((FrameLayout)view0), "getRoot(...)");
                            Balloon.a(((FrameLayout)view0));
                            LifecycleOwner lifecycleOwner0 = j0.G;
                            if(lifecycleOwner0 == null && context0 instanceof LifecycleOwner) {
                                j0.G = (LifecycleOwner)context0;
                                ((LifecycleOwner)context0).a().a(this);
                                return;
                            }
                            if(lifecycleOwner0 != null) {
                                Lifecycle lifecycle0 = lifecycleOwner0.a();
                                if(lifecycle0 != null) {
                                    lifecycle0.a(this);
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    public static void a(ViewGroup viewGroup0) {
        viewGroup0.setFitsSystemWindows(false);
        d d0 = I2.J.R(0, viewGroup0.getChildCount());
        ArrayList arrayList0 = new ArrayList(r.b0(d0));
        c c0 = d0.a();
        while(c0.Z) {
            arrayList0.add(viewGroup0.getChildAt(c0.a()));
        }
        for(Object object0: arrayList0) {
            View view0 = (View)object0;
            view0.setFitsSystemWindows(false);
            if(view0 instanceof ViewGroup) {
                Balloon.a(((ViewGroup)view0));
            }
        }
    }

    public final boolean c(View view0) {
        if(this.e0) {
            return false;
        }
        if(this.f0) {
            return false;
        }
        Activity activity0 = this.X instanceof Activity ? ((Activity)this.X) : null;
        if(activity0 != null && activity0.isFinishing()) {
            return false;
        }
        if(this.c0.getContentView().getParent() != null) {
            return false;
        }
        return view0.isAttachedToWindow() ? view0.getWindowToken().isBinderAlive() : false;
    }

    public final void d() {
        if(this.e0) {
            u9.f f0 = new u9.f(this, 1);
            j j0 = this.Y;
            if(j0.J == m.Z) {
                View view0 = this.c0.getContentView();
                Nb.j.e(view0, "getContentView(...)");
                view0.post(new v(view0, j0.L, f0));
                return;
            }
            f0.invoke();
        }
    }

    public final float e(View view0) {
        N0 n00 = this.Z;
        int v = hb.h.U(((FrameLayout)n00.d0)).x;
        int v1 = hb.h.U(view0).x;
        j j0 = this.Y;
        float f = ((float)j0.j) * j0.o + 0.0f;
        float f1 = ((float)this.j()) - f;
        j0.getClass();
        switch(j0.l.ordinal()) {
            case 0: {
                return ((float)((FrameLayout)n00.f0).getWidth()) * j0.k - ((float)j0.j) * 0.5f;
            }
            case 1: {
                if(view0.getWidth() + v1 >= v) {
                    if(this.j() + v < v1) {
                        return f1 - 0.0f - 0.0f;
                    }
                    float f2 = ((float)view0.getWidth()) * j0.k + ((float)v1) - ((float)v) - ((float)j0.j) * 0.5f;
                    float f3 = ((float)view0.getWidth()) * j0.k + ((float)v1);
                    float f4 = f3 - ((float)j0.j) * 0.5f;
                    if(f4 <= ((float)v)) {
                        return 0.0f;
                    }
                    if(f4 <= ((float)v) && view0.getWidth() <= this.j()) {
                        return f3 - ((float)j0.j) * 0.5f - ((float)v);
                    }
                    if(f2 > ((float)(j0.j * 2))) {
                        return f2 > ((float)(this.j() - j0.j * 2)) ? f1 - 0.0f - 0.0f : f2;
                    }
                }
                return f;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public final float g(View view0) {
        int v;
        j j0 = this.Y;
        Nb.j.f(view0, "<this>");
        Rect rect0 = new Rect();
        Context context0 = view0.getContext();
        if(!(context0 instanceof Activity) || !j0.T) {
            v = 0;
        }
        else {
            ((Activity)context0).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect0);
            v = rect0.top;
        }
        N0 n00 = this.Z;
        int v1 = hb.h.U(((FrameLayout)n00.d0)).y - v;
        int v2 = hb.h.U(view0).y - v;
        float f = ((float)j0.j) * j0.o + 0.0f;
        float f1 = ((float)this.i()) - f - 0.0f - 0.0f;
        int v3 = j0.j / 2;
        switch(j0.l.ordinal()) {
            case 0: {
                return ((float)((FrameLayout)n00.f0).getHeight()) * j0.k - ((float)v3);
            }
            case 1: {
                if(view0.getHeight() + v2 >= v1) {
                    if(this.i() + v1 < v2) {
                        return f1;
                    }
                    float f2 = ((float)view0.getHeight()) * j0.k + ((float)v2) - ((float)v1) - ((float)v3);
                    if(f2 > ((float)(j0.j * 2))) {
                        return f2 > ((float)(this.i() - j0.j * 2)) ? f1 : f2;
                    }
                }
                return f;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public final int i() {
        int v = this.Y.c;
        return v == 0x80000000 ? ((FrameLayout)this.Z.Y).getMeasuredHeight() : v;
    }

    public final int j() {
        int v = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        this.Y.getClass();
        this.Y.getClass();
        this.Y.getClass();
        this.Y.getClass();
        int v1 = ((FrameLayout)this.Z.Y).getMeasuredWidth();
        this.Y.getClass();
        int v2 = I2.J.r(v1, 0, this.Y.b);
        return v2 > v ? v : v2;
    }

    public final void k() {
        int v = this.Y.j - 1;
        int v1 = (int)this.Y.x;
        FrameLayout frameLayout0 = (FrameLayout)this.Z.d0;
        switch(this.Y.n.ordinal()) {
            case 0: {
                if(v >= v1) {
                    v1 = v;
                }
                frameLayout0.setPadding(0, v, 0, v1);
                return;
            }
            case 1: {
                if(v >= v1) {
                    v1 = v;
                }
                frameLayout0.setPadding(0, v, 0, v1);
                return;
            }
            case 2: {
                frameLayout0.setPadding(v, 0, v, 0);
                return;
            }
            case 3: {
                frameLayout0.setPadding(v, 0, v, 0);
                return;
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public final void l(TextView textView0, View view0) {
        int v4;
        int v = (int)textView0.getPaint().measureText(textView0.getText().toString());
        Drawable[] arr_drawable = textView0.getCompoundDrawablesRelative();
        Nb.j.e(arr_drawable, "getCompoundDrawablesRelative(...)");
        int v1 = 0;
        if(arr_drawable[0] != null || arr_drawable[2] != null) {
            Drawable[] arr_drawable4 = textView0.getCompoundDrawablesRelative();
            Nb.j.e(arr_drawable4, "getCompoundDrawablesRelative(...)");
            Drawable drawable4 = arr_drawable4[0];
            int v5 = drawable4 == null ? 0 : drawable4.getIntrinsicHeight();
            Drawable drawable5 = arr_drawable4[2];
            int v6 = drawable5 == null ? 0 : drawable5.getIntrinsicHeight();
            if(v5 < v6) {
                v5 = v6;
            }
            textView0.setMinHeight(v5);
            Drawable[] arr_drawable5 = textView0.getCompoundDrawablesRelative();
            Nb.j.e(arr_drawable5, "getCompoundDrawablesRelative(...)");
            Drawable drawable6 = arr_drawable5[0];
            v4 = drawable6 == null ? 0 : drawable6.getIntrinsicWidth();
            Drawable drawable7 = arr_drawable5[2];
            if(drawable7 != null) {
                v1 = drawable7.getIntrinsicWidth();
            }
            v += v1 + v4;
        }
        else {
            Drawable[] arr_drawable1 = textView0.getCompoundDrawables();
            Nb.j.e(arr_drawable1, "getCompoundDrawables(...)");
            if(arr_drawable1[0] != null || arr_drawable1[2] != null) {
                Drawable[] arr_drawable2 = textView0.getCompoundDrawables();
                Nb.j.e(arr_drawable2, "getCompoundDrawables(...)");
                Drawable drawable0 = arr_drawable2[0];
                int v2 = drawable0 == null ? 0 : drawable0.getIntrinsicHeight();
                Drawable drawable1 = arr_drawable2[2];
                int v3 = drawable1 == null ? 0 : drawable1.getIntrinsicHeight();
                if(v2 < v3) {
                    v2 = v3;
                }
                textView0.setMinHeight(v2);
                Drawable[] arr_drawable3 = textView0.getCompoundDrawables();
                Nb.j.e(arr_drawable3, "getCompoundDrawables(...)");
                Drawable drawable2 = arr_drawable3[0];
                v4 = drawable2 == null ? 0 : drawable2.getIntrinsicWidth();
                Drawable drawable3 = arr_drawable3[2];
                if(drawable3 != null) {
                    v1 = drawable3.getIntrinsicWidth();
                }
                v += v1 + v4;
            }
        }
        int v7 = textView0.getCompoundPaddingStart();
        int v8 = textView0.getCompoundPaddingEnd() + v7 + v;
        int v9 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        int v10 = view0.getPaddingLeft();
        int v11 = view0.getPaddingRight();
        this.Y.getClass();
        int v12 = this.Y.b - (this.Y.j * 2 + (v11 + v10));
        if(v12 <= v9) {
            v9 = v12;
        }
        if(v8 > v9) {
            v8 = v9;
        }
        textView0.setMaxWidth(v8);
    }

    public final void m(OnBalloonClickListener onBalloonClickListener0) {
        if(onBalloonClickListener0 == null) {
            this.Y.getClass();
            return;
        }
        ((FrameLayout)this.Z.f0).setOnClickListener(new l1(onBalloonClickListener0, 3, this));
    }

    public final void n(ViewGroup viewGroup0) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof TextView) {
                this.l(((TextView)view0), viewGroup0);
            }
            else if(view0 instanceof ViewGroup) {
                this.n(((ViewGroup)view0));
            }
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.a(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner0) {
        Nb.j.f(lifecycleOwner0, "owner");
        androidx.lifecycle.a.b(this, lifecycleOwner0);
        this.f0 = true;
        this.d0.dismiss();
        this.c0.dismiss();
        LifecycleOwner lifecycleOwner1 = this.Y.G;
        if(lifecycleOwner1 != null) {
            Lifecycle lifecycle0 = lifecycleOwner1.a();
            if(lifecycle0 != null) {
                lifecycle0.c(this);
            }
        }
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner0) {
        Nb.j.f(lifecycleOwner0, "owner");
        androidx.lifecycle.a.c(this, lifecycleOwner0);
        this.Y.getClass();
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.d(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.e(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.f(this, lifecycleOwner0);
    }
}

