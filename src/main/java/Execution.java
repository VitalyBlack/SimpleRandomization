import org.jeasy.random.EasyRandom;

public class Execution {

    static EasyRandom g = new EasyRandom();

    static Address address = new Address("SPb");
    static Job job = new Job("job", "somewhere");
    static Person person = new Person("guy", "some");

    public static void main(String[] args) {
        Data res = setAndReturnData(address, job, person);
        System.out.println(res.toString());
    }

    public static Data setAndReturnData(Address address, Job job, Person person) {
        Data result = new Data(address, person, job);
        result = g.nextObject(Data.class);
        return result;
    }
}
