import static javax.swing.JOptionPane.*;

def array = "zero jeden dwa trzy cztery pięć sześć siedem osiem dziewięć".tokenize()
inputDialog = showInputDialog("Podaj liczbę do konwersji:")

def result = []
if (inputDialog.isInteger()) for (num in inputDialog) result << array[num as Integer]
else showMessageDialog(null, "Nie prawidłowe dane wejściowe")

println result.join("-")