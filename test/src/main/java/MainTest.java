import java.util.LinkedList;

public class MainTest {

    public static LinkedList<String> letters = new LinkedList<String>();

    public static void main(String[] args) {

        String name = "Dawid Kazmierczak";
        fillListWithLetters();
        System.out.println(count(name));

    }

    public static void fillListWithLetters(){
        char letter = 'a';
        for (int i = 0; i < 26; i++) {
            letters.add(Character.toString(letter));
            letter++;
        }
    }

    public static int count(String a){
        int results = 0;
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == ' ')
                results += 0;
            else
                results += letters.indexOf(Character.toString(a.charAt(i))) + 1;
        }
        return results % 2;
    }
}
