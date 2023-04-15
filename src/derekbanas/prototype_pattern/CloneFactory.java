package derekbanas.prototype_pattern;


class CloneFactory {

    Animal getClone(Animal animalSample) {

        return animalSample.makeCopy();

    }

}
