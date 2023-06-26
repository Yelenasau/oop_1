import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Gryffindor students = new Gryffindor("Гарри Поттер", random.nextInt(101), random.nextInt(101), "Gryffindor", random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Gryffindor students1 = new Gryffindor("Гермиона Грейнджер", random.nextInt(101), random.nextInt(101), "Gryffindor", random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Gryffindor students2 = new Gryffindor("Рон Уизли", random.nextInt(101), random.nextInt(101), "Gryffindor", random.nextInt(101), random.nextInt(101), random.nextInt(101));

        Slytherin students3 = new Slytherin(" Драко Малфой",  random.nextInt(101), random.nextInt(101), "Slytherin",  random.nextInt(101), random.nextInt(101),  random.nextInt(101), random.nextInt(101),  random.nextInt(101));
        Slytherin students4 = new Slytherin("Грэхэм Монтегю ", random.nextInt(101), random.nextInt(101), "Slytherin",  random.nextInt(101), random.nextInt(101),  random.nextInt(101), random.nextInt(101),  random.nextInt(101));
        Slytherin students5 = new Slytherin("Грегори Гойл  ", random.nextInt(101), random.nextInt(101), "Slytherin",  random.nextInt(101), random.nextInt(101),  random.nextInt(101), random.nextInt(101),  random.nextInt(101));

        Hufflepuff students6 = new Hufflepuff("Захария Смит ", random.nextInt(101), random.nextInt(101), "Hufflepuff", random.nextInt(101), random.nextInt(101),  random.nextInt(101) );
        Hufflepuff students7 = new Hufflepuff(" Седрик Диггори", random.nextInt(101), random.nextInt(101), "Hufflepuff", random.nextInt(101), random.nextInt(101),  random.nextInt(101) );
        Hufflepuff students8 = new Hufflepuff("Джастин Финч-Флетчли ", random.nextInt(101), random.nextInt(101), "Hufflepuff", random.nextInt(101), random.nextInt(101),  random.nextInt(101) );

        Ravenclaw students9 = new Ravenclaw("Чжоу Чанг", random.nextInt(101), random.nextInt(101),  "Ravenclaw", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101) );
        Ravenclaw students10 = new Ravenclaw("Падма Патил",random.nextInt(101), random.nextInt(101),  "Ravenclaw", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101) );
        Ravenclaw students11 = new Ravenclaw(" Маркус Белби", random.nextInt(101), random.nextInt(101),  "Ravenclaw", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101) );

        students.compare(students6);

        students3.compare(students5);

        System.out.println( students );
        System.out.println( students1 );
        System.out.println( students2 );
        System.out.println( students3 );
        System.out.println( students4 );
        System.out.println( students5 );
        System.out.println( students6 );
        System.out.println( students7 );
        System.out.println( students8 );
        System.out.println( students9 );
        System.out.println( students10 );
        System.out.println( students11 );



    }
}
