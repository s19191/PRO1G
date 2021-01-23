package Cwicz6

def list1 = [ 'a', 'b', 'c']
def list2 = [ 1, 8, 23 ]

list1.each {print(" $it")}
println()
list2.each {print(" $it")}

def list3 = []
list1.each {list3 << (it*2) }

def list4 = []
list2.each {list3 << (it*2) }

println()
list3.each {print(" $it")}
println()
list4.each {print(" $it")}