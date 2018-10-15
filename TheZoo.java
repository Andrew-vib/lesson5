package lesson5;

public class TheZoo {

    public static void main (String[] args) {

        Horse horse = new Horse( "Horse",16000,50,5);
        Dog dog = new Dog("Dog", 500, 20, 0, 0.4);
        Bird bird = new Bird("Bird", 10, 0, 0, 0.1);
        Cat cat = new Cat("Cat-Tom", 10, 0, 3);

        Animal[] zoo = {horse, dog, bird, cat};

        for (int i=0; i<zoo.length; i++) {
            if (zoo[i].getRun() == true) {
                System.out.println(zoo[i].name + " run " + zoo[i].run + " meters");
            } else {
                System.out.println(zoo[i].name + " can't run " + zoo[i].run + " meters");
            }
        }

        for (int i=0; i<zoo.length; i++) {
            if (zoo[i] instanceof Bird && zoo[i] instanceof Cat){
                System.out.println(bird.name + "don't swim");
            }  else if (zoo[i].getSwim() == true) {
                    System.out.println(zoo[i].name + " swim " + zoo[i].swim + " meters");
                } else {
                    System.out.println(zoo[i].name + " can't swim " + zoo[i].swim + " meters");
                }
            }


        for (int i=0; i<zoo.length; i++) {
            if (zoo[i].getJump() == true) {
                System.out.println(zoo[i].name + " jump " + zoo[i].jump + " meters");
            } else {
                System.out.println(zoo[i].name + " can't jump " + zoo[i].jump + " meters");
            }
        }
    }
}
