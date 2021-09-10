package com.e.recyclerview;

public class Hewan {
    private String nama,makanan,habitat;
    private int images;


    public Hewan(String nama,String makanan,String habitat,int images) {
        this.nama=nama;
        this.makanan=makanan;
        this.habitat=habitat;
        this.images=images;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getImages() {
            return images;
        }
    public void setImages(int images) {
            this.images = images;
        }
}
