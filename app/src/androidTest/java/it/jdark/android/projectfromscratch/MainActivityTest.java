package it.jdark.android.projectfromscratch;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;

import it.jdark.android.projectfromscratch.MainActivity;

/**
 * Created by jdark on 13/03/15.
 */

// Instrumental Test - Senza Robolectric
public class MainActivityTest extends  ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }


    @Override
    public void setUp() throws Exception {
        super.setUp();
        mActivity = getActivity();
    }

    @SmallTest
    public void testApplicationNotNull() {
        assertNotNull(mActivity);
    }

//    public void testTextViewNotNull() {
//        TextView tv = (TextView) mActivity.findViewById(R.id.textView);
//        // Pass
//        assertNotNull(tv);
//        // Fail
//        //assertNull(tv);
//    }


    @Override
    public void tearDown() throws Exception {
        mActivity.finish();
        super.tearDown();
    }
}
