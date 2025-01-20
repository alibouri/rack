package n2;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer.FrameCallback;
import androidx.profileinstaller.ProfileInstallerInitializer;
import i.l;
import java.util.Random;

public final class e implements Choreographer.FrameCallback {
    public final ProfileInstallerInitializer X;
    public final Context Y;

    public e(ProfileInstallerInitializer profileInstallerInitializer0, Context context0) {
        this.X = profileInstallerInitializer0;
        this.Y = context0;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        this.X.getClass();
        Handler handler0 = Build.VERSION.SDK_INT < 28 ? new Handler(Looper.getMainLooper()) : Handler.createAsync(Looper.getMainLooper());
        int v1 = new Random().nextInt(Math.max(1000, 1));
        handler0.postDelayed(new l(this.Y, 1), ((long)(v1 + 5000)));
    }
}

