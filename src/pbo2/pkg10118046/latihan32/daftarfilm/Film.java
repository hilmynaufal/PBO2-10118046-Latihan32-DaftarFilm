/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan32.daftarfilm;

/**
 *
 * @author ASUS
 */
public class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public double getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(double filmRating) {
        this.filmRating = filmRating;
    }

    public int getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(int filmDuration) {
        this.filmDuration = filmDuration;
    }
    
    public void nowPlaying() {
        System.out.println("\nJudul Film: " + filmName);
        System.out.println("Genre Film: " + filmGenre);
        System.out.println("Rating Film: " + filmRating);
        System.out.println("Duration Film: " + filmDuration + " Menit");
    }
}
