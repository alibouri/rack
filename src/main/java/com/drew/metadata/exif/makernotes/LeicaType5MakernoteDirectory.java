package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class LeicaType5MakernoteDirectory extends b {
    public static final int TagExposureMode = 0x40D;
    public static final int TagFilmMode = 1042;
    public static final int TagLensModel = 0x303;
    public static final int TagOriginalDirectory = 0x408;
    public static final int TagOriginalFileName = 0x407;
    public static final int TagShotInfo = 1040;
    public static final int TagWbRgbLevels = 1043;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        LeicaType5MakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0x303, hashMap0, "Lens Model", 0x407, "Original File Name");
        com.apollographql.apollo.api.b.z(0x408, hashMap0, "Original Directory", 0x40D, "Exposure Mode");
        com.apollographql.apollo.api.b.z(1040, hashMap0, "Shot Info", 1042, "Film Mode");
        hashMap0.put(1043, "WB RGB Levels");
    }

    public LeicaType5MakernoteDirectory() {
        this.setDescriptor(new d(10, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Leica Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return LeicaType5MakernoteDirectory._tagNameMap;
    }
}

