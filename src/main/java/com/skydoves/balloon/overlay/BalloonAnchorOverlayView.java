package com.skydoves.balloon.overlay;

import I2.J;
import Nb.j;
import Nb.l;
import Nb.x;
import R2.k;
import Tb.e;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.util.Collection;
import java.util.List;
import z9.b;

public final class BalloonAnchorOverlayView extends View {
    public final k b0;
    public final k c0;
    public final k d0;
    public final k e0;
    public final k f0;
    public final k g0;
    public final k h0;
    public final k i0;
    public Bitmap j0;
    public final Paint k0;
    public final Paint l0;
    public boolean m0;
    public static final e[] n0;

    static {
        l l0 = new l(BalloonAnchorOverlayView.class, "anchorView", "getAnchorView()Landroid/view/View;", 0);
        x.a.getClass();
        BalloonAnchorOverlayView.n0 = new e[]{l0, new l(BalloonAnchorOverlayView.class, "anchorViewList", "getAnchorViewList()Ljava/util/List;", 0), new l(BalloonAnchorOverlayView.class, "overlayColor", "getOverlayColor()I", 0), new l(BalloonAnchorOverlayView.class, "overlayPaddingColor", "getOverlayPaddingColor()I", 0), new l(BalloonAnchorOverlayView.class, "overlayPaddingShader", "getOverlayPaddingShader()Landroid/graphics/Shader;", 0), new l(BalloonAnchorOverlayView.class, "overlayPadding", "getOverlayPadding()F", 0), new l(BalloonAnchorOverlayView.class, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;", 0), new l(BalloonAnchorOverlayView.class, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", 0)};
    }

    public BalloonAnchorOverlayView(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        super(context0, attributeSet0, 0);
        this.b0 = J.S(this, null);
        this.c0 = J.S(this, null);
        Integer integer0 = 0;
        this.d0 = J.S(this, integer0);
        this.e0 = J.S(this, integer0);
        this.f0 = J.S(this, null);
        this.g0 = J.S(this, 0.0f);
        this.h0 = J.S(this, null);
        this.i0 = J.S(this, b.a);
        Paint paint0 = new Paint(1);
        this.k0 = paint0;
        Paint paint1 = new Paint(1);
        this.l0 = paint1;
        paint0.setAntiAlias(true);
        paint0.setFilterBitmap(true);
        paint0.setDither(true);
        paint1.setAntiAlias(true);
        paint1.setFilterBitmap(true);
        paint1.setDither(true);
    }

