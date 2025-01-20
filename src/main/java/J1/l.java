package J1;

import U7.c;
import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

public abstract class L {
    public static String[] a(View view0) {
        return view0.getReceiveContentMimeTypes();
    }

    public static f b(View view0, f f0) {
        ContentInfo contentInfo0 = f0.a.g();
        Objects.requireNonNull(contentInfo0);
        ContentInfo contentInfo1 = view0.performReceiveContent(contentInfo0);
        if(contentInfo1 == null) {
            return null;
        }
        return contentInfo1 == contentInfo0 ? f0 : new f(new c(contentInfo1));
    }
}

