package M6;

import android.content.Context;
import java.io.File;

public final class k {
    public final Context a;

    public k(Context context0) {
        this.a = context0;
    }

    public static long a(File file0) {
        if(!file0.isDirectory()) {
            return file0.length();
        }
        File[] arr_file = file0.listFiles();
        long v = 0L;
        if(arr_file != null) {
            for(int v1 = 0; v1 < arr_file.length; ++v1) {
                v += k.a(arr_file[v1]);
            }
        }
        return v;
    }
}

