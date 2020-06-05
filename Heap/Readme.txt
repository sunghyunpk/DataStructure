A complete binary tree is a binary tree in which every internal node has two children and all leaves have
the same depth. A binary tree in which if last level is not completely filled but all nodes (leaves) are pushed
across to the left, is also (nearly) a complete binary tree.

Input {
    In the first line, an integer H, the size of the binary heap, is given. In the second line, H integers which
    correspond to values assigned to nodes of the binary heap are given in order of node id (from 1 to H).
}

Output {
    Print the properties of the binary heap in the above format from node 1 to H in order. Note that, the last
    character of each line is a single space character.
}

Constraints {
    H ≤ 250
    −2,000,000,000 ≤ value of a node ≤ 2,000,000,000
}

Sample Input {
    5
    7 8 1 2 3
}

Sample Output {
    node 1: key = 7, left key = 8, right key = 1, 
    node 2: key = 8, parent key = 7, left key = 2, right key = 3, 
    node 3: key = 1, parent key = 7, 
    node 4: key = 2, parent key = 8,
    node 5: key = 3, parent key = 8,
}