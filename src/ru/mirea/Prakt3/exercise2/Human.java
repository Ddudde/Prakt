package ru.mirea.Prakt3.exercise2;

public class Human {
    public static class Lag
    {
        private int leg_length;
        private String left_or_right;

        public Lag(String left_or_right, int leg_length)
        {
            this.leg_length = leg_length;
            this.left_or_right = left_or_right;
        }
        public Lag()
        {
            this.leg_length = 0;
            this.left_or_right = "none";
        }
        public String getLeft_or_right() {
            return left_or_right;
        }
        public int getLeg_length() {
            return leg_length;
        }

        public void setLeft_or_right(String left_or_right) {this.left_or_right = left_or_right;}
        public void setLeg_length(int leg_length) {this.leg_length = leg_length;}

        @Override
        public String toString() {
            return "Lag{" +
                    "leg_length=" + leg_length +
                    ", left_or_right='" + left_or_right + '\'' +
                    '}';
        }
    }
    public static class Head{
        private int the_length_of_the_beard;
        private boolean scars;

        public Head(boolean scars, int the_length_of_the_beard) {
            this.scars = scars;
            this.the_length_of_the_beard = the_length_of_the_beard;
        }
        public Head(int the_length_of_the_beard) {
            this.the_length_of_the_beard = the_length_of_the_beard;
        }
        public Head(boolean scars) {
            this.scars = scars;
        }
        public boolean isScars() {
            return scars;
        }
        public int getThe_length_of_the_beard() {
            return the_length_of_the_beard;
        }
        public void setScars(boolean scars) {
            this.scars = scars;
        }
        public void setThe_length_of_the_beard(int the_length_of_the_beard) {
            this.the_length_of_the_beard = the_length_of_the_beard;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "the_length_of_the_beard=" + the_length_of_the_beard +
                    ", scars=" + scars +
                    '}';
        }
    }
    public static class Hand{
        private int hand_length;
        private String hand_left_or_right;

        public Hand(String hand_left_or_right,int hand_length){
            this.hand_left_or_right = hand_left_or_right;
            this.hand_length = hand_length;
        }

        public Hand() {
            this.hand_length = 0;
            this.hand_left_or_right = "none";
        }
        public String getHand_left_or_right() {
            return hand_left_or_right;
        }
        public int getHand_length() {
            return hand_length;
        }
        public void setHand_left_or_right(String hand_left_or_right) {
            this.hand_left_or_right = hand_left_or_right;
        }
        public void setHand_length(int hand_length) {
            this.hand_length = hand_length;
        }

        @Override
        public String toString() {
            return "Hand{" +
                    "hand_length=" + hand_length +
                    ", hand_left_or_right='" + hand_left_or_right + '\'' +
                    '}';
        }

    }

    @Override
    public String toString() {
        return "Human";
    }
}



