package Ec;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

public final class K extends f {
    public final Socket m;

    public K(Socket socket0) {
        this.m = socket0;
    }

    @Override  // Ec.f
    public final void k() {
        Socket socket0;
        try {
            socket0 = this.m;
            socket0.close();
        }
        catch(Exception exception0) {
            A.a.log(Level.WARNING, "Failed to close timed out socket " + socket0, exception0);
        }
        catch(AssertionError assertionError0) {
            if(!b.f(assertionError0)) {
                throw assertionError0;
            }
            A.a.log(Level.WARNING, "Failed to close timed out socket " + socket0, assertionError0);
        }
    }

    public final IOException l(IOException iOException0) {
        IOException iOException1 = new SocketTimeoutException("timeout");
        if(iOException0 != null) {
            iOException1.initCause(iOException0);
        }
        return iOException1;
    }
}

