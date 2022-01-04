class Solution {
    public int bitwiseComplement(int N) {
    if (N == 0) return 1;
    int todo = N, bit = 1;
    while (todo != 0) {
      // flip current bit
      N = N ^ bit;
      // prepare for the next run
      bit = bit << 1;
      todo = todo >> 1;
    }
    return N;
    }
}