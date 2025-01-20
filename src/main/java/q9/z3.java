package q9;

import Ab.k;
import Ab.o;
import Bb.q;
import Ea.e0;
import Eb.a;
import Nb.w;
import R1.d;
import W4.f;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.sendwave.util.LockScreenActivity;
import com.wave.customer.CustomerApp;
import i.c;
import i.h;
import i.i;
import i.j;
import i9.x;
import java.io.Serializable;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import n0.y;
import o9.R1;

public abstract class z3 extends j {
    public boolean A0;
    public final o B0;
    public final o C0;
    public final u3 D0;
    public boolean z0;

    public z3() {
        h h0 = new h(this);
        this.b0.b.c("androidx:appcompat", h0);
        this.t(new i(this));
        this.B0 = f.A(new R1(9, this));
        this.C0 = f.A(new e0(25));
        this.D0 = new u3(this);
    }

    public final void C(ac.h h0) {
        Nb.j.f(h0, "loading");
        ProgressDialog progressDialog0 = ProgressDialog.show(new ContextThemeWrapper(this, 0x1030073), null, null);
        progressDialog0.setContentView(0x7F0D00E1);  // layout:progress_dialog
        progressDialog0.dismiss();
        o0.e(h0, this, new T0(1, progressDialog0));
    }

    public final void D(String s) {
        Nb.j.f(s, "number");
        Intent intent0 = new Intent("android.intent.action.DIAL", Uri.parse(("tel:" + s)));
        try {
            this.startActivity(intent0);
        }
        catch(ActivityNotFoundException unused_ex) {
            Toast.makeText(this, 0x7F12017A, 0).show();  // string:error_no_dialer_installed "You can’t make calls with this device."
        }
    }

    public final LinearLayout E() {
        return (LinearLayout)this.B0.getValue();
    }

