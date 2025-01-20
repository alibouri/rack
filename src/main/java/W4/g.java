package W4;

import Bb.q;
import M4.l;
import Nb.j;
import android.text.TextUtils;
import f5.a;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g {
    public static final g a;

    static {
        g.a = new g();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static final int a(int[] arr_v) {
        if(arr_v.length == 0) {
            throw new UnsupportedOperationException("Empty array can\'t be reduced.");
        }
        int v = arr_v[0];
        int v2 = arr_v.length - 1;
        if(1 <= v2) {
            for(int v1 = 1; true; ++v1) {
                v *= arr_v[v1];
                if(v1 == v2) {
                    break;
                }
            }
        }
        return v;
    }

    public static final File b() {
        Class class0 = g.class;
        if(a.b(class0)) {
            return null;
        }
        try {
            File file0 = new File(l.a().getFilesDir(), "facebook_ml/");
            if(file0.exists() || file0.mkdirs()) {
                return file0;
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, class0);
        }
        return null;
    }

    public String c(String s) {
        List list0;
        if(a.b(this)) {
            return null;
        }
        try {
            j.f(s, "str");
            int v = s.length() - 1;
            int v1 = 0;
            boolean z = false;
            while(v1 <= v) {
                boolean z1 = j.h(s.charAt((z ? v : v1)), 0x20) <= 0;
                if(z) {
                    if(!z1) {
                        break;
                    }
                    --v;
                }
                else if(z1) {
                    ++v1;
                }
                else {
                    z = true;
                }
            }
            String s1 = s.subSequence(v1, v + 1).toString();
            Pattern pattern0 = Pattern.compile("\\s+");
            j.e(pattern0, "compile(...)");
            j.f(s1, "input");
            Vb.j.m0(0);
            Matcher matcher0 = pattern0.matcher(s1);
            if(matcher0.find()) {
                ArrayList arrayList0 = new ArrayList(10);
                int v2 = 0;
                do {
                    arrayList0.add(s1.subSequence(v2, matcher0.start()).toString());
                    v2 = matcher0.end();
                }
                while(matcher0.find());
                arrayList0.add(s1.subSequence(v2, s1.length()).toString());
                list0 = arrayList0;
            }
            else {
                list0 = q.K(s1.toString());
            }
            Object[] arr_object = list0.toArray(new String[0]);
            if(arr_object == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String s2 = TextUtils.join(" ", ((String[])arr_object));
            j.e(s2, "join(\" \", strArray)");
            return s2;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }

    public int[] d(String s) {
        if(a.b(this)) {
            return null;
        }
        try {
            j.f(s, "texts");
            int[] arr_v = new int[0x80];
            String s1 = this.c(s);
            Charset charset0 = Charset.forName("UTF-8");
            j.e(charset0, "forName(\"UTF-8\")");
            if(s1 != null) {
                byte[] arr_b = s1.getBytes(charset0);
                j.e(arr_b, "(this as java.lang.String).getBytes(charset)");
                for(int v = 0; true; ++v) {
                    arr_v[v] = v < arr_b.length ? arr_b[v] & 0xFF : 0;
                    if(v + 1 >= 0x80) {
                        return arr_v;
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return null;
    }
}

