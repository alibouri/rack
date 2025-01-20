package t4;

import U7.c;
import com.drew.metadata.heif.HeifDirectory;
import i.s;
import java.util.ArrayList;
import java.util.Arrays;
import l4.d;
import l4.l;
import l4.m;

public final class a extends G0.a {
    public s c;

    @Override  // G0.a
    public final HeifDirectory h() {
        return new HeifDirectory();
    }

    @Override  // G0.a
    public final G0.a q(B4.a a0, byte[] arr_b) {
        if(arr_b != null) {
            l l0 = new l(0, arr_b);
            long v = a0.a;
            if(a0.b.equals("ftyp")) {
                String s = l0.s(4);
                long v1 = l0.z();
                ArrayList arrayList0 = new ArrayList();
                for(int v2 = 16; ((long)v2) < v; v2 += 4) {
                    arrayList0.add(l0.s(4));
                }
                HeifDirectory heifDirectory0 = (HeifDirectory)this.b;
                heifDirectory0.setString(1, s);
                heifDirectory0.setLong(2, v1);
                heifDirectory0.setStringArray(3, ((String[])arrayList0.toArray(new String[arrayList0.size()])));
                if(!arrayList0.contains("mif1")) {
                    heifDirectory0.addError("File Type Box does not contain required brand, mif1");
                    return this;
                }
            }
            else if(a0.b.equals("hdlr")) {
                l0.B();
                l0.c(3);
                l0.D(4L);
                String s1 = l0.s(4);
                l0.D(12L);
                l0.q(((int)v) - 0x20, d.a);
                s s2 = this.c;
                s2.getClass();
                return s1.equals("pict") ? new b(((c)this.a), 3) : ((a)s2.X);  // initializer: LG0/a;-><init>(LU7/c;I)V
            }
        }
        return this;
    }

    @Override  // G0.a
    public final void s(B4.a a0, m m0) {
        if(a0.b.equals("meta")) {
            m0.B();
            m0.c(3);
        }
    }

    @Override  // G0.a
    public final boolean v(B4.a a0) {
        return Arrays.asList(new String[]{"ftyp", "hdlr", "hvc1"}).contains(a0.b);
    }

    // Deobfuscation rating: LOW(30)
    @Override  // G0.a
    public final boolean z(B4.a a0) {
        return a0.b.equals("meta") || (a0.b.equals("iprp") || a0.b.equals("ipco"));
    }
}

