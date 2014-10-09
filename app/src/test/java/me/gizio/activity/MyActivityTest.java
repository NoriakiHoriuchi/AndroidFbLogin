package me.gizio.activity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;


import me.gizio.fblogin.MyActivity;
import me.gizio.fblogin.R;

/**
 * Created by blackhorry on 10/6/14.
 */
@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {
    @Test
    public void shouldHaveApplicationName() throws Exception {
        String appName = new MyActivity().getResources().getString(R.string.app_name);
        assertThat(appName, equalTo("FbLogin"));
    }
}