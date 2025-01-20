package Q4;

import E7.g;
import Nb.j;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import f5.a;

public final class m implements SensorEventListener {
    public g X;

    @Override  // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor0, int v) {
        if(a.b(this)) {
            return;
        }
        try {
            j.f(sensor0, "sensor");
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    @Override  // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent0) {
        if(a.b(this)) {
            return;
        }
        try {
            j.f(sensorEvent0, "event");
            g g0 = this.X;
            if(g0 != null) {
                float[] arr_f = sensorEvent0.values;
                double f = (double)(arr_f[0] / 9.80665f);
                double f1 = (double)(arr_f[1] / 9.80665f);
                double f2 = (double)(arr_f[2] / 9.80665f);
                if(Math.sqrt(f2 * f2 + (f1 * f1 + f * f)) > 2.3) {
                    g0.b();
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }
}

