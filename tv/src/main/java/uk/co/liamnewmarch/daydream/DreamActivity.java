package uk.co.liamnewmarch.daydream;

import android.app.Activity;
import android.content.Intent;

public class DreamActivity extends Activity{

    @Override
    public void onStart() {
        super.onStart();

        final Intent intent = new Intent(Intent.ACTION_MAIN);
        // This API is unofficial, and its behavior may change in future.
        intent.setClassName(getString(R.string.dreamservice_package_context),
                getString(R.string.dreamservice_class_name));
        startActivity(intent);
        finish();
    }
}
