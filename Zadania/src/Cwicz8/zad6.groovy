package Cwicz8

import java.text.Collator
import static javax.swing.JOptionPane.*

def words = new URL('http://wiki.puzzlers.org/pub/wordlists/unixdict.txt').getText('UTF-8').tokenize()

def treeMap = new TreeMap<String, TreeSet<String>>(Collator.getInstance(new Locale('en')));

words.each {
    def letters = it.toList().sort().join()
    if (letters !in treeMap.keySet()) {
        def tmp = new TreeSet<>()
        tmp.add(it)
        treeMap[letters] = tmp
    } else {
        treeMap[letters].add(it)
    }
}

treeMap = treeMap.findAll {it.value.size() > 1}

treeMap = treeMap.sort({a, b ->
    b.value.size() - a.value.size()
})

treeMap.each { println it.value}

while (inputDialog = showInputDialog('Podaj słowo, którego anagramów szukasz')) {
    def letters = inputDialog.toList().sort().join()
    def anagramsToInputDialog = treeMap.find( {it.key == letters}).value
    showMessageDialog null, "Word: $inputDialog\nAnagrams: $anagramsToInputDialog"
}