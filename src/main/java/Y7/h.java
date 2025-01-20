package y7;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public final class h {
    public static final byte a;
    public static final byte b;

    static {
        h.a = Byte.parseByte("01110000", 2);
        h.b = Byte.parseByte("00001111", 2);
    }

    public static String a() {
        UUID uUID0 = UUID.randomUUID();
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[17]);
        byteBuffer0.putLong(uUID0.getMostSignificantBits());
        byteBuffer0.putLong(uUID0.getLeastSignificantBits());
        byte[] arr_b = byteBuffer0.array();
        byte b = arr_b[0];
        arr_b[16] = b;
        arr_b[0] = (byte)(b & h.b | h.a);
        return new String(Base64.encode(arr_b, 11), Charset.defaultCharset()).substring(0, 22);
    }
}

