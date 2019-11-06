package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal{
	private Integer avgSwimDepth;
	private TypeOfWater waterType;

    public Integer getavgSwimDepth() {
        return avgSwimDepth;
    }

    public void setavgSwimDepth(Integer avgSwimDepth) {
        this.avgSwimDepth = avgSwimDepth;
    }

    public TypeOfWater getWaterType() {
        return waterType;
    }

    public void setWaterType(TypeOfWater waterType) {
        this.waterType = waterType;
    }
}
