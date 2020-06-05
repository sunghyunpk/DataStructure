Let's first review the activity selection problem. Suppose we have:

a set S=1,2,...,n of n activities (e.g. class meetings)
that compete for the same resource (e.g. a classroom),
which can be used by only one activity (e.g. a class meeting) at a time.

Each activity i has a start time si and a finish time fi, where si ≤ fi.
Activities i and j are compatible if the intervals [si,fi) and [sj,fj) do not overlap (i.e., i and j are
compatible if si >= fj or sj >= fi).
The activity-selection problem is to select a maximum-size set of mutually compatible activities.

The greedy-activity-selector algorithm to solve this:
Sort the activities by increasing finish time
Pick one with the earliest finish time that can be legally scheduled, repeatedly, until no more activities can be scheduled.

Sample Input {
    9
    activity-1 9.30 10.45
    activity-2 10.40 11.40 
    activity-3 8.50 9.40
    activity-4 11.20 12.30
    activity-5 12.10 13.25
    activity-6 10.20 11.10
    activity-7 11.00 12.00
    activity-8 13.00 14.15
    activity-9 14.00 15.15 
}