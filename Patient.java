package PriorityQueue;

public class Patient implements Comparable<Patient>{
	   private String name;
	    private int priority;

	    public Patient(String name, int priority) {
	        this.name = name;
	        this.priority = priority;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getPriority() {
	        return priority;
	    }

	    @Override
	    public int compareTo(Patient other) {
	        return Integer.compare(other.priority, this.priority);
	    }

	    @Override
	    public String toString() {
	        return "Patient{name='" + name + "', priority=" + priority + "}";
	    }
}
