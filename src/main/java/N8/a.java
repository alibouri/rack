package n8;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class a extends LinkedHashMap {
    @Override
    public final boolean removeEldestEntry(Map.Entry map$Entry0) {
        return this.size() > 100;
    }
}

