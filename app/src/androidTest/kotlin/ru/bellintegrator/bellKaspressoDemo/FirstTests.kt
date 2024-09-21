import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import pages.MainPage
import ru.bellintegrator.bellKaspressoDemo.MainActivity

class FirstTests : TestCase() {
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
