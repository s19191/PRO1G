package Cwicz1

def maximum(list){
    output = []
    indexes = []
    objectsMap = [:]
    list.eachWithIndex { it, index ->
        if(it !in objectsMap){
            indexes << index
            objectsMap[it] = indexes
            indexes = []
        } else {
            List listTmp = objectsMap[it]
            listTmp << index
            objectsMap[it] = listTmp
        }
    }
    objectsMap = objectsMap.sort {it.value}
    output << objectsMap.entrySet().last().key
    output << objectsMap.entrySet().last().value
    return output
}
//TODO: Poprwawić
(maxVal, indList) = maximum( [5, 3, 5, 5, 1, 5] )
println "Maximum: $maxVal"
println "Indexes: $indList"

(maxVal, indList) = maximum(['a', 'c', 'c', 'c', 'b'])
println "Maximum: $maxVal"
println "Indexes: $indList"