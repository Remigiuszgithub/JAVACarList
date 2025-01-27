package com.example.carlist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marka;
    private String model;
    private int rokProdukcji;
    private double pojemnoscSilnika;
    private int liczbaDrzwi;
    private int konieMechaniczne;

    // Konstruktory
    public Car() {
    }

    public Car(String marka, String model, int rokProdukcji, double pojemnoscSilnika, int liczbaDrzwi, int konieMechaniczne) {
        if (rokProdukcji <= 0) {
            throw new IllegalArgumentException("Rok produkcji musi być liczbą dodatnią.");
        }
        if (pojemnoscSilnika <= 0) {
            throw new IllegalArgumentException("Pojemność silnika musi być liczbą dodatnią.");
        }
        if (liczbaDrzwi != 3 && liczbaDrzwi != 5) {
            throw new IllegalArgumentException("Liczba drzwi może wynosić tylko 3 lub 5.");
        }
        if (konieMechaniczne <= 0) {
            throw new IllegalArgumentException("Ilość koni mechanicznych musi być liczbą dodatnią.");
        }

        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.pojemnoscSilnika = Math.round(pojemnoscSilnika * 10.0) / 10.0;
        this.liczbaDrzwi = liczbaDrzwi;
        this.konieMechaniczne = konieMechaniczne;
    }

    // Gettery i Settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        if (rokProdukcji <= 0) {
            throw new IllegalArgumentException("Rok produkcji musi być liczbą dodatnią.");
        }
        this.rokProdukcji = rokProdukcji;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        if (pojemnoscSilnika <= 0) {
            throw new IllegalArgumentException("Pojemność silnika musi być liczbą dodatnią.");
        }
        this.pojemnoscSilnika = Math.round(pojemnoscSilnika * 10.0) / 10.0;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        if (liczbaDrzwi != 3 && liczbaDrzwi != 5) {
            throw new IllegalArgumentException("Liczba drzwi może wynosić tylko 3 lub 5.");
        }
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public int getKonieMechaniczne() {
        return konieMechaniczne;
    }

    public void setKonieMechaniczne(int konieMechaniczne) {
        if (konieMechaniczne <= 0) {
            throw new IllegalArgumentException("Ilość koni mechanicznych musi być liczbą dodatnią.");
        }
        this.konieMechaniczne = konieMechaniczne;
    }
}

