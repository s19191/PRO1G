package Cwicz8

import static javax.swing.JOptionPane.*;

while (inputDialog = showInputDialog("Wprowadź listę licz oddzielonych od siebie znakiem spacji")) {
    def numbers = inputDialog.tokenize()*.toInteger()
    println "Posortowane liczby: " + numbers.sort()
    
    def Below0 = numbers.findAll {it < 0}
    println "Liczby mniejsze od zera: $Below0"
}