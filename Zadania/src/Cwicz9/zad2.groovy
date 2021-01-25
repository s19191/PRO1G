package Cwicz9

import groovy.swing.SwingBuilder
import javax.swing.*
import java.awt.*

def colors = [Color.BLACK, Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.CYAN, Color.PINK]
def counter = 0

def swing = new SwingBuilder().edt {
    frame(title: 'ColloredButton', defaultCloseOperation: JFrame.EXIT_ON_CLOSE, pack: true, show: true) {
        button(text: 'Zmień kolor tego przycisku', actionPerformed: { e ->
            if (counter == colors.size()) {
                counter = 0
            }
            e.source.background = colors[counter++]
        })
    }
}