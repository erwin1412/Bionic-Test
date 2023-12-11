package com.example.erwin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Food")
public class Food {
    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "tutorialLink", nullable = false)
    private String tutorialLink;

    @Column(name = "ingredients", nullable = false)
    private String ingredients;

    @Column(name = "area", nullable = true)
    private String area;

    @Column(name = "descriptions", nullable = true)
    private String descriptions;

    @Column(name = "bahan1", nullable = true)
    private String bahan1;

    @Column(name = "amount1", nullable = true)
    private String amount1;

    @Column(name = "unit1", nullable = true)
    private String unit1;

    @Column(name = "bahan2", nullable = true)
    private String bahan2;

    @Column(name = "amount2", nullable = true)
    private String amount2;

    @Column(name = "unit2", nullable = true)
    private String unit2;

    @Column(name = "bahan3", nullable = true)
    private String bahan3;

    @Column(name = "amount3", nullable = true)
    private String amount3;

    @Column(name = "unit3", nullable = true)
    private String unit3;

    public Food() {
    }

    public Food(String name, String tutorialLink, String ingredients, String area, String descriptions, String bahan1,
            String amount1, String unit1, String bahan2, String amount2, String unit2, String bahan3, String amount3,
            String unit3) {
        super();
        this.name = name;
        this.tutorialLink = tutorialLink;
        this.ingredients = ingredients;
        this.area = area;
        this.descriptions = descriptions;
        this.bahan1 = bahan1;
        this.amount1 = amount1;
        this.unit1 = unit1;
        this.bahan2 = bahan2;
        this.amount2 = amount2;
        this.unit2 = unit2;
        this.bahan3 = bahan3;
        this.amount3 = amount3;
        this.unit3 = unit3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTutorialLink() {
        return tutorialLink;
    }

    public void setTutorialLink(String tutorialLink) {
        this.tutorialLink = tutorialLink;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getBahan1() {
        return bahan1;
    }

    public void setBahan1(String bahan1) {
        this.bahan1 = bahan1;
    }

    public String getBahan2() {
        return bahan2;
    }

    public void setBahan2(String bahan2) {
        this.bahan2 = bahan2;
    }

    public String getBahan3() {
        return bahan3;
    }

    public void setBahan3(String bahan3) {
        this.bahan3 = bahan3;
    }

    public String getAmount1() {
        return amount1;
    }

    public void setAmount1(String amount1) {
        this.amount1 = amount1;
    }

    public String getAmount2() {
        return amount2;
    }

    public void setAmount2(String amount2) {
        this.amount2 = amount2;
    }

    public String getAmount3() {
        return amount3;
    }

    public void setAmount3(String amount3) {
        this.amount3 = amount3;
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }

    public String getUnit3() {
        return unit3;
    }

    public void setUnit3(String unit3) {
        this.unit3 = unit3;
    }

}
