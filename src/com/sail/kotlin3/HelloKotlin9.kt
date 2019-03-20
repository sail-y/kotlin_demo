package com.sail.kotlin3

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame

/**
 * 和Java
 * @author yangfan
 * @date 2019/03/20
 */
fun main(args: Array<String>) {
    var jFrame = JFrame("My JFrame")
    var jButton = JButton("My JButton")

    jFrame.addWindowListener(object:WindowListener {
        override fun windowDeiconified(e: WindowEvent?) {
        }

        override fun windowClosing(e: WindowEvent?) {
            println("windowClosing")
        }

        override fun windowClosed(e: WindowEvent?) {
        }

        override fun windowActivated(e: WindowEvent?) {
            println("windowActivated")
        }

        override fun windowDeactivated(e: WindowEvent?) {
        }

        override fun windowOpened(e: WindowEvent?) {
            println("windowOpened")
        }

        override fun windowIconified(e: WindowEvent?) {
        }
    })

//    jButton.addActionListener(object:ActionListener {
//        override fun actionPerformed(e: ActionEvent?) {
//            println("Button pressed")
//        }
//    })

    jButton.addActionListener { println("Button pressed") }

    jFrame.add(jButton)
    jFrame.pack()
    jFrame.isVisible = true
    jFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

}