    public final void a(View view0, Canvas canvas0) {
        RectF rectF0;
        if(view0 != null) {
            Rect rect0 = new Rect();
            view0.getGlobalVisibleRect(rect0);
            Point point0 = this.getOverlayPosition();
            if(point0 == null) {
                float f4 = (float)rect0.left;
                float f5 = this.getOverlayPadding();
                float f6 = (float)rect0.top;
                float f7 = this.getOverlayPadding();
                float f8 = (float)rect0.right;
                float f9 = this.getOverlayPadding();
                float f10 = (float)rect0.bottom;
                rectF0 = new RectF(f4 - f5, f6 - f7, f9 + f8, this.getOverlayPadding() + f10);
            }
            else {
                float f = (float)point0.x;
                float f1 = this.getOverlayPadding();
                float f2 = ((float)point0.y) - this.getOverlayPadding() + ((float)this.getStatusBarHeight());
                int v = point0.x;
                int v1 = view0.getWidth();
                float f3 = this.getOverlayPadding();
                int v2 = point0.y;
                int v3 = view0.getHeight();
                rectF0 = new RectF(f - f1, f2, f3 + ((float)(v1 + v)), this.getOverlayPadding() + ((float)(v3 + v2)) + ((float)this.getStatusBarHeight()));
            }
            float f11 = this.getOverlayPadding() / 2.0f;
            RectF rectF1 = new RectF(rectF0);
            rectF1.inset(f11, f11);
            if(!(this.getBalloonOverlayShape() instanceof b)) {
                throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
            canvas0.drawOval(rectF0, this.k0);
            canvas0.drawOval(rectF1, this.l0);
        }
    }

    @Override  // android.view.View
    public final void dispatchDraw(Canvas canvas0) {
        j.f(canvas0, "canvas");
        if((this.m0 || (this.j0 == null || this.j0.isRecycled())) && (this.getWidth() != 0 && this.getHeight() != 0)) {
            View view0 = this.getAnchorView();
            if(view0 == null || view0.getWidth() != 0) {
                View view1 = this.getAnchorView();
                if(view1 == null || view1.getHeight() != 0) {
                    Bitmap bitmap0 = this.j0;
                    if(bitmap0 != null && !bitmap0.isRecycled()) {
                        bitmap0.recycle();
                    }
                    Bitmap bitmap1 = Bitmap.createBitmap(this.getWidth(), this.getHeight(), Bitmap.Config.ARGB_8888);
                    this.j0 = bitmap1;
                    Canvas canvas1 = new Canvas(bitmap1);
                    PorterDuffXfermode porterDuffXfermode0 = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
                    this.k0.setXfermode(porterDuffXfermode0);
                    int v = this.getOverlayColor();
                    this.k0.setColor(v);
                    canvas1.drawRect(0.0f, 0.0f, ((float)this.getWidth()), ((float)this.getHeight()), this.k0);
                    PorterDuffXfermode porterDuffXfermode1 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
                    this.k0.setXfermode(porterDuffXfermode1);
                    this.k0.setColor(0);
                    int v1 = this.getOverlayPaddingColor();
                    this.l0.setColor(v1);
                    this.l0.setStyle(Paint.Style.STROKE);
                    float f = this.getOverlayPadding();
                    this.l0.setStrokeWidth(f);
                    Shader shader0 = this.getOverlayPaddingShader();
                    this.l0.setShader(shader0);
                    Collection collection0 = this.getAnchorViewList();
                    if(collection0 == null || collection0.isEmpty()) {
                        this.a(this.getAnchorView(), canvas1);
                    }
                    else {
                        List list0 = this.getAnchorViewList();
                        if(list0 != null) {
                            for(Object object0: list0) {
                                this.a(((View)object0), canvas1);
                            }
                        }
                    }
                    this.m0 = false;
                }
            }
        }
        Bitmap bitmap2 = this.j0;
        if(bitmap2 != null && !bitmap2.isRecycled()) {
            canvas0.drawBitmap(bitmap2, 0.0f, 0.0f, null);
        }
    }

    public final View getAnchorView() {
        return (View)this.b0.K(BalloonAnchorOverlayView.n0[0], this);
    }

    public final List getAnchorViewList() {
        return (List)this.c0.K(BalloonAnchorOverlayView.n0[1], this);
    }

    public final BalloonOverlayShape getBalloonOverlayShape() {
        return (BalloonOverlayShape)this.i0.K(BalloonAnchorOverlayView.n0[7], this);
    }

    public final int getOverlayColor() {
        return ((Number)this.d0.K(BalloonAnchorOverlayView.n0[2], this)).intValue();
    }

    public final float getOverlayPadding() {
        return ((Number)this.g0.K(BalloonAnchorOverlayView.n0[5], this)).floatValue();
    }

    public final int getOverlayPaddingColor() {
        return ((Number)this.e0.K(BalloonAnchorOverlayView.n0[3], this)).intValue();
    }

    public final Shader getOverlayPaddingShader() {
        return (Shader)this.f0.K(BalloonAnchorOverlayView.n0[4], this);
    }

    public final Point getOverlayPosition() {
        return (Point)this.h0.K(BalloonAnchorOverlayView.n0[6], this);
    }

    private final int getStatusBarHeight() {
        Rect rect0 = new Rect();
        Context context0 = this.getContext();
        if(context0 instanceof Activity) {
            ((Activity)context0).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect0);
            return rect0.top;
        }
        return 0;
    }

    @Override  // android.view.View
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.m0 = true;
    }

    public final void setAnchorView(View view0) {
        this.b0.R(BalloonAnchorOverlayView.n0[0], view0);
    }

    public final void setAnchorViewList(List list0) {
        this.c0.R(BalloonAnchorOverlayView.n0[1], list0);
    }

    public final void setBalloonOverlayShape(BalloonOverlayShape balloonOverlayShape0) {
        j.f(balloonOverlayShape0, "<set-?>");
        this.i0.R(BalloonAnchorOverlayView.n0[7], balloonOverlayShape0);
    }

    public final void setOverlayColor(int v) {
        this.d0.R(BalloonAnchorOverlayView.n0[2], v);
    }

    public final void setOverlayPadding(float f) {
        this.g0.R(BalloonAnchorOverlayView.n0[5], f);
    }

    public final void setOverlayPaddingColor(int v) {
        this.e0.R(BalloonAnchorOverlayView.n0[3], v);
    }

    public final void setOverlayPaddingShader(Shader shader0) {
        this.f0.R(BalloonAnchorOverlayView.n0[4], shader0);
    }

    public final void setOverlayPosition(Point point0) {
        this.h0.R(BalloonAnchorOverlayView.n0[6], point0);
    }
}

