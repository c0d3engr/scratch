
/* // no.3 Runnable main() resides here. This particular exercise will demonstrate method overloading in Java.
class Demo {
    public static void main(String a[])
    {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        Calculator add2 = new Calculator();
        int addTwo= add2.add(num1, num2);
        System.out.println(addTwo);

        Calculator add3 = new Calculator();
        int addThree= add3.add(num1, num2, num3);
        System.out.println(addThree);

    }
}

// =====================================
// All other classes/methods below:
// =====================================

class Calculator
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
}*/


// no.2 Runnable main resides here.
/*public class Demo
{
    public static void main (String args[])
    {
        Computer feature = new Computer();
        feature.playMusic();

        Computer obj = new Computer();
        String str = obj.getMePen(3);
        System.out.println(str);
    }
}

// ==================================================
// ********* ALL other classes/methods below this:
// ==================================================


class Computer
{
    public void playMusic()
    {
        System.out.println("Music playing..");
    }

    public String getMePen(int cost)
    {
        if (cost >=9)
            return "Pen";
        return "Nothing";
    }
}*/


// no.1
/* public class Demo{
    public static void main(String args[])
    {
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);

        System.out.println(result);
    }
}

// This is a calculator to do multiple calculation operations.
class Calculator{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}*/

/* working init git command:
git add .
git commit -m "Initial commit"
git branch -M main
git push -u origin main
*/

