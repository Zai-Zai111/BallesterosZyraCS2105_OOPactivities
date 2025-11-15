public class Writer extends Artist {

    public enum WritingStyle {
        FICTION, NONFICTION, POETRY, DRAMA
    }

    private WritingStyle style;

    public Writer(String name, int age, WritingStyle style) {
        super(name, age, "Writing");
        this.style = style;
    }

    public WritingStyle getStyle() { return style; }
    public void setStyle(WritingStyle style) { this.style = style; }

    @Override
    public void displayInfo() {
        System.out.println("Writer's Info:");
        super.displayInfo();
        System.out.println("Writing Style: " + style);
    }
}
