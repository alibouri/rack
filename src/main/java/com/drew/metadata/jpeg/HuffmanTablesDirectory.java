package com.drew.metadata.jpeg;

import com.drew.metadata.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HuffmanTablesDirectory extends b {
    public static final int TAG_NUMBER_OF_TABLES = 1;
    static final byte[] TYPICAL_CHROMINANCE_AC_LENGTHS;
    static final byte[] TYPICAL_CHROMINANCE_AC_VALUES;
    static final byte[] TYPICAL_CHROMINANCE_DC_LENGTHS;
    static final byte[] TYPICAL_CHROMINANCE_DC_VALUES;
    static final byte[] TYPICAL_LUMINANCE_AC_LENGTHS;
    static final byte[] TYPICAL_LUMINANCE_AC_VALUES;
    static final byte[] TYPICAL_LUMINANCE_DC_LENGTHS;
    static final byte[] TYPICAL_LUMINANCE_DC_VALUES;
    private static final HashMap _tagNameMap;
    protected final List tables;

    static {
        HuffmanTablesDirectory.TYPICAL_LUMINANCE_DC_LENGTHS = new byte[]{0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        HuffmanTablesDirectory.TYPICAL_LUMINANCE_DC_VALUES = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        HuffmanTablesDirectory.TYPICAL_CHROMINANCE_DC_LENGTHS = new byte[]{0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
        HuffmanTablesDirectory.TYPICAL_CHROMINANCE_DC_VALUES = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        HuffmanTablesDirectory.TYPICAL_LUMINANCE_AC_LENGTHS = new byte[]{0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 0x7D};
        HuffmanTablesDirectory.TYPICAL_LUMINANCE_AC_VALUES = new byte[]{1, 2, 3, 0, 4, 17, 5, 18, 33, 49, 65, 6, 19, 81, 97, 7, 34, 0x71, 20, 50, (byte)0x81, (byte)0x91, (byte)0xA1, 8, 35, 66, (byte)0xB1, (byte)0xC1, 21, 82, (byte)0xD1, -16, 36, 51, 98, 0x72, (byte)0x82, 9, 10, 22, 23, 24, 25, 26, 37, 38, 39, 40, 41, 42, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, (byte)0x83, (byte)0x84, (byte)0x85, (byte)0x86, (byte)0x87, -120, (byte)0x89, (byte)0x8A, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, (byte)0xE1, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6};
        HuffmanTablesDirectory.TYPICAL_CHROMINANCE_AC_LENGTHS = new byte[]{0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 0x77};
        HuffmanTablesDirectory.TYPICAL_CHROMINANCE_AC_VALUES = new byte[]{0, 1, 2, 3, 17, 4, 5, 33, 49, 6, 18, 65, 81, 7, 97, 0x71, 19, 34, 50, (byte)0x81, 8, 20, 66, (byte)0x91, (byte)0xA1, (byte)0xB1, (byte)0xC1, 9, 35, 51, 82, -16, 21, 98, 0x72, (byte)0xD1, 10, 22, 36, 52, (byte)0xE1, 37, -15, 23, 24, 25, 26, 38, 39, 40, 41, 42, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, (byte)0x82, (byte)0x83, (byte)0x84, (byte)0x85, (byte)0x86, (byte)0x87, -120, (byte)0x89, (byte)0x8A, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6};
        HashMap hashMap0 = new HashMap();
        HuffmanTablesDirectory._tagNameMap = hashMap0;
        hashMap0.put(1, "Number of Tables");
    }

    public HuffmanTablesDirectory() {
        this.tables = new ArrayList(4);
        this.setDescriptor(new A4.b(14, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Huffman";
    }

    public int getNumberOfTables() {
        return this.getInt(1);
    }

    public a getTable(int v) {
        return (a)this.tables.get(v);
    }

    public List getTables() {
        return this.tables;
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return HuffmanTablesDirectory._tagNameMap;
    }

    public boolean isOptimized() {
        return !this.isTypical();
    }

    public boolean isTypical() {
        if(this.tables.size() == 0) {
            return false;
        }
        for(Object object0: this.tables) {
            byte[] arr_b = ((a)object0).c;
            byte[] arr_b1 = ((a)object0).b;
            int v = ((a)object0).a;
            if(v != 1) {
                if(v != 2 || (!Arrays.equals(arr_b1, HuffmanTablesDirectory.TYPICAL_LUMINANCE_AC_LENGTHS) || !Arrays.equals(arr_b, HuffmanTablesDirectory.TYPICAL_LUMINANCE_AC_VALUES)) && (!Arrays.equals(arr_b1, HuffmanTablesDirectory.TYPICAL_CHROMINANCE_AC_LENGTHS) || !Arrays.equals(arr_b, HuffmanTablesDirectory.TYPICAL_CHROMINANCE_AC_VALUES))) {
                    return false;
                }
            }
            else if(Arrays.equals(arr_b1, HuffmanTablesDirectory.TYPICAL_LUMINANCE_DC_LENGTHS) && Arrays.equals(arr_b, HuffmanTablesDirectory.TYPICAL_LUMINANCE_DC_VALUES) || Arrays.equals(arr_b1, HuffmanTablesDirectory.TYPICAL_CHROMINANCE_DC_LENGTHS) && Arrays.equals(arr_b, HuffmanTablesDirectory.TYPICAL_CHROMINANCE_DC_VALUES)) {
                continue;
            }
            else {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }
}

