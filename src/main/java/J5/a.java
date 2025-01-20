package j5;

import java.io.File;
import java.io.FilenameFilter;

public final class a implements FilenameFilter {
    public final String a;

    public a(String s) {
        this.a = s;
    }

    @Override
    public final boolean accept(File file0, String s) {
        return s.startsWith(this.a);
    }
}

