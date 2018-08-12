package org.k3v1n;

import java.util.List;

public class PeopleStats {

    public static Stats getStats(final List<Person> collection) {

       final Stats stats = new Stats();

       final double average = collection.stream()
               .mapToInt(Person::getAge)
               .average()
               .orElse(-1.0);
       stats.setAverage(average);

       final long count = collection.stream().count();
       stats.setCount(count);

       final int max = collection.stream().mapToInt(Person::getAge).max().orElse(-1);
       stats.setMax(max);

       final int min = collection.stream().mapToInt(Person::getAge).min().orElse(-1);
       stats.setMin(min);

       final int sum = collection.stream().mapToInt(Person::getAge).sum();
       stats.setSum(sum);

       return stats;
    }

    static class Stats {

        private double average;
        private long count;
        private int max;
        private int min;
        private int sum;

        private void setSum(final int sum) {
            this.sum = sum;
        }

        public int getSum() {
            return sum;
        }

        private void setMin(final int min) {
            this.min = min;
        }

        public int getMin() {
            return min;
        }

        private void setMax(final int max) {
           this.max = max;
        }

        public int getMax() {
            return max;
        }

        private void setCount(final long count) {
            this.count = count;
        }

        public long getCount() {
            return count;
        }

        private void setAverage(final double average) {
           this.average = average;
        }

        public double getAverage() {
           return average;
        }
    }
}
