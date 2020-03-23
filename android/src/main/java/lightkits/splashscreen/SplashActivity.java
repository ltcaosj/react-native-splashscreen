package lightkits.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        Intent starter = new Intent(this, LKSplashScreenConfiguration.mainActivityClass);
        this.startActivity(starter);
        //
        this.finish();
    }
}
