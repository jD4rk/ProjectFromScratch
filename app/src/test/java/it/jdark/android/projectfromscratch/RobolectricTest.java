package it.jdark.android.projectfromscratch;


import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java_cup.Main;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

// Used that insted methods in "CustomRobolectricRunner" -> getAppManifest and overwriteConfig
//@Config(manifest = "app/src/main/AndroidManifest.xml")
//@RunWith(RobolectricTestRunner.class)
@RunWith(CustomRobolectricRunner.class)

// Used that insted method in "CustomRobolectricRunner" -> pickSdkVersion
//@Config(emulateSdk = 18)

@Config(shadows = {ShadowSupportMenuInflater.class})
public class RobolectricTest {

    @Test
    public void testApplicationNotNull() {
        // failing test gives much better feedback
        // to show that all works correctly ;)
//        assertThat(Robolectric.application, nullValue());
        assertThat(Robolectric.application, notNullValue());
    }

    @Test
    public void testActivityCreate() {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertThat(activity, notNullValue());
    }

    @Test
    public void testTextViewNull() {
        Activity activity = Robolectric.setupActivity(MainActivity.class);

        TextView results = (TextView) activity.findViewById(R.id.textView);
        String resultsText = results.getText().toString();

        // failing test gives much better feedback
        // to show that all works correctly ;)
//        assertThat(resultsText, equalTo("Testing Android Rocks!"));
        assertThat(resultsText, equalTo(""));
    }
}

