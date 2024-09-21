package pages
import ru.bellintegrator.myapplication4.R
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KTextView
import ru.bellintegrator.myapplication4.MainActivity

object MainPage: KScreen<MainPage>() {
    override val layoutId: Int = R.layout.activity_main

    override val viewClass: Class<*> = MainActivity::class.java

    val text = KTextView { withId(R.id.helloTextView) }
}