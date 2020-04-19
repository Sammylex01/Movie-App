package com.example.movie.model;

import androidx.core.app.ServiceCompat;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("adult")
    private boolean adult;

    @SerializedName("overview")
    private String overview;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName ("genre ids")
    private List<Integer> genreIds = new ArrayList<Integer>();

    @SerializedName ("id")
    private Integer id;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName ("original_language")
    private String originalLanguage;

    @SerializedName ("title")
    private String title;

    @SerializedName ("backdrop_count")
    private String backdropCount;

    @SerializedName ("popularity")
    private Double popularity;

    @SerializedName ("vote_count")
    private Integer voteCount;

    @SerializedName ("video")
    private Boolean video;

    @SerializedName ("vote_average")
    private Double voteAverage;

    public Movie (String posterPath, Boolean adult, String overview, String releaseDate, List<Integer> genreIds,
                  Integer id, String originalTitle, String originalLanguage, String title, String backdropCount,
                  Double popularity, Integer voteCount, Boolean video, Double voteAverage) {

        this.posterPath = posterPath;
        this.adult = adult;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.genreIds = genreIds;
        this.id = id;
        this.originalTitle = originalTitle;
        this.originalLanguage = originalLanguage;
        this.title = title;
        this.backdropCount = backdropCount;
        this.popularity = popularity;
        this.voteCount = voteCount;
        this.video = video;
        this.voteAverage = voteAverage;
    }

    public String getPosterPath(){
        return posterPath;
    }

    public void setPosterPath (String posterPath){
        this.posterPath = posterPath;
    }

    public boolean  isAdult(){
        return adult;
    }

    public void setAdult (boolean adult){
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview (String overview){
        this.overview = overview;
    }

    public String getReleaseDate (){
        return releaseDate;
    }

    public void setReleaseDate (String releaseDate){
        this.releaseDate = releaseDate;
    }

    public List<Integer> getGenreIds (){
        return genreIds;
    }

    public void setGenreIds (List<Integer> genreIds){
        this.genreIds = genreIds;
    }

    public Integer getId (){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    public String getOriginalTitle(){
        return originalTitle;
    }

    public void setOriginalTitle (String originalTitle){
        this.originalTitle = originalTitle;
    }

    public String getOriginalLanguage(){
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage){
        this.originalLanguage = originalLanguage;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle (String title){
        this.title = title;
    }

    public String getBackdropCount(){
        return backdropCount;
    }

    public void setBackdropCount (String backdropCount){
        this.backdropCount = backdropCount;
    }

    public Double getPopularity(){
        return popularity;
    }

    public void setPopularity(double popularity){
        this.popularity = popularity;
    }

    public Integer getVoteCount(){
        return voteCount;
    }

    public void setVoteCount(int voteCount){
        this.voteCount = voteCount;
    }

    public Double getVoteAverage(){
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage){
        this.voteAverage = voteAverage;
    }

    public Boolean getVideo(){
        return video;
    }

    public void setVideo (boolean video){
        this.video = video;
    }
}
