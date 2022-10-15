package com.example.guessnumber.data;

import java.io.Serializable;

/**
 * Clase Message es la clase desde la que se controla el nombre del jugador y el numero de intentos que tiene disponibles
 */
public class Message implements Serializable {
    private String player;
    private String attempts;
    private Integer number;
    private String winLose;


    public Message(){

    }

    public Message(String player, String attepmts) {
        this.player = player;
        this.attempts = attepmts;
    }

    public String getWinLose() {
        return winLose;
    }

    public void setWinLose(String winLose) {
        this.winLose = winLose;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getAttempts() {
        return attempts;
    }

    public void setAttempts(String attempts) {
        this.attempts = attempts;
    }


    @Override
    public String toString() {
        return "Message{" +
                "player='" + player + '\'' +
                ", attempts='" + attempts + '\'' +
                '}';
    }
}
