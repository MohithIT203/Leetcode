class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String str : emails) {
            String[] st = str.split("@");
            String local = st[0];
            String domain = st[1];
            int ind = local.indexOf("+");
            if (ind != -1) {
                local = local.substring(0, ind);
            }
            local = local.replace(".", "");
            set.add(local + "@" + domain);
        }
        return set.size();
    }
}