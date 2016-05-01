package uk.co.liamnewmarch.daydream;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class WebsiteDaydreamSettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.settings);
    }
}
