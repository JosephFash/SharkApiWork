package com.example.shark.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sharks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Breed;
    private String Country;
    private Integer Weight;
    private Integer Length;
    private Integer Attacks;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String Breed) {
        this.Breed = Breed;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Integer getWeight() {
        return Weight;
    }

    public void setWeight(Integer Weight) {
        this.Weight = Weight;
    }

    public Integer getLength() {
        return Length;
    }

    public void setLength(Integer Length) {
        this.Length = Length;
    }

    public Integer getAttacks() {
        return Attacks;
    }

    public void setAttacks(Integer attacks) {
        Attacks = attacks;
    }


    public Sharks(){}
    public Sharks(Long id, String Breed, String Country, Integer Weight, Integer Length, Integer Attacks) {
        this.id = id;
        this.Breed = Breed;
        this.Country = Country;
        this.Weight = Weight;
        this.Length = Length;
        this.Attacks = Attacks;
    }
}
