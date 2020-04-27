package grep

import java.io.*


class Utilita(val regex: Boolean, val invert: Boolean, val ignore: Boolean) {

    fun grep(word: String, inputname: String): List<String> {
        val it = mutableListOf<String>()
        val pattern = if (regex) word else Regex.escape(word)
        val reg = if (ignore) pattern.toRegex(RegexOption.IGNORE_CASE) else pattern.toRegex()
        for (line in File(inputname).readLines()) {
            if (line.contains(reg) != invert) {
                it.add(line)
            }
        }
        return it
    }





}

