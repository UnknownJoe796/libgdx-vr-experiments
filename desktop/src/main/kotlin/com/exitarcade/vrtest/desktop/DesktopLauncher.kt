package com.exitarcade.vrtest.desktop

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.badlogic.gdx.vr.HelloVR
import com.exitarcade.vrtest.MyGdxGame

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        val config = Lwjgl3ApplicationConfiguration()
        config.setIdleFPS(90)
        config.useVsync(false)
        config.setBackBufferConfig(8, 8, 8, 8, 16, 0, 16)
        Lwjgl3Application(HelloVR(), config)
    }
}
