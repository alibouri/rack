package a2;

import android.system.Os;
import java.io.FileDescriptor;

public abstract class h {
    public static void a(FileDescriptor fileDescriptor0) {
        Os.close(fileDescriptor0);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor0) {
        return Os.dup(fileDescriptor0);
    }

    public static long c(FileDescriptor fileDescriptor0, long v, int v1) {
        return Os.lseek(fileDescriptor0, v, v1);
    }
}

