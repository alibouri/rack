package com.drew.metadata.mov.media;

import C4.a;
import com.apollographql.apollo.api.b;
import com.drew.metadata.mov.QuickTimeDirectory;
import java.util.HashMap;

public class QuickTimeTimecodeDirectory extends QuickTimeDirectory {
    public static final int TAG_24_HOUR_MAX = 2;
    public static final int TAG_BACKGROUND_COLOR = 9;
    public static final int TAG_COUNTER = 4;
    public static final int TAG_DROP_FRAME = 1;
    public static final int TAG_FONT_NAME = 10;
    public static final int TAG_NEGATIVE_TIMES_OK = 3;
    public static final int TAG_TEXT_COLOR = 8;
    public static final int TAG_TEXT_FACE = 6;
    public static final int TAG_TEXT_FONT = 5;
    public static final int TAG_TEXT_SIZE = 7;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        QuickTimeTimecodeDirectory._tagNameMap = hashMap0;
        QuickTimeMediaDirectory.addQuickTimeMediaTags(hashMap0);
        hashMap0.put(1, "Drop Frame");
        hashMap0.put(2, "24 Hour Max");
        b.z(3, hashMap0, "Negative Times OK", 4, "Counter");
        b.z(5, hashMap0, "Text Font", 6, "Text Face");
        b.z(7, hashMap0, "Text Size", 8, "Text Color");
        b.z(9, hashMap0, "Background Color", 10, "Font Name");
    }

    public QuickTimeTimecodeDirectory() {
        this.setDescriptor(new a(4, this));
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public String getName() {
        return "QuickTime Timecode";
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public HashMap getTagNameMap() {
        return QuickTimeTimecodeDirectory._tagNameMap;
    }
}

