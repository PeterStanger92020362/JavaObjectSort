public class Student implements Comparable{

    private String name;
    private int rating;

    // getter methods
    public String getName(){
        return name;
    }

    public int getRating(){
        return rating;
    }

    @Override
    public int compareTo(Object o) {
        Student e = (Student) o;
        return getName().compareTo(e.getName());
    }

    public Student(String newName, int newRating){
        name = newName;
        rating = newRating;
    }
}