package j6;

import G1.n;
import com.apollographql.apollo.api.b;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class f0 implements Runnable {
    public final int X;
    public final U Y;
    public final AppMeasurementDynamiteService Z;

    public f0(AppMeasurementDynamiteService appMeasurementDynamiteService0, U u0, int v) {
        this.X = v;
        this.Y = u0;
        this.Z = appMeasurementDynamiteService0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            r1 r10 = this.Z.d.j0;
            d0.e(r10);
            d0 d00 = this.Z.d;
            r10.P(this.Y, d00.y0 != null && d00.y0.booleanValue());
            return;
        }
        P0 p00 = b.n(this.Z.d);
        p00.z(new n(p00, p00.J(false), this.Y, 10));
    }
}

