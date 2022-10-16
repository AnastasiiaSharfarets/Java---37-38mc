package Lesson3;

public class CastingObject {
    int i;
    String s;
    private void get(){

    }

    public static void main(String[] args) {
        CastingObject castingObject = new CastingObject();
        castingObject.get();
        String s = String.valueOf(99);
        Person person = new Person(1, "");
        person.getTTT();
    }
}
