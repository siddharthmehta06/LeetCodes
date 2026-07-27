// class Solution {
//     public int maxArea(int[] height) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         for(int i=0;i<height.length-1;i++){
//             for(int j=i+1;j<height.length;j++){
//                 if(height[i]<=height[j]){
//                     list.add((j-i)*height[i]);
//                 }
//                 else{
//                     list.add((j-i)*height[j]);
//                 }
//             }
//         }
//         Collections.sort(list);
//         return list.get(list.size() - 1);
//     }
// }
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;

            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