    public final Object F(String s, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, CharSequence charSequence3, boolean z, Integer integer0, Object object0, Object object1, g g0) {
        v3 v30;
        if(g0 instanceof v3) {
            v30 = (v3)g0;
            int v = v30.d0;
            if((v & 0x80000000) == 0) {
                v30 = new v3(this, g0);
            }
            else {
                v30.d0 = v ^ 0x80000000;
            }
        }
        else {
            v30 = new v3(this, g0);
        }
        Object object2 = v30.b0;
        Object object3 = a.X;
        switch(v30.d0) {
            case 0: {
                W5.f.b0(object2);
                i.f f0 = new i.f(this);
                c c0 = f0.a;
                c0.d = s;
                c0.f = charSequence0;
                c0.m = z;
                if(integer0 != null) {
                    R1.g g1 = d.a(LayoutInflater.from(c0.a), ((int)integer0), null);
                    g1.t(30, object0);
                    g1.t(20, object1);
                    g1.r(this);
                    c0.s = g1.d;
                }
                v30.d0 = 1;
                object2 = o0.Y(f0, charSequence1, charSequence3, charSequence2, null, v30, 8);
                return object2 == object3 ? object3 : ((k)object2).Y;
            }
            case 1: {
                W5.f.b0(object2);
                return ((k)object2).Y;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Serializable G(String s, String s1, String s2, String s3, String s4, String s5, String s6, int v, Function1 function10, Fb.c c0) {
        EditText editText0;
        w3 w30;
        if(c0 instanceof w3) {
            w30 = (w3)c0;
            int v1 = w30.e0;
            if((v1 & 0x80000000) == 0) {
                w30 = new w3(this, c0);
            }
            else {
                w30.e0 = v1 ^ 0x80000000;
            }
        }
        else {
            w30 = new w3(this, c0);
        }
        Object object0 = w30.c0;
        Serializable serializable0 = a.X;
        switch(w30.e0) {
            case 0: {
                W5.f.b0(object0);
                i.f f0 = new i.f(this);
                f0.a.d = s;
                f0.a.f = s1;
                View view0 = LayoutInflater.from(f0.a.a).inflate(0x7F0D0050, null);  // layout:dialog_generic_input
                View view1 = view0.findViewById(0x7F0A018B);  // id:input
                ((EditText)view1).setText(s3);
                ((EditText)view1).setHint(s2);
                ((EditText)view1).setInputType(v);
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                ((EditText)view1).addTextChangedListener(new x3(w0, function10));
                f0.a.s = view0;
                com.apollographql.apollo.api.a a0 = new com.apollographql.apollo.api.a(w0, ((EditText)view1), function10, s3, 2);
                w30.b0 = (EditText)view1;
                w30.e0 = 1;
                object0 = o0.X(f0, s4, s6, s5, a0, w30);
                if(object0 == serializable0) {
                    return serializable0;
                }
                editText0 = (EditText)view1;
                break;
            }
            case 1: {
                editText0 = w30.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s7 = editText0.getText().toString();
        return new k(((Integer)((k)object0).Y), s7);
    }

    public final Object H(String s, String s1, String s2, String s3, Fb.c c0) {
        x x0;
        y3 y30;
        if(c0 instanceof y3) {
            y30 = (y3)c0;
            int v = y30.e0;
            if((v & 0x80000000) == 0) {
                y30 = new y3(this, c0);
            }
            else {
                y30.e0 = v ^ 0x80000000;
            }
        }
        else {
            y30 = new y3(this, c0);
        }
        Object object0 = y30.c0;
        Object object1 = a.X;
        switch(y30.e0) {
            case 0: {
                W5.f.b0(object0);
                i.f f0 = new i.f(this);
                c c1 = f0.a;
                c1.d = s;
                if(s1 != null) {
                    c1.f = s1;
                }
                x0 = (x)d.a(LayoutInflater.from(c1.a), 0x7F0D004F, null);  // layout:dialog_confirm_pin
                Nb.j.e(x0, "inflate(...)");
                c1.s = x0.d;
                f0.d(s2, null);
                f0.b(s3, null);
                i.g g0 = f0.a();
                Window window0 = g0.getWindow();
                if(window0 != null) {
                    window0.setSoftInputMode(5);
                }
                x0.q.requestFocus();
                y30.b0 = x0;
                y30.e0 = 1;
                kotlin.coroutines.k k0 = new kotlin.coroutines.k(N4.j.w(y30));
                V0 v00 = new V0(k0);
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                F0 f00 = new F0(1, w0);
                g0.setOnDismissListener(new E0(v00, w0, 1));
                g0.show();
                for(Object object2: q.L(new Integer[]{new Integer(-2), new Integer(-3), new Integer(-1)})) {
                    int v1 = ((Number)object2).intValue();
                    Button button0 = g0.j(v1);
                    if(button0 != null) {
                        CharSequence charSequence0 = button0.getText();
                        g0.d0.c(v1, charSequence0, f00);
                    }
                }
                object0 = k0.c();
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                x0 = y30.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ((Integer)object0) != null && ((int)(((Integer)object0))) == -1 ? x0.q.getText().toString() : null;
    }

    @Override  // c2.x
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.A0 = ((CustomerApp)r1.b(this)).x0;
        View view0 = this.D0.Y.getWindow().getDecorView();
        Nb.j.e(view0, "getDecorView(...)");
        view0.getViewTreeObserver().addOnGlobalLayoutListener(this.D0);
        view0.setOnSystemUiVisibilityChangeListener(this.D0);
        if(Build.VERSION.SDK_INT >= 27) {
            y.o(this.getWindow().getDecorView());
        }
        W5.f.c0(this);
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem0) {
        Nb.j.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // c2.x
    public void onResume() {
        super.onResume();
        if(this.A0) {
            hd.c.a.n("LockManager");
            boolean z = C1.a();
            hd.c.a.a("Activity considering whether to show PIN screen... " + !z, new Object[0]);
            boolean z1 = new v2(this).b();
            if(!C1.a() && !C1.c0 && z1 && r1.b(this).d().h() != null) {
                Intent intent0 = new Intent(this, LockScreenActivity.class);
                intent0.putExtra("next_intent", this.getIntent());
                this.startActivity(intent0);
                this.finish();
            }
        }
    }

    @Override  // i.j
    public final void setContentView(int v) {
        if(!this.z0) {
            super.setContentView(v);
            return;
        }
        View view0 = this.getLayoutInflater().inflate(v, null, false);
        this.E().addView(view0, ((LinearLayout.LayoutParams)this.C0.getValue()));
        super.setContentView(this.E());
    }

    @Override  // i.j
    public final void setContentView(View view0) {
        if(!this.z0) {
            super.setContentView(view0);
            return;
        }
        this.E().addView(view0, ((LinearLayout.LayoutParams)this.C0.getValue()));
        super.setContentView(this.E());
    }

    @Override  // i.j
    public final void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(!this.z0) {
            super.setContentView(view0, viewGroup$LayoutParams0);
            return;
        }
        this.E().addView(view0, viewGroup$LayoutParams0);
        super.setContentView(this.E());
    }
}

