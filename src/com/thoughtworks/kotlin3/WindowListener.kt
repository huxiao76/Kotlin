package com.thoughtworks.kotlin3

import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame

fun main() {
    val jFrame = JFrame("My JFrame")
    val jButton = JButton("MY JButton")

    jFrame.addWindowListener(object : WindowListener {
        override fun windowDeiconified(e: WindowEvent?) {
        }

        override fun windowClosing(e: WindowEvent?) {
            println("window close")
        }

        override fun windowClosed(e: WindowEvent?) {
        }

        override fun windowActivated(e: WindowEvent?) {
            println("window activated")
        }

        override fun windowDeactivated(e: WindowEvent?) {
        }

        override fun windowOpened(e: WindowEvent?) {
            println("window open")
        }

        override fun windowIconified(e: WindowEvent?) {
        }

    })

    jButton.addActionListener { println("button prass") }

    jFrame.add(jButton)
    jFrame.pack()
    jFrame.defaultCloseOperation
    jFrame.isActive
}

