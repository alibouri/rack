package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class k2 extends IOException {
    public static final int X;

    public static k2 a() {
        return new k2("Protocol message had invalid UTF-8.");  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    }

    public static k2 b() {
        return new k2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    }

    public static k2 c() {
        return new k2("Failed to parse the message.");  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    }

    public static k2 d() {
        return new k2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    }
}

