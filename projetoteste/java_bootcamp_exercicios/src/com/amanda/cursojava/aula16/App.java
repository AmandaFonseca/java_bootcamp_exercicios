package com.amanda.cursojava.aula16;


public class App {
    public static void main(String[] args) {
        RelogioBrasileiro br = new RelogioBrasileiro();
        RelogioAmericano usa = new RelogioAmericano();
        usa.copiarHorario(br);

        System.out.println("Relógio BR: " + br.getHorarioFormatado(23, 10, 5));
        System.out.println("Relógio USA: " + usa.getHorarioFormatado());
    }

}
