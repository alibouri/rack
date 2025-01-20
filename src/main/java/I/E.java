package i;

import a8.O;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController.RecycleListView;
import androidx.core.widget.NestedScrollView;
import h.a;
import java.lang.ref.WeakReference;

public final class e {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final boolean E;
    public final O F;
    public final K6.e G;
    public final Context a;
    public final g b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public AlertController.RecycleListView f;
    public View g;
    public boolean h;
    public Button i;
    public CharSequence j;
    public Message k;
    public Button l;
    public CharSequence m;
    public Message n;
    public Button o;
    public CharSequence p;
    public Message q;
    public NestedScrollView r;
    public Drawable s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public View w;
    public ListAdapter x;
    public int y;
    public final int z;

    public e(Context context0, g g0, Window window0) {
        this.h = false;
        this.y = -1;
        this.G = new K6.e(5, this);
        this.a = context0;
        this.b = g0;
        this.c = window0;
        O o0 = new O();
        o0.b = new WeakReference(g0);
        this.F = o0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, a.e, 0x7F04002C, 0);  // attr:alertDialogStyle
        this.z = typedArray0.getResourceId(0, 0);
        typedArray0.getResourceId(2, 0);
        this.A = typedArray0.getResourceId(4, 0);
        this.B = typedArray0.getResourceId(5, 0);
        this.C = typedArray0.getResourceId(7, 0);
        this.D = typedArray0.getResourceId(3, 0);
        this.E = typedArray0.getBoolean(6, true);
        typedArray0.getDimensionPixelSize(1, 0);
        typedArray0.recycle();
        g0.g().h(1);
    }

    public static boolean a(View view0) {
        if(view0.onCheckIsTextEditor()) {
            return true;
        }
        if(!(view0 instanceof ViewGroup)) {
            return false;
        }
        int v = ((ViewGroup)view0).getChildCount();
        while(v > 0) {
            --v;
            if(e.a(((ViewGroup)view0).getChildAt(v))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public static ViewGroup b(View view0, View view1) {
        if(view0 == null) {
            if(view1 instanceof ViewStub) {
                view1 = ((ViewStub)view1).inflate();
            }
            return (ViewGroup)view1;
        }
        if(view1 != null) {
            ViewParent viewParent0 = view1.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(view1);
            }
        }
        if(view0 instanceof ViewStub) {
            view0 = ((ViewStub)view0).inflate();
        }
        return (ViewGroup)view0;
    }

    public final void c(int v, CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        Message message0 = dialogInterface$OnClickListener0 == null ? null : this.F.obtainMessage(v, dialogInterface$OnClickListener0);
        switch(v) {
            case -3: {
                this.p = charSequence0;
                this.q = message0;
                return;
            }
            case -2: {
                this.m = charSequence0;
                this.n = message0;
                return;
            }
            case -1: {
                this.j = charSequence0;
                this.k = message0;
                return;
            }
            default: {
                throw new IllegalArgumentException("Button does not exist");
            }
        }
    }
}

