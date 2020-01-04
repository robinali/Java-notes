class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> nor = new HashSet<>();
        for(String email : emails) {
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            nor.add(local[0].replace(".", "") + "@" + parts[1]);
        }
        return nor.size();
    }
}