package com.example.compositionexample

class Tecyuo(val health: Int, val mana: Int): AssasinAction {
    override fun strike(): Int {
        return mana
    }

    override fun move(): Int {
        return mana
    }

    override fun die(): Int {
        return health
    }

}