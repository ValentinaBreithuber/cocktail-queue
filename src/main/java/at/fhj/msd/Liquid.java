package at.fhj.msd;
// put into drinkss


/**
 * Object with drinks consist of Liquid
 */
public class Liquid {

    /**
     * Name of liquid
     */
    private String name;

    /**
     * volume of liquid
     */
    private double volume;

    /**
     * alcohol percent of liquid
     */
    private double alcoholPercent;

    /**
     * Constactor of Liquid
     *
     * @param name Name of Liquid
     * @param volume Volume of Liquid
     * @param alcoholPercent Alcohol content of Liquid in Percent
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Gets Name of Liquid
     *
     * @return Name of drink
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of Liquid
     *
     * @param name Name of Liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets Volume of Liquid
     *
     * @return Volume of drink
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the Volume of Liquid
     *
     * @param volume Volume of Liquid
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Gets Alcohol Content of Liquid
     *
     * @return Name of drink
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the Alcohol Content of Liquid
     *
     * @param alcoholPercent Alcohol Content of Liquid
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
