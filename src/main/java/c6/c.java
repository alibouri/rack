package c6;

import I5.h;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c implements Iterator<String> {
    private String nextElement;
    private int state;
    private final String source;
    private final boolean allowEmpty;
    private int currentIndex;
    private int remainingSplits;
    private final h delimiter;

    public c(h delimiter, F1.c config, String source) {
        if (delimiter == null || config == null || source == null) {
            throw new IllegalArgumentException("Delimiter, config, and source cannot be null.");
        }
        this.delimiter = delimiter;
        this.allowEmpty = config.X;
        this.source = source;
        this.state = 2;
        this.currentIndex = 0;
        this.remainingSplits = Integer.MAX_VALUE;
    }

    @Override
    public boolean hasNext() {
        if (state == 3) {
            return false;
        }
        if (state == 1) {
            return true;
        }
        return findNext();
    }

    private boolean findNext() {
        if (state == 4) {
            throw new IllegalStateException("Iterator is in an invalid state.");
        }

        int start = currentIndex;
        int end = source.length();
        while (currentIndex < end) {
            if (source.charAt(currentIndex) == ((b) delimiter.Y).a) {
                break;
            }
            currentIndex++;
        }

        if (currentIndex == end) {
            if (start < end || allowEmpty) {
                nextElement = source.substring(start);
                state = 1;
                currentIndex = end;
                return true;
            }
            state = 3;
            return false;
        }

        if (allowEmpty || currentIndex > start) {
            nextElement = source.substring(start, currentIndex);
            state = 1;
            currentIndex++;
            return true;
        }

        currentIndex++;
        return findNext();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements to iterate.");
        }
        state = 2;
        String result = nextElement;
        nextElement = null;
        return result;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported.");
    }
}