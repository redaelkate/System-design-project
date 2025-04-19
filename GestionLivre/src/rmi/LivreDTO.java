package rmi;

import java.io.Serializable;

public class LivreDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    // Attributs du livre
    private String nomLivre;
    private String auteurLivre;
    private String ISBN;
    private int numeroExemplaire;
    private String editeur;
    private Genre genre;

    // Constructeur
    public LivreDTO(String nomLivre, String auteurLivre, String ISBN, int numeroExemplaire, String editeur, Genre genre) {
        this.nomLivre = nomLivre;
        this.auteurLivre = auteurLivre;
        this.ISBN = ISBN;
        this.numeroExemplaire = numeroExemplaire;
        this.editeur = editeur;
        this.genre = genre;
    }

    // Getters et Setters
    public String getNomLivre() {
        return nomLivre;
    }

    public void setNomLivre(String nomLivre) {
        this.nomLivre = nomLivre;
    }

    public String getAuteurLivre() {
        return auteurLivre;
    }

    public void setAuteurLivre(String auteurLivre) {
        this.auteurLivre = auteurLivre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroExemplaire() {
        return numeroExemplaire;
    }

    public void setNumeroExemplaire(int numeroExemplaire) {
        this.numeroExemplaire = numeroExemplaire;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}