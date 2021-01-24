package Cwicz8

import static javax.swing.JOptionPane.showInputDialog

def array = (showInputDialog("Podaj ciąg liczb") as List).collect({it as Integer})*.multiply(2)

println array
