package se.patrikbergman.java.designpattern.builder.basic;

class Band {
    private final String name;
    private final String description;
    private final int yearsActive;

    private Band(Builder builder) {
        name = builder.name;
        description = builder.description;
        yearsActive = builder.yearsActive;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYearsActive() {
        return yearsActive;
    }

    public static final class Builder {
        private String name;
        private String description;
        private int yearsActive;

        public Builder() { }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder yearsActive(int yearsActive) {
            this.yearsActive = yearsActive;
            return this;
        }

        public Band build() {
            return new Band(this);
        }
    }
}
