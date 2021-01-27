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

    /*
        如果对象是Java函数式接口的一个实例（即只拥有一个抽象方法的接口）
        那么可以通过Lambda表达式来调用，其中Lambda表达式前面加上接口的类型
     */

    jButton.addActionListener { println("button prass") }

    jFrame.add(jButton)
    jFrame.pack()
    jFrame.defaultCloseOperation
    jFrame.isActive
}

