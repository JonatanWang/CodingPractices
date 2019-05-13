package StackAndQueue.CatAndDogQueue;

public class PetEntityForQueue {

    private Pet pet;

    // timestamp
    private long count;

    public PetEntityForQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public long getCount() {
        return count;
    }

    public String getPetType() {

        return this.pet.getType();
    }
}
