package myapp;

public class AppStats {

    private int count = 0;
    private float totalRating;

    private String highestApp;
    private float highestAppRating = 0;

    private String lowestApp;
    private float lowerAppRating = 5;

    private String category;

    public AppStats(String category) {this.category = category;}

     
    // getter and setters
    public String getCategory() {
        return category;}
        
    public int getCount() {
        return count;}
    public void setCount(int count) {
        this.count = count;}

    public float getTotalRating() {
        return totalRating; }
    public void setTotalRating(float totalRating) {
        this.totalRating = totalRating; }

    public String getHighestApp() {
        return highestApp;}
    public void setHighestApp(String highestApp) {
        this.highestApp = highestApp; }

    public float getHighestAppRating() {
        return highestAppRating;}
    public void setHighestAppRating(float highestAppRating) {
        this.highestAppRating = highestAppRating;}

    public String getLowestApp() {
        return lowestApp;} 
    public void setLowestApp(String lowestApp) {
        this.lowestApp = lowestApp;}

    public float getLowerAppRating() {
        return lowerAppRating;}
    public void setLowerAppRating(float lowerAppRating) {
        this.lowerAppRating = lowerAppRating;}

    // methods
    public void evaluate(String appName, float rating) {
        this.count++;
        this.totalRating += rating;

        if(rating > this.highestAppRating) {
            this.highestAppRating = rating;
            this.highestApp = appName; 
        } else if (rating < this.lowerAppRating) {
            this.lowerAppRating = rating;
            this.lowestApp = appName;
        }
    }
}
