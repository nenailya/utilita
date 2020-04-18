package grep

import java.io.*


open class Utilita(regex: Boolean, invert: Boolean, ignore: Boolean) {
    var regex: Boolean = false
    var invert: Boolean = false
    var ignore: Boolean = false

    class Utilita ( regex: Boolean, invert: Boolean, ignore: Boolean) {
    }

    fun constructor(word: String, inputname: String): BufferedWriter {
        val outputName = ""
        File(outputName).bufferedWriter().use {
            if (!regex)
                if (!invert)
                    if (!ignore)
                        for (line in File(inputname).readLines()) {
                            if (word?.let { it1 -> line.contains(it1) }!!) {
                                it.write(line)
                                it.newLine()
                            }
                        }
                    else
                        for (line in File(inputname).readLines()) {
                            if (line.trim().contains(Regex("""$word""", RegexOption.IGNORE_CASE))) {
                                it.write(line)
                                it.newLine()
                            }
                        }
                else
                    if (!ignore)
                        for (line in File(inputname).readLines()) {
                            if (word?.let { it1 -> line.contains(it1) }!!) {
                            } else {
                                it.write(line)
                                it.newLine()
                            }
                        }
                    else
                        for (line in File(inputname).readLines()) {
                            if (line.trim().contains(Regex("""$word""", RegexOption.IGNORE_CASE))) {
                            } else {
                                it.write(line)
                                it.newLine()
                            }

                        }
            else
                if (!invert)
                    if (!ignore)
                        for (line in File(inputname).readLines()) {
                            if (line.contains(Regex("""$word"""))) {
                                it.write(line)
                                it.newLine()
                            }
                        }
                    else
                        for (line in File(inputname).readLines()) {
                            if (line.trim().contains(Regex("""$word""", RegexOption.IGNORE_CASE))) {
                                it.write(line)
                                it.newLine()
                            }
                        }
                else
                    if (!ignore)
                        for (line in File(inputname).readLines()) {
                            if (line.contains(Regex("""$word"""))) {
                            } else {
                                it.write(line)
                                it.newLine()
                            }
                        }
                    else
                        for (line in File(inputname).readLines()) {
                            if (line.trim().contains(Regex("""$word""", RegexOption.IGNORE_CASE))) {
                            } else {
                                it.write(line)
                                it.newLine()
                            }

                        }
            return it
        }
    }
}

