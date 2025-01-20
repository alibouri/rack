package v8;

import U8.e;
import U8.h;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

public final class a implements SensorEventListener {
    public h X;
    public Handler Y;

    @Override  // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor0, int v) {
    }

    @Override  // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent0) {
        float f = sensorEvent0.values[0];
        if(this.X != null) {
            if(f <= 45.0f) {
                this.Y.post(new e(2, this, true));
                return;
            }
            if(f >= 450.0f) {
                this.Y.post(new e(2, this, false));
            }
        }
    }
}

