/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasse
 */
public class Result {
    private String country;
    private int year;
    private String sex;    
    private double literacyPercent;
 
    public Result(String country, int year, String sex, double literacyPercent) {
        this.country = country;
        this.year = year;
        this.sex = sex;     
        this.literacyPercent = literacyPercent;
    }
 
    public double getLiteracyPercent() {
        return literacyPercent;
    }
 
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacyPercent;
    }
}