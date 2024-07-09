/*Create an abstract class Marks with three instance variables (markICP, markDSA,
and percentage) and an abstract method getPercentage(). Create two classes: CSE
with instance variable algoDesign, and NonCSE with instance variable enggMechanics. Both classes inherit the abstract class Marks and override the abstract method
getPercentage(). The constructor of class CSE takes the marks in three subjects
(markICP, markDSA, and algoDesign) as its parameters, and the constructor of class
NonCSE takes the marks in three subjects (markICP, markDSA, and enggMechanics)
as its parameters. Create an object for each of the two classes and print the percentage
of marks for both students. */
package ass2;
abstract class Marks{
    int marksIcp;
    int marksDsa;
    int percentage;
    abstract void getPercentage();
    Marks(int marksIcp, int marksDsa){
        this.marksIcp=marksIcp;
        this.marksDsa=marksDsa;
    }
}
class CSE extends Marks {
    int algodesign;

    CSE(int marksIcp, int marksDsa, int algodesign) {
        super(marksIcp, marksDsa);
        this.algodesign = algodesign;
    }

    @Override
    void getPercentage() {
        System.out.println((marksDsa + marksIcp + algodesign) / 3);
    }
}

    class nonCSE extends Marks {
        int em;

        nonCSE(int marksIcp, int marksDsa, int em) {
            super(marksIcp, marksDsa);
            this.em = em;
        }

        @Override
        void getPercentage() {
            System.out.println((marksDsa + marksIcp + em) / 3);
        }
}

public class PerOfMarks {
    public static void main(String[] args) {
        CSE c=new CSE(80,85,90);
        nonCSE n=new nonCSE(70,75,80);
        c.getPercentage();
        n.getPercentage();


    }
}
