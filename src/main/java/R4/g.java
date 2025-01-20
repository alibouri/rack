package R4;

import J1.l;
import Nb.j;
import a5.w;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import f5.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {
    public static final g a;
    public static WeakReference b;
    public static Method c;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
        g.b = new WeakReference(null);
    }

    public static final ArrayList a(View view0) {
        Class class0 = g.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            if(view0 instanceof ViewGroup) {
                int v = ((ViewGroup)view0).getChildCount();
                if(v > 0) {
                    for(int v1 = 0; true; ++v1) {
                        arrayList0.add(((ViewGroup)view0).getChildAt(v1));
                        if(v1 + 1 >= v) {
                            break;
                        }
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

    public static final int b(View view0) {
        Class class2;
        Class class1;
        g g0;
        int v;
        Class class0 = g.class;
        if(a.b(class0)) {
            return 0;
        }
        try {
            j.f(view0, "view");
            v = view0 instanceof ImageView ? 2 : 0;
            if(view0.isClickable()) {
                v |= 0x20;
            }
            boolean z = a.b(class0);
            g0 = g.a;
            if(!z) {
                goto label_10;
            }
            goto label_31;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return 0;
        }
        try {
        label_10:
            class1 = null;
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof AdapterView) {
                v |= 0x200;
            }
            else {
                if(a.b(g0)) {
                    goto label_18;
                }
                else {
                    class2 = Class.forName("android.support.v4.view.NestedScrollingChild");
                }
                goto label_19;
            }
            goto label_31;
        }
        catch(Throwable throwable1) {
            goto label_30;
        }
        try {
            class2 = Class.forName("android.support.v4.view.NestedScrollingChild");
            goto label_19;
        }
        catch(ClassNotFoundException unused_ex) {
            goto label_18;
        }
        catch(Throwable throwable2) {
        }
        try {
            a.a(throwable2, g0);
        label_18:
            class2 = null;
        label_19:
            if(class2 == null || !class2.isInstance(viewParent0)) {
                if(!a.b(g0)) {
                    class1 = l.class;
                }
                if(class1 != null && class1.isInstance(viewParent0)) {
                    v |= 0x200;
                }
            }
            else {
                v |= 0x200;
            }
            goto label_31;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_30:
            a.a(throwable1, class0);
        label_31:
            if(view0 instanceof TextView) {
                if(view0 instanceof Button) {
                    if(!(view0 instanceof Switch)) {
                        if(view0 instanceof CheckBox) {
                            v |= 0x8405;
                            return view0 instanceof EditText ? v | 0x800 : v;
                        }
                        v |= 0x405;
                        return view0 instanceof EditText ? v | 0x800 : v;
                    }
                    v |= 0x2405;
                    return view0 instanceof EditText ? v | 0x800 : v;
                }
                v |= 0x401;
                return view0 instanceof EditText ? v | 0x800 : v;
            }
            if(view0 instanceof Spinner || view0 instanceof DatePicker) {
                return v | 0x1000;
            }
            if(view0 instanceof RatingBar) {
                return v | 0x10000;
            }
            if(view0 instanceof RadioGroup) {
                return v | 0x4000;
            }
            return !(view0 instanceof ViewGroup) || !g0.l(view0, ((View)g.b.get())) ? v : v | 0x40;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
        return 0;
    }

    public static final JSONObject c(View view0) {
        Class class0 = g.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            j.f(view0, "view");
            if(view0.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                g.b = new WeakReference(view0);
            }
            JSONObject jSONObject0 = new JSONObject();
            try {
                g.m(view0, jSONObject0);
                JSONArray jSONArray0 = new JSONArray();
                ArrayList arrayList0 = g.a(view0);
                int v = arrayList0.size();
                if(v - 1 >= 0) {
                    for(int v1 = 0; true; ++v1) {
                        jSONArray0.put(g.c(((View)arrayList0.get(v1))));
                        if(v1 + 1 > v - 1) {
                            break;
                        }
                    }
                }
                jSONObject0.put("childviews", jSONArray0);
                return jSONObject0;
            }
            catch(JSONException jSONException0) {
            }
            Log.e("R4.g", "Failed to create JSONObject for view.", jSONException0);
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
        return null;
    }

    public final JSONObject d(View view0) {
        if(a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("top", view0.getTop());
                jSONObject0.put("left", view0.getLeft());
                jSONObject0.put("width", view0.getWidth());
                jSONObject0.put("height", view0.getHeight());
                jSONObject0.put("scrollx", view0.getScrollX());
                jSONObject0.put("scrolly", view0.getScrollY());
                jSONObject0.put("visibility", view0.getVisibility());
            }
            catch(JSONException jSONException0) {
                Log.e("R4.g", "Failed to create JSONObject for dimension.", jSONException0);
            }
            return jSONObject0;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public static final View.OnClickListener e(View view0) {
        Class class0 = g.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            Field field0 = View.class.getDeclaredField("mListenerInfo");
            if(field0 != null) {
                field0.setAccessible(true);
            }
            Object object0 = field0.get(view0);
            if(object0 == null) {
                return null;
            }
            Field field1 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            if(field1 != null) {
                field1.setAccessible(true);
                Object object1 = field1.get(object0);
                if(object1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
                }
                return (View.OnClickListener)object1;
            }
            return null;
        }
        catch(NoSuchFieldException | ClassNotFoundException | IllegalAccessException unused_ex) {
            return null;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, class0);
        return null;
    }

    public static final View.OnTouchListener f(View view0) {
        Class class0 = g.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            Field field0 = View.class.getDeclaredField("mListenerInfo");
            if(field0 != null) {
                field0.setAccessible(true);
            }
            Object object0 = field0.get(view0);
            if(object0 == null) {
                return null;
            }
            Field field1 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            if(field1 != null) {
                field1.setAccessible(true);
                Object object1 = field1.get(object0);
                if(object1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                }
                return (View.OnTouchListener)object1;
            }
            return null;
        }
        catch(NoSuchFieldException | ClassNotFoundException | IllegalAccessException unused_ex) {
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return null;
        }
        return null;
    }

    public static final String g(View view0) {
        CharSequence charSequence0;
        Class class0 = g.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            if(view0 instanceof EditText) {
                charSequence0 = ((EditText)view0).getHint();
            }
            else if(view0 instanceof TextView) {
                charSequence0 = ((TextView)view0).getHint();
            }
            else {
                charSequence0 = null;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return null;
        }
        if(charSequence0 != null) {
            String s = charSequence0.toString();
            return s == null ? "" : s;
        }
        return "";
    }

    public static final ViewGroup h(View view0) {
        Class class0 = g.class;
        if(a.b(class0)) {
            return null;
        }
        if(view0 == null) {
            return null;
        }
        try {
            ViewParent viewParent0 = view0.getParent();
            return viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return null;
        }
    }

    public static final String i(View view0) {
        CharSequence charSequence0;
        View view1;
        int v = 0;
        Class class0 = g.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            if(view0 instanceof TextView) {
                charSequence0 = ((TextView)view0).getText();
                if(view0 instanceof Switch) {
                    charSequence0 = ((Switch)view0).isChecked() ? "1" : "0";
                }
            }
            else if(view0 instanceof Spinner) {
                if(((Spinner)view0).getCount() > 0) {
                    Object object0 = ((Spinner)view0).getSelectedItem();
                    charSequence0 = object0 == null ? null : object0.toString();
                }
                else {
                    charSequence0 = null;
                }
            }
            else if(view0 instanceof DatePicker) {
                charSequence0 = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{((DatePicker)view0).getYear(), ((DatePicker)view0).getMonth(), ((DatePicker)view0).getDayOfMonth()}, 3));
            }
            else if(view0 instanceof TimePicker) {
                Integer integer0 = ((TimePicker)view0).getCurrentHour();
                j.e(integer0, "view.currentHour");
                int v3 = integer0.intValue();
                Integer integer1 = ((TimePicker)view0).getCurrentMinute();
                j.e(integer1, "view.currentMinute");
                charSequence0 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{v3, integer1.intValue()}, 2));
            }
            else if(view0 instanceof RadioGroup) {
                int v1 = ((RadioGroup)view0).getCheckedRadioButtonId();
                int v2 = ((RadioGroup)view0).getChildCount();
                if(v2 > 0) {
                    while(true) {
                        view1 = ((RadioGroup)view0).getChildAt(v);
                        if(view1.getId() == v1 && view1 instanceof RadioButton) {
                            break;
                        }
                        if(v + 1 >= v2) {
                            goto label_19;
                        }
                        ++v;
                    }
                    charSequence0 = ((RadioButton)view1).getText();
                    goto label_47;
                }
            label_19:
                charSequence0 = null;
            }
            else if(view0 instanceof RatingBar) {
                charSequence0 = String.valueOf(((RatingBar)view0).getRating());
            }
            else {
                charSequence0 = null;
            }
        label_47:
            if(charSequence0 == null) {
                return "";
            }
            String s = charSequence0.toString();
            return s == null ? "" : s;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
            return null;
        }
    }

    public final View j(View view0, float[] arr_f) {
        if(a.b(this)) {
            return null;
        }
        try {
            this.k();
            Method method0 = g.c;
            if(method0 != null && view0 != null) {
                try {
                    Object object0 = method0.invoke(null, arr_f, view0);
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    if(((View)object0).getId() > 0) {
                        ViewParent viewParent0 = ((View)object0).getParent();
                        if(viewParent0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        return (View)viewParent0;
                    }
                    return null;
                }
                catch(IllegalAccessException | InvocationTargetException unused_ex) {
                }
            }
            return null;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }

    public final void k() {
        if(a.b(this)) {
            return;
        }
        if(g.c != null) {
            return;
        }
        try {
            Method method0 = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
            g.c = method0;
            if(method0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            method0.setAccessible(true);
        }
        catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    public final boolean l(View view0, View view1) {
        if(a.b(this)) {
            return false;
        }
        try {
            float[] arr_f = null;
            j.f(view0, "view");
            if(!view0.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            if(!a.b(this)) {
                try {
                    int[] arr_v = new int[2];
                    view0.getLocationOnScreen(arr_v);
                    arr_f = new float[]{((float)arr_v[0]), ((float)arr_v[1])};
                }
                catch(Throwable throwable1) {
                    a.a(throwable1, this);
                }
            }
            View view2 = this.j(view1, arr_f);
            if(view2 != null && view2.getId() == view0.getId()) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
        return false;
    }

    public static final void m(View view0, JSONObject jSONObject0) {
        Class class0 = g.class;
        if(a.b(class0)) {
            return;
        }
        try {
            j.f(view0, "view");
            try {
                String s = g.i(view0);
                String s1 = g.g(view0);
                Object object0 = view0.getTag();
                CharSequence charSequence0 = view0.getContentDescription();
                jSONObject0.put("classname", view0.getClass().getCanonicalName());
                jSONObject0.put("classtypebitmask", g.b(view0));
                jSONObject0.put("id", view0.getId());
                if(f.b(view0)) {
                    jSONObject0.put("text", "");
                    jSONObject0.put("is_user_input", true);
                }
                else {
                    jSONObject0.put("text", w.q(w.j0(s)));
                }
                jSONObject0.put("hint", w.q(w.j0(s1)));
                if(object0 != null) {
                    jSONObject0.put("tag", w.q(w.j0(object0.toString())));
                }
                if(charSequence0 != null) {
                    jSONObject0.put("description", w.q(w.j0(charSequence0.toString())));
                }
                jSONObject0.put("dimension", g.a.d(view0));
            }
            catch(JSONException unused_ex) {
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
        }
    }
}

