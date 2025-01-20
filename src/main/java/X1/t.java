package X1;

import Bb.F;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class t extends SpannableStringBuilder {
    public final Class X;
    public final ArrayList Y;

    public t(Class class0, t t0, int v, int v1) {
        super(t0, v, v1);
        this.Y = new ArrayList();
        F.n(class0, "watcherClass cannot be null");
        this.X = class0;
    }

    public t(Class class0, CharSequence charSequence0) {
        super(charSequence0);
        this.Y = new ArrayList();
        F.n(class0, "watcherClass cannot be null");
        this.X = class0;
    }

    public final void a() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.Y;
            if(v >= arrayList0.size()) {
                break;
            }
            ((s)arrayList0.get(v)).Y.incrementAndGet();
        }
    }

    @Override  // android.text.SpannableStringBuilder
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final Editable append(CharSequence charSequence0) {
        super.append(charSequence0);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final Editable append(CharSequence charSequence0, int v, int v1) {
        super.append(charSequence0, v, v1);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence0) {
        super.append(charSequence0);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence0, int v, int v1) {
        super.append(charSequence0, v, v1);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence0, Object object0, int v) {
        super.append(charSequence0, object0, v);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final Appendable append(CharSequence charSequence0) {
        super.append(charSequence0);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final Appendable append(CharSequence charSequence0, int v, int v1) {
        super.append(charSequence0, v, v1);
        return this;
    }

    public final void b() {
        this.e();
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.Y;
            if(v >= arrayList0.size()) {
                break;
            }
            ((s)arrayList0.get(v)).onTextChanged(this, 0, this.length(), this.length());
        }
    }

    public final s c(Object object0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.Y;
            if(v >= arrayList0.size()) {
                break;
            }
            s s0 = (s)arrayList0.get(v);
            if(s0.X == object0) {
                return s0;
            }
        }
        return null;
    }

    public final boolean d(Object object0) {
        if(object0 != null) {
            Class class0 = object0.getClass();
            return this.X == class0;
        }
        return false;
    }

    @Override  // android.text.SpannableStringBuilder
    public final Editable delete(int v, int v1) {
        super.delete(v, v1);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final SpannableStringBuilder delete(int v, int v1) {
        super.delete(v, v1);
        return this;
    }

    public final void e() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.Y;
            if(v >= arrayList0.size()) {
                break;
            }
            ((s)arrayList0.get(v)).Y.decrementAndGet();
        }
    }

    @Override  // android.text.SpannableStringBuilder
    public final int getSpanEnd(Object object0) {
        if(this.d(object0)) {
            s s0 = this.c(object0);
            if(s0 != null) {
                object0 = s0;
            }
        }
        return super.getSpanEnd(object0);
    }

    @Override  // android.text.SpannableStringBuilder
    public final int getSpanFlags(Object object0) {
        if(this.d(object0)) {
            s s0 = this.c(object0);
            if(s0 != null) {
                object0 = s0;
            }
        }
        return super.getSpanFlags(object0);
    }

    @Override  // android.text.SpannableStringBuilder
    public final int getSpanStart(Object object0) {
        if(this.d(object0)) {
            s s0 = this.c(object0);
            if(s0 != null) {
                object0 = s0;
            }
        }
        return super.getSpanStart(object0);
    }

    @Override  // android.text.SpannableStringBuilder
    public final Object[] getSpans(int v, int v1, Class class0) {
        if(this.X == class0) {
            s[] arr_s = (s[])super.getSpans(v, v1, s.class);
            Object[] arr_object = (Object[])Array.newInstance(class0, arr_s.length);
            for(int v2 = 0; v2 < arr_s.length; ++v2) {
                arr_object[v2] = arr_s[v2].X;
            }
            return arr_object;
        }
        return super.getSpans(v, v1, class0);
    }

    @Override  // android.text.SpannableStringBuilder
    public final Editable insert(int v, CharSequence charSequence0) {
        super.insert(v, charSequence0);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final Editable insert(int v, CharSequence charSequence0, int v1, int v2) {
        super.insert(v, charSequence0, v1, v2);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final SpannableStringBuilder insert(int v, CharSequence charSequence0) {
        super.insert(v, charSequence0);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final SpannableStringBuilder insert(int v, CharSequence charSequence0, int v1, int v2) {
        super.insert(v, charSequence0, v1, v2);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final int nextSpanTransition(int v, int v1, Class class0) {
        if(class0 == null || this.X == class0) {
            class0 = s.class;
        }
        return super.nextSpanTransition(v, v1, class0);
    }

    @Override  // android.text.SpannableStringBuilder
    public final void removeSpan(Object object0) {
        s s0;
        if(this.d(object0)) {
            s0 = this.c(object0);
            if(s0 != null) {
                object0 = s0;
            }
        }
        else {
            s0 = null;
        }
        super.removeSpan(object0);
        if(s0 != null) {
            this.Y.remove(s0);
        }
    }

    @Override  // android.text.SpannableStringBuilder
    public final Editable replace(int v, int v1, CharSequence charSequence0) {
        this.replace(v, v1, charSequence0);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final Editable replace(int v, int v1, CharSequence charSequence0, int v2, int v3) {
        this.replace(v, v1, charSequence0, v2, v3);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final SpannableStringBuilder replace(int v, int v1, CharSequence charSequence0) {
        this.a();
        super.replace(v, v1, charSequence0);
        this.e();
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final SpannableStringBuilder replace(int v, int v1, CharSequence charSequence0, int v2, int v3) {
        this.a();
        super.replace(v, v1, charSequence0, v2, v3);
        this.e();
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public final void setSpan(Object object0, int v, int v1, int v2) {
        if(this.d(object0)) {
            s s0 = new s(object0);
            this.Y.add(s0);
            object0 = s0;
        }
        super.setSpan(object0, v, v1, v2);
    }

    @Override  // android.text.SpannableStringBuilder
    public final CharSequence subSequence(int v, int v1) {
        return new t(this.X, this, v, v1);
    }
}

