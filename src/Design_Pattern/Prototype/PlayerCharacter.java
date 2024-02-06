package Design_Pattern.Prototype;

public class PlayerCharacter implements CharacterPrototype{
    private String hairstyle;
    private String clothing;
    private String accessories;

    public PlayerCharacter(String hairstyle, String clothing, String accessories) {
        this.hairstyle = hairstyle;
        this.clothing = clothing;
        this.accessories = accessories;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    @Override
    public CharacterPrototype cloneCharacter() {
        return new PlayerCharacter(this.hairstyle, this.clothing, this.accessories);
    }

    @Override
    public void displayCharacter() {
        System.out.println("Character with " + hairstyle + " hairstyle, " + clothing + " clothing, " + " and " + accessories + " accessories.");
    }
}
