package ClassData_01;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movie1 = new MovieReview();
        movie1.title = "aaa";
        movie1.review = "no1review";

        System.out.println(movie1); // system.out.println을 사용하면 movie1.toString()은 굳이 안 해도 됨

    }
}
