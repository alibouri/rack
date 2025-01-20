package O4;

import Nb.j;
import V4.e;
import Vb.q;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {
    public static final a a;
    public static boolean b;

    static {
        a.a = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static final void a(HashMap hashMap0, String s, String s1) {
        List list0;
        switch(s.hashCode()) {
            case 0xE01: {
                if(s.equals("r3")) {
                    s1 = q.O(s1, "m", false) || q.O(s1, "b", false) || q.O(s1, "ge", false) ? "m" : "f";
                }
                break;
            }
            case 0xE02: {
                if(s.equals("r4")) {
                    goto label_8;
                }
                break;
            }
            case 0xE03: {
                if(s.equals("r5")) {
                label_8:
                    Pattern pattern0 = Pattern.compile("[^a-z]+");
                    j.e(pattern0, "compile(...)");
                    s1 = pattern0.matcher(s1).replaceAll("");
                    j.e(s1, "replaceAll(...)");
                }
                break;
            }
            case 0xE04: {
                if(s.equals("r6") && Vb.j.R(s1, "-", false)) {
                    Pattern pattern1 = Pattern.compile("-");
                    j.e(pattern1, "compile(...)");
                    Vb.j.m0(0);
                    Matcher matcher0 = pattern1.matcher(s1);
                    if(matcher0.find()) {
                        ArrayList arrayList0 = new ArrayList(10);
                        int v = 0;
                        do {
                            arrayList0.add(s1.subSequence(v, matcher0.start()).toString());
                            v = matcher0.end();
                        }
                        while(matcher0.find());
                        arrayList0.add(s1.subSequence(v, s1.length()).toString());
                        list0 = arrayList0;
                    }
                    else {
                        list0 = Bb.q.K(s1.toString());
                    }
                    Object[] arr_object = list0.toArray(new String[0]);
                    if(arr_object == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    s1 = ((String[])arr_object)[0];
                    break;
                }
            }
        }
        hashMap0.put(s, s1);
    }

    public static void b(Activity activity0) {
        j.f(activity0, "activity");
        Class class0 = d.class;
        HashMap hashMap0 = f5.a.b(class0) ? null : d.c0;
        Integer integer0 = activity0.hashCode();
        Object object0 = hashMap0.get(integer0);
        if(object0 == null) {
            object0 = new d(activity0);
            hashMap0.put(integer0, object0);
        }
        d d0 = (d)object0;
        if(f5.a.b(class0)) {
            return;
        }
        else {
            try {
                if(f5.a.b(d0)) {
                    return;
                }
                else {
                    try {
                        if(!d0.b0.getAndSet(true)) {
                            View view0 = e.b(((Activity)d0.Z.get()));
                            if(view0 != null) {
                                ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
                                if(viewTreeObserver0.isAlive()) {
                                    viewTreeObserver0.addOnGlobalFocusChangeListener(d0);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    catch(Throwable throwable1) {
                    }
                }
                f5.a.a(throwable1, d0);
                return;
            }
            catch(Throwable throwable0) {
            }
        }
        f5.a.a(throwable0, class0);
    }
}

