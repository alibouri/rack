package Ec;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

public final class x implements Closeable {
    public boolean X;
    public int Y;
    public final ReentrantLock Z;
    public final RandomAccessFile b0;

    public x(RandomAccessFile randomAccessFile0) {
        this.Z = new ReentrantLock();
        this.b0 = randomAccessFile0;
    }

    public final long a() {
        ReentrantLock reentrantLock0 = this.Z;
        reentrantLock0.lock();
        try {
            if(!this.X) {
                synchronized(this) {
                    return this.b0.length();
                }
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }

    public final o b(long v) {
        ReentrantLock reentrantLock0 = this.Z;
        reentrantLock0.lock();
        try {
            if(!this.X) {
                ++this.Y;
                return new o(this, v);
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final void close() {
        ReentrantLock reentrantLock0 = this.Z;
        reentrantLock0.lock();
        if(this.X) {
            reentrantLock0.unlock();
            return;
        }
        this.X = true;
        if(this.Y != 0) {
            reentrantLock0.unlock();
            return;
        }
        reentrantLock0.unlock();
        synchronized(this) {
            this.b0.close();
        }
    }
}

