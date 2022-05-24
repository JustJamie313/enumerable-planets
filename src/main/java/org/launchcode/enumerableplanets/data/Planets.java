package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury",88, "Terrestrial"),
    VENUS("Venus",225,"Terrestrial"),
    EARTH("Earth",365, "Terrestrial"),
    MARS("Mars",687, "Terrestrial"),
    JUPITER("Jupiter",4333,"Gas Giant"),
    SATURN("Saturn",10759, "Gas Giant"),
    URANUS("Uranus",30687, "Ice Giant"),
    NEPTUNE("Neptune",60200, "Ice Giant");

    private final String displayName;
    private final int yearLength;
    private final String planetType;
    Planets(String displayName,int yearLength, String planetType){
        this.displayName = displayName;
        this.yearLength = yearLength;
        this.planetType = planetType;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getYearLength() {
        return yearLength;
    }

    public String getPlanetType() {
        return planetType;
    }
}
