package U0;

import Bb.a;
import K.D;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

public class q implements InputConnection {
    public final a a;
    public D b;

    public q(D d0, a a0) {
        this.a = a0;
        this.b = d0;
    }

    public void a(D d0) {
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        return this.b == null ? false : this.b.beginBatchEdit();
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int v) {
        return this.b == null ? false : this.b.clearMetaKeyStates(v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        D d0 = this.b;
        if(d0 != null) {
            this.a(d0);
            this.b = null;
            this.a.n(this);
        }
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo0) {
        return this.b == null ? false : this.b.commitCompletion(completionInfo0);
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo0) {
        return this.b == null ? false : this.b.commitCorrection(correctionInfo0);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence0, int v) {
        return this.b == null ? false : this.b.commitText(charSequence0, v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int v, int v1) {
        return this.b == null ? false : this.b.deleteSurroundingText(v, v1);
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int v, int v1) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return this.b == null ? false : this.b.b();
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        return this.b == null ? false : this.b.finishComposingText();
    }

    @Override  // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int v) {
        return this.b == null ? 0 : this.b.getCursorCapsMode(v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest0, int v) {
        D d0 = this.b;
        return d0 == null ? new ExtractedText() : d0.getExtractedText(extractedTextRequest0, v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int v) {
        D d0 = this.b;
        if(d0 != null) {
            CharSequence charSequence0 = d0.getSelectedText(v);
            if(charSequence0 != null) {
                return charSequence0;
            }
        }
        return "";
    }

    @Override  // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int v, int v1) {
        return this.b == null ? null : this.b.getTextAfterCursor(v, v1);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int v, int v1) {
        return this.b == null ? null : this.b.getTextBeforeCursor(v, v1);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int v) {
        return this.b == null ? false : this.b.performContextMenuAction(v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int v) {
        return this.b == null ? false : this.b.performEditorAction(v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String s, Bundle bundle0) {
        return this.b == null ? false : this.b.performPrivateCommand(s, bundle0);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int v) {
        return this.b == null ? false : this.b.requestCursorUpdates(v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent0) {
        return this.b == null ? false : this.b.sendKeyEvent(keyEvent0);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int v, int v1) {
        return this.b == null ? false : this.b.setComposingRegion(v, v1);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence0, int v) {
        return this.b == null ? false : this.b.setComposingText(charSequence0, v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean setSelection(int v, int v1) {
        return this.b == null ? false : this.b.setSelection(v, v1);
    }
}

