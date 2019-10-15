/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan32.daftarfilm;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membuat daftar fil yang sedang tayang dengan konsep pbo
 */
public class PBO210118046Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Daftar Film yang Sedang Tayang===");
        Film film1 = new Film();
        Film film2 = new Film();
        Film film3 = new Film();
        Film film4 = new Film();
        
        film1.setFilmName("Venow"); film1.setFilmGenre("Action, Horror, Scifi"); film1.setFilmRating(8.5); film1.setFilmDuration(120);
        film2.setFilmName("Small Foot"); film2.setFilmGenre("Animation"); film2.setFilmRating(9.0); film2.setFilmDuration(96);
        film3.setFilmName("Crazy Rich Asian"); film3.setFilmGenre("Comedy"); film3.setFilmRating(7.8); film3.setFilmDuration(119);
        film4.setFilmName("Asih"); film4.setFilmGenre("Horror"); film4.setFilmRating(6.0); film4.setFilmDuration(100);
        
        film1.nowPlaying();
        film2.nowPlaying();
        film3.nowPlaying();
        film4.nowPlaying();
        
        
    }

}
