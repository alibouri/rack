package com.sendwave.components;

import Ab.k;
import Bb.F;
import I.V0;
import J1.U;
import Nb.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import f9.B;
import h9.b;
import java.util.Map;
import r8.d;

public final class QRCodeView extends AppCompatImageView {
    public String e0;
    public int f0;
    public boolean g0;
    public static final int h0;

    public QRCodeView(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        this(context0, attributeSet0, 4);
    }

    public QRCodeView(Context context0, AttributeSet attributeSet0, int v) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        j.f(context0, "context");
        super(context0, attributeSet0, ((v & 4) == 0 ? 0 : 0x101006E));
        this.f0 = 3;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, b.d);
        j.e(typedArray0, "obtainStyledAttributes(...)");
        this.setQrcontent(typedArray0.getString(2));
        this.setQrmargin(typedArray0.getInt(1, 3));
        this.g0 = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
        this.addOnLayoutChangeListener(new B(this));
    }

    public final void c() {
        int v8;
        String s = this.e0 == null ? "" : this.e0;
        if(Vb.j.c0(s)) {
            s = "http://example.com";
        }
        int v = this.getWidth();
        if(v < 100) {
            v = 100;
        }
        d d0 = d.Z;
        V0 v00 = (V0)R8.b.g(s, 1, F.J(new k(d0, ((int)this.f0)))).f;
        j.e(v00, "getMatrix(...)");
        int v1 = Math.max(this.getWidth(), v);
        int v2 = Math.max(this.getHeight(), v);
        int v3 = v00.Y;
        int v4 = v00.Z;
        int v5 = Math.min(v1 / v3, v2 / v4);
        int v6 = v3 * v5;
        int v7 = v4 * v5;
        Map map0 = F.J(new k(d0, ((int)this.f0)));
        if(s.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if(v6 < 0 || v7 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + v6 + 'x' + v7);
        }
        d d1 = d.X;
        if(map0.containsKey(d1)) {
            String s1 = map0.get(d1).toString();
            if(s1 == null) {
                throw new NullPointerException("Name is null");
            }
            if(s1.equals("L")) {
                v8 = 1;
            }
            else if(s1.equals("M")) {
                v8 = 2;
            }
            else if(s1.equals("Q")) {
                v8 = 3;
            }
            else {
                if(!s1.equals("H")) {
                    throw new IllegalArgumentException("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel." + s1);
                }
                v8 = 4;
            }
        }
        else {
            v8 = 1;
        }
        int v9 = map0.containsKey(d0) ? Integer.parseInt(map0.get(d0).toString()) : 4;
        V0 v01 = (V0)R8.b.g(s, v8, map0).f;
        if(v01 == null) {
            throw new IllegalStateException();
        }
        int v10 = v01.Y;
        int v11 = v10 + (v9 << 1);
        int v12 = v01.Z;
        int v13 = (v9 << 1) + v12;
        int v14 = Math.max(v6, v11);
        int v15 = Math.max(v7, v13);
        int v16 = Math.min(v14 / v11, v15 / v13);
        int v17 = (v15 - v12 * v16) / 2;
        x8.b b0 = new x8.b(v14, v15);
        int v18 = 0;
        while(v18 < v12) {
            int v19 = 0;
            for(int v20 = (v14 - v10 * v16) / 2; v19 < v10; v20 += v16) {
                if(v01.a(v19, v18) == 1) {
                    b0.h(v20, v17, v16, v16);
                }
                ++v19;
            }
            ++v18;
            v17 += v16;
        }
        int v21 = b0.X;
        int v22 = b0.Y;
        int[] arr_v = new int[v21 * v22];
        for(int v23 = 0; v23 < v22; ++v23) {
            for(int v24 = 0; v24 < v21; ++v24) {
                arr_v[v23 * v21 + v24] = b0.c(v24, v23) ? 0xFF000000 : -1;
            }
        }
        Bitmap bitmap0 = Bitmap.createBitmap(v21, v22, Bitmap.Config.ARGB_8888);
        j.e(bitmap0, "createBitmap(...)");
        bitmap0.setPixels(arr_v, 0, v21, 0, 0, v21, v22);
        this.setImageBitmap(bitmap0);
    }

    public final boolean getAnimateOnUpdate() {
        return this.g0;
    }

    public final String getQrcontent() {
        return this.e0;
    }

    public final int getQrmargin() {
        return this.f0;
    }

    public final void setAnimateOnUpdate(boolean z) {
        this.g0 = z;
    }

    public final void setQrcontent(String s) {
        if(!this.g0) {
            this.e0 = s;
            this.c();
            return;
        }
        if(j.a(this.e0, s)) {
            return;
        }
        this.e0 = s;
        this.animate().alpha(0.5f).setDuration(100L).setListener(new U(2, this));
    }

    public final void setQrmargin(int v) {
        this.f0 = v;
        this.c();
    }
}

