package m9;

import Ec.i;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class k {
    public h a;
    public byte[] b;
    public byte[] c;

    static {
    }

    public final void a(i i0, a a0) {
        byte[] arr_b = this.c;
        byte[] arr_b1 = this.b;
        long v = ((RandomAccessFile)i0.Y).getFilePointer();
        try {
            Inflater inflater0 = new Inflater(true);
            while(true) {
            label_4:
                if(inflater0.finished()) {
                    long v1 = inflater0.getBytesRead();
                    ((RandomAccessFile)i0.Y).seek(v + v1);
                    return;
                }
                int v2 = i0.read(arr_b1);
                if(v2 <= 0) {
                    throw new IOException("Truncated compressed data");
                }
                inflater0.setInput(arr_b1, 0, v2);
                while(!inflater0.needsInput() && !inflater0.finished()) {
                    a0.write(arr_b, 0, inflater0.inflate(arr_b, 0, arr_b.length));
                }
            }
        }
        catch(DataFormatException unused_ex) {
            throw new IOException("Invalid compressed data");
        }
        goto label_4;
    }
}

