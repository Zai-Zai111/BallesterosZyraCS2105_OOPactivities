public class ArtistDemo {
    public static void main(String[] args) {

        System.out.println("Instance of Artist class\n");
        Artist a = new Artist("Charlie Puth", 32, "Music");
        a.displayInfo();

        System.out.println("\nInstance of Singer class\n");
        Singer s = new Singer("Nayeon Im", 29, Singer.Genre.POP);
        s.displayInfo();

        System.out.println("\nInstance of Painter class\n");
        Painter p = new Painter("Leonardo Da Vinci", 67, Painter.Medium.OIL);
        p.displayInfo();

        System.out.println("\nInstance of Writer class\n");
        Writer w = new Writer("William Shakespeare", 52, Writer.WritingStyle.DRAMA);
        w.displayInfo();

        System.out.println("\nInstance of Dancer class\n");
        Dancer d = new Dancer("Misty Copeland", 41, Dancer.DanceStyle.BALLET);
        d.displayInfo();
    }
}
