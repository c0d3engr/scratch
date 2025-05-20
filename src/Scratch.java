
public static void main()
{

}



/*
/*
// no.4 array
// main() resides here
class Scratch {
    public static void main(String a[])
    {
        Character c1 = new Character();
        c1.accntNo = 1;
        c1.name = "wetch";
        c1.zeny = 1000000;

        Character c2 = new Character();
        c2.accntNo = 1;
        c2.name = "c0d3";
        c2.zeny = 900000;

        Character c3 = new Character();
        c3.accntNo = 1;
        c3.name = "fl0w";
        c3.zeny = 30000;

        Character characters[] = new Character[3];
        characters[0] = c1;
        characters[1] = c2;
        characters[2] = c3;

        for(int i=0; i<characters.length; i++)
        {
            System.out.println(characters[i].name + " " + characters[i].zeny);
        }
    }
}

 */


//============================================
// Everything else resides here
//============================================
/*
class Character
{
    int accntNo;
    String name;
    double zeny;
}
*/


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
*/