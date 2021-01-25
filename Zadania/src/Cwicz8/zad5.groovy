package Cwicz8

import java.text.Collator

def wordsCountedFile = new File('wordsCounted.txt')

def treeMap = new TreeMap(Collator.getInstance(new Locale('PL')))

wordsCountedFile.text.split(/[\s\p{Punct}]+/).each {
    int count = treeMap.get(it, 0)
    treeMap[it] = count + 1
}
println treeMap.sort()