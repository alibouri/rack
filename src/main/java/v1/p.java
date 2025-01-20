package v1;

import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;

public abstract class p {
    public static AudioAttributes a(AudioAttributes.Builder audioAttributes$Builder0) {
        return audioAttributes$Builder0.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder audioAttributes$Builder0, int v) {
        return audioAttributes$Builder0.setContentType(v);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder audioAttributes$Builder0, int v) {
        return audioAttributes$Builder0.setUsage(v);
    }
}

