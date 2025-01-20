package O4;

import Bb.q;
import Nb.j;
import R4.g;
import android.content.res.Resources.NotFoundException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import f5.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {
    public static final b a;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static final ArrayList a(View view0) {
        Class class0 = b.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            j.f(view0, "view");
            ArrayList arrayList0 = new ArrayList();
            ViewGroup viewGroup0 = g.h(view0);
            if(viewGroup0 != null) {
                for(Object object0: g.a(viewGroup0)) {
                    View view1 = (View)object0;
                    if(view0 != view1) {
                        arrayList0.addAll(b.a.c(view1));
                    }
                }
            }
            return arrayList0;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return null;
        }
    }

    public static final ArrayList b(View view0) {
        List list0;
        Class class0 = b.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            j.f(view0, "view");
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(g.g(view0));
            Object object0 = view0.getTag();
            if(object0 != null) {
                arrayList0.add(object0.toString());
            }
            CharSequence charSequence0 = view0.getContentDescription();
            if(charSequence0 != null) {
                arrayList0.add(charSequence0.toString());
            }
            try {
                if(view0.getId() != -1) {
                    String s = view0.getResources().getResourceName(view0.getId());
                    j.e(s, "resourceName");
                    Pattern pattern0 = Pattern.compile("/");
                    j.e(pattern0, "compile(...)");
                    Vb.j.m0(0);
                    Matcher matcher0 = pattern0.matcher(s);
                    if(matcher0.find()) {
                        ArrayList arrayList1 = new ArrayList(10);
                        int v = 0;
                        do {
                            arrayList1.add(s.subSequence(v, matcher0.start()).toString());
                            v = matcher0.end();
                        }
                        while(matcher0.find());
                        arrayList1.add(s.subSequence(v, s.length()).toString());
                        list0 = arrayList1;
                    }
                    else {
                        list0 = q.K(s.toString());
                    }
                    Object[] arr_object = list0.toArray(new String[0]);
                    if(arr_object == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    if(((String[])arr_object).length == 2) {
                        arrayList0.add(((String[])arr_object)[1]);
                    }
                }
            }
            catch(Resources.NotFoundException unused_ex) {
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object1: arrayList0) {
                String s1 = (String)object1;
                if(s1.length() > 0 && s1.length() <= 100) {
                    String s2 = s1.toLowerCase();
                    j.e(s2, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(s2);
                }
            }
            return arrayList2;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
        return null;
    }

    public final ArrayList c(View view0) {
        if(a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            if(view0 instanceof EditText) {
                return arrayList0;
            }
            if(view0 instanceof TextView) {
                String s = ((TextView)view0).getText().toString();
                if(s.length() > 0 && s.length() < 100) {
                    String s1 = s.toLowerCase();
                    j.e(s1, "(this as java.lang.String).toLowerCase()");
                    arrayList0.add(s1);
                    return arrayList0;
                }
                return arrayList0;
            }
            for(Object object0: g.a(view0)) {
                arrayList0.addAll(this.c(((View)object0)));
            }
            return arrayList0;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }

    public static final boolean d(ArrayList arrayList0, ArrayList arrayList1) {
        Class class0 = b.class;
        if(a.b(class0)) {
            return false;
        }
        try {
            j.f(arrayList0, "indicators");
            j.f(arrayList1, "keys");
            Iterator iterator0 = arrayList0.iterator();
        alab1:
            while(true) {
                if(!iterator0.hasNext()) {
                    return false;
                }
                Object object0 = iterator0.next();
                String s = (String)object0;
                b b0 = b.a;
                if(!a.b(b0)) {
                    try {
                        Iterator iterator1 = arrayList1.iterator();
                        do {
                            if(!iterator1.hasNext()) {
                                continue alab1;
                            }
                            Object object1 = iterator1.next();
                        }
                        while(!Vb.j.R(s, ((String)object1), false));
                        break;
                    }
                    catch(Throwable throwable1) {
                        a.a(throwable1, b0);
                    }
                }
            }
            return true;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return false;
        }
    }
}

