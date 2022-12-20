public class Monkey extends Animal{
    @Override
    void sound() {
        System.out.println("Sound of monkey");
        SoundOfAnimals.soundOfAnimal("monkey.mp3");

    }
}
