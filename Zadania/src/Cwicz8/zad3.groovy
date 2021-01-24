package Cwicz8
println "Odwrotne sortowanie przy użyciu mojego Comparatora: "
def array1 = '1 -1 10 156 -235 -22 -33 -1 4 2 3'.tokenize()*.toInteger()
def myComparator = {a, b -> b - a } as Comparator
array1.sort(myComparator)
println array1

println "Odwrotne sortowanie przy użyciu Comparator.reverseOrder(): "
def array2 = '1 -1 10 156 -235 -22 -33 -1 4 2 3'.tokenize()*.toInteger()
array2.sort(Comparator.reverseOrder())
println array2

println "Standardowe sortowanie: "
def array3 = '1 -1 10 156 -235 -22 -33 -1 4 2 3'.tokenize()*.toInteger()
array3.sort()
println array3