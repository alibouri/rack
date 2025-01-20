package b3;

import Ec.C;
import Ec.y;
import I2.J;
import android.os.StatFs;
import fc.d;
import java.io.File;

public final class a {
    public C a;
    public y b;
    public double c;
    public long d;
    public long e;
    public d f;

    public final h a() {
        C c0 = this.a;
        if(c0 == null) {
            throw new IllegalStateException("directory == null");
        }
        double f = this.c;
        if(f > 0.0) {
            try {
                File file0 = c0.e();
                file0.mkdir();
                StatFs statFs0 = new StatFs(file0.getAbsolutePath());
                return new h(J.t(((long)(f * ((double)statFs0.getBlockCountLong()) * ((double)statFs0.getBlockSizeLong()))), this.d, this.e), this.b, c0, this.f);
            }
            catch(Exception unused_ex) {
                return new h(this.d, this.b, c0, this.f);
            }
        }
        return new h(0L, this.b, c0, this.f);
    }
}

