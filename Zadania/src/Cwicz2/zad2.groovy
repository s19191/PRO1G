package Cwicz2

import static javax.swing.JOptionPane.showInputDialog

List getInts(){
    def input

    while (!input) {
        inputDialog = showInputDialog("Podaj liczbe calkowita")
        if (inputDialog.isInteger()) {
            input = inputDialog
        }
    }
    return (input as List).collect{it as Integer}
}

println getInts()