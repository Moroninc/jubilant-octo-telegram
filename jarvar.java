public class jarvar {
    public static void main(String[] args) {

        String name = "James"; // string
        System.out.println(name); // print string above

        String[] nameList = {"Jacob", "Tony", "Kyle"}; // array

        for (String i : nameList) {
            System.out.println(i);
        } // for loop

        System.out.println(sayName()); // use a function to return a string to console.

        System.out.println(coinFlip()); // flips a coin. see function line: 23 -> 30

    }

    public static String sayName() { // new function, can be used anywhere within the type.
        return "Name.";
    }

    public static Boolean coinFlip() { // this function will get a random number then see if that number is higher than .5
        if (Math.random() >= .5) {
            return true;               // if it is return true.
        }
        else {
            return false;              // if not, then return false
        }
    }

    public static Number oneThroughTen() {

        Number num = (Math.random() * 10);
        return num;
    }
}