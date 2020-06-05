Given two sequences, the problem is to find the longest subsequence that is common to the input sequences
The characters in a subsequence are not necessarily in a contiguous block. For example, the lonest common
subsequence between "abcbdab" and "bdcaba" is "bdab", which has length of 4.

Given two sequences a1a2a3...am and b1b2b3...bn, of length m and n, respectively. Define LCS[i, j] as
he length of the longest common subsequence between their prefixes, a1a2a3...ai and b1b2b3...bj,respectively.

The algorithm described above is a dynamic algorithm. Make sure that you implement this algorithm bottom up
(instead of using recursion). Compute and store the solutions to all the subproblems in a table (2D array, in which
LCS[i, j] stores the length of the longest common subsequence between a1a2a3...ai and b1b2b3...bj),
starting with the smallest problems and then move to bigger and bigger problems. LCS[m, n] is the solution to the
largest problem (i.e., the original problem).

