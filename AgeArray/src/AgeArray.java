import java.util.Arrays;

/**
 * Claim Academy JavaBootCamp
 * Created by kim on 6/17/2015.
 * find largest, smallest and sort all ages
 * Save as Group ages array
 * minor age <18
 * major => 18 < 65
 * senior = > 65
 */
public class AgeArray {
    public static void main(String[] args) {
        int age[] = new int[]{2,5,65,32, 25, 12, 20, 22, 19, 54, 22, 54};
        Arrays.sort(age);

        int largest = 0;
        int smallest = age[0];
        for (int i = 0; i < age.length; i++) {
            System.out.println("age [" + i + "] " + age[i]);
            if (age[i] > largest)
                largest = age[i];
            else if (age[i] < smallest)
                    smallest = age[i];
        }
        int minors = 0;
        int minor [] = new int[4];
        int majors = 0;
        int major[] = new int[8];
        int seniors = 0;
        int senior[] = new int[1];
        for (int i = 0; i < age.length; i++){
            if (age[i] < 18){
                minor[minors++] = age[i];
            }
            else if (age[i] >= 18 && age[i] < 65){
                major[majors++] = age[i];
            }
            else{
                senior[seniors++] = age[i];
            }

        }

        System.out.println("The most senior person is of the age " + largest);
        System.out.println("The youngest person is the age " + smallest);
        System.out.println("This list is now sorted: " + Arrays.toString(age));
        System.out.println("We have this many minors: " + Arrays.toString(minor));
        System.out.println("We have this many majors: " + Arrays.toString(major));
        System.out.println("We have this many seniors: " + Arrays.toString(senior));

    }
}
