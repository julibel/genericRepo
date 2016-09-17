package burrows.apps.example.template.activity

import android.os.Build
import burrows.apps.example.template.BuildConfig
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(Build.VERSION_CODES.M))
class MainActivityTest {

    @Test
    fun testActivityShouldNotBeNull() {
        val mainActivity = Robolectric.setupActivity(MainActivity::class.java)

        assertThat(mainActivity).isNotNull()
    }
}
