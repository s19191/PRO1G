package Cwicz8

def wordsToSortFile = new File("wordsToSort.txt")

def wordsToSortArray = wordsToSortFile.text.tokenize()

println "Nie posorotwana lista słów:\n$wordsToSortArray\n"

wordsToSortedArray = wordsToSortArray.sort() { a, b ->
    if (a.size() == b.size()) {
        return a.compareTo(b)
    } else {
        return a.size().compareTo(b.size())
    }
}

println "Posortowana lista słów bez użycia TreeSet:\n$wordsToSortedArray\n"

def myComparator = { a, b ->
    if (a.size() == b.size()) {
        return a.compareTo(b)
    } else {
        return a.size().compareTo(b.size())
    }
} as Comparator

def treeSet = new TreeSet(myComparator)

wordsToSortFile.text.tokenize().each {treeSet << it}

println "Posortowana lista słów przy użyciu TreeSet:\n$treeSet"