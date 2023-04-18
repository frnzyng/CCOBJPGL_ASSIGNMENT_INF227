public class exercise1 {

    static boolean iWillReview = true;
    static boolean iWillNotFail = true;

    public static void main(String[] args) throws Exception {
        
        exercise1 myApp = new exercise1();

        // pre-condition
        assert iWillReview == true: "I will fail.";

        myApp.Study();
        // post-condition
        assert iWillNotFail == true: "You failed.";
    }

    void Study() {
        iWillReview = false;
        iWillNotFail = false;
    }
}
