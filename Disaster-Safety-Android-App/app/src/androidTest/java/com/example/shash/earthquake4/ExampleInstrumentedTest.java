package com.example.shash.earthquake4;

import static org.junit.Assert.assertEquals;

import android.app.Instrumentation;
import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Instrumentation InstrumentationRegistry = null;
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.shash.earthquake4", appContext.getPackageName());
    }
}
