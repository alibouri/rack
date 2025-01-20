package O7;

import L7.a;
import M7.e;
import T7.r;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

public abstract class h {
    public static final Pattern a;

    static {
        h.a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");
    }

    public static Long a(HttpMessage httpMessage0) {
        try {
            Header header0 = httpMessage0.getFirstHeader("content-length");
            if(header0 != null) {
                return Long.parseLong(header0.getValue());
            }
        }
        catch(NumberFormatException unused_ex) {
            a.d().a("The content-length value is not a valid number");
        }
        return null;
    }

    public static String b(HttpResponse httpResponse0) {
        Header header0 = httpResponse0.getFirstHeader("content-type");
        if(header0 != null) {
            String s = header0.getValue();
            return s == null ? null : s;
        }
        return null;
    }

    public static void c(e e0) {
        if(!((r)e0.b0.Y).U()) {
            e0.b0.j();
            r.v(((r)e0.b0.Y));
        }
        e0.c();
    }
}

