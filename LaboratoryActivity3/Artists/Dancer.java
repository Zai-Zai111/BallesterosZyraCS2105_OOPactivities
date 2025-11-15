public class Dancer extends Artist {

    public enum DanceStyle {
        BALLET, HIPHOP, JAZZ, CONTEMPORARY
    }

    private DanceStyle danceStyle;

    public Dancer(String name, int age, DanceStyle style) {
        super(name, age, "Dance");
        this.danceStyle = style;
    }

    public DanceStyle getDanceStyle() { return danceStyle; }
    public void setDanceStyle(DanceStyle style) { this.danceStyle = style; }

    @Override
    public void displayInfo() {
        System.out.println("Dancer's Info:");
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }
}
