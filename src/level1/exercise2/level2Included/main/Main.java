package level1.exercise2.level2Included.main;

import level1.exercise2.level2Included.model.GenericMethods;
import level1.exercise2.level2Included.model.Person;

public class Main {
    public static void main(String[] args) {
    GenericMethods exampleWithString = new GenericMethods("Canyon","Bianchi","Orbea");
    System.out.println(exampleWithString.getT());
    System.out.println(exampleWithString.getU());
    System.out.println(exampleWithString.getV());

    System.out.println("---------------------------");

    GenericMethods exampleWithInt = new GenericMethods(1,2,3);
    System.out.println(exampleWithInt.getT());
    System.out.println(exampleWithInt.getU());
    System.out.println(exampleWithInt.getV());

    System.out.println("---------------------------");

    GenericMethods exampleWithClassPerson = new GenericMethods(new Person("Pablo", "Gomez", 31),new Person("Juan", "Perez", 27),new Person("Pedro","Almodovar", 62));
    System.out.println(exampleWithClassPerson.getT());
    System.out.println(exampleWithClassPerson.getU());
    System.out.println(exampleWithClassPerson.getV());

    System.out.println("---------------------------");

    exampleWithInt.setT(10);
    System.out.println(exampleWithInt.getT());

    System.out.println("---------------------------");

    exampleWithClassPerson.setU(new Person("Rodolfo", "Gomez", 34));
    System.out.println(exampleWithClassPerson.getU());

    System.out.println("---------------------------");

    exampleWithString.setU("Cannondale");
    System.out.println(exampleWithString.getV());

    System.out.println("---------------------------");
    System.out.println("LVL2 EX1, w is no generic");

    GenericMethods exampleWithNoGenericArgument = new GenericMethods("Canyon","Bianchi","Orbea",new Person("Pablo", "Gomez", 31));
    System.out.println(exampleWithNoGenericArgument.getW());
    System.out.println(exampleWithNoGenericArgument.getV());
    System.out.println(exampleWithNoGenericArgument.getT());
    System.out.println(exampleWithNoGenericArgument.getU());

    System.out.println("---------------------------");
    exampleWithNoGenericArgument.setW(new Person("Leonardo", "Douglas", 29));

    System.out.println("---------------------------");
    System.out.println("LVL2 EX2, v is varargs");
    GenericMethods exampleWithVarargs = new GenericMethods(1,2,3,4,5,6,7,8,9,10);
    System.out.println(exampleWithVarargs.getV());



    }
}

