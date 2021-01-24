package Cwicz7

def dir = new File(System.getProperty("user.home") + "/Desktop")


//println "Bez użycia metody traverse"
//int counter1 = 1;
//dir.eachFileRecurse {
//    if (it.name.endsWith(".html")) {
//        println "$counter1 $it"
//        counter1++
//    }
//}

println "Z użyciem metody traverse"
int counter2 = 1;
dir.traverse(
        filter: {it.name.endsWith(".html")},
) {
    println "$counter2 $it"
    counter2++
}