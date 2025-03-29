public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex, int tonerLevel) {
        this.duplex = duplex;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
    }

    public int addToner(int tonerAmount) {

        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }


    public int addToner1(int tonerAmount) {
        if (tonerLevel > 100 || tonerLevel < 0 || tonerLevel + tonerAmount > 100) {
            return -1;
        }
        return tonerLevel += tonerAmount;
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
