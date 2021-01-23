package Cwicz2

List getData(def l, Closure c = { it }) {
    transformed = []
    if (!(l instanceof List) && l instanceof String) l = l.tokenize()
    for (item in l) transformed << c.call(item)
    return transformed
}

println getData([1, 2, 3, 4, 5, -1]) { it > 0 }            // liczby całkowite większe od 0
println getData('Ala ma kota') { it.size() > 3 }   // słowa o długości większej od 3 (domyślny typ: String)
println getData("Ala ma kota")                          // dowolne napisy (słowa)
println getData(BigDecimal)         // dowolne liczby

//:TODO: Nie wiem czy do końca o to chodziło