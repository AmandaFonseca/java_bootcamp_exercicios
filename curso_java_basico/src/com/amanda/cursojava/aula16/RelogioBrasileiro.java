package com.amanda.cursoJava.aula16;

public class RelogioBrasileiro extends Relogio {

    @Override
    public void copiarHorario(Relogio outroRelogio) {
        setHora(outroRelogio.getHora());
        setMinuto(outroRelogio.getMinuto());
        setSegundo(outroRelogio.getSegundo());
    }

}
