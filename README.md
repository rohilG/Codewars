Gap in Primes:

The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1. From 3 to 5 the gap is 2. From 7 to 11 it is 4. Between 2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43

A prime gap of length n is a run of n-1 consecutive composite numbers between two successive primes (see: http://mathworld.wolfram.com/PrimeGaps.html).

We will write a function gap with parameters:

g (integer >= 2) which indicates the gap we are looking for

m (integer > 2) which gives the start of the search (m inclusive)

n (integer >= m) which gives the end of the search (n inclusive)

As an example gap(2, 3, 50) will return [3, 5] or (3, 5) or {3, 5} which is the first pair between 3 and 50 with a 2-gap.

So this function should return the first pair of two prime numbers spaced with a gap of g between the limits m, n if these numbers exist otherwise nil or null or None or Nothing (depending on the language).

#Examples: gap(2, 5, 7) --> [5, 7] or (5, 7) or {5, 7}

gap(2, 5, 5) --> nil. In C++ {0, 0}. In F# [||]

gap(4, 130, 200) --> [163, 167] or (163, 167) or {163, 167}

([193, 197] is also such a 4-gap primes between 130 and 200 but it's not the first pair)

gap(6,100,110) --> nil or {0, 0} : between 100 and 110 we have 101, 103, 107, 109 but 101-107is not a 6-gap because there is 103in between and 103-109is not a 6-gap because there is 107 in between.

A Noisy Class:
One day Mr. Sidhu's class is excessively loud. Unfortunately, giving them an activity about tiles didn't really work.

He notices that when he tells a certain student to stop talking, they will immediately resume since another noisy student will distract them, but if he tells the noisy student to stop talking, there will be silence at last.

After many hours of careful observations, Mr. Sidhu has given you a list containing the connections between students and asks you if it is even possible for the class to be completely silent.

Given the size of his class (as seen in New Students), he can only tell students to stop talking individually. Note that connections are in one direction - the noisy students talk to the distracted students, but not the other way around.

Input Specification:
The first line consists of NN (1≤N≤10000)(1≤N≤10000), the number of students; each student is assigned a number from 11 to NN.
The next line contains MM (1≤M≤10000)(1≤M≤10000), the number of connections.
The next MM lines contain two space-separated integers, representing the noisy student and the distracted student respectively. Given the sheer size, it is not guaranteed that the connections are distinct.

Output Specification
You are to output Y if it is possible and N if it is not.

Sample Input 1:
4
4
1 2
2 3
2 4
4 3

Sample Output 1:
Y

Explanation for Sample Input 1:
Mr. Sidhu can tell the students to stop talking in the following order: 1,2,4,31,2,4,3

Sample Input 2:
2
2
1 2
2 1

Sample Output 2:
N

Explanation for Sample Input 2:
After telling student 11 to quiet down student 22 will immediately distract him, and vice-versa. Since there is a cycle the class will never be quiet!

Dubstep:

Polycarpus works as a DJ in the best Berland nightclub, and he often uses dubstep music in his performance. Recently, he has decided to take a couple of old songs and make dubstep remixes from them.

Let's assume that a song consists of some number of words. To make the dubstep remix of this song, Polycarpus inserts a certain number of words "WUB" before the first word of the song (the number may be zero), after the last word (the number may be zero), 
and between words (at least one between any pair of neighbouring words), and then the boy glues together all the words, including "WUB", in one string and plays the song at the club.

For example, a song with words "I AM X" can transform into a dubstep remix as "WUBWUBIWUBAMWUBWUBX" and cannot transform into "WUBWUBIAMWUBX".

Recently, Jonny has heard Polycarpus's new dubstep track, but since he isn't into modern music, he decided to find out what was the initial song that Polycarpus remixed. Help Jonny restore the original song.
