package level1.exercise1.main;

import level1.exercise1.model.NoGenericMethods;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NoGenericMethods ngm = new NoGenericMethods("Canyon","Bianchi","Orbea");
        System.out.println(ngm);

        ngm.setSecond("Bianchi");
        ngm.setThird("Orbea");
        ngm.setFirst("Canyon");

        System.out.println(ngm.getThird());
        System.out.println(ngm.getFirst());
        System.out.println(ngm.getSecond());

    }
}


