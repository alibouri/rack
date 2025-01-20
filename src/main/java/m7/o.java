package m7;

import E7.C;
import J1.p0;
import a8.Q;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import androidx.activity.result.ActivityResult;
import androidx.core.view.WindowInsetsCompat;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import f.a;
import hb.j;
import hb.n;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import n7.k;
import o0.i;
import o6.d;
import v.y;
import y5.f;
import z1.b;

public final class o implements J1.o, a, j, e, i, d, y, f {
    public final int X;

    public o(int v) {
        this.X = v;
        super();
    }

    @Override  // hb.j
    public String a(String s) {
        Nb.j.f(s, "it");
        return s;
    }

    @Override  // y5.f
    public Object apply(Object object0) {
        byte[] arr_b;
        try(Cursor cursor0 = ((SQLiteDatabase)object0).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0])) {
            Object object1 = new ArrayList();
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                Q q0 = r5.i.a();
                q0.O(cursor0.getString(1));
                q0.b0 = B5.a.b(cursor0.getInt(2));
                String s = cursor0.getString(3);
                arr_b = s == null ? null : Base64.decode(s, 0);
                q0.Z = arr_b;
                ((ArrayList)object1).add(q0.f());
            }
        }
        return object1;
    }

    @Override  // f.a
    public void b(Object object0) {
        if(this.X != 13) {
            Nb.j.f(((ActivityResult)object0), "it");
            return;
        }
        Nb.j.f(((ActivityResult)object0), "it");
    }

    @Override  // v.y
    public float c(float f) {
        return f;
    }

    @Override  // m7.e
    public Object d(C c0) {
        switch(this.X) {
            case 1: {
                return (ScheduledExecutorService)ExecutorsRegistrar.a.get();
            }
            case 2: {
                return (ScheduledExecutorService)ExecutorsRegistrar.c.get();
            }
            case 3: {
                return (ScheduledExecutorService)ExecutorsRegistrar.b.get();
            }
            case 4: {
                return k.X;
            }
            case 8: {
                return TransportRegistrar.lambda$getComponents$0(c0);
            }
            case 9: {
                return TransportRegistrar.lambda$getComponents$1(c0);
            }
            case 10: {
                return TransportRegistrar.lambda$getComponents$2(c0);
            }
            default: {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c0);
            }
        }
    }

    @Override  // o0.i
    public double e(double f) {
        switch(this.X) {
            case 5: {
                double f1 = f < 0.0 ? -f : f;
                return f1 >= 0.003131 ? Math.copySign((Math.pow(f1, 0.416667) - 0.052133) / 0.947867, f) : Math.copySign(f1 / 0.077399, f);
            }
            case 6: {
                double f2 = f < 0.0 ? -f : f;
                return f2 >= 0.04045 ? Math.copySign(Math.pow(0.947867 * f2 + 0.052133, 2.4), f) : Math.copySign(f2 * 0.077399, f);
            }
            default: {
                return f;
            }
        }
    }

    @Override  // J1.o
    public WindowInsetsCompat l(View view0, WindowInsetsCompat windowInsetsCompat0) {
        switch(this.X) {
            case 11: {
                Nb.j.f(view0, "view");
                b b1 = windowInsetsCompat0.a.f(7);
                Nb.j.e(b1, "getInsets(...)");
                ViewGroup.LayoutParams viewGroup$LayoutParams1 = view0.getLayoutParams();
                if(viewGroup$LayoutParams1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams1).leftMargin = b1.a;
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams1).topMargin = b1.b;
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams1).rightMargin = b1.c;
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams1).bottomMargin = b1.d;
                view0.setLayoutParams(((FrameLayout.LayoutParams)viewGroup$LayoutParams1));
                return windowInsetsCompat0;
            }
            case 12: {
                Nb.j.f(view0, "view");
                b b2 = windowInsetsCompat0.a.f(7);
                Nb.j.e(b2, "getInsets(...)");
                ViewGroup.LayoutParams viewGroup$LayoutParams2 = view0.getLayoutParams();
                if(viewGroup$LayoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams2).leftMargin = b2.a;
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams2).topMargin = b2.b;
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams2).rightMargin = b2.c;
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams2).bottomMargin = b2.d;
                view0.setLayoutParams(((FrameLayout.LayoutParams)viewGroup$LayoutParams2));
                return windowInsetsCompat0;
            }
            case 15: {
                Nb.j.f(view0, "view");
                b b3 = windowInsetsCompat0.a.f(7);
                Nb.j.e(b3, "getInsets(...)");
                ViewGroup.LayoutParams viewGroup$LayoutParams3 = view0.getLayoutParams();
                if(viewGroup$LayoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams3).leftMargin = b3.a;
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams3).topMargin = b3.b;
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams3).rightMargin = b3.c;
                ((FrameLayout.LayoutParams)viewGroup$LayoutParams3).bottomMargin = b3.d;
                view0.setLayoutParams(((FrameLayout.LayoutParams)viewGroup$LayoutParams3));
                return windowInsetsCompat0;
            }
            default: {
                Nb.j.f(view0, "view");
                p0 p00 = windowInsetsCompat0.a;
                b b0 = p00.f(1);
                Nb.j.e(b0, "getInsets(...)");
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                if(viewGroup$LayoutParams0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                ((LinearLayout.LayoutParams)viewGroup$LayoutParams0).topMargin = b0.b;
                view0.setLayoutParams(((LinearLayout.LayoutParams)viewGroup$LayoutParams0));
                return p00.m(0, b0.b, 0, 0);
            }
        }
    }

    @Override  // o6.d
    public void u(Exception exception0) {
        if(!(exception0 instanceof K5.d) && !(exception0 instanceof K5.e)) {
            n.b(exception0, null, null, 14);
        }
    }
}

