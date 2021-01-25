package Cwicz1

import static javax.swing.JOptionPane.*;

def array = "zero jeden dwa trzy cztery pięć sześć siedem osiem dziewięć".tokenize()
def number = showInputDialog("Podaj liczbę do konwersji:")

def result = []
if (number.isInteger()) for (digit in number) result << array[digit as Integer]
else showMessageDialog(null, "Nie prawidłowe dane wejściowe")

println result.join("-")