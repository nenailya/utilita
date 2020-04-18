import grep.Utilita
import org.junit.Test
import java.io.File
import kotlin.test.assertEquals

class test {
    private fun assertFileContent(name: String, expectedContent: String) {
        val file = File(name)
        val content = file.readLines().joinToString("\n")
        assertEquals(expectedContent, content)
    }
    @Test
    fun

    }

}