package Cwicz2

List apply(List l, Closure c) {
    def transformed = []
    for (item in l) transformed << c.call(item)
    println transformed
}

apply([1, 2, 3, 4, 5, 6]) { it**2 }

apply("abc cba".tokenize()) { it.replace("a","v") }

apply([11, 1]) { (it !in 1..10) ?: (it += 10)}