package o9;

import android.view.View.OnClickListener;
import android.view.View;
import com.sendwave.shared.PhotoActivity;

public final class y1 implements View.OnClickListener {
    public final int X;
    public final PhotoActivity Y;

    public y1(PhotoActivity photoActivity0, int v) {
        this.X = v;
        this.Y = photoActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        PhotoActivity photoActivity0 = this.Y;
        if(this.X != 0) {
            photoActivity0.R();
            return;
        }
        photoActivity0.findViewById(0x7F0A01E3).setVisibility(8);  // id:more_pages_dialog
        photoActivity0.findViewById(0x7F0A01E2).setVisibility(8);  // id:more_pages_back
        photoActivity0.onRetake(view0);
    }
}

