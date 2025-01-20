package com.google.protobuf;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public class v0 extends Enum {
    // PARTIAL FAILURE: ENUM SUGARING
    // The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
    public final class r0 extends v0 {
    }

    // PARTIAL FAILURE: ENUM SUGARING
    // The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
    public final class s0 extends v0 {
    }

    // PARTIAL FAILURE: ENUM SUGARING
    // The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
    public final class t0 extends v0 {
    }

    // PARTIAL FAILURE: ENUM SUGARING
    // The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
    public final class u0 extends v0 {
    }

    public final w0 X;
    public final int Y;
    public static final enum v0 Z;
    public static final enum r0 b0;
    public static final enum s0 c0;
    public static final v0[] d0;

    static {
        v0 v00 = new v0("DOUBLE", 0, w0.b0, 1);
        v0 v01 = new v0("FLOAT", 1, w0.Z, 5);
        v0.Z = new v0("INT64", 2, w0.Y, 0);
        v0 v02 = new v0("UINT64", 3, w0.Y, 0);
        v0 v03 = new v0("INT32", 4, w0.X, 0);
        v0 v04 = new v0("FIXED64", 5, w0.Y, 1);
        v0 v05 = new v0("FIXED32", 6, w0.X, 5);
        v0 v06 = new v0("BOOL", 7, w0.c0, 0);
        v0.b0 = new r0("STRING", 8, w0.d0, 2);  // initializer: Lcom/google/protobuf/v0;-><init>(Ljava/lang/String;ILcom/google/protobuf/w0;I)V
        v0.c0 = new s0("GROUP", 9, w0.g0, 3);  // initializer: Lcom/google/protobuf/v0;-><init>(Ljava/lang/String;ILcom/google/protobuf/w0;I)V
        v0.d0 = new v0[]{v00, v01, v0.Z, v02, v03, v04, v05, v06, v0.b0, v0.c0, new t0("MESSAGE", 10, w0.g0, 2), new u0("BYTES", 11, w0.e0, 2), new v0("UINT32", 12, w0.X, 0), new v0("ENUM", 13, w0.f0, 0), new v0("SFIXED32", 14, w0.X, 5), new v0("SFIXED64", 15, w0.Y, 1), new v0("SINT32", 16, w0.X, 0), new v0("SINT64", 17, w0.Y, 0)};  // initializer: Lcom/google/protobuf/v0;-><init>(Ljava/lang/String;ILcom/google/protobuf/w0;I)V / initializer: Lcom/google/protobuf/v0;-><init>(Ljava/lang/String;ILcom/google/protobuf/w0;I)V
    }

    public v0(String s, int v, w0 w00, int v1) {
        super(s, v);
        this.X = w00;
        this.Y = v1;
    }

    public static v0 valueOf(String s) {
        return (v0)Enum.valueOf(v0.class, s);
    }

    public static v0[] values() {
        return (v0[])v0.d0.clone();
    }
}

