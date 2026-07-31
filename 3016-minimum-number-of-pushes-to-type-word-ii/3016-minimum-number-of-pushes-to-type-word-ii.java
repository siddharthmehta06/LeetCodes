class Solution {
    public int minimumPushes(String word) {
        



        int[] freq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        Arrays.sort(freq);

        for (int i = 0; i < freq.length/2; i++) {
            int temp = freq[i];
            freq[i] = freq[freq.length - 1 - i];
            freq[freq.length - 1 - i] = temp;
        }

        int press = 0;

        int j = 0;
        int count = 0;
        int k = 1;
        while (j < freq.length && freq[j] != 0) {
            press += k * freq[j];
            count++;
            if(count%8==0){
                k++;
            }
            j++;
        }

        return press;
    }
}