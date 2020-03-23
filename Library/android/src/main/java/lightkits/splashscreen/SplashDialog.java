package lightkits.splashscreen;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

public class SplashDialog extends Dialog {

  public SplashDialog(@NonNull Context context) {
    super(context, R.style.Theme_AppCompat_Light_NoActionBar);
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
