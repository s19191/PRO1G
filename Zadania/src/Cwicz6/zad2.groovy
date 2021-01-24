package Cwicz6

def pmap = [ Groovy: [ 'Asia', 'Jan' ],
             Grails: [ 'Asia', 'Jan', 'Stefan', 'Mirek' ],
             Java: [ 'Asia', 'Stefan', 'Mirek' ],
             JEE: [ 'Slawek', 'Stefan', 'Janusz' ]
]

for (item in pmap) println "W projekcie: $item.key pracuje $item.value.size osób"

pmap.each { if (it.value.size() > 2) println "W projekcie: $it.key pracuje więcej niż 2 programistów"}

def emap = [:]
pmap.each { project ->
    project.value.each { employee ->
        if (employee !in emap) {
            def tmp = []
            tmp << (project.key)
            emap[employee] = tmp
        } else {
            emap[employee] << project.key
        }
    }
}

println emap