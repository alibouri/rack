package jc;

import android.os.MessageQueue.IdleHandler;

public final class j implements MessageQueue.IdleHandler {
    public final k X;

    public j(k k0) {
        this.X = k0;
    }

    @Override  // android.os.MessageQueue$IdleHandler
    public final boolean queueIdle() {
        this.X.Y.invoke();
        return true;
    }
}

