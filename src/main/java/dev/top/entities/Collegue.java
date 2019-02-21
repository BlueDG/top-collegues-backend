package dev.top.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collegue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String pseudo;
    @Column
    private Integer score;
    @Column
    private String photoURL;
    

    public Collegue() {
    	
    	
    }

    
    
    public Collegue(String pseudo, Integer score, String photoUrl) {
		super();
		this.pseudo = pseudo;
		this.score = score;
		this.photoURL = photoUrl;
	}



	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}



	public String getPhotoURL() {
		return photoURL;
	}



	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

    
}
