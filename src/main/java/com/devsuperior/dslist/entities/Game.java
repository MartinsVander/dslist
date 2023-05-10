package com.devsuperior.dslist.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity  // configura classe como se fosse uma tabela
@Table(name = "tb_game")	// customizar nome da tabela do banco

public class Game {
	
	@Id  // id chame primaria
	@GeneratedValue (strategy = GenerationType.IDENTITY) //autoincremento
	
	private Long id;
	private String title;
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl ;
	@Column(columnDefinition = "TEXT") // tipo texto no sql
	private String shortDescription;
	@Column(columnDefinition = "TEXT")
	private String longDescription;

		public Game() {
			
		}

		public Game(Long id, String title, Integer year, String genre, String platforms,Double score, String imgUrl,
				String shortDescription, String longDescription) {
			
			this.id = id;
			this.title = title;
			this.year = year;
			this.genre = genre;
			this.platforms = platforms;
			this.score=score;
			this.imgUrl = imgUrl;
			this.shortDescription = shortDescription;
			this.longDescription = longDescription;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getPlatforms() {
			return platforms;
		}

		public void setPlatforms(String platforms) {
			this.platforms = platforms;
		}
		
		

		public Double getScore() {
			return score;
		}

		public void setScore(Double score) {
			this.score = score;
		}

		public String getImgUrl() {
			return imgUrl;
		}

		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}

		public String getShortDescription() {
			return shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getLongDescription() {
			return longDescription;
		}

		public void setLongDescription(String longDescription) {
			this.longDescription = longDescription;
		}

		//esses dois metodos compara se os games são iguais
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Game other = (Game) obj;
			return Objects.equals(id, other.id);
		}
		
		
		
		
}
