package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88, "Terrestrial"),
    VENUS("Venus", 225, "Terrestrial"),
    EARTH("Earth", 365, "Terrestrial"),
    MARS("Mars", 687, "Terrestrial"),
    JUPITER("Jupiter", 4333, "Ice Giant"),
    SATURN("Saturn", 10759, "Ice Giant"),
    URANUS("Uranus", 30687, "Gas Giant"),
    NEPTUNE("Neptune", 60200, "Gas Giant");

    private final String displayName;
    private final int yearLength;
    private final String planetType;

    Planets(String displayName, int yearLength, String planetType) {
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
