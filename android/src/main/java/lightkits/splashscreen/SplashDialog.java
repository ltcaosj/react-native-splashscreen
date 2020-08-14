package lightkits.splashscreen;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;

public class SplashDialog extends Dialog {

  public SplashDialog(@NonNull Context context) {
    super(context, R.style.Theme_AppCompat_Light_NoActionBar);
    //
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    //
    this.configure();
  }

  public View getContentView() {
    return ((ViewGroup) this.getWindow().getDecorView()).getChildAt(0);
  }

  private void configure() {
    this.setContentView(LKSplashScreenConfiguration.dialogLayout);
    this.setCancelable(false);
  }
}
