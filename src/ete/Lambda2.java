package ete;

interface Sayable{
    public String say(String name);
        }
public class Lambda2 {
    public static void main(String[] args) {
//        Sayable s = (String name) -> {
//           return "Hello " + name;
//      };
        //Sayable s = (name)->{return "Hello "+name;};
        Sayable s = name->{return "Hello " +name;};
        System.out.println(s.say("Jarvis"));
    }
}
