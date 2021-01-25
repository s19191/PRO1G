package Cwicz9

import groovy.swing.SwingBuilder
import javax.swing.*
import java.awt.*

import static javax.swing.JOptionPane.showInputDialog
import static javax.swing.JOptionPane.showMessageDialog

def buttonNames = "Przycisk 1=Przycisk 2=Przycisk 3=Przycisk 4=Przycisk 5".tokenize("=")

LayoutManager[] lm = new LayoutManager[3]

lm[0] = new FlowLayout()
lm[1] = new BorderLayout()
lm[2] = new GridLayout(3,2)

def inputDialog = showInputDialog("Wybierz leyout\nWpisując 1 wybierasz FlowLayout\nWpisując 2 wybierasz BorderLayout\nWpisując 3 wybierasz GridLayout 3x2")


while (!inputDialog.isInteger()) {
    inputDialog = showInputDialog("Wybierz leyout\nWpisując 1 wybierasz FlowLayout\nWpisując 2 wybierasz BorderLayout\nWpisując 3 wybierasz GridLayout 3x2")
}
def swing = new SwingBuilder().edt {
    frame(title: 'Buttons', defaultCloseOperation: JFrame.EXIT_ON_CLOSE, pack: true, show: true,layout: lm[(inputDialog as Integer) - 1]) {
        button(text: buttonNames[0], constraints: BorderLayout.CENTER)
        button(text: buttonNames[1], constraints: BorderLayout.EAST)
        button(text: buttonNames[2], constraints: BorderLayout.WEST)
        button(text: buttonNames[3], constraints: BorderLayout.NORTH)
        button(text: buttonNames[4], constraints: BorderLayout.SOUTH)
    }
}