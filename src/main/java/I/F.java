package i;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController.RecycleListView;
import f9.h;
import n.k;
import q9.G0;

public class f {
    public final c a;
    public final int b;

    public f(Context context0) {
        this(context0, g.k(context0, 0));
    }

    public f(Context context0, int v) {
        this.a = new c(new ContextThemeWrapper(context0, g.k(context0, v)));
        this.b = v;
    }

    public g a() {
        Object object0;
        c c0 = this.a;
        g g0 = new g(c0.a, this.b);
        View view0 = c0.e;
        e e0 = g0.d0;
        if(view0 == null) {
            CharSequence charSequence0 = c0.d;
            if(charSequence0 != null) {
                e0.d = charSequence0;
                TextView textView0 = e0.u;
                if(textView0 != null) {
                    textView0.setText(charSequence0);
                }
            }
            Drawable drawable0 = c0.c;
            if(drawable0 != null) {
                e0.s = drawable0;
                ImageView imageView0 = e0.t;
                if(imageView0 != null) {
                    imageView0.setVisibility(0);
                    e0.t.setImageDrawable(drawable0);
                }
            }
        }
        else {
            e0.w = view0;
        }
        CharSequence charSequence1 = c0.f;
        if(charSequence1 != null) {
            e0.e = charSequence1;
            TextView textView1 = e0.v;
            if(textView1 != null) {
                textView1.setText(charSequence1);
            }
        }
        CharSequence charSequence2 = c0.g;
        if(charSequence2 != null) {
            e0.c(-1, charSequence2, c0.h);
        }
        CharSequence charSequence3 = c0.i;
        if(charSequence3 != null) {
            e0.c(-2, charSequence3, c0.j);
        }
        CharSequence charSequence4 = c0.k;
        if(charSequence4 != null) {
            e0.c(-3, charSequence4, c0.l);
        }
        if(c0.p != null || c0.q != null) {
            View view1 = c0.b.inflate(e0.A, null);
            ContextThemeWrapper contextThemeWrapper0 = c0.a;
            if(c0.u) {
                object0 = new a(c0, contextThemeWrapper0, e0.B, c0.p, ((AlertController.RecycleListView)view1));
            }
            else {
                int v = c0.v ? e0.C : e0.D;
                object0 = c0.q;
                if(object0 == null) {
                    object0 = new d(contextThemeWrapper0, v, 0x1020014, c0.p);  // initializer: Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V
                }
            }
            e0.x = object0;
            e0.y = c0.w;
            if(c0.r != null) {
                ((AlertController.RecycleListView)view1).setOnItemClickListener(new h(c0, e0));
            }
            else if(c0.x != null) {
                ((AlertController.RecycleListView)view1).setOnItemClickListener(new b(c0, ((AlertController.RecycleListView)view1), e0));
            }
            if(c0.v) {
                ((AlertController.RecycleListView)view1).setChoiceMode(1);
            }
            else if(c0.u) {
                ((AlertController.RecycleListView)view1).setChoiceMode(2);
            }
            e0.f = (AlertController.RecycleListView)view1;
        }
        View view2 = c0.s;
        if(view2 != null) {
            e0.g = view2;
            e0.h = false;
        }
        g0.setCancelable(c0.m);
        if(c0.m) {
            g0.setCanceledOnTouchOutside(true);
        }
        g0.setOnCancelListener(c0.n);
        g0.setOnDismissListener(null);
        k k0 = c0.o;
        if(k0 != null) {
            g0.setOnKeyListener(k0);
        }
        return g0;
    }

    public void b(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.i = charSequence0;
        this.a.j = dialogInterface$OnClickListener0;
    }

    public void c(G0 g00) {
        this.a.n = g00;
    }

    public void d(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.a.g = charSequence0;
        this.a.h = dialogInterface$OnClickListener0;
    }
}

