package Design_Pattern.Prototype;

public class GameApp{
    public static void main(String[] args) {
        PlayerCharacter character = new PlayerCharacter("spikey", "armor", "shield");
        character.displayCharacter();

        PlayerCharacter character1 = (PlayerCharacter) character.cloneCharacter();
//        character1.displayCharacter();
        character1.setClothing("robe");
        character1.setAccessories("magic wand");
        character1.displayCharacter();

        PlayerCharacter character2 = (PlayerCharacter) character1.cloneCharacter();
//        character2.displayCharacter();
        character2.setHairstyle("long");
        character2.setAccessories("sword");
        character2.setClothing("leather jacket");
        character2.displayCharacter();
    }
}
