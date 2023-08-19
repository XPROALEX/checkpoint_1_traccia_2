public class Main {
    public static void main(String[] args) {
        Person[] personArray = new Person[]{
                new Person("Alessandro", 26),
                new Person("Martina", 24),
                new Person("Giacomo", 32)
        };
        String[] nameArray = new String[3];
        nameArray[0] = personArray[0].getName();
        nameArray[1] = personArray[1].getName();
        nameArray[2] = personArray[2].getName();

Methods.printFirstFiveLetters(nameArray);
System.out.println(Methods.thirdLettersChains(nameArray,2,1));
    }
}
