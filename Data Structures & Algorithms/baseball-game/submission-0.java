class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scoreCard = new ArrayList<>();

        for (String op : operations) {
            if (op.equalsIgnoreCase("+")) {
                scoreCard.add(scoreCard.getLast() + scoreCard.get(scoreCard.size() - 2));
            } else if (op.equalsIgnoreCase("D")) {
                scoreCard.add(scoreCard.getLast() * 2);
            } else if (op.equalsIgnoreCase("C")) {
                scoreCard.removeLast();
            } else {
                scoreCard.addLast(Integer.valueOf(op));
            }
        }

        return scoreCard.stream().mapToInt(Integer::intValue).sum();
    }
}