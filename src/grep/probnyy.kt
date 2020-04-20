package grep

import java.io.*


class Utilita(val regex: Boolean, val invert: Boolean, val ignore: Boolean) {

    fun grep(word: String, inputname: String): MutableList<String> {
        val it = mutableListOf<String>()
        if (!regex)
            if (!invert)
                if (!ignore)
                    for (line in File(inputname).readLines()) {
                        if (word?.let { it1 -> line.contains(it1) }!!){
                            it.add(line)
                    }
                    }
                else
                    for (line in File(inputname).readLines()) {
                        if (line.trim().contains(Regex("""$word""", RegexOption.IGNORE_CASE))) {
                            it.add(line)
                        }
                    }
            else
                if (!ignore)
                    for (line in File(inputname).readLines()) {
                        if (word?.let { it1 -> line.contains(it1) }!!) {
                        } else {
                            it.add(line)
                        }
                    }
                else
                    for (line in File(inputname).readLines()) {
                        if (line.trim().contains(Regex("""$word""", RegexOption.IGNORE_CASE))) {
                        } else {
                            it.add(line)
                        }

                    }
        else
            if (!invert)
                if (!ignore)
                    for (line in File(inputname).readLines()) {
                        if (line.contains(Regex("""$word"""))) {
                            it.add(line)
                        }
                    }
                else
                    for (line in File(inputname).readLines()) {
                        if (line.trim().contains(Regex("""$word""", RegexOption.IGNORE_CASE))) {
                            it.add(line)
                        }
                    }
            else
                if (!ignore)
                    for (line in File(inputname).readLines()) {
                        if (line.contains(Regex("""$word"""))) {
                        } else {
                            it.add(line)
                        }
                    }
                else
                    for (line in File(inputname).readLines()) {
                        if (line.trim().contains(Regex("""$word""", RegexOption.IGNORE_CASE))) {
                        } else {
                            it.add(line)
                        }

                    }
        return it
    }
}

