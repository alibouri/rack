package com.drew.metadata.exif;

import com.drew.metadata.b;
import java.util.HashMap;

public class PanasonicRawDistortionDirectory extends b {
    public static final int TagDistortionCorrection = 7;
    public static final int TagDistortionN = 12;
    public static final int TagDistortionParam02 = 2;
    public static final int TagDistortionParam04 = 4;
    public static final int TagDistortionParam08 = 8;
    public static final int TagDistortionParam09 = 9;
    public static final int TagDistortionParam11 = 11;
    public static final int TagDistortionScale = 5;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PanasonicRawDistortionDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(2, hashMap0, "Distortion Param 2", 4, "Distortion Param 4");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Distortion Scale", 7, "Distortion Correction");
        com.apollographql.apollo.api.b.z(8, hashMap0, "Distortion Param 8", 9, "Distortion Param 9");
        com.apollographql.apollo.api.b.z(11, hashMap0, "Distortion Param 11", 12, "Distortion N");
    }

    public PanasonicRawDistortionDirectory() {
        this.setDescriptor(new A4.b(24, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "PanasonicRaw DistortionInfo";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PanasonicRawDistortionDirectory._tagNameMap;
    }
}

