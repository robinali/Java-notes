class Solution {
    public String defangIPaddr(String address) {
        int len = address.length();
        StringBuilder sb = new StringBuilder();
        for(Character ch : address.toCharArray()) {
            if(ch != '.')
                sb.append(ch);
            else
                sb.append("[.]");
        }
        return sb.toString();
    }
}