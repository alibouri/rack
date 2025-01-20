package com.sendwave.shared;

import Ab.k;
import Ab.o;
import Ab.t;
import Bb.F;
import Eb.a;
import Fb.c;
import Nb.j;
import R9.F2;
import W4.f;
import W8.e;
import Xb.J;
import Xb.V;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.LifecycleOwnerKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import o9.A1;
import o9.B1;
import o9.x1;
import o9.y1;
import o9.z1;
import q9.o0;

public final class PhotoActivity extends e {
    public final ArrayList T0;
    public final o U0;
    public static final int V0;

    public PhotoActivity() {
        this.T0 = new ArrayList();
        this.U0 = f.A(new F2(28, this));
    }

    public final void R() {
        this.Q("submit photo", F.J(new k("photo_source", (this.M0 ? "photo library" : "snap"))));
        o0.T(this, new PhotoActivityResult(this.T0, null), true);
    }

    public final Object S(c c0) {
        A1 a10;
        if(c0 instanceof A1) {
            a10 = (A1)c0;
            int v = a10.e0;
            if((v & 0x80000000) == 0) {
                a10 = new A1(this, c0);
            }
            else {
                a10.e0 = v ^ 0x80000000;
            }
        }
        else {
            a10 = new A1(this, c0);
        }
        Object object0 = a10.c0;
        Object object1 = a.X;
        switch(a10.e0) {
            case 0: {
                W5.f.b0(object0);
                try {
                    B1 b10 = new B1(this, null);
                    a10.b0 = this;
                    a10.e0 = 1;
                    object0 = J.y(V.c, b10, a10);
                    if(object0 == object1) {
                        return object1;
                    }
                    PhotoActivity photoActivity0 = this;
                    goto label_24;
                label_22:
                    photoActivity0 = a10.b0;
                    W5.f.b0(object0);
                label_24:
                    hd.c.a.n("Photo");
                    int v1 = photoActivity0.G0.getWidth();
                    int v2 = photoActivity0.G0.getHeight();
                    long v3 = ((File)object0).length();
                    hd.c.a.a("Dimensions: " + v1 + "x" + v2 + ". Upload size: " + v3, new Object[0]);
                    String s = Uri.fromFile(((File)object0)).toString();
                    j.e(s, "toString(...)");
                    photoActivity0.T0.add(s);
                    return t.a;
                }
                catch(IOException iOException0) {
                    break;
                }
            }
            case 1: {
                goto label_22;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        hd.c.a.n("Photo");
        hd.c.a.d((iOException0.getMessage() == null ? "" : iOException0.getMessage()), new Object[0]);
        return t.a;
    }

    @Override  // W8.e
    public final void onCreate(Bundle bundle0) {
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        Class class0 = PhotoActivity.class;
        if(parcelable0 == null) {
            throw new Exception(class0.getName() + " invoked with no params");
        }
        this.getIntent().putExtra("titleText", ((PhotoActivityParams)parcelable0).X);
        this.getIntent().putExtra("preferFrontCamera", ((PhotoActivityParams)parcelable0).Z);
        this.getIntent().putExtra("useConfirmationFlow", ((PhotoActivityParams)parcelable0).Y);
        this.getIntent().putExtra("isSkippable", ((PhotoActivityParams)parcelable0).b0);
        this.getIntent().putExtra("warnForSkip", ((PhotoActivityParams)parcelable0).c0);
        this.getIntent().putExtra("moreInfo", ((PhotoActivityParams)parcelable0).e0);
        this.getIntent().putExtra("confirmText", ((PhotoActivityParams)parcelable0).f0);
        this.getIntent().putExtra("allowPickFromGallery", ((PhotoActivityParams)parcelable0).g0);
        this.getIntent().putExtra("trackingCategory", ((PhotoActivityParams)parcelable0).h0);
        this.getIntent().putExtra("showBackBtn", ((PhotoActivityParams)parcelable0).i0);
        this.getIntent().putExtra("isPortrait", ((PhotoActivityParams)parcelable0).k0);
        Parcelable parcelable1 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable1 == null) {
            throw new Exception(class0.getName() + " invoked with no params");
        }
        this.Q0 = ((PhotoActivityParams)parcelable1).d0.X;
        super.onCreate(bundle0);
        this.findViewById(0x7F0A01E2).setOnClickListener(new x1());  // id:more_pages_back / initializer: Ljava/lang/Object;-><init>()V
        ((AppCompatButton)this.findViewById(0x7F0A020C)).setOnClickListener(new y1(this, 0));  // id:no_btn
        ((AppCompatButton)this.findViewById(0x7F0A0335)).setOnClickListener(new y1(this, 1));  // id:yes_btn
    }

    @Override  // W8.e
    public void onSubmit(View view0) {
        J.q(LifecycleOwnerKt.a(this), null, null, new z1(this, null), 3);
    }
}

