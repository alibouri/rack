package d4;

import U7.c;
import com.drew.metadata.heif.HeifDirectory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import l4.m;

public final class a {
    public static final HashSet a;

    static {
        a.a = new HashSet(Arrays.asList(new String[]{"ftyp", "meta"}));
    }

    public static G0.a a(m m0, B4.a a0, G0.a a1) {
        if(a1.z(a0)) {
            a1.s(a0, m0);
            return a.b(m0, m0.c + a0.a - 8L, a1);
        }
        if(a1.v(a0)) {
            return a1.q(a0, m0.c(((int)a0.a) - 8));
        }
        long v = a0.a;
        if(v > 1L) {
            m0.D(v - 8L);
        }
        return a1;
    }

    public static G0.a b(m m0, long v, G0.a a0) {
        try {
            while(v == -1L || m0.c < v) {
                a0 = a.a(m0, new B4.a(m0), a0);
            }
        }
        catch(IOException unused_ex) {
        }
        return a0;
    }

    public static void c(BufferedInputStream bufferedInputStream0, m m0, t4.a a0, boolean z) {
        boolean z1 = false;
        boolean z2 = false;
        try {
            while(true) {
                B4.a a1 = new B4.a(m0);
                if(!z1 && !a.a.contains(a1.b)) {
                    z2 = true;
                }
                if("meta".equalsIgnoreCase(a1.b)) {
                    z1 = true;
                }
                a0 = a.a(m0, a1, a0);
            }
        }
        catch(IOException unused_ex) {
            if(z2 && z) {
                bufferedInputStream0.reset();
                a.b(new m(bufferedInputStream0), -1L, a0);
                return;
            }
            if(z2) {
                HeifDirectory heifDirectory0 = (HeifDirectory)((c)a0.a).o(HeifDirectory.class);
                if(heifDirectory0 != null) {
                    heifDirectory0.addError("Unable to extract Exif data because inputStream was not resettable and \'meta\' was not first box");
                }
            }
        }
    }
}

