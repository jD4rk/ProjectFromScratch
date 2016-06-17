package it.jdark.android.projectfromscratch;

import android.content.Context;
import android.test.suitebuilder.annotation.MediumTest;


import static junit.framework.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentationTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("it.jdark.android.example.camera.camera2api", appContext.getPackageName());
    }
}