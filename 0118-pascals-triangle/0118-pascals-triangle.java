class Solution {
    public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> list = new ArrayList<>();

            for(int i=0;i<numRows;i++){
                list.add(new ArrayList<>());
                if(i==0){
                    list.get(0).add(1);
                    continue;
                }
                int j=0;
                while(j<=i){
                    if(j==0){
                        list.get(i).add(1);
                    }
                    else if(j<i){
                        list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                    }
                    else{
                        list.get(i).add(1);
                    }
                    j++;
                }
            }

            return list;
        
       
    }
}