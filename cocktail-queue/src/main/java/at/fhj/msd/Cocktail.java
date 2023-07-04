package main.java.at.fhj.msd;

import java.util.ArrayList;

public class Cocktail extends Drink {

    /**
     * Name of Cocktail
     */
    private String Name;

    /**
     * List of Liquids
     */
    private ArrayList<Liquid> Liquids=new ArrayList<Liquid>();

    /**
     * Volume of all Liquids
     */
    private double Volume=0;

    /**
     * Creates a Cocktail object with given name a list of liquids
     *
     * @param name name of cocktail
     * @param liquids list of liquids of the cocktail
     */
    public Cocktail(String name, ArrayList<Liquid> liquids) {
        super(name);
        Name = name;
        Liquids = liquids;
        for (int i=0;i<liquids.size();i++){
            Volume+=liquids.get(i).getVolume();
        }
    }

    /**
     * Return the volume of the cocktail
     *
     * @return Volume volume of cocktail
     */
    @Override
    public double getVolume() {
        return this.Volume;
    }

    /**
     * Calculates and returns the AlcoholContent of cocktail
     *
     * @return alcoholContent Alcohol content in percent
     */
    @Override
    public double getAlcoholPercent() {
        double alcoholContent=0;
        for (int i =0;i<Liquids.size();i++){
            double alcohol = Liquids.get(i).getAlcoholPercent()/100;
            double volume=Liquids.get(i).getVolume();
            double volumeTotal= this.getVolume();
            alcoholContent+=((volume*alcohol)/volumeTotal)*100;
        }
        return alcoholContent;
    }

    /**
     * Is the drink alcoholic
     *
      * @return true when alcoholic, false when non-alcoholic
     */
    @Override
    public boolean isAlcoholic() {
        boolean ret=false;
        for (int i=0;i<Liquids.size();i++){
            if(Liquids.get(i).getAlcoholPercent()>0){
                ret=true;
            }
        }
        return ret;
    }

}
