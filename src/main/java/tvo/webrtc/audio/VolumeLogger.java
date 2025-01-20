package tvo.webrtc.audio;

import android.media.AudioManager;
import java.util.Timer;
import java.util.TimerTask;

class VolumeLogger {
    class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        public LogVolumeTask(VolumeLogger volumeLogger0, int v, int v1) {
        }

        @Override
        public void run() {
        }
    }

    private static final String TAG;
    private static final String THREAD_NAME;
    private static final int TIMER_PERIOD_IN_SECONDS;
    private final AudioManager audioManager;
    private Timer timer;

    public VolumeLogger(AudioManager audioManager0) {
    }

    public static AudioManager access$000(VolumeLogger volumeLogger0) {
    }

    public void start() {
    }

    public void stop() {
    }
}

