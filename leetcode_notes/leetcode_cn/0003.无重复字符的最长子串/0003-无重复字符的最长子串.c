int not_repeated(char *s, int left, int right) {
    if(left == right) return -1;
    while(left < right) {
        if(s[left] == s[right]) {
            return left;
        }
        left += 1;
    }
    return -1;
}

int lengthOfLongestSubstring(char * s){
    int max = 0, tmp = 0, check_output = 0, current = 0, left = 0, right = 0;
    while(s[right] != 0 && left <= right) {
        check_output = not_repeated(s, left, right);
        if(check_output == -1) {
            right += 1;
        } else {
            tmp = right - left;
            max = tmp > max ? tmp : max;
            left = check_output + 1;
            right += 1;
        }
    }
    tmp= right - left;
    max = tmp > max ? tmp : max;
    return max;
}

