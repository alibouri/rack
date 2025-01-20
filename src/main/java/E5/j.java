package E5;

import android.os.Process;

public final class j extends Thread {
    @Override
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}

