package exemploInterface;

public class principal {
    public static void main(String[] args) {
        vetor v1 = new vetor(10);
        v1.adiciona("elemento a");
        v1.adiciona("elemento b");
        v1.adiciona("elemento c");
        System.out.println(v1);
        System.out.println("apagando o elemento: " + v1.remove());
        System.out.println(v1);
    }
}
