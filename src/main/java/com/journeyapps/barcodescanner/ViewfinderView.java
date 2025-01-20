package com.journeyapps.barcodescanner;

import T8.f;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import r8.o;
import v8.h;

public class ViewfinderView extends View {
    public final Paint b0;
    public int c0;
    public final int d0;
    public final int e0;
    public boolean f0;
    public int g0;
    public ArrayList h0;
    public ArrayList i0;
    public CameraPreview j0;
    public Rect k0;
    public Size l0;
    public static final int[] m0;

    static {
        ViewfinderView.m0 = new int[]{0, 0x40, 0x80, 0xC0, 0xFF, 0xC0, 0x80, 0x40};
    }

    public ViewfinderView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b0 = new Paint(1);
        Resources resources0 = this.getResources();
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, h.b);
        this.c0 = typedArray0.getColor(4, resources0.getColor(0x7F06019A));  // color:zxing_viewfinder_mask
        typedArray0.getColor(1, resources0.getColor(0x7F060196));  // color:zxing_result_view
        this.d0 = typedArray0.getColor(2, resources0.getColor(0x7F060199));  // color:zxing_viewfinder_laser
        this.e0 = typedArray0.getColor(0, resources0.getColor(0x7F060195));  // color:zxing_possible_result_points
        this.f0 = typedArray0.getBoolean(3, true);
        typedArray0.recycle();
        this.g0 = 0;
        this.h0 = new ArrayList(20);
        this.i0 = new ArrayList(20);
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        CameraPreview cameraPreview0 = this.j0;
        if(cameraPreview0 != null) {
            Rect rect0 = cameraPreview0.getFramingRect();
            Size size0 = this.j0.getPreviewSize();
            if(rect0 != null && size0 != null) {
                this.k0 = rect0;
                this.l0 = size0;
            }
        }
        Rect rect1 = this.k0;
        if(rect1 != null) {
            Size size1 = this.l0;
            if(size1 != null) {
                int v = this.getWidth();
                int v1 = this.getHeight();
                Paint paint0 = this.b0;
                paint0.setColor(this.c0);
                canvas0.drawRect(0.0f, 0.0f, ((float)v), ((float)rect1.top), paint0);
                canvas0.drawRect(0.0f, ((float)rect1.top), ((float)rect1.left), ((float)(rect1.bottom + 1)), paint0);
                canvas0.drawRect(((float)(rect1.right + 1)), ((float)rect1.top), ((float)v), ((float)(rect1.bottom + 1)), paint0);
                canvas0.drawRect(0.0f, ((float)(rect1.bottom + 1)), ((float)v), ((float)v1), paint0);
                if(this.f0) {
                    paint0.setColor(this.d0);
                    paint0.setAlpha(ViewfinderView.m0[this.g0]);
                    this.g0 = (this.g0 + 1) % 8;
                    int v2 = rect1.height() / 2 + rect1.top;
                    canvas0.drawRect(((float)(rect1.left + 2)), ((float)(v2 - 1)), ((float)(rect1.right - 1)), ((float)(v2 + 2)), paint0);
                }
                float f = ((float)this.getWidth()) / ((float)size1.X);
                float f1 = ((float)this.getHeight()) / ((float)size1.Y);
                int v3 = this.e0;
                if(!this.i0.isEmpty()) {
                    paint0.setAlpha(80);
                    paint0.setColor(v3);
                    for(Object object0: this.i0) {
                        canvas0.drawCircle(((float)(((int)(((o)object0).a * f)))), ((float)(((int)(((o)object0).b * f1)))), 3.0f, paint0);
                    }
                    this.i0.clear();
                }
                if(!this.h0.isEmpty()) {
                    paint0.setAlpha(0xA0);
                    paint0.setColor(v3);
                    for(Object object1: this.h0) {
                        canvas0.drawCircle(((float)(((int)(((o)object1).a * f)))), ((float)(((int)(((o)object1).b * f1)))), 6.0f, paint0);
                    }
                    ArrayList arrayList0 = this.h0;
                    ArrayList arrayList1 = this.i0;
                    this.h0 = arrayList1;
                    this.i0 = arrayList0;
                    arrayList1.clear();
                }
                this.postInvalidateDelayed(80L, rect1.left - 6, rect1.top - 6, rect1.right + 6, rect1.bottom + 6);
            }
        }
    }

    public void setCameraPreview(CameraPreview cameraPreview0) {
        this.j0 = cameraPreview0;
        f f0 = new f(2, this);
        cameraPreview0.k0.add(f0);
    }

    public void setLaserVisibility(boolean z) {
        this.f0 = z;
    }

    public void setMaskColor(int v) {
        this.c0 = v;
    }
}

