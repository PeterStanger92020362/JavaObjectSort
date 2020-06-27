import static java.util.Arrays.sort;

public class JavaObjectSort {

    /* Prints the array */
    void printArray(Student arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i].getName() + " ");
        System.out.println();
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        JavaObjectSort ob = new JavaObjectSort();
        Student arr[] = {
                new Student("Bob",4),
                new Student("tama",3),
                new Student("Bob",1),
                new Student("Susan",2),
                new Student("Sarah",3),
                new Student("Abdul",2),
                new Student("Jama",3),
                new Student("Jen",1),
        };
        System.out.println("The Unsorted array of students is");
        ob.printArray(arr);

        // apply sort
        sort(arr);
        System.out.println("The Student array sorted by name is");
        ob.printArray(arr);
    }
}


