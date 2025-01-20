package O4;

import Bb.F;
import E7.n;
import Vb.j;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.widget.EditText;
import f5.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final LinkedHashSet X;
    public final Handler Y;
    public final WeakReference Z;
    public final AtomicBoolean b0;
    public static final HashMap c0;

    static {
        d.c0 = new HashMap();
    }

    public d(Activity activity0) {
        this.X = new LinkedHashSet();
        this.Y = new Handler(Looper.getMainLooper());
        this.Z = new WeakReference(activity0);
        this.b0 = new AtomicBoolean(false);
    }

    public final void a(View view0) {
        n n0;
        if(a.b(this)) {
            return;
        }
        try {
            n0 = new n(view0, 11, this);
            if(!a.b(this)) {
                goto label_4;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
        return;
        try {
        label_4:
            if(Thread.currentThread() == Looper.getMainLooper().getThread()) {
                n0.run();
                return;
            }
            this.Y.post(n0);
            return;
        }
        catch(Throwable throwable1) {
        }
        try {
            a.a(throwable1, this);
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public final void b(View view0) {
        Class class0;
        boolean z1;
        String s4;
        String s3;
        c c0;
        ArrayList arrayList1;
        HashMap hashMap0;
        if(a.b(this)) {
            return;
        }
        try {
            String s = ((EditText)view0).getText().toString();
            if(s == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            String s1 = j.z0(s).toString();
            if(s1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String s2 = s1.toLowerCase();
            Nb.j.e(s2, "(this as java.lang.String).toLowerCase()");
            if(s2.length() == 0) {
                return;
            }
            LinkedHashSet linkedHashSet0 = this.X;
            if(linkedHashSet0.contains(s2) || s2.length() > 100) {
                return;
            }
            linkedHashSet0.add(s2);
            hashMap0 = new HashMap();
            ArrayList arrayList0 = b.b(view0);
            Iterator iterator0 = new HashSet(c.a()).iterator();
            arrayList1 = null;
            while(true) {
            label_18:
                if(!iterator0.hasNext()) {
                    F.T(hashMap0);
                    return;
                }
                Object object0 = iterator0.next();
                c0 = (c)object0;
                if("r2".equals(c0.c())) {
                    Pattern pattern0 = Pattern.compile("[^\\d.]");
                    Nb.j.e(pattern0, "compile(...)");
                    s3 = pattern0.matcher(s2).replaceAll("");
                    Nb.j.e(s3, "replaceAll(...)");
                }
                else {
                    s3 = s2;
                }
                boolean z = a.b(c0);
                s4 = c0.b;
                String s5 = z ? null : s4;
                if(s5.length() > 0) {
                    if(a.b(c0)) {
                        s4 = null;
                    }
                    z1 = false;
                    class0 = b.class;
                    if(!a.b(class0)) {
                        break;
                    }
                    goto label_49;
                }
                goto label_50;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return;
        }
        try {
            Nb.j.f(s4, "rule");
            Pattern pattern1 = Pattern.compile(s4);
            Nb.j.e(pattern1, "compile(...)");
            z1 = pattern1.matcher(s3).matches();
            goto label_49;
        }
        catch(Throwable throwable1) {
            try {
                a.a(throwable1, class0);
            label_49:
                if(!z1) {
                    goto label_18;
                }
            label_50:
                if(!b.d(arrayList0, c0.b())) {
                    if(arrayList1 == null) {
                        arrayList1 = b.a(view0);
                    }
                    if(!b.d(arrayList1, c0.b())) {
                        goto label_18;
                    }
                    O4.a.a(hashMap0, c0.c(), s3);
                    goto label_18;
                }
                O4.a.a(hashMap0, c0.c(), s3);
                goto label_18;
            }
            catch(Throwable throwable0) {
            }
        }
        a.a(throwable0, this);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view0, View view1) {
        if(a.b(this)) {
            return;
        }
        try {
            if(view0 != null) {
                this.a(view0);
            }
            if(view1 != null) {
                this.a(view1);
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }
}

