
public class Line {

    private String name;
    private int occurence;

    public Line(String name, int occurence) {
        this.name = name;
        this.occurence = occurence;
    }

    public String getName() {
        return name;
    }

    public int getOccurence() {
        return occurence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccurence(int occurence) {
        this.occurence = occurence;
    }

    @Override
    public String toString() {
        return "{ line: \"" + name +
                "\", occurence: " + occurence +
                " }";
    }

}
