package m9;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class d {
    public static final byte[] a;

    static {
        d.a = new byte[]{66, 83, 68, 73, 70, 70, 52, 0x30};
    }

    public static String a(FileInputStream fileInputStream0) {
        MessageDigest messageDigest0;
        try {
            i i0 = new i(1);
            try {
                messageDigest0 = MessageDigest.getInstance("SHA1");
            }
            catch(NoSuchAlgorithmException unused_ex) {
                throw new RuntimeException("The SHA-1 implementation is missing");
            }
            i0.Y = messageDigest0;
            byte[] arr_b = new byte[0x4000];
            int v;
            while((v = fileInputStream0.read(arr_b)) > 0) {
                i0.write(arr_b, 0, v);
            }
            return new BigInteger(1, messageDigest0.digest()).toString(16);
        }
        catch(IOException unused_ex) {
            return null;
        }
    }
}

