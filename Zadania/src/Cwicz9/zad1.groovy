package Cwicz9

import groovy.swing.SwingBuilder

import javax.swing.JColorChooser
import javax.swing.JFrame
import java.awt.BorderLayout
import java.awt.Color
import java.awt.Dimension


def swing = new SwingBuilder().edt {
    frame(title: 'Prosty edytor', defaultCloseOperation: JFrame.EXIT_ON_CLOSE, pack: true, show: true, layout: new BorderLayout(), preferredSize: new Dimension(1080, 720)) {
        def textArea = textArea(constraints: BorderLayout.CENTER)
        menuBar(){
            menu("Pismo") {
                menu("Zmień wielkość") {
                    for (i in 8..<40) {
                        if (i % 2 == 0) {
                            def fontSize = menuItem(text: i as String)
                            fontSize.addActionListener( e ->
                                    textArea.setFont(textArea.getFont().deriveFont(fontSize.text as float))
                            )
                        }
                    }
                }
                menuItem("Zmień kolor", actionPerformed: { e ->
                    JColorChooser jColorChooser = new JColorChooser()
                    Color fontColor
                    fontColor = jColorChooser.showDialog(null, "Wybierz kolor pisma:", null)
                    if (fontColor != null) {
                        textArea.foreground = fontColor
                    }
                })
            }

            menu("Tło") {
                menuItem("Zmień kolor", actionPerformed: { e ->
                    JColorChooser jColorChooser = new JColorChooser()
                    Color backColor
                    backColor = jColorChooser.showDialog(null, "Wybierz kolor tła:", null)
                    if (backColor != null) {
                        textArea.background = backColor
                    }
                })
            }
        }
    }
}