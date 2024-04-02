package part4;

public class Polymorphism {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.fly(); // Outputs: The bird is flying.

        Bird myEagle = new Eagle(); // Upcasting
        myEagle.fly(); // Outputs: The eagle flies fast.
    }
}

