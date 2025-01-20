package com.drew.metadata.mov.media;

import C4.a;
import com.apollographql.apollo.api.b;
import com.drew.metadata.mov.QuickTimeDirectory;
import java.util.HashMap;

public class QuickTimeTextDirectory extends QuickTimeDirectory {
    public static final int TAG_ANTI_ALIAS = 9;
    public static final int TAG_AUTO_SCALE = 1;
    public static final int TAG_BACKGROUND_COLOR = 12;
    public static final int TAG_CONTINUOUS_SCROLL = 7;
    public static final int TAG_DEFAULT_TEXT_BOX = 13;
    public static final int TAG_DROP_SHADOW = 8;
    public static final int TAG_FONT_FACE = 15;
    public static final int TAG_FONT_NUMBER = 14;
    public static final int TAG_FOREGROUND_COLOR = 16;
    public static final int TAG_HORIZONTAL_SCROLL = 5;
    public static final int TAG_JUSTIFICATION = 11;
    public static final int TAG_KEY_TEXT = 10;
    public static final int TAG_MOVIE_BACKGROUND_COLOR = 2;
    public static final int TAG_NAME = 17;
    public static final int TAG_REVERSE_SCROLL = 6;
    public static final int TAG_SCROLL_IN = 3;
    public static final int TAG_SCROLL_OUT = 4;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        QuickTimeTextDirectory._tagNameMap = hashMap0;
        QuickTimeMediaDirectory.addQuickTimeMediaTags(hashMap0);
        hashMap0.put(1, "Auto Scale");
        hashMap0.put(2, "Use Background Color");
        b.z(3, hashMap0, "Scroll In", 4, "Scroll Out");
        b.z(5, hashMap0, "Scroll Orientation", 6, "Scroll Direction");
        b.z(7, hashMap0, "Continuous Scroll", 8, "Drop Shadow");
        b.z(9, hashMap0, "Anti-aliasing", 10, "Display Text Background Color");
        b.z(11, hashMap0, "Alignment", 12, "Background Color");
        b.z(13, hashMap0, "Default Text Box", 14, "Font Number");
        b.z(15, hashMap0, "Font Face", 16, "Foreground Color");
        hashMap0.put(17, "Font Name");
    }

    public QuickTimeTextDirectory() {
        this.setDescriptor(new a(3, this));
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public String getName() {
        return "QuickTime Text";
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public HashMap getTagNameMap() {
        return QuickTimeTextDirectory._tagNameMap;
    }
}

