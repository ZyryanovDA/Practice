package com.example.compositionexample

class Akira(val health: Int, val mana: Int, val stealth: Int, val damage: Int): StealthInterface {
    override fun gainStealth(): Int {
        return stealth
    }
    override fun loseStealth(): Int {
        return stealth
    }
}