public class employee {
    String name;
    int year;
    String address;

    employee(String name, int year, String address){
        this.name = name;
        this.year = year;
        this.address = address;

    }

    public static void main(String[] args){

        employee E_1 = new employee("Robert", 1994, "64C- WallsStreet");
        employee E_2 = new employee("Sam", 2000, "68D- WallsStreet");
        employee E_3 = new employee("John", 1999, "26B- WallsStreet");

        System.out.println(E_1.name+" "+E_1.year+" "+E_1.address);
        System.out.println(E_2.name+" "+E_2.year+" "+E_2.address);
        System.out.println(E_3.name+" "+E_3.year+" "+E_3.address);
   }
}
