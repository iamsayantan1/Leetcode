class Solution {
    public List<String> fizzBuzz(int n) {
        String[] fb = new String[n];
        for(int no=1;no<=n;no++) {
            fb[no-1] = no%3==0 && no%5==0 ? "FizzBuzz" : no%3==0 ? "Fizz" : no%5==0 ? "Buzz" : String.valueOf(no);
        }

        return Arrays.asList(fb);
    }
}