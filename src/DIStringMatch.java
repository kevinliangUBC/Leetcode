public class DIStringMatch {

    public int[] diStringMatch(String S) {

        int n = S.length();
        int[] array = new int[n+1];

        int low = 0;
        int high = S.length();



        for (int i = 0; i < n ; i++) {


            if (S.charAt(i) == 'D') {

                array[i] = high;
                high --;

            }

            if (S.charAt(i) == 'I') {

                array[i] = low;
                low++;

            }
        }

        if (S.charAt(S.length() - 1) == 'D') {

            array[n] = high;

        } else {
            array[n] = low;
        }




        return array;


    }


}
