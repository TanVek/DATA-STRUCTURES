import java.util.Comparator;
public class MovieInfo implements Comparable<MovieInfo> {  // CHANGE THIS LINE TO MAKE THIS CLASS COMPARABLE
   String title;
   String genre;
   String leadActor;

   MovieInfo(String t, String g, String a) {
      title = t; genre = g; leadActor = a;
   }
   public String toString() {
      return title + " " + genre + " " + leadActor + "\n";
   }

   // getters
   public String getTitle() { return title; }
   public String getGenre( ) { return genre; }
   public String getActor( ) { return leadActor; }

   public int compareTo(MovieInfo other) {
      // YOUR CODE HERE
      return this.getTitle().compareTo(other.getTitle()); // change this line
   }
   public static class GenreOrder implements Comparator<MovieInfo>{
      public int compare(MovieInfo one, MovieInfo two) {
         return one.getGenre().compareTo(two.getGenre());
      }
   }
   public static class ActorOrder implements Comparator<MovieInfo>{
      public int compare(MovieInfo one, MovieInfo two) {
         return one.getActor().compareTo(two.getActor());
      }
 
   }
}