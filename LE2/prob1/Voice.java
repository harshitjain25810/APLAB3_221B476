// Define the Voice class
public class Voice {
    Animal[] animals = new Animal[5];

    // Method to prepare the voices
    void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    // Method to hear the voices
    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}