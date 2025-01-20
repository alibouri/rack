package w1;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public final class d {
    public final HashMap a;

    public d(String s) {
        this.a = new HashMap();
    }

    public final File a(Uri uri0) {
        File file2;
        String s = uri0.getEncodedPath();
        int v = s.indexOf(0x2F, 1);
        String s1 = Uri.decode(s.substring(v + 1));
        File file0 = (File)this.a.get(Uri.decode(s.substring(1, v)));
        if(file0 == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri0);
        }
        File file1 = new File(file0, s1);
        try {
            file2 = file1.getCanonicalFile();
        }
        catch(IOException unused_ex) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file1);
        }
        String s2 = e.a(file2.getPath());
        String s3 = e.a(file0.getPath());
        if(!s2.equals(s3) && !s2.startsWith(s3 + '/')) {
            throw new SecurityException("Resolved path jumped beyond configured root");
        }
        return file2;
    }
}

