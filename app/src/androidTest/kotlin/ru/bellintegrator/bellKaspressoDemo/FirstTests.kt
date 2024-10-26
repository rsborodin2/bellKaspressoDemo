import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import pages.MainPage
import ru.bellintegrator.bellKaspressoDemo.MainActivity

class FirstTests : TestCase(kaspressoBuilder = Kaspresso.Builder.withForcedAllureSupport()) {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainPageHelloTextVisibleTest() =
        run {
            step("Open Simple Screen") {
                MainPage{
                    text{
                        isVisible()
                    }
                }
            }
        }
}
