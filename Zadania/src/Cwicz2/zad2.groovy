package Cwicz2

import static javax.swing.JOptionPane.*

List getInts(){
    def input

    while (!input) {
        inputDialog = showInputDialog("Podaj liczbe calkowita")
        if (inputDialog.isInteger()) {
            input = inputDialog
        } else {
            showMessageDialog(null, "Nie prawidłowe dane wejściowe")
        }
    }
    return (input as List).collect{it as Integer}
}

println getInts()