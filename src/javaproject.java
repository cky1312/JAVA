
/*import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Person implements Serializable{
    private String name;
    Person(String name) {
        this.name = name;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    abstract void display();
}

class Employee extends Person{
    private int id;
    private LocalDate date_of_join;
    Employee() {
        id = 0;
        date_of_join = null;
    }
    void display() {
        System.out.println("\nName: "+getName());
    }

    void setId(int id){
        this.id = id;
    }
    void setDate_of_join(LocalDate date_of_join){
        this.date_of_join = date_of_join;
    }
    int getId(){
        return id;
    }
    LocalDate getDate_of_join(){
        return date_of_join;
    }
}

class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            employees.add(new Employee());
            System.out.print("Enter the name of the Employee:");
            employees.get(i).setName(sc.nextLine());
            System.out.print("Enter the ID of Employee"+(i+1)+":");
            try {
                int id = sc.nextInt();
                if (id<0)
                    throw new InputMismatchException();
                employees.get(i).setId(id);
            }
            catch (Exception e) {
                System.out.println("The given ID is invalid. Please enter valid ID number.");
                System.exit(0);
            }

            sc.nextLine();
            System.out.print("Enter the Joining date(yyyy-mm-dd) of Employee"+(i+1)+":");
            String date  = sc.nextLine();
            LocalDate obj = LocalDate.parse(date);
            employees.get(i).setDate_of_join(obj);
            System.out.println("");
        }
        int total = serializeObject(employees);
        deserializeObjects(total);
    }
    static int serializeObject(ArrayList<Employee> employees) {
        int count = 0;
        try (FileOutputStream fos = new FileOutputStream("records.txt"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            for (Employee e:
                    employees) {
                if (e.getDate_of_join().getYear() <2015){
                    oos.writeObject(e);
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while writing the object");
        }
        return count;
    }
    static void deserializeObjects(int count) {
        try (FileInputStream fis = new FileInputStream("records.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            System.out.println("\nList of Employees who joined before 2015");
            if (count == 0){
                throw new Exception();
            }
            for (int i = 0; i < count; i++) {
                Employee E = (Employee)ois.readObject();
                E.display();
                System.out.println("Id: "+E.getId());
                System.out.println("Date of joining: "+E.getDate_of_join());
            }
        }catch (Exception e){
            System.out.println("\nSorry! No entries found!!!");
        }
    }
}

 */