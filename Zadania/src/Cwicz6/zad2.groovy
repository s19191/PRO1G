package Cwicz6

def pmap = [ Groovy: [ 'Asia', 'Jan' ],
             Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
             Java: [ 'Asia', 'Stefan', 'Mirek' ],
             JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
]

for (item in pmap) println "W projekcie: $item.key pracuje $item.value.size osób"

pmap.each { if (it.value.size() > 2) println "W projekcie: $it.key pracuje więcej niż 2 programistów"}

def out = [:]
pmap.each { element ->
    element.value.each { employee ->
        if (employee !in out) {
            def tmp = []
            tmp << (element.key)
            out[employee] = tmp
        } else {
            out[employee] << element.key
        }
    }
}

println out