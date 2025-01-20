package com.drew.metadata.pcx;

import com.drew.metadata.b;
import java.util.HashMap;

public class PcxDirectory extends b {
    public static final int TAG_BITS_PER_PIXEL = 2;
    public static final int TAG_BYTES_PER_LINE = 11;
    public static final int TAG_COLOR_PLANES = 10;
    public static final int TAG_HORIZONTAL_DPI = 7;
    public static final int TAG_HSCR_SIZE = 13;
    public static final int TAG_PALETTE = 9;
    public static final int TAG_PALETTE_TYPE = 12;
    public static final int TAG_VERSION = 1;
    public static final int TAG_VERTICAL_DPI = 8;
    public static final int TAG_VSCR_SIZE = 14;
    public static final int TAG_XMAX = 5;
    public static final int TAG_XMIN = 3;
    public static final int TAG_YMAX = 6;
    public static final int TAG_YMIN = 4;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PcxDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Version", 2, "Bits Per Pixel");
        com.apollographql.apollo.api.b.z(3, hashMap0, "X Min", 4, "Y Min");
        com.apollographql.apollo.api.b.z(5, hashMap0, "X Max", 6, "Y Max");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Horizontal DPI", 8, "Vertical DPI");
        com.apollographql.apollo.api.b.z(9, hashMap0, "Palette", 10, "Color Planes");
        com.apollographql.apollo.api.b.z(11, hashMap0, "Bytes Per Line", 12, "Palette Type");
        com.apollographql.apollo.api.b.z(13, hashMap0, "H Scr Size", 14, "V Scr Size");
    }

    public PcxDirectory() {
        this.setDescriptor(new A4.b(9, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "PCX";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PcxDirectory._tagNameMap;
    }
}

