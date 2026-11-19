package space.linuy.leetcode.bank;

public class LC2409 {
    private class Date {
        private int month;
        private int day;

        public Date(String dateStr) {
            String[] split = dateStr.split("-");
            this.month = Integer.parseInt(split[0]);
            this.day = Integer.parseInt(split[1]);
        }

        public boolean beforeThis(Date date) {
            if (this.month == date.month) {
                return this.day > date.day;
            }
            return this.month > date.month;
        }

        public int dayDifference(Date date) {

        }
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

    }
}
