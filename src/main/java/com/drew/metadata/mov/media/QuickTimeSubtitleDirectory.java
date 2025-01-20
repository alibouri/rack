package com.drew.metadata.mov.media;

import C4.a;
import com.apollographql.apollo.api.b;
import com.drew.metadata.mov.QuickTimeDirectory;
import java.util.HashMap;

public class QuickTimeSubtitleDirectory extends QuickTimeDirectory {
    public static final int TAG_ALL_SAMPLES_FORCED = 3;
    public static final int TAG_DEFAULT_TEXT_BOX = 4;
    public static final int TAG_FONT_FACE = 6;
    public static final int TAG_FONT_IDENTIFIER = 5;
    public static final int TAG_FONT_SIZE = 7;
    public static final int TAG_FOREGROUND_COLOR = 8;
    public static final int TAG_SOME_SAMPLES_FORCED = 2;
    public static final int TAG_VERTICAL_PLACEMENT = 1;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        QuickTimeSubtitleDirectory._tagNameMap = hashMap0;
        QuickTimeMediaDirectory.addQuickTimeMediaTags(hashMap0);
        hashMap0.put(1, "Vertical Placement");
        hashMap0.put(2, "Some Samples Forced");
        b.z(3, hashMap0, "All Samples Forced", 4, "Default Text Box");
        b.z(5, hashMap0, "Font Identifier", 6, "Font Face");
        b.z(7, hashMap0, "Font Size", 8, "Foreground Color");
    }

    public QuickTimeSubtitleDirectory() {
        this.setDescriptor(new a(2, this));
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public String getName() {
        return "QuickTime Subtitle";
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public HashMap getTagNameMap() {
        return QuickTimeSubtitleDirectory._tagNameMap;
    }
}

