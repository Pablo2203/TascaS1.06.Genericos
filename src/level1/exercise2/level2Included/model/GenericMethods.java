package level1.exercise2.level2Included.model;

import java.util.Arrays;

public class GenericMethods <T,U,V>{
    private T t;
    private U u;
    private V[] v; //level 2 ex2
    private Person w; //Level 2 ex1


    public GenericMethods(T t, U u, V... v){
        this.t = t;
        this.u = u;
        this.v = v;
    }

    public GenericMethods(T t, U u, Person w, V... v) { //Level 2 ex1
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }

    public Person getW() {
        return w;
    }

    public V[] getV() {
        return v;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setU(U u) {
        this.u = u;
    }

    public void setW(Person w) {
        this.w = w;
    }

    public void setV(V[] v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "GenericMethods{" +
                "t=" + t +
                ", u=" + u +
                ", v=" + Arrays.toString(v) +
                ", w=" + w +
                '}';
    }
}

