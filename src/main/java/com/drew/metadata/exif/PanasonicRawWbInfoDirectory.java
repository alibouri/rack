package com.drew.metadata.exif;

import com.drew.metadata.b;
import java.util.HashMap;

public class PanasonicRawWbInfoDirectory extends b {
    public static final int TagNumWbEntries = 0;
    public static final int TagWbRbLevels1 = 2;
    public static final int TagWbRbLevels2 = 5;
    public static final int TagWbRbLevels3 = 8;
    public static final int TagWbRbLevels4 = 11;
    public static final int TagWbRbLevels5 = 14;
    public static final int TagWbRbLevels6 = 17;
    public static final int TagWbRbLevels7 = 20;
    public static final int TagWbType1 = 1;
    public static final int TagWbType2 = 4;
    public static final int TagWbType3 = 7;
    public static final int TagWbType4 = 10;
    public static final int TagWbType5 = 13;
    public static final int TagWbType6 = 16;
    public static final int TagWbType7 = 19;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PanasonicRawWbInfoDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0, hashMap0, "Num WB Entries", 1, "WB Type 1");
        com.apollographql.apollo.api.b.z(2, hashMap0, "WB RGB Levels 1", 4, "WB Type 2");
        com.apollographql.apollo.api.b.z(5, hashMap0, "WB RGB Levels 2", 7, "WB Type 3");
        com.apollographql.apollo.api.b.z(8, hashMap0, "WB RGB Levels 3", 10, "WB Type 4");
        com.apollographql.apollo.api.b.z(11, hashMap0, "WB RGB Levels 4", 13, "WB Type 5");
        com.apollographql.apollo.api.b.z(14, hashMap0, "WB RGB Levels 5", 16, "WB Type 6");
        com.apollographql.apollo.api.b.z(17, hashMap0, "WB RGB Levels 6", 19, "WB Type 7");
        hashMap0.put(20, "WB RGB Levels 7");
    }

    public PanasonicRawWbInfoDirectory() {
        this.setDescriptor(new A4.b(27, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "PanasonicRaw WbInfo";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PanasonicRawWbInfoDirectory._tagNameMap;
    }
}

