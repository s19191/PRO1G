package Cwicz2

def eachTuple(def data, Closure c) {
    int numberOfParameters = c.getMaximumNumberOfParameters()

    def array = []
    if (data instanceof String) {
        array = data.tokenize().collate(numberOfParameters)
    } else {
        array = data.collate(numberOfParameters)
    }

    array.each { c.call(it) }
}

def list = (1..40)

eachTuple(list) { e1, e2, e3, e4 ->
    println "$e1 $e2 $e3 $e4"
}

def s = 'asia ma kota i psa'

def out = new StringBuffer()
eachTuple(s) { a,b ->
    out << b << a
}

println out