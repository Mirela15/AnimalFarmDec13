public class Donkey extends Animal{

    @Override
    void sound() {
        System.out.println("donkey nihaniha");
        SoundOfAnimals.soundOfAnimal("Donkey.mp3");
    }
    @Override
    public void move(){
        System.out.println("It moves like a donkey ");
    }

}
