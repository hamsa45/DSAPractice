package Crio.dsa.SlidingWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class firstSW {
    //maximum sum sub array of size k
    public static void main(String[] args) {
        System.out.println(maxSubArraySumOfK(new int[]{2, 5, 1, 8, 2, 9, 1},3)+ " is the max.");
        System.out.println(minSubArraySumOfK(new int[]{2, 5, 1, 8, 2, 9, 1},3)+ " is the min.");
        findSubstring("wordgoodgoodgoodbestword",new String[]{"word","good","best","word"});
    }


    public static List<Integer> findSubstring(String s, String[] words) {
        if(s.length()==0 || words.length==0) return new ArrayList<>();
        int eStrLen = words[0].length();
        int wLength = eStrLen * words.length;
        if(wLength > s.length()) return new ArrayList<>();
        HashMap<String, Integer> occMap = new HashMap<>();
        fillOccMap(occMap,words);
        List<Integer> ans = new ArrayList<>();
        int l = 0, r = wLength;
        while(r<s.length())
        {
            String currString = s.substring(l,r);
            int sPoint = l;
            boolean integrity = true;
            while(sPoint < (l+wLength))
            {
                String currWord = s.substring(sPoint,sPoint+eStrLen);
                if(!occMap.containsKey(currWord))
                {
                    integrity = false;
                    break;
                }
                sPoint += eStrLen;
            }
            sPoint = l;
            if(integrity)
            {
                boolean gotIt = true;
                while(sPoint < (l+wLength))
                {
                    String localString = s.substring(sPoint,sPoint+eStrLen);
                    if(occMap.get(localString)-1 < 0)
                    {

                        gotIt = false;
                        break;
                    }
                    else
                    {
                        occMap.put(localString,occMap.get(localString)-1);
                    }
                    sPoint += eStrLen;
                }
                if(gotIt)
                {
                    ans.add(l);
                }
                fillOccMap(occMap,words);
            }
            l++;
            r++;
        }
        return ans;
    }

    private static void fillOccMap(HashMap<String,Integer> map, String[] words)
    {
        map.clear();
        for(var str : words)
        {
            map.put(str,map.getOrDefault(str,0)+1);
        }
    }

    private static int minSubArraySumOfK(int[] nums, int k) {
        int i = 0, j = 0, sum = 0;
        int ans = Integer.MAX_VALUE;
        while(j < nums.length)
        {
            while(j-i+1 < k)
            {
                sum += nums[j];
                j++;
            }
            sum += nums[j];
            ans = Math.min(ans,sum);
            sum -= nums[i];
            j++;
            i++;
        }
        return ans;
    }

    private static int maxSubArraySumOfK(int[] nums, int k) {
        int sum = 0, i =0, j = 0;
        int ans = Integer.MIN_VALUE;
        while(j-i+1 < k)
        {
            sum += nums[j];
            j++;
            System.out.println(sum+" is sum, "+ j+ " is j.");
        }
        while(j < nums.length)
        {
            sum += nums[j];
            ans = Math.max(ans,sum);
            sum -= nums[i];
            i++;
            j++;
        }
        return ans;
    }
}
