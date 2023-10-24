import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Human> listOfHuman = new ArrayList<>();
        Human human1 = new Human("c", 20, 178.15, 200.5);
        Human human2 = new Human();

        human2.setName("b");
        human2.setAge(15);
        human2.setHeight(180.15);
        human2.setWeight(89.10);
        System.out.println("My name is " + human2.getName());
        Human human3 = Human.builder()
                .age(15).name("a")
                .build();
        listOfHuman.add(human1);
        listOfHuman.add(human2);
        listOfHuman.add(human3);
        System.out.println(listOfHuman);
        Collections.sort(listOfHuman, new Human());
        System.out.println(listOfHuman);

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Human implements Comparator<Human> {
    private String name;
    private int age;
    private double height;
    private double weight;

    @Override
    public int compare(Human o1, Human o2) {
        if (o1.age > o2.age) {
            return 1;
        }
        else if(o1.age < o2.age){
            return -1;
        }
        else{
            return 0;
        }
    }
}
