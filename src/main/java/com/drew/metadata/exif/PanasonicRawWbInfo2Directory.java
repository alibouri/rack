package com.drew.metadata.exif;

import com.drew.metadata.b;
import java.util.HashMap;

public class PanasonicRawWbInfo2Directory extends b {
    public static final int TagNumWbEntries = 0;
    public static final int TagWbRgbLevels1 = 2;
    public static final int TagWbRgbLevels2 = 6;
    public static final int TagWbRgbLevels3 = 10;
    public static final int TagWbRgbLevels4 = 14;
    public static final int TagWbRgbLevels5 = 18;
    public static final int TagWbRgbLevels6 = 22;
    public static final int TagWbRgbLevels7 = 26;
    public static final int TagWbType1 = 1;
    public static final int TagWbType2 = 5;
    public static final int TagWbType3 = 9;
    public static final int TagWbType4 = 13;
    public static final int TagWbType5 = 17;
    public static final int TagWbType6 = 21;
    public static final int TagWbType7 = 25;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PanasonicRawWbInfo2Directory._tagNameMap = hashMap0;
        Integer integer0 = 0;
        hashMap0.put(integer0, "Num WB Entries");
        hashMap0.put(integer0, "Num WB Entries");
        hashMap0.put(1, "WB Type 1");
        hashMap0.put(2, "WB RGB Levels 1");
        com.apollographql.apollo.api.b.z(5, hashMap0, "WB Type 2", 6, "WB RGB Levels 2");
        com.apollographql.apollo.api.b.z(9, hashMap0, "WB Type 3", 10, "WB RGB Levels 3");
        com.apollographql.apollo.api.b.z(13, hashMap0, "WB Type 4", 14, "WB RGB Levels 4");
        com.apollographql.apollo.api.b.z(17, hashMap0, "WB Type 5", 18, "WB RGB Levels 5");
        com.apollographql.apollo.api.b.z(21, hashMap0, "WB Type 6", 22, "WB RGB Levels 6");
        com.apollographql.apollo.api.b.z(25, hashMap0, "WB Type 7", 26, "WB RGB Levels 7");
    }

    public PanasonicRawWbInfo2Directory() {
        this.setDescriptor(new A4.b(26, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "PanasonicRaw WbInfo2";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PanasonicRawWbInfo2Directory._tagNameMap;
    }
}

