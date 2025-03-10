public class Age {
    int y, d, m;

    // Constructor to initialize the date
    public Age(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    // Method to calculate the gap between two dates
    Age cal_gap(Age d1, Age d2) {
        Age d3 = new Age(0, 0, 0);

        // Calculate day difference
        if (d2.d > d1.d) {
            d3.d = d2.d - d1.d;
        } else {
            d3.d = d2.d + 30 - d1.d;
            d2.m--;  // Borrow from the month
        }

        // Calculate month difference
        if (d2.m > d1.m) {
            d3.m = d2.m - d1.m;
        } else {
            d3.m = d2.m + 12 - d1.m;
            d2.y--;  // Borrow from the year
        }

        // Calculate year difference
        d3.y = d2.y - d1.y;

        return d3;
    }

    // Method to display the result
    void show() {
        System.out.println(d + " Days " + m + " Months " + y + " Years ");
    }

    public static void main(String[] args) {
        Age d1 = new Age(27, 2, 2025);  // Current date
        Age d2 = new Age(16, 9, 2002);  // Birth_date
        Age d3 = d1.cal_gap(d1, d2);    // Calculate the gap
        d3.show();                      // Show the result
    }
}