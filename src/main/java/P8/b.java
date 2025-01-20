package p8;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import m8.e;

public final class b {
    public static final Logger a;

    static {
        b.a = Logger.getLogger(b.class.getName());
    }

    public static List a(InputStream inputStream0) {
        ArrayList arrayList0;
        Throwable throwable1;
        IOException iOException1;
        ObjectInputStream objectInputStream0;
        Logger logger0 = b.a;
        if(inputStream0 == null) {
            return Collections.emptyList();
        }
        try {
            objectInputStream0 = null;
            objectInputStream0 = new ObjectInputStream(inputStream0);
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            throw new IllegalStateException("Unable to parse metadata file", iOException1);
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_21;
        }
        try {
            try {
                e e0 = new e();  // initializer: Ljava/lang/Object;-><init>()V
                arrayList0 = new ArrayList();
                e0.X = arrayList0;
                e0.readExternal(objectInputStream0);
                if(arrayList0.isEmpty()) {
                    throw new IllegalStateException("Empty metadata");
                }
                goto label_32;
            }
            catch(IOException iOException1) {
            }
            throw new IllegalStateException("Unable to parse metadata file", iOException1);
        }
        catch(Throwable throwable1) {
        }
    label_21:
        if(objectInputStream0 == null) {
            try {
                inputStream0.close();
            }
            catch(IOException iOException3) {
                logger0.log(Level.WARNING, "Error closing input stream (ignored)", iOException3);
            }
        }
        else {
            try {
                objectInputStream0.close();
            }
            catch(IOException iOException2) {
                logger0.log(Level.WARNING, "Error closing input stream (ignored)", iOException2);
            }
        }
        throw throwable1;
        try {
        label_32:
            objectInputStream0.close();
        }
        catch(IOException iOException4) {
            logger0.log(Level.WARNING, "Error closing input stream (ignored)", iOException4);
        }
        return arrayList0;
    }
}

