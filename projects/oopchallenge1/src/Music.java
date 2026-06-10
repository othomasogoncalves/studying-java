public class Music {

    String title;
    String artist;
    int yearRelease;
    int numReviews;
    double sumReviews;

    void displaysTechnicalSpec() {
        System.out.println("Song title: " + title);
        System.out.println("Artist: " + artist);
        System.err.println("Year of release: " + yearRelease);
    }

    void asses(double note) {
        sumReviews += note;
        numReviews++;
    }

    double checkMedia() {
        return sumReviews / numReviews;
    }
}