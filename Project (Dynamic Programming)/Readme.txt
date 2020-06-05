This project is about studying the relationship between the LCS and the edit distance using DNA sequences.
Our team found out that if we use LCS and Edit distance function to compute results of FASTA file, the data didn't showed correctly.
Also for the median text, it didn't showed correctly either. The reason for this is because the result of Edit distance
is sensitive to length of sequence. For example, if we have sequence "AC" and "ACTG" then the edit distance is two and 
the LCS is also two. But if one sequence has length of 100 and other sequence has length of 100, then only two characters are different.
Then, Edit distance is two but the LCS is much larger than Edit distance. Thus, we need to normalize the result.
So, we managed to normalize by dividing the Edit distance and LCS by the length of longer sequence by using Math.max function.
The two graph that we posted shows the inverse relationship between LCS and Edit distance, which is our expectations.
First of all, we worte a code to read the FASTA file so we could pull up content inside the file to comapre with and put into an arryList.
Then we made it to choose contents randomly generate two random numbers corresponding to arraylist elements,
so it could compare every possible combinations. We implemented our LCS and Edit distance functions that we used in our lab and homework. 
We used "median.txt" and "small.txt" file provided by professor to test our programs and if they have inverse relationships.

