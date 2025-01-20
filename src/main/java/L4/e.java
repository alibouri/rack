package l4;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public abstract class e extends Exception {
    public final IOException X;

    public e(String s, IOException iOException0) {
        super(s);
        this.X = iOException0;
    }

    @Override
    public final void printStackTrace() {
        super.printStackTrace();
        IOException iOException0 = this.X;
        if(iOException0 != null) {
            System.err.println("--- inner exception ---");
            iOException0.printStackTrace();
        }
    }

    @Override
    public final void printStackTrace(PrintStream printStream0) {
        super.printStackTrace(printStream0);
        IOException iOException0 = this.X;
        if(iOException0 != null) {
            printStream0.println("--- inner exception ---");
            iOException0.printStackTrace(printStream0);
        }
    }

    @Override
    public final void printStackTrace(PrintWriter printWriter0) {
        super.printStackTrace(printWriter0);
        IOException iOException0 = this.X;
        if(iOException0 != null) {
            printWriter0.println("--- inner exception ---");
            iOException0.printStackTrace(printWriter0);
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        IOException iOException0 = this.X;
        if(iOException0 != null) {
            stringBuilder0.append("\n--- inner exception ---\n");
            stringBuilder0.append(iOException0.toString());
        }
        return stringBuilder0.toString();
    }
}

