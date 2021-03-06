package com.abdulelah.binsaleem.models.raw_data;

public enum Continent {
    Asia("Asia"),
    Europe("Europe"),
    North_America("North America"),
    Africa("Africa"),
    Oceania("Oceania"),
    Antarctica("Antarctica"),
    South_America("South America");

    public final String label;

    private Continent(String label) {
        this.label = label;
    }

    public static Continent fromString(String text) {
        for (Continent b : Continent.values()) {
            if (b.label.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}