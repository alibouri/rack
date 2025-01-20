package T8;

import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.Size;

public final class d implements TextureView.SurfaceTextureListener {
    public final CameraPreview a;

    public d(CameraPreview cameraPreview0) {
        this.a = cameraPreview0;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        this.onSurfaceTextureSizeChanged(surfaceTexture0, v, v1);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        return false;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        this.a.q0 = new Size(v, v1);
        this.a.i();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
    }
}

