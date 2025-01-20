package r;

import java.util.Arrays;

public final class e {
    public final int a;
    public final CharSequence b;

    public e(int v, CharSequence charSequence0) {
        this.a = v;
        this.b = charSequence0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof e && this.a == ((e)object0).a) {
            String s = null;
            String s1 = this.b == null ? null : this.b.toString();
            CharSequence charSequence0 = ((e)object0).b;
            if(charSequence0 != null) {
                s = charSequence0.toString();
            }
            return s1 == null && s == null || s1 != null && s1.equals(s);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = (int)this.a;
        return this.b == null ? Arrays.hashCode(new Object[]{integer0, null}) : Arrays.hashCode(new Object[]{integer0, this.b.toString()});
    }
}

