package j2;

import java.io.File;
import java.io.FileFilter;

public final class c implements FileFilter {
    @Override
    public final boolean accept(File file0) {
        return !file0.getName().equals("MultiDex.lock");
    }
}

