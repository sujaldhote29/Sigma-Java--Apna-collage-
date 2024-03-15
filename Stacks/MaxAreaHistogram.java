import java.util.Stack;

public class MaxAreaHistogram {
    public static void maxArea(int[] arr){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
       
       
        // Next smaller right 
         Stack<Integer>  s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while loop
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();

            }

            // 2 if-else
            if (s.isEmpty()) {
                nsr[i] = arr.length;

            } else {
                nsr[i] = s.peek();
            }
            // 3 push in s
            s.push(i);
        }


        // Next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            // 1 while loop
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();

            }

            // 2 if-else
            if (s.isEmpty()) {
                nsl[i] = -1;

            } else {
                nsl[i] = s.peek();
            }
            // 3 push in s
            s.push(i);
        }

        // current area : width = j-i-1 = nsr[i] - nsl[i]-1:
        for(int i =0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i]-1;
            int currentArea = height*width;
            maxArea = Math.max(maxArea, currentArea);
        }


        System.out.println("Maximum Area in Histogram is : "+maxArea);

    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        maxArea(arr);

    }
}
