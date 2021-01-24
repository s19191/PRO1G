package Cwicz1

def maximum(list) {
    def result = []
    def indexes = []
    def map = [:]
    list.eachWithIndex { it, index ->
        if (it !in map) {
            indexes << index
            map[it] = indexes
            indexes = []
        } else {
            List listTmp = map[it]
            listTmp << index
            map[it] = listTmp
        }
    }
    map = map.sort {it.value}
    result << map.entrySet().last().key
    result << map.entrySet().last().value
    return result
}

(maxVal, indList) = maximum( [5, 3, 5, 5, 1, 5] )
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"