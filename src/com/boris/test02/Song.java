package com.boris.test02;

public class Song {
    private String name;
    private String artistName;
    private int duration;
    private double durationInSeconds;
    
    public Song(String name, String artistName, int duration) {
        this.name = name;
        this.artistName = artistName;
        this.duration = duration;
        /*
         *  The parameter 260 passed in to the constructor represents the duration in
            seconds, 
         */
        this.durationInSeconds = (double) duration / 60.0d;
    }

    /*
     * and the method getDurationInMinutes calculates the duration in minutes.
     */
    public double getDurationInMinutes() {
        return durationInSeconds;
    }
    
/*   NA DRUGI NACIN KAKO JE method napisan   
 * 
 * public Song(String name, String artistName, int duration) {
        this.name = name;
        this.artistName = artistName;
        this.duration = duration;
    } 
    public double getDurationInMinutes() {
        return (double) duration / 60.0d;
    }*/
    
    
    

}
