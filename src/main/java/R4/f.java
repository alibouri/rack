package R4;

import Nb.j;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import f5.a;
import java.util.regex.Pattern;

public final class f {
    public static final f a;

    static {
        f.a = new f();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public final boolean a(TextView textView0) {
        int v3;
        if(a.b(this)) {
            return false;
        }
        try {
            String s = g.i(textView0);
            Pattern pattern0 = Pattern.compile("\\s");
            j.e(pattern0, "compile(...)");
            j.f(s, "input");
            String s1 = pattern0.matcher(s).replaceAll("");
            j.e(s1, "replaceAll(...)");
            int v = s1.length();
            if(v >= 12 && v <= 19) {
                int v1 = v - 1;
                if(v1 >= 0) {
                    int v2 = 0;
                    v3 = 0;
                    while(true) {
                        int v4 = s1.charAt(v1);
                        if(!Character.isDigit(((char)v4))) {
                            return false;
                        }
                        int v5 = Character.digit(v4, 10);
                        if(v5 < 0) {
                            throw new IllegalArgumentException("Char " + ((char)v4) + " is not a decimal digit");
                        }
                        if(v2 != 0) {
                            v5 *= 2;
                            if(v5 > 9) {
                                v5 = v5 % 10 + 1;
                            }
                        }
                        v3 += v5;
                        v2 ^= 1;
                        if(v1 - 1 < 0) {
                            break;
                        }
                        --v1;
                    }
                }
                else {
                    v3 = 0;
                }
                return v3 % 10 == 0;
            }
            return false;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
        return false;
    }

    public static final boolean b(View view0) {
        boolean z3;
        boolean z2;
        boolean z1;
        boolean z;
        Class class0 = f.class;
        if(a.b(class0)) {
            return false;
        }
        if(view0 instanceof TextView) {
            try {
                f f0 = f.a;
                TextView textView0 = (TextView)view0;
                if(a.b(f0)) {
                    z = false;
                }
                else {
                    try {
                        z = textView0.getInputType() == 0x80 ? true : textView0.getTransformationMethod() instanceof PasswordTransformationMethod;
                    }
                    catch(Throwable throwable1) {
                        a.a(throwable1, f0);
                        z = false;
                    }
                }
                if(z || f0.a(((TextView)view0))) {
                    return true;
                }
                TextView textView1 = (TextView)view0;
                if(a.b(f0)) {
                label_25:
                    z1 = false;
                }
                else {
                    try {
                        if(textView1.getInputType() == 0x60) {
                            goto label_23;
                        }
                        else {
                            goto label_25;
                        }
                        goto label_28;
                    }
                    catch(Throwable throwable2) {
                        a.a(throwable2, f0);
                        goto label_25;
                    }
                label_23:
                    z1 = true;
                }
            label_28:
                if(z1) {
                    return true;
                }
                TextView textView2 = (TextView)view0;
                if(a.b(f0)) {
                label_38:
                    z2 = false;
                }
                else {
                    try {
                        if(textView2.getInputType() == 0x70) {
                            goto label_36;
                        }
                        else {
                            goto label_38;
                        }
                        goto label_41;
                    }
                    catch(Throwable throwable3) {
                        a.a(throwable3, f0);
                        goto label_38;
                    }
                label_36:
                    z2 = true;
                }
            label_41:
                if(z2) {
                    return true;
                }
                TextView textView3 = (TextView)view0;
                if(a.b(f0)) {
                label_51:
                    z3 = false;
                }
                else {
                    try {
                        if(textView3.getInputType() == 3) {
                            goto label_49;
                        }
                        else {
                            goto label_51;
                        }
                        goto label_54;
                    }
                    catch(Throwable throwable4) {
                        a.a(throwable4, f0);
                        goto label_51;
                    }
                label_49:
                    z3 = true;
                }
            label_54:
                if(z3) {
                    return true;
                }
                TextView textView4 = (TextView)view0;
                if(a.b(f0)) {
                    return false;
                }
                else {
                    try {
                        if(textView4.getInputType() == 0x20) {
                            return true;
                        }
                        String s = g.i(textView4);
                        return s == null || s.length() == 0 ? false : Patterns.EMAIL_ADDRESS.matcher(s).matches();
                    }
                    catch(Throwable throwable5) {
                    }
                }
                a.a(throwable5, f0);
            }
            catch(Throwable throwable0) {
                a.a(throwable0, class0);
            }
            return false;
        }
        return false;
    }
}

