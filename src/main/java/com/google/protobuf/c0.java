package com.google.protobuf;

public abstract class c0 {
    public static final a0 a;
    public static final b0 b;

    static {
        c0.a = new a0();  // initializer: Ljava/lang/Object;-><init>()V
        c0.b = new b0();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public abstract int a(String arg1, byte[] arg2, int arg3, int arg4);

    public static String b(e e0) {
        StringBuilder stringBuilder0 = new StringBuilder(e0.size());
        for(int v = 0; v < e0.size(); ++v) {
            int v1 = e0.a(v);
            switch(v1) {
                case 7: {
                    stringBuilder0.append("\\a");
                    break;
                }
                case 8: {
                    stringBuilder0.append("\\b");
                    break;
                }
                case 9: {
                    stringBuilder0.append("\\t");
                    break;
                }
                case 10: {
                    stringBuilder0.append("\\n");
                    break;
                }
                case 11: {
                    stringBuilder0.append("\\v");
                    break;
                }
                case 12: {
                    stringBuilder0.append("\\f");
                    break;
                }
                case 13: {
                    stringBuilder0.append("\\r");
                    break;
                }
                case 34: {
                    stringBuilder0.append("\\\"");
                    break;
                }
                case 39: {
                    stringBuilder0.append("\\\'");
                    break;
                }
                case 92: {
                    stringBuilder0.append("\\\\");
                    break;
                }
                default: {
                    if(v1 < 0x20 || v1 > 0x7E) {
                        stringBuilder0.append('\\');
                        stringBuilder0.append(((char)((v1 >>> 6 & 3) + 0x30)));
                        stringBuilder0.append(((char)((v1 >>> 3 & 7) + 0x30)));
                        stringBuilder0.append(((char)((v1 & 7) + 0x30)));
                    }
                    else {
                        stringBuilder0.append(((char)v1));
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public abstract int c(byte[] arg1, int arg2, int arg3);
}

