package Z4;

import Bb.q;
import Nb.j;
import R4.g;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import f5.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    public static final c a;
    public static final List b;

    static {
        c.a = new c();  // initializer: Ljava/lang/Object;-><init>()V
        c.b = q.L(new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});
    }

    public static final ArrayList a(View view0) {
        Class class0 = c.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            j.f(view0, "view");
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: c.b) {
                if(((Class)object0).isInstance(view0)) {
                    return arrayList0;
                }
                if(false) {
                    break;
                }
            }
            if(view0.isClickable()) {
                arrayList0.add(view0);
            }
            for(Object object1: g.a(view0)) {
                arrayList0.addAll(c.a(((View)object1)));
            }
            return arrayList0;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
        return null;
    }

    public static final JSONObject b(View view0, View view1) {
        JSONObject jSONObject0;
        Class class0 = c.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            j.f(view0, "view");
            jSONObject0 = new JSONObject();
            if(view0 == view1) {
                try {
                    jSONObject0.put("is_interacted", true);
                label_7:
                    c.e(view0, jSONObject0);
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object0: g.a(view0)) {
                        jSONArray0.put(c.b(((View)object0), view1));
                    }
                    jSONObject0.put("childviews", jSONArray0);
                    return jSONObject0;
                }
                catch(JSONException unused_ex) {
                }
                return jSONObject0;
            }
            goto label_7;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return null;
        }
    }

    public final ArrayList c(View view0) {
        if(a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: g.a(view0)) {
                String s = g.i(((View)object0));
                if(s.length() > 0) {
                    arrayList0.add(s);
                }
                arrayList0.addAll(this.c(((View)object0)));
            }
            return arrayList0;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }

    public static final String d(View view0) {
        Class class0 = c.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            j.f(view0, "hostView");
            String s = g.i(view0);
            if(s.length() > 0) {
                return s;
            }
            String s1 = TextUtils.join(" ", c.a.c(view0));
            j.e(s1, "join(\" \", childrenText)");
            return s1;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return null;
        }
    }

    public static final void e(View view0, JSONObject jSONObject0) {
        Class class0 = c.class;
        if(a.b(class0)) {
            return;
        }
        try {
            j.f(view0, "view");
            try {
                String s = g.i(view0);
                String s1 = g.g(view0);
                jSONObject0.put("classname", view0.getClass().getSimpleName());
                jSONObject0.put("classtypebitmask", g.b(view0));
                if(s.length() > 0) {
                    jSONObject0.put("text", s);
                }
                if(s1.length() > 0) {
                    jSONObject0.put("hint", s1);
                }
                if(view0 instanceof EditText) {
                    jSONObject0.put("inputtype", ((EditText)view0).getInputType());
                }
            }
            catch(JSONException unused_ex) {
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
    }
}

