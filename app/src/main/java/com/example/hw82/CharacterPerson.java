package com.example.hw82;

import java.io.Serializable;

public class CharacterPerson implements Serializable {
    private int image;
    private String aliveOrDead;
    private String personName;
public CharacterPerson(int image,String aliveOrDead, String personName){
    this.image=image;
    this.aliveOrDead=aliveOrDead;
    this.personName=personName;

}
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getAliveOrDead() {
        return aliveOrDead;
    }

    public void setAliveOrDead(String aliveOrDead) {
        this.aliveOrDead = aliveOrDead;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
