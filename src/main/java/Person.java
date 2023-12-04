import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Person {
        public String nume;
        public int varsta;
        public Person(String nume, int varsta){
            this.nume=nume;
            this.varsta=varsta;
        }
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = new Person("Adriana", 20);
        Person person2 = new Person ("Andreea", 21);
        objectMapper.writeValue(new File("C:\\Users\\cti22b212\\IdeaProjects\\lab09\\person.txt"), person);
    }
}
