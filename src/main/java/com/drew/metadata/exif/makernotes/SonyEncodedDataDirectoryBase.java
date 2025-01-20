package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;

public abstract class SonyEncodedDataDirectoryBase extends b {
    private static final byte[] _substitution;

    static {
        SonyEncodedDataDirectoryBase._substitution = new byte[]{0, 1, 50, (byte)0xB1, 10, 14, (byte)0x87, 40, 2, -52, -54, -83, 27, -36, 8, -19, 100, (byte)0x86, -16, 0x4F, (byte)0x8C, 108, -72, -53, 105, -60, 44, 3, -105, -74, -109, 0x7C, 20, -13, -30, 62, 0x30, (byte)0x8E, -41, 0x60, 28, (byte)0xA1, -85, 55, -20, 0x75, -66, 35, 21, 106, 89, 0x3F, (byte)0xD0, -71, -106, -75, 80, 39, -120, -29, (byte)0x81, -108, (byte)0xE0, (byte)0xC0, 4, 92, -58, -24, 0x5F, 75, 0x70, 56, -97, (byte)0x82, (byte)0x80, 81, 43, -59, 69, 73, -101, 33, 82, 83, 84, (byte)0x85, 11, 93, 97, -38, 0x7B, 85, 38, 36, 7, 110, 54, 91, 71, -73, -39, 74, -94, -33, -65, 18, 37, -68, 30, 0x7F, 86, -22, 16, -26, -49, 103, 77, 60, (byte)0x91, (byte)0x83, (byte)0xE1, 49, -77, 0x6F, -12, 5, (byte)0x8A, 70, -56, 24, 0x76, 104, -67, -84, -110, 42, 19, -23, 15, -93, 0x7A, -37, 61, -44, -25, 58, 26, 87, -81, 0x20, 66, -78, -98, -61, (byte)0x8B, -14, -43, -45, -92, 0x7E, 0x1F, -104, -100, -18, 0x74, -91, -90, -89, -40, 94, -80, -76, 52, -50, -88, 0x79, 0x77, 90, (byte)0xC1, (byte)0x89, -82, -102, 17, 51, -99, -11, 57, 25, 101, 120, 22, 0x71, -46, -87, 68, 99, 0x40, 41, -70, (byte)0xA0, (byte)0x8F, -28, -42, 59, (byte)0x84, 13, -62, 78, 88, -35, -103, 34, 107, -55, -69, 23, 6, -27, 0x7D, 102, 67, 98, -10, -51, 53, (byte)0x90, 46, 65, (byte)0x8D, 109, -86, 9, 0x73, -107, 12, -15, 29, -34, 76, 0x2F, 45, -9, (byte)0xD1, 0x72, -21, -17, 72, -57, -8, -7, -6, -5, -4, -3, -2, -1};
    }

    public static void decipherInPlace(byte[] arr_b) {
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b[v] = SonyEncodedDataDirectoryBase._substitution[arr_b[v] & 0xFF];
        }
    }
}

