package com.example.mediaappbyson;

public class Song {
    private String tilte;
    private int file;

    public Song(String tilte, int file) {
        this.tilte = tilte;
        this.file = file;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }
}
