package StackAndQueue.CatAndDogQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * add(): add a cat or dog instance to the queue
 * pollAll(): poll out each cat or dog FIFO
 * pollCat(): poll out each cat FIFO
 * pollDog(): poll out each dog FIFO
 * isEmpty(): check if any cat or dog instance remained in the queue
 * isCatEmpty() & isDogEmpty()
 */
public class CatAndDogQueue {

    private Queue<PetEntityForQueue> catQueue;
    private Queue<PetEntityForQueue> dogQueue;
    private long count;

    public CatAndDogQueue() {
        this.catQueue = new LinkedList<>();
        this.dogQueue = new LinkedList<>();
        this.count = 0;
    }

    public boolean add(Pet pet) {

        if (pet.getType().equals("Cat")) {

            catQueue.add(new PetEntityForQueue(pet, count ++));

            return true;

        } else if (pet.getType().equals("Dog")) {

            dogQueue.add(new PetEntityForQueue(pet, count ++));

            return true;
        } else {

            return false;
        }
    }

    public Pet pollAll() {

        if (!catQueue.isEmpty() && !dogQueue.isEmpty()) {

            return (catQueue.peek().getCount() < dogQueue.peek().getCount())
                    ? catQueue.poll().getPet() : dogQueue.poll().getPet();
        } else if (!catQueue.isEmpty()) {

            return catQueue.poll().getPet();
        } else if (!dogQueue.isEmpty()) {

            return dogQueue.poll().getPet();
        } else {

            throw new RuntimeException("The queue is empty.");
        }
    }

    public Cat pollCat() {

        if (!catQueue.isEmpty()) {

            return (Cat) catQueue.poll().getPet();
        } else {

            throw new RuntimeException("Cat queue is empty.");
        }
    }

    public Dog pollDog() {

        if (!dogQueue.isEmpty()) {

            return (Dog) dogQueue.poll().getPet();
        } else {

            throw new RuntimeException("Dog queue is empty.");
        }
    }

    public boolean isCatEmpty() {

        return catQueue.isEmpty();
    }

    public boolean isDogEmpty() {

        return dogQueue.isEmpty();
    }

    public boolean isEmpty() {

        return isCatEmpty() && isDogEmpty();
    }
}
