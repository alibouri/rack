package U8;

import android.hardware.Camera.Parameters;
import android.util.Log;
import com.apollographql.apollo.api.b;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public abstract class c {
    public static final int a;

    static {
        Pattern.compile(";");
    }

    public static String a(String s, List list0, String[] arr_s) {
        StringBuilder stringBuilder0 = b.s("Requesting ", s, " value from among: ");
        stringBuilder0.append(Arrays.toString(arr_s));
        Log.i("CameraConfiguration", stringBuilder0.toString());
        Log.i("CameraConfiguration", "Supported " + s + " values: " + list0);
        if(list0 != null) {
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                if(list0.contains(s1)) {
                    Log.i("CameraConfiguration", "Can set " + s + " to: " + s1);
                    return s1;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void b(Camera.Parameters camera$Parameters0, boolean z) {
        List list0 = camera$Parameters0.getSupportedFlashModes();
        String s = z ? c.a("flash mode", list0, new String[]{"torch", "on"}) : c.a("flash mode", list0, new String[]{"off"});
        if(s != null) {
            if(s.equals(camera$Parameters0.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to " + s);
                return;
            }
            Log.i("CameraConfiguration", "Setting flash mode to " + s);
            camera$Parameters0.setFlashMode(s);
        }
    }
}

