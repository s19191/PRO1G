package Cwicz2

import static javax.swing.JOptionPane.*

List getInts() {
    def input

    while (!input) {
        def number = showInputDialog("Podaj liczbe calkowita")
        if (number.isInteger()) {
            input = number
        } else {
            showMessageDialog(null, "Nie prawidłowe dane wejściowe")
        }
    }
    return (input as List).collect{it as Integer}
}

println getInts()