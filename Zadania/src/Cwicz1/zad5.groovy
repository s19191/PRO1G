package Cwicz1

import static javax.swing.JOptionPane.*;

def map = [:].withDefault { 0 }
while (inputDialog = showInputDialog("Podaj produkt i jego koszt w formacie produkt=koszt")) {
    //TODO: nie wiem czemu nie działa "=" in inputDialog, wydaje mi się żę powinno działać
    if ("=" in inputDialog || inputDialog.contains("=")) {
        (name, cost) = inputDialog.tokenize("=")

        if (cost.isNumber()) {
            map[name] += cost.toBigDecimal()
        } else {
            showMessageDialog(null, "Nie prawidłowe dane wejściowe")
        }
        for (entry in map) println "Produkt: $entry.key kosztuje: $entry.value"
    } else {
        showMessageDialog(null, "Nie prawidłowe dane wejściowe")
    }
}