class Solution {
    List<List<Integer>> result;

    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();

        backtrack(1, combination, n, k);
        return result;
    }

    void backtrack(int start, List<Integer> combination, int n, int k) {
        if (combination.size() == k) {
            result.add(List.copyOf(combination));
            return;
        }

        for (int i = start; i <= n; i++ ) {
            combination.add(i);
            backtrack(i + 1, combination, n, k);
            combination.remove(combination.size() - 1);
        }
    }
}