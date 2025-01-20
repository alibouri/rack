package Q4;

import Bb.q;
import M4.l;
import Nb.j;
import R4.c;
import R4.g;
import a5.m;
import a5.p;
import android.os.Handler;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
    public final WeakReference X;
    public ArrayList Y;
    public final HashSet Z;
    public final String b0;

    public f(View view0, Handler handler0, HashSet hashSet0, String s) {
        j.f(handler0, "handler");
        j.f(hashSet0, "listenerSet");
        super();
        this.X = new WeakReference(view0);
        this.Z = hashSet0;
        this.b0 = s;
        handler0.postDelayed(this, 200L);
    }

    public final void a(e e0, View view0, c c0) {
        boolean z;
        View view1 = e0.a();
        if(view1 == null) {
            return;
        }
        View.OnClickListener view$OnClickListener0 = g.e(view1);
        if(view$OnClickListener0 instanceof a) {
            if(view$OnClickListener0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
            }
            z = ((a)view$OnClickListener0).c0;
        }
        else {
            z = false;
        }
        HashSet hashSet0 = this.Z;
        String s = e0.b;
        if(!hashSet0.contains(s) && !z) {
            Class class0 = Q4.c.class;
            View.OnClickListener view$OnClickListener1 = null;
            if(!f5.a.b(class0)) {
                try {
                    a a0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
                    a0.X = c0;
                    a0.Y = new WeakReference(view1);
                    a0.Z = new WeakReference(view0);
                    a0.b0 = g.e(view1);
                    a0.c0 = true;
                    view$OnClickListener1 = a0;
                }
                catch(Throwable throwable0) {
                    f5.a.a(throwable0, class0);
                }
            }
            view1.setOnClickListener(view$OnClickListener1);
            hashSet0.add(s);
        }
    }

    public final void b(e e0, View view0, c c0) {
        boolean z;
        AdapterView adapterView0 = (AdapterView)e0.a();
        if(adapterView0 == null) {
            return;
        }
        AdapterView.OnItemClickListener adapterView$OnItemClickListener0 = adapterView0.getOnItemClickListener();
        if(adapterView$OnItemClickListener0 instanceof b) {
            if(adapterView$OnItemClickListener0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
            }
            z = ((b)adapterView$OnItemClickListener0).c0;
        }
        else {
            z = false;
        }
        HashSet hashSet0 = this.Z;
        String s = e0.b;
        if(!hashSet0.contains(s) && !z) {
            Class class0 = Q4.c.class;
            AdapterView.OnItemClickListener adapterView$OnItemClickListener1 = null;
            if(!f5.a.b(class0)) {
                try {
                    b b0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
                    b0.X = c0;
                    b0.Y = new WeakReference(adapterView0);
                    b0.Z = new WeakReference(view0);
                    b0.b0 = adapterView0.getOnItemClickListener();
                    b0.c0 = true;
                    adapterView$OnItemClickListener1 = b0;
                }
                catch(Throwable throwable0) {
                    f5.a.a(throwable0, class0);
                }
            }
            adapterView0.setOnItemClickListener(adapterView$OnItemClickListener1);
            hashSet0.add(s);
        }
    }

    public final void c(e e0, View view0, c c0) {
        boolean z;
        View view1 = e0.a();
        if(view1 == null) {
            return;
        }
        View.OnTouchListener view$OnTouchListener0 = g.f(view1);
        if(view$OnTouchListener0 instanceof h) {
            if(view$OnTouchListener0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
            }
            z = ((h)view$OnTouchListener0).c0;
        }
        else {
            z = false;
        }
        HashSet hashSet0 = this.Z;
        String s = e0.b;
        if(!hashSet0.contains(s) && !z) {
            Class class0 = i.class;
            View.OnTouchListener view$OnTouchListener1 = null;
            if(!f5.a.b(class0)) {
                try {
                    view$OnTouchListener1 = new h(c0, view0, view1);
                }
                catch(Throwable throwable0) {
                    f5.a.a(throwable0, class0);
                }
            }
            view1.setOnTouchListener(view$OnTouchListener1);
            hashSet0.add(s);
        }
    }

    public final void d() {
        boolean z;
        ArrayList arrayList0 = this.Y;
        if(arrayList0 != null) {
            WeakReference weakReference0 = this.X;
            if(weakReference0.get() != null) {
                int v = arrayList0.size();
                if(v - 1 >= 0) {
                    int v1 = 0;
                    while(true) {
                        c c0 = (c)arrayList0.get(v1);
                        View view0 = (View)weakReference0.get();
                        if(c0 == null || view0 == null) {
                        label_54:
                            if(v1 + 1 <= v - 1) {
                                goto label_55;
                            }
                            break;
                        }
                        else {
                            String s = this.b0;
                            if(c0.d.length() != 0 && !c0.d.equals(s)) {
                                goto label_54;
                            }
                            else {
                                List list0 = Collections.unmodifiableList(c0.b);
                                j.e(list0, "unmodifiableList(path)");
                                if(list0.size() <= 25) {
                                    Iterator iterator0 = q.n(view0, list0, 0, -1, s).iterator();
                                    while(true) {
                                        if(!iterator0.hasNext()) {
                                            goto label_54;
                                        }
                                        Object object0 = iterator0.next();
                                        e e0 = (e)object0;
                                        try {
                                            View view1 = e0.a();
                                            if(view1 == null) {
                                                continue;
                                            }
                                            View view2 = null;
                                            Class class0 = g.class;
                                            if(!f5.a.b(class0)) {
                                                for(View view3 = view1; view3 != null; view3 = (View)viewParent0) {
                                                    try {
                                                        g g0 = g.a;
                                                        if(f5.a.b(g0)) {
                                                            z = false;
                                                        }
                                                        else {
                                                            try {
                                                                z = view3.getClass().getName().equals("com.facebook.react.ReactRootView");
                                                            }
                                                            catch(Throwable throwable1) {
                                                                f5.a.a(throwable1, g0);
                                                                z = false;
                                                            }
                                                        }
                                                        if(z) {
                                                            view2 = view3;
                                                            break;
                                                        }
                                                        ViewParent viewParent0 = view3.getParent();
                                                        if(!(viewParent0 instanceof View)) {
                                                            break;
                                                        }
                                                    }
                                                    catch(Throwable throwable0) {
                                                        f5.a.a(throwable0, class0);
                                                        break;
                                                    }
                                                }
                                            }
                                            if(view2 != null && g.a.l(view1, view2)) {
                                                this.c(e0, view0, c0);
                                            }
                                            else if(!Vb.q.O(view1.getClass().getName(), "com.facebook.react", false)) {
                                                if(view1 instanceof AdapterView) {
                                                    if(!(view1 instanceof ListView)) {
                                                        continue;
                                                    }
                                                    this.b(e0, view0, c0);
                                                }
                                                else {
                                                    this.a(e0, view0, c0);
                                                }
                                            }
                                        }
                                        catch(Exception unused_ex) {
                                            f5.a.b(Q4.g.class);
                                        }
                                    }
                                }
                                else {
                                    goto label_54;
                                }
                            }
                        }
                    label_55:
                        ++v1;
                    }
                }
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.d();
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.d();
    }

    @Override
    public final void run() {
        if(f5.a.b(this)) {
            return;
        }
        try {
            m m0 = p.b(l.b());
            if(m0 != null && m0.f) {
                JSONArray jSONArray0 = m0.g;
                ArrayList arrayList0 = new ArrayList();
                if(jSONArray0 != null) {
                    try {
                        int v = jSONArray0.length();
                        if(v > 0) {
                            for(int v1 = 0; true; ++v1) {
                                JSONObject jSONObject0 = jSONArray0.getJSONObject(v1);
                                j.e(jSONObject0, "array.getJSONObject(i)");
                                arrayList0.add(N4.h.s(jSONObject0));
                                if(v1 + 1 >= v) {
                                    break;
                                }
                            }
                        }
                    }
                    catch(JSONException | IllegalArgumentException unused_ex) {
                    }
                }
                this.Y = arrayList0;
                View view0 = (View)this.X.get();
                if(view0 == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
                if(viewTreeObserver0.isAlive()) {
                    viewTreeObserver0.addOnGlobalLayoutListener(this);
                    viewTreeObserver0.addOnScrollChangedListener(this);
                }
                this.d();
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        f5.a.a(throwable0, this);
    }
}

